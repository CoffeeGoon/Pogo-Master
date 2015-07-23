/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pogo.master.Level_1;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author radioshack
 */
public class Vine {
    private ImageIcon[] Veanstalk = new ImageIcon[10];
    private int x;
    private int y;
    Vine() 
    {
 
        Veanstalk[0] = new ImageIcon(this.getClass().getResource("beanstalk1.png"));

       Veanstalk[1] = new ImageIcon(this.getClass().getResource("beanstalk2.png"));
     
         Veanstalk[2] = new ImageIcon(this.getClass().getResource("beanstalk3.png"));
  
        Veanstalk[3] = new ImageIcon(this.getClass().getResource("beanstalk4.png"));
 
         Veanstalk[4] = new ImageIcon(this.getClass().getResource("beanstalk5.png"));

        Veanstalk[5]  = new ImageIcon(this.getClass().getResource("beanstalk6.png"));
  
        Veanstalk[6] = new ImageIcon(this.getClass().getResource("beanstalk7.png"));
     
         Veanstalk[7] = new ImageIcon(this.getClass().getResource("beanstalk8.png"));
     
           Veanstalk[8] = new ImageIcon(this.getClass().getResource("beanstalk9.png"));
    
         Veanstalk[9]  = new ImageIcon(this.getClass().getResource("beanstalk10.png"));
     
        x = 200;
        y = 200;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void growthPattern() {
        y -= 1;
    } 
    

    public Image getSection(int frame) {
        Image stalk = Veanstalk[frame].getImage();
        return stalk;
    }
    
}
