/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package capitulo15appletsEventoTopicos.criandoAppletBannerSimple2;

import java.applet.*;
import java.awt.*;

/*
<applet code="Banner" width=300 heigth= 50> </applet>
 */
/**
 * Tente isto 15-1 Applet de banner simples. Este applet cria uma thread que
 * rola a mensagem contida em msg da direita para a esquerda ao longo de sua
 * janela.
 */
@SuppressWarnings("unused")
public class Banner extends Applet implements Runnable {

    /**
     * Interface runnable é necessario pq, o applet criar uma segunda thread de
     * excecucao para rolar o banner
     */
    String msg = " Java domina a Web. ";//mensagem que vai rolar o banner

    Thread t;//uma a referencia a thread que executa o applet

    boolean stopFlag;//usada para interromper o applet

    //Inicializa a THREAD com null t = null
    //
    @Override
    public void init() {
        t = null;
    }

    @Override
    public void start() {
        t = new Thread(this); //cria uma thread de execucao
        stopFlag = false; //configura como false para nao chamar o stop
        t.start();//inicia a thread e inicializa run
    }

    /**
     * Em run( ), é feita uma chamada a repaint( ). Isso faz o método paint( )
     * ser chamado e o conteúdo de msg ser girado e exibido
     */
    @Override
    //ponto de entrada que a thread executa o banner    
    public void run() {
        //exibe o banner novamente
        for (;;) {

            try {
                repaint();
                Thread.sleep(250);
                if (stopFlag) {
                    break;
                }
            } catch (InterruptedException exc) {
            }
        }
    }

    //pausa o banner
    @Override
    public void stop() {
        stopFlag = true;
        t = null;
    }

    @Override
    public void paint(Graphics g) {
        char ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 50, 30);
        // showStatus(String mensagem); String é a mensagem que deseja exibir
        showStatus("janela de status");
    }

}
