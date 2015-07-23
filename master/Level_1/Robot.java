/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pogo.master.Level_1;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author radioshack
 */
public class Robot  {
    Timer Dtimer;
    private int x = 200;
    private int y;
    private int dx = 1; 
    private int Lbound = 100;
    private int Rbound = 400;    
    private int framenum = 0;
    private int health = 3;
    private int camx;
    private int camy;
    private int Kount = 0; 
    private int dethFrame = 0;
    private boolean left = false;
    private boolean die = false;
    private Timer Dtime;
    TimerTask task;
    ImageIcon frames[] = new ImageIcon[6];
    ImageIcon splosion[] = new ImageIcon[16];
  public void Robot() {
    x = 200;
    y = 1390;
     dx = 1; 
    Lbound = 100;
    Rbound = 400;    
   framenum = 0;
     camx = 0;
       camy = 0;
       Kount = 0;
  }
 public Image getImage() {
     frames[0] = new ImageIcon(this.getClass().getResource("Robot1.png"));
     frames[1] = new ImageIcon(this.getClass().getResource("Robot2.png"));
     frames[2] = new ImageIcon(this.getClass().getResource("Robot3.png"));
     frames[3] = new ImageIcon(this.getClass().getResource("Robot4.png"));
     frames[4] = new ImageIcon(this.getClass().getResource("Robot5.png"));
     frames[5] = new ImageIcon(this.getClass().getResource("Robot6.png"));
     Image temp =  frames[framenum].getImage();
     return temp;
}
 public Image getDeth() {
      Kount++;
      if (Kount % 3 == 0) {
          dethFrame++;
      }
     splosion[0] = new ImageIcon(this.getClass().getResource("splosion1.png"));
     splosion[1] = new ImageIcon(this.getClass().getResource("splosion2.png"));
     splosion[2] = new ImageIcon(this.getClass().getResource("splosion3.png"));
     splosion[3] = new ImageIcon(this.getClass().getResource("splosion4.png"));
     splosion[4] = new ImageIcon(this.getClass().getResource("splosion5.png"));
     splosion[5] = new ImageIcon(this.getClass().getResource("splosion6.png"));
     splosion[6] = new ImageIcon(this.getClass().getResource("splosion7.png"));
     splosion[7] = new ImageIcon(this.getClass().getResource("splosion8.png"));
     splosion[8] = new ImageIcon(this.getClass().getResource("splosion9.png"));
     splosion[9] = new ImageIcon(this.getClass().getResource("splosion10.png"));
     splosion[10] = new ImageIcon(this.getClass().getResource("splosion11.png"));
     splosion[11] = new ImageIcon(this.getClass().getResource("splosion12.png"));
     splosion[12] = new ImageIcon(this.getClass().getResource("splosion13.png"));
     splosion[13] = new ImageIcon(this.getClass().getResource("splosion14.png"));
     splosion[14] = new ImageIcon(this.getClass().getResource("splosion15.png"));
     splosion[15] = new ImageIcon(this.getClass().getResource("splosion16.png"));
     if (dethFrame > 15) {
         dethFrame = 15;
     }
     Image temp = splosion[dethFrame].getImage();
     return temp;
 }
 public int getXy() {
     return x;
 }
 public void setBound(int l, int r) {
     Lbound = l;
     Rbound = r;
 }
 public boolean getDie() {
     return die;
 }
 public int getDframe() {
     return dethFrame;
 }
 public void setX( int xe) {
     x = xe;
 }
 public void setCamx(int x) {
     camx = x;
 }
 public int getY() {
     return y;
 }
 public void setY(int ye) {
     y = ye;
 }
 public void die(int y) {
     if ( health > 0 && y == 0 ) {
         health--;
     }
     if (health <= 0) {
         die = true;
     }
 }
 public void Recarn()  {
    
        Dtime = new Timer();
 Dtime.schedule( new Foo() , 15 * 1000); 
  
    
 
}
 public void end(){
     Dtime.cancel();
 }
 public void alive() {
    if(die) {
    die = false;
    health = 3;
    framenum = 0;
    dethFrame = 0;
    
    }
}
 public class Foo extends TimerTask {
  public void run() {
       if(die) {
        alive();
       }
        Dtime.cancel();
     }
}
public void robotAI() {
    
    if(!die) {
     if( x == Rbound ) {
         left = true;
        
     }
    else if(x == Lbound ) {
         left = false;
      
     }
     if (left) {
        x -= dx;
    }
    if(!left) {
        x += dx;
    }
     if(x % 15 == 0) {
         Kount++;
         if(!left){
         framenum = Kount % 3;
     }
         else{
             framenum = (Kount % 3) + 3;
         }
        
    }
    
}


}
    
}
