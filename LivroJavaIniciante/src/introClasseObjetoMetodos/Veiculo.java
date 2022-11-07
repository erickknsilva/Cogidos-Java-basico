/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introClasseObjetoMetodos;

/**
 *
 * @author eric
 */
public class Veiculo {
     
    int passageiros, tankCombustivel, mpgaloes;
    int i;
    
    int range(){ //Autonomia de um determinado veiculo
        return tankCombustivel * mpgaloes;
    }
        
    double combNecessario(int milhas){
        return (double) milhas / mpgaloes;
    }
}
