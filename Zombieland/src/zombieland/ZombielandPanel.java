package zombieland;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class ZombielandPanel extends JPanel implements ActionListener {
    private boolean isDay;
    private Image mano;//se declara para poder poner imagen
    private Image tumba,murci;
    private Image fondo,homero,terminator,generic;  
    private int x1,y1,x2,x3,x4,y2,y3,y4;
    Player player= new Player(); 
    Timer timer = new Timer(10,this); 
    
    private ZombielandPanel panel;
    public ZombielandPanel(int width, int height) {
        //Create the panel
        super();
        //Sets the size of the panel
        Dimension d = new Dimension(width, height);
        // I want to force this size so I use preferred, min and max
        // and set the same size for all of them
        setPreferredSize(d);
        setMinimumSize(d);
        setMaximumSize(d);
        isDay = true;
        setFocusable(true);
        addKeyListener(new teclado());
        timer.start();
      }
    
    public void toggle() {
        isDay = !isDay;
    }

    @Override
    public void paint(Graphics g) {
        // Create a Random to add tombs and hands
        Random rand = new Random();
        // Just for calling it with easier names
        int width = getWidth();
        int height = getHeight();
        
      
       Color tierra= new Color( 91, 64, 6 );
        
        if(isDay) {
            // CREATE A BACKGROUND 
        fondo = new ImageIcon(getClass().getResource("/zombieland/fondo.jpg")).getImage();//paa obtenr imagen
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(),this);//ponerla en el JPanel
 
        setOpaque(false);
        //super.paint(g);    
        }    
        else {
            // CREATE A BACKGROUND IN BLACK
            g.setColor(tierra);
            g.fillRect(0, 0, width, height);
        }
        murci = new ImageIcon(getClass().getResource("/zombieland/murcielago.gif")).getImage();
        g.drawImage(murci,50,200,100,100,this);
        //create zombies
        homero = new ImageIcon(getClass().getResource("/zombies/homeroRecto.png")).getImage();
        g.drawImage(homero,1050,40,112,146,this);
        generic = new ImageIcon(getClass().getResource("/zombies/genericoRecto.png")).getImage();
        g.drawImage(generic,1050,200,112,146,this);
        terminator= new ImageIcon(getClass().getResource("/zombies/terminatorRecto.png")).getImage();
        g.drawImage(terminator,1050,350,112,146,this);
        
        //put tombs and hands  
        mano = new ImageIcon(getClass().getResource("/zombieland/hand.png")).getImage();//paa obtenr imagen
        tumba = new ImageIcon(getClass().getResource("/zombieland/tumba.png")).getImage();
        x1=0;
        y1=60;
        g.drawImage(mano,x1=x1+50,y1,50,50,this);//ponerla en el JPanel
        g.drawImage(tumba,x1=x1+40,y1=y1+60,50,50,this);
        
        g.drawImage(mano,x1=x1+180,y1-50,50,50,this);//ponerla en el JPanel
        g.drawImage(tumba,x1=x1+40,y1=y1+45,50,50,this);
        
        g.drawImage(mano,x1=x1+120,y1-50,50,50,this);//ponerla en el JPanel
        g.drawImage(tumba,x1=x1+40,y1=y1+45,50,50,this);
        
        g.drawImage(mano,x1=x1+150,y1-120,50,50,this);//ponerla en el JPanel
        g.drawImage(tumba,x1=x1+40,y1=y1+45,50,50,this);
        
        g.drawImage(mano,x1=x1+120,y1-70,50,50,this);//ponerla en el JPanel
        g.drawImage(tumba,x1=x1+40,y1=y1+45,50,50,this);
        
        g.drawImage(mano,x1=x1+150,y1-50,50,50,this);//ponerla en el JPanel
        g.drawImage(tumba,x1=x1+40,y1=y1+45,50,50,this);
        
        g.drawImage(mano,1000,25,50,50,this);//ponerla en el JPanel
        g.drawImage(tumba,900,100,50,50,this);
        //2
        g.drawImage(mano,x1=0,y1=300,50,50,this);//ponerla en el JPanel
        g.drawImage(tumba,x1=x1+40,y1=y1+60,50,50,this);
        
        g.drawImage(mano,x1=x1+150,y1-50,50,50,this);//ponerla en el JPanel
        g.drawImage(tumba,x1=x1+40,y1=y1+45,50,50,this);
        
        g.drawImage(mano,x1=x1+100,y1-50,50,50,this);//ponerla en el JPanel
        g.drawImage(tumba,x1=x1+40,y1=y1+45,50,50,this);
        
        g.drawImage(mano,x1=x1+150,y1-50,50,50,this);//ponerla en el JPanel
        g.drawImage(tumba,x1=x1+40,y1=y1+45,50,50,this);
        
        g.drawImage(mano,x1=x1+100,y1-50,50,50,this);//ponerla en el JPanel
        g.drawImage(tumba,x1=x1+40,y1=y1+45,50,50,this);
        
        g.drawImage(mano,x1=x1+100,y1-50,50,50,this);//ponerla en el JPanel
        g.drawImage(tumba,x1=x1+40,y1=y1+45,50,50,this);
        
        g.drawImage(mano,270,560,50,50,this);//ponerla en el JPanel
        g.drawImage(tumba,70,530,50,50,this);
        
       
        //player
        
       
        g.drawImage(player.tenerImagen(), player.tenerX(), player.tenerY(), 112,146,null);//ponerla en el JPanel
       
        
}
public void actionPerformed(ActionEvent e){
    player.mover();
    repaint();
}  
private class teclado extends KeyAdapter{
    public void keyPressed (KeyEvent e){
        player.keyPressed(e);
    }
    public void keyReleased (KeyEvent e){
        player.keyReleased(e);
    }
} 
    

   
         
        

}
