/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe_generica;

/*
<TIPO> é para definir o tipo que voce quer trabalhar 
exe: String, Integer, Double 
e o tipo inserido sera atribuido em todos os lugares onde está escrito tipo
 */
public class Caixa<TIPO> {

    private TIPO coisa;

    public void guardar(TIPO obj) {
        this.coisa = obj;
    }

    public TIPO abrir() {
        return this.coisa;
    }

}
