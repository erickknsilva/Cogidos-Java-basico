/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao;

/**
 *
 * @author eric
 */
public class ExcecaoCausadora {

    public static void main(String[] args) {

        //Excecao causadoura é quando uma exceçao gera outra.
        try {
            metodoA(null);
        } catch (IllegalArgumentException e) {
            if (e.getCause() != null) {
                System.out.println(e.getCause().getMessage());
            }
        }
        metodoA(null);

    }

    static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);

        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    static void metodoB(Aluno aluno) {
        if (aluno == null) {
            throw new NullPointerException("Aluno está nuloooo.");
        }
        System.out.println(aluno.nome);
    }

}
