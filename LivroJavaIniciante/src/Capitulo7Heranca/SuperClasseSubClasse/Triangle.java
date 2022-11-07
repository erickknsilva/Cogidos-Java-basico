/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.SuperClasseSubClasse;

/**
 *
 * @author eric
 */
public class Triangle extends TwoDShape { //herdadndo a classe TwoDShape, suas variaveis de instancia  e metodos

    String style;

    double area() {
        return (width * heigth) / 2; //variaveis instanciadas na classe TwoDShape
    }

    void showStyle() { //metodo para ler o tipo do triangulo
        System.out.println("O tipo do triangulo: " + this.style);
    }

}
