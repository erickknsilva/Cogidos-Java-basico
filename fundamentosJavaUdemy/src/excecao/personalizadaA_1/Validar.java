/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao.personalizadaB;

import excecao.Aluno;

/**
 *
 * @author eric
 */
public class Validar {

    private Validar() {
    }

    //Exceção checada obrigado a ser tratada quando vor chamada.
    public static void aluno(Aluno aluno)
            throws StringVaziaException, NumeroNegativoException {

        if (aluno == null) {
            throw new IllegalArgumentException("O aluno está nulo.");
        }

        if (aluno.nome == null || aluno.nome.trim().isEmpty()) { //trim tira os espaço em branco
            throw new StringVaziaException("nome");
        }

        if (aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroNegativoException("Nota");
        }

    }

}
