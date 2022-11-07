/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo8PacotesEInterface.fundamentosMetodosPadraoDeInterface;

/**
 *
 * @author eric
 */
interface MyIf {

    //esta é uma declaração "comun" de metodos de uma interface.
    //Ela não define uma implementação padrao.
    int getUserID();

    //Este é um método padrão. Observe que ele fornece.
    //Uma implementação padrão.
    default int getAdminID() {
        return 1;
    }
}
