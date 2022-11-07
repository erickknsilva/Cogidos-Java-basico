/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo13tiposgenericos.interfacegenerica5.interfacegenericade1tipo;

/**
 *
 * @author eric
 */
public class MyDemo {
    
    public static void main(String[] args) {
        
        Integer[] nums = {1, 2, 3};
        
        MyClass<Integer> obj = new MyClass<>(nums);
        System.out.println(obj.contains(3));
        
        Double[] nums2 = {1.2, 2.2, 3.2};
        MyClass<Double> obj2 = new MyClass<>(nums2);
        
        System.out.println(obj2.contains(2.2));
        
    }
}
