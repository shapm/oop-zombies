package zombieland;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
        


/**
 *
 * @author abram
 */
public class ZombielandFrame  extends JFrame{
   private ZombielandPanel panel;
    private JButton button;

    public ZombielandFrame() {
        // Calls the parent constructor and adds a title
        super("Zombieland");
        // This is the size of the window in pixels
        setSize(1200, 700);
        // We don't want the size to change so we don't have
        // to recalculate the board
        setResizable(false);
        // We cant for the window to be closed when you click on the x
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create a new Button
        button = new JButton("Day/Night");
        // Add the Action Listener
        button.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              // Everything in here is the code that will be executed
              // when the user clicks on the button
              panel.toggle();
              panel.repaint();
          }
        });
        // Add it to the SOUTH of the Border Layout
        add(button, BorderLayout.SOUTH);
        // Creates the Panel
        panel = new ZombielandPanel(1000, 700);
        // Adds the panel to the Frame
        add(panel, BorderLayout.CENTER);
        // This is for showing the window
        setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZombielandFrame frame = new ZombielandFrame();
    }
}
