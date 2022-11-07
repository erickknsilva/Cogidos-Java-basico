/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao.personalizadaB;

/**
 *
 * @author eric
 */
public class NumeroNegativoException extends Exception {

    private String nomeDoAtributo;

    NumeroNegativoException(String nomeAtributo) {
        this.nomeDoAtributo = nomeAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo '%s' está negativo. ", nomeDoAtributo);
    }
//    private static final long serialVersionUid = -3014530899920482717L;
}
