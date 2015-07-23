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
import java.awt.Rectangle;
/**
 *
 * @author radioshack
 */
public class Unicorn {
    Timer Dtimer;
    private int x = 100;
    private int y = 1370;
    private int dx = 1;
     private int Lbound = 100;
    private int Rbound = 400;    
    private int framenum = 0;
    private int health = 5;
    private int camx;
    private int camy;
    private Rectangle laser;
    private int Kount = 0; 
    private int Kount2 = 0;
    private Image[] frames = new Image[16];
    private Image[] death = new Image[5];
    private int dethFrame = 0;
    private boolean left = false;
    private boolean die = false;
     private boolean once = false;
     private boolean shot = false;
     private boolean finite = false;
     private boolean deflect = false;
     private ImageIcon tem1;
      private ImageIcon tem2;
      private ImageIcon tem3;
      private ImageIcon tem4;
      private ImageIcon tem5;
       private ImageIcon tem6;
       private ImageIcon tem7;
       private ImageIcon tem8;
       private ImageIcon tem9;
        private ImageIcon tem1b;
        private ImageIcon tem2b;
        private ImageIcon tem3b;
        private ImageIcon tem4b;
        private ImageIcon tem5b;
        private ImageIcon tem6b;
        private ImageIcon tem7b;
        private ImageIcon tem8b;
        private ImageIcon tem9b;
    public  Unicorn() {
     tem1 = new ImageIcon(this.getClass().getResource("unicorn1.png"));
      tem2 = new ImageIcon(this.getClass().getResource("unicorn2.png"));
      tem3 = new ImageIcon(this.getClass().getResource("unicorn3.png"));
       tem4 = new ImageIcon(this.getClass().getResource("unicorn4.png"));
       tem5 = new ImageIcon(this.getClass().getResource("unicorn5.png"));
       tem6 = new ImageIcon(this.getClass().getResource("unicorn6.png"));
        tem7 = new ImageIcon(this.getClass().getResource("unicorn7.png"));
        tem8 = new ImageIcon(this.getClass().getResource("unicorn8.png"));
        tem9 = new ImageIcon(this.getClass().getResource("unicorn9.png"));
        tem1b = new ImageIcon(this.getClass().getResource("unicorn1b.png"));
      tem2b = new ImageIcon(this.getClass().getResource("unicorn2b.png"));
        tem3b = new ImageIcon(this.getClass().getResource("unicorn3b.png"));
        tem4b = new ImageIcon(this.getClass().getResource("unicorn4b.png"));
       tem5b = new ImageIcon(this.getClass().getResource("unicorn5b.png"));
       tem6b = new ImageIcon(this.getClass().getResource("unicorn6b.png"));
        tem7b = new ImageIcon(this.getClass().getResource("unicorn7b.png"));
        tem8b = new ImageIcon(this.getClass().getResource("unicorn8b.png"));
         tem9b = new ImageIcon(this.getClass().getResource("unicorn9b.png"));
    
    }

    public Image getImage() { 
        if(!left) {
        
        frames[0] = tem1.getImage();
        frames[1] = tem2.getImage();
        frames[2] = tem3.getImage();
        frames[3] = tem4.getImage();
        frames[4] = tem5.getImage();
        frames[5] = tem8.getImage();
        frames[6] = tem9.getImage();
        frames[7] = tem1.getImage();
        frames[8] = tem2.getImage();
        frames[9] = tem3.getImage();
        frames[10] = tem4.getImage();
        frames[11] = tem5.getImage();
        frames[12] = tem6.getImage();
        frames[13] = tem7.getImage();
        frames[14] = tem8.getImage();
        frames[15] = tem9.getImage();
        if(framenum > 15) {
            framenum = 0;
            
        }
        }
        else {
             
        frames[0] = tem1b.getImage();
        frames[1] = tem2b.getImage();
        frames[2] = tem3b.getImage();
        frames[3] = tem4b.getImage();
        frames[4] = tem5b.getImage();
        frames[5] = tem8b.getImage();
        frames[6] = tem9b.getImage();
        frames[7] = tem1b.getImage();
        frames[8] = tem2b.getImage();
        frames[9] = tem3b.getImage();
        frames[10] = tem4b.getImage();
        frames[11] = tem5b.getImage();
        frames[12] = tem6b.getImage();
        frames[13] = tem7b.getImage();
        frames[14] = tem8b.getImage();
        frames[15] = tem9b.getImage();
        if(framenum > 15) {
            framenum = 0;
        }
        }
        return frames[framenum];
    }
    
    public void setDeflect(boolean choice) {
        deflect = choice;
    }
    
    public Image getDeath() {
        ImageIcon temp = new ImageIcon(this.getClass().getResource("blood4.png"));
        death[0] = temp.getImage();
         temp = new ImageIcon(this.getClass().getResource("blood5.png"));
         death[1] = temp.getImage();
          temp = new ImageIcon(this.getClass().getResource("blood6.png"));
          death[2] = temp.getImage();
           temp = new ImageIcon(this.getClass().getResource("blood7.png"));
          death[3] = temp.getImage();
           temp = new ImageIcon(this.getClass().getResource("blood8.png"));
          death[4] = temp.getImage();
          Kount2++;
          if(Kount2 % 6 == 0) {
              dethFrame++;
          }
          if(dethFrame > 4) {
              dethFrame = 4;
              Kount2 = 0;
          }
          return death[dethFrame];
    }
     public void die(int y) {
     if ( health > 0 && y == 0 ) {
         health--;
     }
     if (health <= 0) {
         die = true;
     }
 }
     
      public boolean getDie() {
     return die;
 }
      
      public int getDframe() {
          return dethFrame;
      }
  
    
    public void setCam(int cX, int cY) {
        camx = cX;
        camy = cY;
    }
     public void setBound(int l, int r) {
     Lbound = l;
     Rbound = r; 
 }
     public boolean getShot() {
         return shot;
     }
     public boolean getLeft() {
         return left;
     }
 
 public Rectangle getLaser() {
     return laser;
 }
 public int getFrameNum() {
     return framenum;
 }
 public void setX( int z) {
     x = z;
 }
 public void setY(int d){
     y = d;
 }
 public int getX() {
     return x;
 }
 public int getY() {
     return y;
 }
   public void UniAI() {
     if(!die) {
       if(x > Rbound) {
           left = true;
       }
        if(x < Lbound) {
           left = false;
       }
        if(left && framenum != 13) {
            x--;
            
            shot = false;
            deflect = false;
            dx = 1;
           
        }
        else if( framenum != 13){
            x++;
            
            shot = false;
            deflect = false;
            
            dx = 1;
             
        }
         if(left && framenum == 13) {
             if(dx > - 70 && !finite) {
             shot = true;
             finite = true;
             }
             if(Kount % 150 == 0) {
             x--;
             }
            
         }
          else if( framenum == 13){
             if(Kount % 150 == 0) {
             x++;
             }
             if(dx > -130 && !finite) {
             shot = true;
             finite = true;
             }
             
              
        }
         
         if(framenum != 13){
             finite = false;
         }
        Kount++;
        if (Kount % 6 == 0 && framenum != 13) {
            framenum++;
        }
        if (Kount % 150 == 0 && framenum == 13) {
            framenum++;
        }
        if (shot && left && !deflect) {
            dx += 2;
            laser = new Rectangle(x - 25 -dx + camx , y + 30 + camy, 10, 3 );
        }
        else if(shot && left && deflect) {
            dx -= 8;
            laser = new Rectangle(x - 30 -dx + camx, y + 30 + camy, 10, 3 );
            if (dx <= -150) {
                shot = false;
                deflect = false;
                die(0);
                die(0);
            }
        }
         if (shot && !left && !deflect) {
            dx += 2;
            laser = new Rectangle(x + 125 +dx + camx, y + 30 + camy, 10, 3 );
        }
         else if(shot && !left && deflect) {
             dx -= 8;
            laser = new Rectangle(x + 130 +dx + camx, y + 30 + camy, 20, 3 );
            if (dx <= -150) {
                shot = false;
                deflect = false;
                die(0);
                die(0);        
            }
         }
         if(!shot){
            // dx = -20;
             dx = 1;
         }
   }
   }
     
}


