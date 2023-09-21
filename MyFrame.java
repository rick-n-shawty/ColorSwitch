package ColorChangeApp;

import javax.swing.JFrame;
import java.awt.Color; 
import java.util.Random; 
public class MyFrame extends JFrame {
    Random random = new Random(); 
    public MyFrame(){
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(450, 650);
        this.getContentPane().setBackground(new Color(0,0,0));
    }
    public void setBackground(){
        int r = random.nextInt(255); 
        int g = random.nextInt(255);
        int b = random.nextInt(255); 
        this.getContentPane().setBackground(new Color(r, g, b));
    }
}
