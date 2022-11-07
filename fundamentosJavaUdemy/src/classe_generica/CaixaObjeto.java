/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe_generica;

/**
 *
 * @author eric
 */
public class CaixaObjeto {

    private Object coisa;
    
    public void guarda(Object coisa){
        this.coisa = coisa;
    }
    
    public Object abrir(){
        return this.coisa;
    }
    
}
