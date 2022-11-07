/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Capitulo12enumautoboxing.enumeracoes;

//enumeraçao de meio de transporte
public enum Transport {
    /*
    uma vez que tiver definido uma enumeração, podera criar uma variavel
    desse tipo. No entanto, ainda que as enumeraçoes definam um tipo de classe,
    voce nao pode instanciar uma enum usando new. Em vez disso deve declarar e 
    usar uma variavel de enumeração de maneira semelhante ao que faria com os tipos
    primitivos. por exemplo Transport tp; tp = Transport.AIRPLANES;
     */
    CAR("Ferrari", 65), TRUCK("Volvo", 55), AIRPLANE("Boeing", 600), TRAIN("Cptm", 70), BOAT("Canoa", 22);
//    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(60);

    private int speed;
    private String nome;

    /*
    contrutor do tipo de Transport recebe um tipo inteiro, o construtor 
    é executado assim  CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(60)
    automaticamente o construtor de enum é chamado.
     */
    Transport(String n, int s) {
        this.speed = s;
        this.nome = n;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getNome() {
        return this.nome;
    }
}
