/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author Kai
 */
public class pastaAngel {
    private int x = 300;
    private int y =  180;
    private int tossx = 0;
    private int tossy = 0;
    private int slopx = 1;
    private int slopy = 1;
    private int speartype = 0;
    boolean spotted = false;
    int shift = 0;
    int stagger = 0;
    int countdown = 300;
    int xreset = x; 
    boolean up = false;
    private int camx = 0; 
    private int camy = 0;
    private int part;
    private int frameNum;
    private boolean same = false;
    private boolean activated;
    private boolean toss = false;
    private boolean seek = false;
    private boolean phase2 = false;
    private boolean dead = false;
    private boolean hit = false;
    private boolean launch = false;
    private boolean charge = false;
    private boolean blocked = false;
    private int throwclock = 0;
    boolean sited = false;
    private Rectangle spear;
    private int xtarget = 0;
    private int ytarget = 0;
    private Rectangle hitbox;
    Image frames[] = new Image[8];
    private int health = 3;
    private int delay = 0;
    int register = 0;
    private Image[] death = new Image[5];
    private int dethFrame = 0;


pastaAngel(int portion, boolean start){
    activated = start;
    part = portion;
    ImageIcon uno = new ImageIcon(this.getClass().getResource("pastaAngel3.png"));
    frames[0] = uno.getImage();
    ImageIcon dos = new ImageIcon(this.getClass().getResource("pastaAngel4.png"));
    frames[1] = dos.getImage();
    ImageIcon tres = new ImageIcon(this.getClass().getResource("pastaAngel5.png"));
    frames[2] = tres.getImage();
    ImageIcon quad = new ImageIcon(this.getClass().getResource("pastaAngel1.png"));
    frames[3] = quad.getImage();
     ImageIcon cinco = new ImageIcon(this.getClass().getResource("pastaAngel2.png"));
    frames[4] = cinco.getImage();
     ImageIcon seis = new ImageIcon(this.getClass().getResource("pastaAngel6.png"));
    frames[5] = seis.getImage();
     ImageIcon sven = new ImageIcon(this.getClass().getResource("pastaAngel7.png"));
    frames[6] = sven.getImage();
     ImageIcon hachi = new ImageIcon(this.getClass().getResource("pastaAngel8.png"));
    frames[7] = hachi.getImage();
}
public void activate(int j, int k){
    activated = true;
    x = j;
    y = k;
     xreset = x; 
    
}
public boolean getPhase(){
    return phase2;
}
public Rectangle getSpear(){
    return new Rectangle(x + camx + 20, y + camy + 85 + shift, 8, 8);
}
public boolean getBlocked(){
    return blocked;
}

public void changeBlock(boolean b){
    blocked = b;
}
public boolean getLaunch(){
    return launch;
}
public void setCam(int x, int y){
    camx = x;
    camy = y;
}
public void setLaunch(boolean change){
    launch = change;
}

public void damage(int doub){
    if(!hit){
    if(health > 2){
        if(doub == 1){
        health-= 2;
        }
        else{
            health--;
        }
        phase2 = true;
    }
    else if(health > 0){
         if(doub == 1){
        health-= 2;
        }
         else{
        health--;
         }
    }
    if(health <= 0){
        dead = true;
    }
    hit = true;
    }
}
public boolean getDead(){
    return dead;
}

public void samePart(int n){
    if(n != part){
        same = false;
    } 
    else{
        same = true;
    }
    
}
public void spotted(int m){
    if(x + camx - m < 200) {
        if (register > 600  && getX() > 0 && getX() < 500 && getY() > 0 && getY() < 500){
        spotted = true;
        register = 0;
        }
        else{
            register++;
        }
    }
    
    
    
}
public Image findImage(){
        return frames[frameNum];
}

public int fnum(){
    return frameNum;
}

public Image spearThrow(){
        ImageIcon close = new ImageIcon(this.getClass().getResource("spear2.png"));
        if (speartype == 2){
          close = new ImageIcon(this.getClass().getResource("spear2.png"));  
        }
        return close.getImage();   
}
public void sinch(int k){
    if(!charge && phase2 && spotted){
    if(y + camy + 100 >= k + 30){
     charge = true;   
    }
    }
}
public void targetAquired(int a, int b){
    if(spotted){
      int xslope = (x + camx) - a;
      int yslope = b - (y + camy + shift);
      if(xslope >= yslope - 180 && xslope <= yslope + 180){
          xtarget = a;
          ytarget = b;
           if(xslope > yslope && !toss){
             tossy -=  80 ;
         }
           else if(xslope < yslope && !toss){
               tossy -= 40 ;
           }
           
         toss = true; 
        
          
      }
    
}
    }

public void spearpath(){
    if(toss && throwclock > 20){

        tossy+= 1;
        tossx -= 1;
        slopy++;
 
    if(throwclock > 300){
      
        toss = false;
        spotted = false;
        throwclock = 0;
        xtarget = 0;
        ytarget = 0;        
        slopy = 0;
        delay = 0;
    }
    
    }
    
    
}

public Rectangle getBody(){
     Rectangle temp = new Rectangle(0, 0, 1, 1);
     if(!blocked){
     temp = new Rectangle( x + 30 + camx, y + shift + 70 + camy, 50, 60);
    if(frameNum == 7){
    temp = new Rectangle( x + 60 + camx, y + shift + 70 + camy, 50, 60);
    }
     }
    return temp;
}
public void kill(){
    activated = false;
}
public void unkill(){
    dead = false;
}
public boolean getHit(){
    return hit;
}
public int getPx(){
    return tossx;
}
public int getPy(){
    return tossy;
}
public int getStagger(){
    return stagger;
}
public boolean getToss(){
    return toss;
}
public boolean getSpot(){
    return spotted;
}
public int getHp(){
    return health;
}
public boolean getAct(){
    
   return activated;
}
public boolean getSame(){
    
    return same;
}
public int getCamx(){
    
    return camx;
}
public int getCammy(){
    return camy;
}

public int getX(){
   return (x  + camx);
}
public int getY(){
    return(y + shift + camy);
}
public void changeStagger(int a){
    countdown = a;
    
}
public void AI(){
    if(!phase2){
        if(!toss){
            tossx = x + camx + 50;
            tossy = y + shift + camy  + 40;
            
            
        }
    }
    if(!spotted){
    if(up){
        if(delay % 4 == 0){
        shift+= 2;
        }
        if(shift > 70){
            up = false;
        }   
    }
    else{
        if(delay % 4 == 0){
        shift-= 2;
        }
        if(shift < -70){
            up = true;
        }
    }
    delay++;
    if(delay == 15){
        frameNum = 1;
    }
    if(delay == 30){
        frameNum = 2;
    }
    if(delay == 45){
        frameNum = 0;
        delay = 0;
    }
    }
    else if(spotted && !phase2){
        if(!up){
             if(delay % 4 == 0 && !toss){
        shift-= 2;
        }
        if(shift < -60){
            up = true;
        }
        
         delay++;
    if(delay == 15){
        frameNum = 1;
    }
    if(delay == 30){
        frameNum = 2;
    }
    if(delay == 45){
        frameNum = 0;
        delay = 0;
    }    
        }
        if(up){
        frameNum = 3; 
        delay++;
        if(delay >= 70){
            frameNum = 4;
           
        }
        if(delay >= 85 && !toss){
           spotted = false;
            delay = 0;
           
        }
          
        
        }
        if(toss){
            throwclock+= 1;
        
        if(throwclock > 10){
            frameNum = 3;
        }
        if(throwclock > 20){
            frameNum = 4;
          
        }
    }
        else if (!toss){
            throwclock = 0;
        } 
        
    }
    else if(spotted && phase2){
        if(up){
        if(delay % 4 == 0){
        shift+= 2;
        }
         delay++;
    if(delay == 20){
        frameNum = 1;
    }
    if(delay == 40){
        frameNum = 2;
    }
    if(delay == 60){
        frameNum = 0;
        delay = 0;
    }    
        if(shift > 100 || charge){
            up = false;
             
            frameNum = 7;
        }
        }
    
        else if(!up){
           
            x-= 2;
            frameNum = 7;
            
            if(x < -20){
                x = xreset;
                shift = 20;
                up = true;
                spotted = false;
                 charge = false;
            }
            
            
        }
      
        
        
    }
    if(hit){
        stagger++;
        if(stagger >= countdown){
            stagger = 0;
            hit = false;
        }
    }
}

    
}

