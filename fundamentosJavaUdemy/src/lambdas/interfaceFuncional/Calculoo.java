/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lambdas.interfaceFuncional;

/*marca que a interface é funcional e interface funcional 
só pode ter um metodo se tiver mais de um ela ira apresentar um erro, 
pedindo para removera marcacao de interface funcional = @FunctionalInterface*/
@FunctionalInterface

public interface Calculoo {

    double executar(double a, double b);
//obs: interface funcional tambem aceita o metodo default/padrao e static
//double soma(int a, int b); tente isso para ler o comentario acima de @FunctionalInterface
}
