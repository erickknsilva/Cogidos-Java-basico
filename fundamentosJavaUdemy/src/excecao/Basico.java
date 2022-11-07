/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao;

/**
 *
 * @author eric
 */
public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;

        try {
        System.out.println(7 / 0);

        } catch (ArithmeticException obj) {
            System.out.println("Ocorreu uma exceção 1"
                    + obj.getMessage());
        }

        try {
            imprimirAluno(a1);

        } catch (NullPointerException obj) {
            System.out.println("Ocorreu uma exceção 2");
        }
    }

    public static void imprimirAluno(Aluno obj) {
        System.out.println(obj.nome);
    }
}
