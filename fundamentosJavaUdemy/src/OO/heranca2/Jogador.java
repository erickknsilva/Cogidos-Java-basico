/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.heranca2;

/**
 *
 * @author eric
 */
public class Jogador {

    int vida = 100;
    int x;
    int y;

    Jogador() {

    }

    protected Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean atacar(Jogador ob) {
        int deltaX = Math.abs(x - ob.x);
        int deltaY = Math.abs(y - ob.y);

        if (deltaX == 0 && deltaY == 1) {
            ob.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            ob.vida -= 10;
            return true;
        }
        return false;
    }

//    boolean atacarMonstro(Jogador ob) {
//        int deltaX = Math.abs(x - ob.x);
//        int deltaY = Math.abs(y - ob.y);
//
//        if (deltaX == 0 && deltaY == 1) {
//            ob.vida -= 20;
//            return true;
//        } else if (deltaX == 1 && deltaY == 0) {
//            ob.vida -= 20;
//            return true;
//        }
//        return false;
//    }
    public boolean andou(Direcao direcao) {
        if (direcao == Direcao.NORTE) {
            y--;
        }
        if (direcao == Direcao.LESTE) {
            x++;
        }
        if (direcao == Direcao.SUL) {
            y++;
        }
        if (direcao == Direcao.OESTE) {
            x--;
        }
        return true;
    }

    public int getVida() {
        return this.vida;
    }

    void andouNorte() {
        y--;

    }

    void andouSul() {
        y++;
    }

    void andouLeste() {
        x++;
    }

    void andouOeste() {
        x--;
    }

}
