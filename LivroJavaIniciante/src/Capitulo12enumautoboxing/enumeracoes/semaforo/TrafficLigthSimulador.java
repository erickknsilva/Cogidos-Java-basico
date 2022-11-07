/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo12enumautoboxing.enumeracoes.semaforo;

/**
 *
 * @author eric
 */
public class TrafficLigthSimulador implements Runnable {

    private Thread thrd; // contem a thread que excecuta a simulação
    private TrafficLigthColor tlc; //contem a cor do sinal
    boolean stop = false; //Configura com true a cor do sinal
    boolean changed = false; // true quando o sinal mudou

    //RECEBE COMO PARAMETRO UM OBJETO DA CLASSE TrafficLigthColor
    public TrafficLigthSimulador(TrafficLigthColor init) {
        this.tlc = init;

        //cria um objeto da classe thread e recebe o objeto da propia classe
        thrd = new Thread(this);

        thrd.start();//inicia a thread assim que o construtor é construido
    }

    public TrafficLigthSimulador() {
        tlc = TrafficLigthColor.VERMELHO; //define a cor padrao do farol

        thrd = new Thread(this);
        thrd.start();//inicia a thread assim que o construtor é construido
    }

    public void run() {
        while (!stop) {//agora é verdadeiro
            try {
                switch (tlc) {
                    case VERDE:
                        //define o tempo da thread, aqui é 10 segundos
                        Thread.sleep(10000);
                        break;
                    case AMARELO:
                        Thread.sleep(2000); //amarelo por 2 segundos
                        break;
                    case VERMELHO:
                        Thread.sleep(12000);//vermelho por 12 segundos
                        break;
                }
            } catch (InterruptedException obj) {
                System.out.println(obj);
            }
            changeColor();
            /*Metodo vai percorrer as cores do farol, entrando em suspenção baseando na 
    cor atual*/
        }
    }//fim do metodo run

    synchronized void changeColor() {
        switch (tlc) {
            case VERMELHO: //se vor vermelho vai para verde
                tlc = TrafficLigthColor.VERDE;
                break;
            case AMARELO: //se vor amarelo vai para vermelho
                tlc = TrafficLigthColor.VERMELHO;
                break;
            case VERDE: //se vor verde vai para vermelho
                tlc = TrafficLigthColor.AMARELO;
        }
        changed = true;
        notify();//sinaliza que a cor mudou
        /*examina a cor armazenada em tlc e entrao atribui a proxima cor da sequencia,
        esse metodo é sincronizado e isso é necessario pq ele chama notify(),
        para sinalizar que ocorreu uma mudança de cor (notify so pode ser chamado
        apartir do de um contexto sincronizado)
         */
    }

    synchronized void waitForChange() {
        try {
            while (!changed) {
                wait();//espera o sinal mudar
            }
            changed = false;
        } catch (InterruptedException obj) {
            System.out.println(obj);
        }
        /*
        esse metodo apenas chama wait(). A chamada nao retornara até changeColor()
        executar uma chamada a notify(). Logo, waitForChange() não retornara até
        o sinal muda
         */
    }

    //retorna a cor atual
    synchronized TrafficLigthColor getColor() {
        return tlc;
    }

    //interrompe o semaforo
    synchronized void cancel() {
        stop = true;
    }

}
