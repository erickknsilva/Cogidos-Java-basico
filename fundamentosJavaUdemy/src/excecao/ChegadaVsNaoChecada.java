/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao;

/**
 *
 * @author eric
 */
public class ChegadaVsNaoChecada {

    public static void main(String[] args) {

        try {
            gerarErro1();
        } catch (Exception obj) {
            System.out.println(obj.getMessage());
        }

        try {
            gerarErro2();
        } catch (Exception ob) {
            System.out.println(ob.getMessage());
        }

        System.out.println("Fim");

        /*
        uma exceção nao checada ou nao verificada, não é obrigado
        a tratar o erro.
        Uma exceção checada ou verificada é obrigado a tratar o erro
        no ponto em que esta chamando
            Obs: Erro RuntimeException o tratamento é opcional 
             Erro de Exception é obrigatorio a tratar o erro
         */
    }

    //Exceção NÃO checada ou NÃO verificada
    static void gerarErro1() {
        throw new RuntimeException("Ocorreu uma exceção #01.");
    }

    //Exceção checada ou verificada 
    static void gerarErro2() throws Exception {
        throw new Exception("Ocorreu uma exceção #02.");
    }
}
