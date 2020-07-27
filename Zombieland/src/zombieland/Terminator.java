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
public class Terminator extends Zombie{
    public Terminator() {
        super("Terminator", 2, 25, 20);
    }
    public Terminator(boolean direction, int speed, int life, int attack) {
        super("Terminator", 2, life, attack);
    }
}
