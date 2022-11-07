/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo7Heranca.EstendendoAClasseVeiculo;

/**
 *
 * @author eric
 */
public class TruckDemo {

    public static void main(String[] args) {
        //constroi caminhoes

        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);

        double gallons;
        int dist = 252;
        gallons = semi.combNecessario(dist);

        System.out.println("Semi pode transportar " + semi.getPassagers() + " passageiros, a "
                + semi.getCargo() + " libras.");

        System.out.println("Para ir " + dist + " milhas semi precisa " + gallons
                + " gallões de combustiveis. \nSua autonomia é de " + semi.range() + "km.\n");

        gallons = pickup.combNecessario(dist);

        System.out.println("Pickup pode transporta " + pickup.getPassagers() + " passageiros, a "
                + pickup.getCargo() + " libras.");

        System.out.println("Para ir " + dist + " milhas pickup precisa " + gallons
                + " galões de combustiveis. \nSua autonomia é de " + pickup.range() + "km.\n");

    }

}
