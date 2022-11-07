/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao.personalizadaA;

/**
 *
 * @author eric
 */
public class StringVaziaException extends RuntimeException {

    private String nomeDoAtributo;

    StringVaziaException(String nomeAtributo) {
        this.nomeDoAtributo = nomeAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo '%s' está vazio. ", nomeDoAtributo);
    }
//    private static final long serialVersionUid = -3014530899920482717L;
}
