/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseQueue;

/**
 *
 * @author eric
 */
public class QueueDemo {

    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);

        char ch;
        int i;
        System.out.println("Usando bigQ para armazenar o alfabeto");

        //insere alguns numeros em bigQ
        for (i = 0; i < 26; i++) { //incrementa de 0 a 25 
            bigQ.put ((char) ('A' + i)); // // armazena a incrementa do alfabeto a,b,c,d etc
            //bigQ armazena o alfabeto agora
        }

        //recupera elementos e exibe elementos de bigQ
        for (i = 0; i < 26; i++) {
            ch = bigQ.get(); // bigQ.get agora pega o valor armazena em bigQ.put e passa para ch
            //  System.out.println(ch); //mostra o alfabeto
            if (ch != (char) 0) {
                System.out.print(ch + " ");
            }
        }
        System.out.println("");

        System.out.print("\nUsando smallq para gerar um erro\n");
        //smallq para gerar alguns erro
        for (i = 0; i < 5; i++) {
            System.out.print("tentando armazenar " + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));
            System.out.println("");
        }
        System.out.println();
        
        // mais erros em smallQ
        System.out.print("Contents of smallQ:");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            
            if(ch != (char) 0 ) System.out.println(ch);
        }
    }
}
