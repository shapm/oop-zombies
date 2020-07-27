/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

/**
 *
 * @author luisderek
 */
public class Generic extends Zombie {
    public Generic() {
        super("Generic", 2, 20, 10, 0, 0);
    }
    public Generic(int posiX, int posiY, int speed, int life, int attack) {
        super("Generic", 2, life, attack, posiX, posiY);
        
    }
}
