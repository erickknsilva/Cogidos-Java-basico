/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

/**
 *
 * @author eric
 */
public class TabelaLogicaOp {

    public static void main(String[] args) {
        boolean p, q;
        p = true;
        q = true;

        System.out.println("P\tQ\tAnd\tOr\tXor\tNot");

        System.out.println(p + "\t" + q + "\t");
        System.out.println((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));
        
        p = true;
        q = false;
        
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));
    }
}
