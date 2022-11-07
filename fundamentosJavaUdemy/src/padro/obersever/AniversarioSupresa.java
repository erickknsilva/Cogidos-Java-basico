/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padro.obersever;

/**
 *
 * @author eric
 */
public class AniversarioSupresa {
    
    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        //Referencia por metodo.
        porteiro.registraObservador(e -> {
            System.out.println("\nAvisar os convidados...");
            System.out.println("Apagar as luzes...");
            System.out.println("Esperar um pouco....");
            System.out.println(".... surpresaaaa!");
            System.out.println("Ocorrencia do evento " + e.getMomento());
        });

//        porteiro.registraObservador(namorada);
        porteiro.monitorar();
        
    }
}
