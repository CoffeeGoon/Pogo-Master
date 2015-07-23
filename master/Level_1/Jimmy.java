/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pogo.master.Level_1;
import java.awt.Image;
import java.awt.event.KeyEvent;
import pogo.master.Level_1.Board;
import javax.swing.ImageIcon;

public class Jimmy {
    private int lives = 3;
     private int x = 30;
     private int y  = 300;
     private int dy = 0;
     private int dy2 = 1;
     private int dx = 0;
     private int dx2 = 0;
     private int cameraX = 0;
     private int cameraY = -1100;
     private int kount = 0;
     private int subKount = 0;
     private int subKount2 = 0;
     private Image Image;
     private int base = 310;
     private int top = 260;
     private ImageIcon[] Frames;
     private  boolean jump = true;
     private boolean change = false;
     private boolean once = false;
     private boolean Lside = true;
     private boolean Rside = false;
     private boolean zoom = false;
     private boolean intro = false;
     private boolean reflect = false;
     private boolean drizz = false;
     private boolean drilldive = false;
     private boolean supjump = false;
     private int rebound = 0;
     private boolean finalbattle = false;
     private int level = 1;
     private int part = 1;
     
     public void setLives(int deth) {
         lives += deth;
     }
     public boolean getOnce(){
         return once;
     }
     public void notOnce(){
         once = false;
     }
     public boolean counter(){
         return reflect;
     }
     public void swoosh(boolean a){
         supjump = a;
     }
       public void pivot(boolean a){
         change = a;
     }
     public void setSide() {
           Lside = true;
           Rside = false;
     }
     public void setpart(int n){
         part = n;
     }
     public void setRSide() {
         Lside = false;
         Rside = true;
     }
     public void negSide() {
         Lside = false;
         Rside = false;
     }
     public void Finale(){
         finalbattle = true;
     }
     public void NoFin(){
         finalbattle = false;
     }
     
     public int getLives() {
         return lives;
     }
     public void setLevel(int l) {
         level = l;
     }
     public boolean getIntro() {
         return intro;
     }
    
     public void setZoom( boolean boing) {
         zoom = boing;
     }
     public boolean getZoom() {
         return zoom;
     }
     public void setDy2( int y) {
         dy2 = y;
     }
     public void Omega(){
         drizz = true;
     }
     public void setCam(int x, int y) {
         cameraX = x;
         cameraY = y;
     }
   public void move() {
         x+= dx;
         if (dy2 > 1) {
             base += 2;
         }
          if(level == 4 && cameraX > -1){
                  Lside = true;
                  cameraX -= 1;
              }
              if( level == 4 && cameraX <= -2660 && !change){
                Rside = true;
                cameraX += 1;
            }
              if(level == 4 && cameraX <= -2000 && cameraX >= -2310 && !change ){
                 Lside = true;
                 cameraX -= 1;
             }
         cameraX -= dx2;
         cameraY -= dy;
         if(finalbattle && cameraX >= -595){
             rebound = 1;
         }
         if(finalbattle && cameraX <= -795){
             rebound = 2;
         }
         if(rebound == 1){
             cameraX -= 2;
             Lside = true;
             x--;
             if(cameraX <= -635){
                 
                 rebound = 0;
             }
         }
         if(rebound == 2){
             cameraX += 2;
             x++;
             Rside = true;
             if(cameraX >= -755){
                 
                 rebound = 0;
             }
         }
         if(level == 4 && x < 15 && dx < 0 ){
             x += 1;
         }
         if(level == 4 && x > 485 && dx > 0){
             x -= 1;
         }
         if(level == 4 && cameraY > 6){
             cameraY  -= 1;
         }
     }
   public int getX() {
    return x;
}
   public int getDy(){
       return dy;
   }
   public char getSide(){
       if(Rside) {
           return 'r';
       }
       else if(Lside) {
           return 'l';
       }
       else{ return 'n';}
   }
   public int GetTop() {
       return top;
   }
   public void setTop(int t) {
       top -= t;
   }
   public int GetBase() {
       return base;
   }
   public int getY() {
       return y;
   }
   public void setX(int a) {
       x = a;
   }
   public void setY(int b) {
       y = b;
   }
   public int getBase() {
       return base;
   }
  public int getCamx() {
      return cameraX;
  }
  public int getCammy() {
      return cameraY;
  }
   public void setDx(int cancel) {
       dx = cancel;
   }
   public void setDx2(int cancel) {
       dx2 = cancel;
   }
   public int getKount() {
       return subKount2;
   }
   public void setBase(int bs) {
       base = bs;
   }
   public void setDy(int cancel) {
       dy = cancel;
   }
    public void Cykle() {
        if(y >= base) {
            jump = false;
        
        }
        if (y <= top) {
            jump = true;
        }
        if (jump) {
            y+= dy2;
        }   
        else {
            y-= 1;
            if(finalbattle){
                y++;
                y-= dy2;
            }
        }
        if (y == base) {
            once = false;
        }
       if( kount < 100) {
           kount++;
       }
    }
    
    
    public Image getReflect() {
        if(reflect && kount % 100 == 0){
            ImageIcon[] reflects = new ImageIcon[12];
            reflects[0] = new ImageIcon(this.getClass().getResource("reflect1.png"));
            reflects[1] = new ImageIcon(this.getClass().getResource("reflect2.png"));
            reflects[2] = new ImageIcon(this.getClass().getResource("reflect3.png"));
            reflects[3] = new ImageIcon(this.getClass().getResource("reflect4.png"));
            reflects[4] = new ImageIcon(this.getClass().getResource("reflect5.png"));
            reflects[5] = new ImageIcon(this.getClass().getResource("reflect6.png"));
            reflects[6] = new ImageIcon(this.getClass().getResource("reflect7.png"));
            reflects[7] = new ImageIcon(this.getClass().getResource("reflect8.png"));
            reflects[8] = new ImageIcon(this.getClass().getResource("reflect9.png"));
            reflects[9] = new ImageIcon(this.getClass().getResource("reflect10.png"));
            reflects[10] = new ImageIcon(this.getClass().getResource("reflect11.png"));
            reflects[11] = new ImageIcon(this.getClass().getResource("reflect12.png"));
            subKount++;
             if(reflect && subKount > 11) {
            subKount = 0;
            kount = 0;
            reflect = false;
            return null;
        }
            return reflects[subKount].getImage();
        }
       
        return null;
    }
    
    public boolean getDive(){
        return drilldive;
    }
    public Image getReflect2() {
        if(reflect && kount % 100 == 0){
            ImageIcon[] reflects = new ImageIcon[12];
            reflects[0] = new ImageIcon(this.getClass().getResource("reflect1B.png"));
            reflects[1] = new ImageIcon(this.getClass().getResource("reflect2B.png"));
            reflects[2] = new ImageIcon(this.getClass().getResource("reflect3B.png"));
            reflects[3] = new ImageIcon(this.getClass().getResource("reflect4B.png"));
            reflects[4] = new ImageIcon(this.getClass().getResource("reflect5B.png"));
            reflects[5] = new ImageIcon(this.getClass().getResource("reflect6B.png"));
            reflects[6] = new ImageIcon(this.getClass().getResource("reflect7B.png"));
            reflects[7] = new ImageIcon(this.getClass().getResource("reflect8B.png"));
            reflects[8] = new ImageIcon(this.getClass().getResource("reflect9B.png"));
            reflects[9] = new ImageIcon(this.getClass().getResource("reflect10B.png"));
            reflects[10] = new ImageIcon(this.getClass().getResource("reflect11B.png"));
            reflects[11] = new ImageIcon(this.getClass().getResource("reflect12B.png"));
            subKount2++;
             if(reflect && subKount2 > 11) {
            subKount2 = 0;
  
            return null;
        }
            return reflects[subKount2].getImage();
        }
       
        return null;
    }
    
    
    
    public boolean getJump() {
        return jump;
    }
   public void  keyPressed(KeyEvent e) {
        if(!zoom) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT && !drizz)
        {   if(level == 1)
            {
            dx = -1;
            }
            if(level == 2 && Lside &&  x <= 230 ) {
                dx = -1;
                dx2 = 0;
                
            }
             else if(level == 2 && Rside && x >= 230) {
                dx = -1;
                dx2 = 0;
               
            }
               else if(level == 2 ) {
                dx2 = -1;
                dx = 0;
              
                if (cameraX  > -1) {
                    dx = -1;
                    Lside = true;
                    Rside = false;
                }
            }
           
            if(level == 3 && Lside &&  x <= 200 ) {
                dx = -1;
                dx2 = 0;
                
            }
            
            else if(level == 3 && Rside && x > 200) {
                dx = -1;
                dx2 = 0;
               
            }
               else if(level == 3 ) {
                dx2 = -1;
                dx = 0;
              
                if (cameraX  > -1 ) {
                    dx = -1;
                    Lside = true;
                    Rside = false;
                }
            }
         if(level == 4 && part == 1){
                 dx = -1;
                 
       
         
        }
         if(level == 4 && part == 2){
             Lside = false;
             if(cameraX >= 0){
                 Lside = true;
             }
             if(cameraX <= -1900 && cameraX >= -2320 ){
                 Lside = true;
             }
             if(Lside){
                 dx = -1;
                 dx2 = 0;
             }
             else if(!Lside && x <= 150){
                 dx2 = -1;
                 dx = 0;
             }
             else if(!Lside && x > 150){
                 dx = -1;
                 dx2 = 0;
             }
         }
         if(level == 4 && part == 4){
             Lside = false;
             if(cameraX >= -2 && !finalbattle){
                 Lside = true;
             }
             else if(cameraX >= -635 && finalbattle){
                 
                Lside = true; 
             }
             
             if(Lside){
                 dx = -1;
                 if(finalbattle){
                     dx = -2;
                 }
                 dx2 = 0;
             }
             else if(!Lside && x <= 200){
                 dx = 0;
                 dx2 = -1;
                 if(finalbattle){
                     dx2 = -2;
                 }
             }
             else if(x > 200){
                 dx = -1;
                 if(finalbattle){
                     dx = -2;
                 }
                 dx2 = 0;
             }
             
         }
         
        }
        if (key == KeyEvent.VK_RIGHT && !drizz)
        {   if(level == 1)
            {
            dx = 1;
            }
         if(level == 2  && Rside && x >= 230 ){
                dx = 1;
                dx2 = 0;
               
            }
         else if(level == 2 && Lside && x <= 230) {
             dx = 1;
             dx2 = 0;
         }
          else if(level == 2) {
                dx2 = 1;
                dx = 0;
              //  x = 200;
                if(cameraX <= -549) {
                    dx = 1;
                    Rside = true;
                    Lside = false;
                }
            }
         if(level == 3 && Rside && x >= 200 ){
                dx = 1;
                dx2 = 0;
               
            }
         
         else if(level == 3 && Lside && x <= 200) {
             dx = 1;
             dx2 = 0;
         }
          else if(level == 3) {
                dx2 = 1;
                dx = 0;
          }
            if(level == 4 && part == 1){
                    dx = 1;
                    dx2 = 0;
                
            }
            if(level == 4 && part == 2){
                Rside = false;
                        
            if(cameraX <= -1700 && cameraX >= -1760){
                 Rside = true;
             }
            if(cameraX <= -2650){
                Rside = true;
            }
             if(Rside){
                 dx = 1;
                 dx2 = 0;
             }
             else if(!Rside && x >= 220){
                 dx2 = 1;
                 dx = 0;
             }
             else if(!Rside && x < 220){
                 dx = 1;
                 dx2 = 0;
             }
        }
            if(level == 4 && part == 4){
             Rside = false;
             
             if(cameraX <= -115 && cameraX >= -150 && !finalbattle){
                 Rside = true;
             }
             else if(finalbattle && cameraX <= -760){
                 Rside = true;
             }
             
             
             if(Rside){
                 dx = 1;
                 if(finalbattle){
                     dx = 2;
                 }
                 dx2 = 0;
             }
             else if(!Rside && x >= 220) {
                 dx = 0;
                 dx2 = 1;
                 if(finalbattle){
                     dx2 = 2;
                 }
             }
             else if( x < 220){
                 dx = 1;
                 if(finalbattle){
                     dx = 2;
                 }
                 dx2 = 0;
             }
             
         }
                if(cameraX <= -549 && level != 4) {
                    dx = 1;
                    Rside = true;
                    Lside = false;
                }
             
         
        }
       // if(key == KeyEvent.VK_UP) {
         //   dy = -1;
       // }
       // if(key == KeyEvent.VK_DOWN) {
      // dy = 1;
  // }
    if(key == KeyEvent.VK_SPACE) {
        if(this.y < base + 15 && !once && level > 1) {
            this.top = top - 30;
            this.base+= 5;
            once = true;
            intro = true;
            if(x > 230 && Lside && level != 4) {
                Lside = false;
            }
              if(x < 230 && Rside && level != 4) {
                Rside = false;
            }
             if(supjump){
                 top = top - 20;
             }
             if(finalbattle){
                 top = top - 7;
             }
              
        }
        }
        if(key == KeyEvent.VK_Z && level > 2) {
             if(kount > 90) {
            reflect = true;
             }
            }
        if(level == 4 && key == KeyEvent.VK_X && jump && kount > 90 && !drizz){
            drilldive = true;
              subKount = 0;
            kount = 0;
            reflect = false;
        }
    }     
   }
   
     public void keyReleased(KeyEvent e) {
         if(!zoom) {
         int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_LEFT) 
        {
            dx = 0;
            dx2 =0;
        }
        
        if (key == KeyEvent.VK_RIGHT)
        {
            dx = 0;
            dx2 = 0;
        }
           if(key == KeyEvent.VK_UP) {
            dy = 0;
        }
        if(key == KeyEvent.VK_DOWN) {
       dy = 0;
   }
        if(key == KeyEvent.VK_SPACE){
         
        }
    }
     }
     public void jumpChange(int y) {
         
         base  = y - 57;
         top =  base -  27;
         
     }
     public void diveEnd(){
         drilldive = false;
     }
     public void spin(){
         drilldive = true;
     }
     public void jumpRevert() {
         base = base + 2;
        
         
         
     }

}
   
    

