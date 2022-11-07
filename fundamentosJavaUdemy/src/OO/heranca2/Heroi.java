/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.heranca2;

/**
 *
 * @author eric
 */
public class Heroi extends Jogador {
    
    int dano;
    
    public Heroi() {
        
    }

    public Heroi(int x, int y) {
        super(x, y);
    }
    
    public boolean atacar(Jogador ob) {
        int deltaX = Math.abs(x - ob.x);
        int deltaY = Math.abs(y - ob.y);
        
        if (deltaX == 0 && deltaY == 1) {
            ob.vida -= 20;
            this.dano += 20;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            ob.vida -= 20;
            this.dano += 20;
            
            return true;
        }
        return false;
    }
    
    public String danoHeroi() {
        return "Monstro recebeu " + dano + " de dano do heroi ";
    }
    
}
