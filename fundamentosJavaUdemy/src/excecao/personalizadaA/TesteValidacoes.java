/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao.personalizadaA;

import excecao.personalizadaB.StringVaziaException;
import excecao.personalizadaB.NumeroNegativoException;
import excecao.personalizadaB.Validar;
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

            Validar.aluno(null);
        } catch (StringVaziaException obj) {
            System.out.println(obj.getMessage());
            //
        } catch (NumeroNegativoException
                | java.lang.IllegalArgumentException obj) {
            System.out.println(obj.getMessage());
        }

    }
}
