/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo8PacotesEInterface.interfaces;

/**
 *
 * @author eric
 */
public interface Series {

    //versao melhorada de series que inclui um metodo padrao chamado getNextArray
    int getNext();//retorna o proximo numero da serie

    void reset();//reinicia a serie

    void setStart(int x);//define o valor inicial

    //Retorna um array que contém os proximos
    //n elemento da Series após o elemento atual
    
    default int[] getNextArray(int n) //para recuperar elementos
    {
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = getNext();
        }
        return vals;
    }
    
    

}
