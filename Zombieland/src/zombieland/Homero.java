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
public class Homero extends Zombie{
    public Homero() {
        super("Homero", 1, 10, 5, 0, 0);
    }
    public Homero(int posiX, int posiY, int speed, int life, int attack) {
        super("Homero", 2, life, attack, posiX, posiY);
    }
}
