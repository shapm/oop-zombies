
package zombieland;

import java.awt.Image;
import java.awt.event.KeyEvent;
import static java.lang.Math.abs;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author abraham
 */
public class Player {
    private Image personaje;      
    private int dx;//aux. for move player
    private int dy; 
    private int x,y;//position player 
    private int r; 
    
    
    public Player(){
        x=0;
        y=0;
        
    }
  
    public void keyPressed(KeyEvent e) {//metodo para mover al personaje
       
        try{
            
     int key =  e.getKeyCode();
     if (key == KeyEvent.VK_LEFT){
         dx= -2;
         personaje= new ImageIcon(getClass().getResource("/player/lateralIzquierdo.png")).getImage();    
  
         //personaje= new ImageIcon(getClass().getResource("/player/lateralLevantadoIzquierdo.png")).getImage();    
         }
    if (key == KeyEvent.VK_RIGHT){
         dx= 2;
        personaje= new ImageIcon(getClass().getResource("/player/lateralDerecho.png")).getImage();//paa obtenr imagen
         }
    if (key == KeyEvent.VK_UP){
         dy= -2;
         personaje= new ImageIcon(getClass().getResource("/player/traseroDerescho.png")).getImage();
         }
    if (key == KeyEvent.VK_DOWN){ 
         dy= 2;
         personaje= new ImageIcon(getClass().getResource("/player/frontalDerecho.png")).getImage();//paa obtenr imagen
         }
    }
        catch(Exception nfe){
        System.out.print("Escogiste un tecla incorrecta");
        }
}
            
    public void keyReleased(KeyEvent e) {
         int key =  e.getKeyCode();
     if (key == KeyEvent.VK_LEFT){
         dx= 0;
         }
    if (key == KeyEvent.VK_RIGHT){
         dx= 0;
         }
    if (key == KeyEvent.VK_UP){
         dy= 0;
         }
    if (key == KeyEvent.VK_DOWN){
         dy= 0;
         }     
    }
    
    public void mover(){
        x+=dx;
        y+=dy;
    }
    
    public int tenerX(){
        return x;
    }
    
    public int tenerY(){
        return y;
    }
    
    public Image tenerImagen(){
        return personaje;
    }
    
}

