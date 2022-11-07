/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

public class PesoNaLua {

    public static void main(String[] args) {

        double pesoTerra = 85, divPeso = 9.81, metSeg = 1.622, pesoLua;

        pesoLua = (pesoTerra / divPeso) * metSeg;

        System.out.printf("Peso na lua = %.2f", pesoLua);

    }
}
