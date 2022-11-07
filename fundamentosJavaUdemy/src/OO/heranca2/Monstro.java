/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.heranca2;

/**
 *
 * @author eric
 */
public class Monstro extends Jogador {

    int dano;

    public Monstro() {

    }
    public Monstro(int x, int y) {
        super(x, y);
    }

     public boolean atacar(Jogador ob) {
        int deltaX = Math.abs(x - ob.x);
        int deltaY = Math.abs(y - ob.y);

        if (deltaX == 0 && deltaY == 1) {
            ob.vida -= 15;
            this.dano += 15;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            ob.vida -= 15;
            this.dano += 15;
            return true;
        }
        return false;
    }

    public String danoMonstro() {
        return "Heroi recebeu " + dano + " de dano do monstro ";
    }

}
