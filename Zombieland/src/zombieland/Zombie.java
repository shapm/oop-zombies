/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

import java.util.Random;

/**
 *
 * @author luisderek
 */
public class Zombie {
    protected String name;
    protected int speed;
    protected int life;
    protected int attack;
    protected int posiX;
    protected int posiY;
    
    // Constructor without parameters
    public Zombie() {
        this.name = "Zombie";
        this.speed = 0;
        this.life = 0;
        this.attack = 0;
        
    }
    
    // Constructor with parameters
    public Zombie(String name, int speed, int life, int attack) {
        this.name = name;
        this.speed = speed;
        this.life = life;
        this.attack = attack;
    }
    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getLife() {
        return life;}
  
    public void setLife(int life) {
        this.life = life;
    }
   
    public int getAttack() {
        return attack;}
   
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void mover(){
        Random rand = new Random();
        posiX = rand.nextInt();
        posiY = rand.nextInt();
    }
    
    public int tenerX(){
        return posiX;
    }
    
    public int tenerY(){
        return posiY;
    }
}
