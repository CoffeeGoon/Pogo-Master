/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pogo.master.Level_1;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author radioshack
 */
public class Alien { 
    private int x = 267;
    private int range;
    private int dx = 1;
    private int y = 340;
    private int countdown = 1000;
    private  int start;
    private int length = 35;
    private int width = 28;
    private  int rLimit = 133 + x ;
    private  int lLimit = x - 37; 
    public ImageIcon framez[];
    public int FrameNum = 0;
    private int Kount = 3;
    private Image Imagez;
    private boolean left = true;
    private Rectangle area;
    private boolean Alive = true;
    private boolean antiRepeat = true;
    private final int MINUTES = 1;
   // private Timer Dtime;
    TimerTask task;
public int getX() {
    return x;
}
public int getFnum() {
    return FrameNum;
    
}
Alien(){
   // Dtime = new Timer();
    
}
public void setCoor(int cx, int cy ) {
    x = cx; 
    y = cy;
}
public void setLim( int Liml, int Limr) {
    lLimit = Liml;
    rLimit = Limr;
}
public void setFnum(int change) {
    FrameNum = change;
}

public int getY() {
    return y;
}
public boolean getAlive() {
    return Alive;
}
public void die() {
    Alive = false;
}
public void alive() {
    if(!Alive) {
    Alive = true;
    FrameNum = 0;
    y = start;
    }
}
//public void Recarn()  {
   //if(!Alive){
 //Dtime.schedule( new Foo() , 15 * 1000);
         //} 
// }
//public class Foo extends TimerTask {
 //  public void run() {
    //   if(!Alive) {
      //  alive();
        
      // }
      // Dtime.cancel();
      // Dtime = new Timer();
//}
//}

public Rectangle getArea() {
    area = new Rectangle(getX() + 5, getY() + 5, 25 , 25);
    return area;
}
public void Alien(int z, int a) {
    framez = new ImageIcon[7];
    framez[0] = new ImageIcon(this.getClass().getResource("Alienframe1.png"));
    framez[1] = new ImageIcon(this.getClass().getResource("Alienframe2.png"));
    framez[2] = new ImageIcon(this.getClass().getResource("Alienframe3.png"));
    Imagez = framez[FrameNum].getImage();
    x = z;
    y = a;
    rLimit = 133 + x ;
     lLimit = x - 37; 
     start = y;
    // Dtime = new Timer();
   
}
public void setStart(int yl) {
    start = yl;
}
public Image getFrame() {
     framez = new ImageIcon[8];
    framez[0] = new ImageIcon(this.getClass().getResource("Alienframe1.png"));
    framez[1] = new ImageIcon(this.getClass().getResource("Alienframe2.png"));
    framez[2] = new ImageIcon(this.getClass().getResource("Alienframe3.png"));
    framez[3] = new ImageIcon(this.getClass().getResource("Alienframe4.png"));
    framez[4] = new ImageIcon(this.getClass().getResource("Alienframe5.png"));
    framez[5] = new ImageIcon(this.getClass().getResource("Alienframe6.png"));
    framez[6] = new ImageIcon(this.getClass().getResource("Alienframe7.png"));
    framez[7] = new ImageIcon(this.getClass().getResource("blood.png"));
    Imagez = framez[FrameNum].getImage();
    return Imagez;
}
public void AlienAI() {
 if (Alive) {
    if( x <= lLimit) {
       left = false;
    }
    else if (x >= rLimit) {
        left = true;
    }
    if(left) {
        x -= dx;
    }
    else if(!left) {
        x += dx;
    }
    if(x % 5 == 0) {
        Kount++;
        FrameNum = Kount % 3;
    }
 }
 else if (FrameNum < 8){
        FrameNum ++;
         y -= 5;
     }
 if(!Alive){
     countdown--;
     if(countdown <= 0){
         alive();
         countdown = 1000;
     }
 }
 }
}



