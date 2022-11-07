/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesMetodos;

/**
 *
 * @author eric
 */
public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nomeP, double pesoP) {
        //para trazer a variavel nome fora do objeto, para dentro
        this.nome = nomeP; // this.nome = nomeP para atribuir o valor de nomeP para nome dentro do objeto
        this.peso = pesoP; // this.peso = pesoP para atribuir o valor de pesoP para peso dentro do objeto
    }

    void comer(Comida comida) {
        if (comida != null) { // verifica se a comida tem o valor valido
            this.peso += comida.pesoComida; // se tiver um valor valido executa this.peso += comida.pesoComida
        }

    }

    String informar() {
        return "Olá " + nome + " seu peso agora é " + peso + "kgs."; // informar as caracteristicas das pessoas
    }

}
