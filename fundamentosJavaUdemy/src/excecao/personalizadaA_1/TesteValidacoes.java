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
public class TesteValidacoes {

    public static void main(String[] args) {

        try {
            Aluno a1 = new Aluno(" Erick ", 7);
            Validar.aluno(a1);

        } catch (StringVaziaException obj) {
            System.out.println(obj.getMessage());
            //
        } catch (NumeroNegativoException
                | java.lang.IllegalArgumentException obj) {
            System.out.println(obj.getMessage());
        }

        //exceção chegada é obrigatorio o tratamento delas, quando chamam
//            Validar.aluno(a1);
    }
}
