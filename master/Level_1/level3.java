/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pogo.master.Level_1;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Rectangle;
import java.util.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
/**
 *
 * @author radioshack
 */
public class level3 extends JPanel implements ActionListener {
     private Timer timer3;
    private Jimmy jimmy3;
    private Alien[] aliens = new Alien[4];
    private Robot[] robots = new Robot[4];
    private Unicorn uni;
    private Unicorn corns[] = new Unicorn[10];
    private int timebonus = 32000;
    private int lifebonus = 1200;
    private int finalscore = 0;
    private int kount = 0;
    private int mode = 1;
    private int kount2 = 0;
     private int Akount = 0;
     private int dashcount = 0;
     private int nochange = 0;
     private boolean lost = false;
     private boolean space = false;
    private boolean freeFall = false;
    private boolean fall = false;
      private boolean killed = false;
      private boolean down = false;
      private boolean stop = false;
     private boolean moveplat = false;
     private boolean bounced = false;
     private boolean badplats[] = new boolean[8];
     private boolean Enemybounce = false;
     private boolean deflect = false;
     private boolean part2 = false;
     private int excessive = 0;
     private boolean landing = false;
     private boolean shield = false;
     private boolean gone = false;
     private boolean shot = true;
     private boolean reset = false;
     private boolean blocked = false;
     private boolean ritual = false;
     private boolean done = false;
     int dashflash = 0;
     private boolean end = false;
     boolean dash = false;
     private int  def2 = 0;
     private int sacrifice = 8;
     private int flicker = 0;
     private int Imortal = 0;
     private int dark = 0;
     TAdapter keys = new TAdapter();
     ImageIcon Frames[];
      private platforms platformz = new platforms();
   private ImageIcon lives = new ImageIcon(this.getClass().getResource("jimmyHead.png"));
   public level3() {
       addKeyListener(keys);
       setFocusable(true);
       jimmy3 = new Jimmy();
       jimmy3.setLevel(3);
       jimmy3.setX(27);
       jimmy3.setY(100);
       platformz.setLevel(3);
       Frames = new ImageIcon[6];
       aliens[0] = new Alien();
       aliens[0].setCoor(508, 1344);
       aliens[0].setStart(1344);
       aliens[0].setLim(490, 520);
       aliens[1] = new Alien();
         aliens[1].setCoor(830, 856);
       aliens[1].setStart(856);
       aliens[1].setLim(822, 895);
       uni = new Unicorn();
       corns[0] = uni;
       corns[1] = new Unicorn();
       corns[1].setBound(776, 910);
       corns[1].setX(800);
       corns[1].setY(1198);
       corns[2] = new Unicorn();
        corns[2].setBound(223, 340);
       corns[2].setX(300);
       corns[2].setY(875);
        corns[3] = new Unicorn();
        corns[3].setBound(507, 730);
       corns[3].setX(600);
       corns[3].setY(457);
       corns[4] = new Unicorn();
       corns[4].setBound(540, 800);
       corns[4].setX(600);
       corns[4].setY(1379);
       corns[5] = new Unicorn();
       corns[5].setBound(340, 480);
       corns[5].setX(360);
       corns[5].setY(1210);
       corns[6] = new Unicorn();
       corns[6].setBound(516, 765);
       corns[6].setX(600);
       corns[6].setY(841);
       corns[7] = new Unicorn();
       corns[7].setBound(18, 150);
       corns[7].setX(40);
       corns[7].setY(628);
       corns[8] = new Unicorn();
       corns[8].setBound(670, 830);
       corns[8].setX(770);
       corns[8].setY(553);
       corns[9] = new Unicorn();
       corns[9].setBound(720, 909);
       corns[9].setX(800);
       corns[9].setY(242);
       robots[0] = new Robot();
       robots[0].setBound(700, 945);
       robots[0].setX(800);
       robots[0].setY(740);
       robots[1] = new Robot();
       robots[1].setBound(510, 670);
       robots[1].setX(600);
       robots[1].setY(859); 
       robots[2] = new Robot();
       robots[2].setBound(666, 816);
       robots[2].setX(700);
       robots[2].setY(562);
       robots[3] = new Robot();
       robots[3].setBound(695, 735);
       robots[3].setX(700);
       robots[3].setY(1062);
         Frames[0] = new ImageIcon(this.getClass().getResource("frame1.png"));
         Frames[1] = new ImageIcon(this.getClass().getResource("frame2.png"));
         Frames[2]= new ImageIcon(this.getClass().getResource("frame4.png"));
         Frames[3]= new ImageIcon(this.getClass().getResource("frame5.png"));
         Frames[4] = new ImageIcon(this.getClass().getResource("frame6.png"));
         for(int i = 0; i < badplats.length; i++) {
             badplats[i] = false;
         }
         timer3 = new Timer(13, this);
         timer3.start();
         setDoubleBuffered(true);
   }
   public boolean getDone(){ 
       return done;
   }
   public int getScore(){
       return finalscore;
   }
   
   public boolean getLost(){
       return lost;
   }
     public int survive(){
           return (jimmy3.getLives());
       }
    @ Override public void paint(Graphics g) {
         super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        ImageIcon temp2 = new ImageIcon(this.getClass().getResource("candymountain.png"));
        
        
        Image background = temp2.getImage();
        if(part2){
            ImageIcon temp3 = new ImageIcon(this.getClass().getResource("candymountain2.png"));
            background = temp3.getImage();
        }
        g2d.drawImage(background, jimmy3.getCamx(), jimmy3.getCammy(), null);
        ImageIcon meter = new ImageIcon(this.getClass().getResource("guage.png"));
        Image grape = meter.getImage();
        int displacor = 0;
        if(!ritual){
        for(int i = 0; i < sacrifice; i++) {
            Rectangle bloop = new Rectangle(460, 213 - displacor, 15, 13);
             if (i == 9) {
                  bloop = new Rectangle(460, 213 - displacor - 10, 16, 23);
            }
            g2d.draw(bloop);
            g2d.setColor(Color.red);
            g2d.fill(bloop);
            displacor+= 13;
        }
        g2d.setColor(Color.black);
        
        g2d.drawImage(grape, 450, 80, null);
        }
        platformz.secondHalf(part2);
        Rectangle[] platforms = platformz.getPlatforms();
        for(int i = 16; i < platforms.length; i++) {
           if(i > 19 && i <= 24 && !part2) {
               if(!badplats[i - 20]) {
                  g2d.fill(platforms[i]); 
               }
           }
           else if(i > 16 && i <= 19 && part2) {
               if(!badplats[i - 12]) {
                  g2d.fill(platforms[i]); 
               }
           }
           if(!part2 && ( i == 25 || i == 27  || i == 28)) {
               g2d.fill(platforms[i]); 
           }
        }
        int y = jimmy3.getY();
        int base = jimmy3.getBase();
        int frameNum = 0;
        if (base - y <= 11) 
        {
            frameNum = 0;
        }
        else if (base - y >= 12 && base - y < 15)
        {
            frameNum = 1;
        }
        else if (base - y >= 15 && y < 18)
        {
            frameNum = 2;
        }
        else if ( base - y >= 18 && base  - y < 21)
        {
            frameNum = 3;
        }
        
        else if  ( base -  y >= 21) 
        {
            frameNum = 4;
        }
        Image Image = Frames[frameNum].getImage();
        g2d.drawImage(Image, jimmy3.getX(), jimmy3.getY(), null);
        Image barrier2 = jimmy3.getReflect2();
        Image barrier = jimmy3.getReflect();
        g2d.drawImage(barrier, jimmy3.getX() + 3, jimmy3.getY() - 30, this);
        g2d.drawImage(barrier2, jimmy3.getX() - 12, jimmy3.getY() - 30, this);
        if(part2){
            ImageIcon extraD = new ImageIcon(this.getClass().getResource("shield.png"));
            Image block = extraD.getImage();
            if(!gone){
                g2d.drawImage(block, 812 + jimmy3.getCamx(), 490 + jimmy3.getCammy(), null);
            }
             }
       
        for(int i = 1; i < robots.length; i++) {
            int j = 0;
            if(part2) {
                j = i;
            }
        Image bot = robots[j].getImage();
        if(!robots[j].getDie() || robots[j].getDframe() != 15) {
        g2d.drawImage(bot, robots[j].getXy() + jimmy3.getCamx(), robots[j].getY() + jimmy3.getCammy(), null);
        }
        if(robots[j].getDie() && robots[j].getDframe() != 15) {
                 Image temp = robots[j].getDeth();
                 if(robots[j].getDframe() == 0) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx() + 22 , robots[j].getY() + jimmy3.getCammy() + 5 , this);
                 }
                  if(robots[j].getDframe() == 1) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx() + 20 , robots[j].getY() + jimmy3.getCammy() + 2 , this);
                 }
                    if(robots[j].getDframe() == 2) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx() + 16 ,robots[j].getY() + jimmy3.getCammy()   , this);
                 }
                    if(robots[j].getDframe() == 3) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx() + 10 , robots[j].getY() + jimmy3.getCammy() - 3 , this);
                 }
                 if(robots[j].getDframe() == 4) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx()  , robots[j].getY() + jimmy3.getCammy()  - 5 , this);
                 }
                  if(robots[j].getDframe() == 5) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx() - 6, robots[j].getY() + jimmy3.getCammy() - 10, this);
                 }
                   if(robots[j].getDframe() == 6) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx()  - 4 , robots[j].getY() + jimmy3.getCammy()  - 25, this);
                 }
                    if(robots[j].getDframe() == 7) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx()   - 8, robots[j].getY() + jimmy3.getCammy() - 30 , this);
                 }
                       if(robots[j].getDframe() == 8) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx()   - 30, robots[j].getY() + jimmy3.getCammy() - 70 , this);
                 }
                   if(robots[j].getDframe() == 9) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx()   - 40, robots[j].getY() + jimmy3.getCammy() - 55 , this);
                 }
                    if(robots[j].getDframe() == 10) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx()   - 52, robots[j].getY() + jimmy3.getCammy() - 55 , this);
                 }
                       if(robots[j].getDframe() == 11) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx()   - 57, robots[j].getY() + jimmy3.getCammy() - 55 , this);
                 }
                          if(robots[j].getDframe() == 12) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx()   - 57, robots[j].getY() + jimmy3.getCammy() - 55 , this);
                 }
                              if(robots[j].getDframe() == 13) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx()   - 47, robots[j].getY() + jimmy3.getCammy() - 50 , this);
                 }
                                  if(robots[j].getDframe() == 14) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx()   - 20, robots[j].getY() + jimmy3.getCammy() - 45 , this);
                 }
                                      if(robots[j].getDframe() == 15) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy3.getCamx()   + 10, robots[j].getY() + jimmy3.getCammy() - 60 , this);
                  }
        }
        if(!part2){
            break;
        }
        }
        
        
        
        
            //Rectangle barrier1 = new Rectangle(jimmy3.getX() - 12, jimmy3.getY() - 3, 20, 60);
                //Rectangle barrierB = new Rectangle(jimmy3.getX() + 17, jimmy3.getY() - 3, 20, 60);
               // g2d.draw(barrierB);
                // g2d.draw(barrier1);
        
        
       
            int start = 0;
            int finish = 4;
         if(part2) { 
             start = 4;
             finish = 10;
         }
        for(int i = 0 + start; i < finish; i ++) {
            boolean xnear = false;
            boolean ynear = false;
            if(jimmy3.getX() - 440 <= corns[i].getX() + jimmy3.getCamx() && jimmy3.getX() + 440 >= corns[i].getX() + jimmy3.getCamx()){
             xnear = true;   
            }
            if(jimmy3.getY() - 450 <= corns[i].getY() + jimmy3.getCammy() && jimmy3.getX() + 500 >= corns[i].getX() + jimmy3.getCammy()){
             ynear = true;   
            }
            if(xnear && ynear || i == 9){
        Image corn = corns[i].getImage();
        int change = 0;
        if (corns[i].getFrameNum()== 13) {
            change = 20;
        }
        if (corns[i].getFrameNum()== 12) {
            change = 8;
        }
         if(!corns[i].getDie() ||  corns[i].getDframe() != 4)
            {
            g2d.drawImage(corn, corns[i].getX() + jimmy3.getCamx(),corns[i].getY() + change + jimmy3.getCammy(), null);
            }
            if(corns[i].getDframe() < 4 && corns[i].getDie()) {
                Image bloody = corns[i].getDeath();
                g2d.drawImage(bloody, corns[i].getX() + jimmy3.getCamx() - 138, corns[i].getY() + jimmy3.getCammy() - 132, null);
            }
           // Rectangle murder = new Rectangle(corns[i].getX() + jimmy3.getCamx() , corns[i].getY() + jimmy3.getCammy() + 30, 90, 18);
           // g2d.draw(murder);
            }
        }
        if(!part2) {
        for(int i = 0; i < 2; i++) {
        if(aliens[i].getFnum() < 8) {
        Image bad = aliens[i].getFrame();
        g2d.drawImage(bad, aliens[i].getX() + jimmy3.getCamx(), aliens[i].getY() + jimmy3.getCammy(), null);
        }
        }
        }
            for (int i = 0 + start; i < finish; i ++) {
                if(!corns[i].getDie()) {
        if(corns[i].getShot()) {
            corns[i].setCam(jimmy3.getCamx(), jimmy3.getCammy());
            Rectangle temper = corns[i].getLaser();
            if (kount2 % 10 < 5) {
            g.setColor(Color.red);
           
            }
            else {
                g.setColor(Color.blue);
            }
            kount2++;
            
            g2d.fill(temper);
        }
         }
    }   if(part2){
            ImageIcon blueblur = new ImageIcon(this.getClass().getResource("energy1.png"));
            ImageIcon blueblur2 = new ImageIcon(this.getClass().getResource("energy2.png"));
    
            if(dashflash == 1){
                if( jimmy3.getY() > 290 ){
                    Image temp = blueblur.getImage();
                    g2d.drawImage(temp, 390 + jimmy3.getCamx(), 1400 + jimmy3.getCammy(), this);
                    
                }
                else if(jimmy3.getY() < 290 && jimmy3.getY() > 200 && def2 == 0){
                      Image temp = blueblur2.getImage();
                    g2d.drawImage(temp, 390 + jimmy3.getCamx(), 1280 + jimmy3.getCammy(), this);
                }
                else{ dashflash = 0;
                space = false;
                }
                
            }
            if(dashflash == 2){
                if(jimmy3.getY()  + jimmy3.getCammy() < 200  + jimmy3.getCammy()){ dashflash = 0;
                space = false;}
                else if(jimmy3.getY()  + jimmy3.getCammy() < 730 + jimmy3.getCammy() && def2 == 10){
                      Image temp = blueblur2.getImage();
                    g2d.drawImage(temp, 213 + jimmy3.getCamx(), 660 + jimmy3.getCammy(), this);
                }
                    Image temp = blueblur.getImage();
                    g2d.drawImage(temp, 209 + jimmy3.getCamx(), 770 + jimmy3.getCammy(), this);
                
            }
               if(dashflash == 3){
                    if(jimmy3.getY() + jimmy3.getCammy() <  650 + jimmy3.getCammy() && def2 == 12){
                      Image temp = blueblur2.getImage();
                    g2d.drawImage(temp, 540 + jimmy3.getCamx(), 550 + jimmy3.getCammy(), this);
                }
                if(jimmy3.getY() + jimmy3.getCammy() <  180 + jimmy3.getCammy()){ dashflash = 0;
                space = false;
                    }
                    Image temp = blueblur.getImage();
                    g2d.drawImage(temp, 540 + jimmy3.getCamx(), 650 + jimmy3.getCammy(), this);
                    
                }
               if(dashflash == 4){
                    if(jimmy3.getY() + jimmy3.getCammy() <  560 + jimmy3.getCammy()){
                      Image temp = blueblur2.getImage();
                    g2d.drawImage(temp, 630 + jimmy3.getCamx(), 310 + jimmy3.getCammy(), this);
                }
                if(jimmy3.getY() + jimmy3.getCammy() <  190 + jimmy3.getCammy()){ dashflash = 0;
                space = false; }
                    Image temp = blueblur.getImage();
                    g2d.drawImage(temp, 640 + jimmy3.getCamx(), 420 + jimmy3.getCammy(), this);
                    
                }
              
    }            
            
            if(ritual){
                ImageIcon end1 = new ImageIcon(this.getClass().getResource("bolt1..png"));
                Image bolt = end1.getImage();
                ImageIcon end2 =new ImageIcon(this.getClass().getResource("bolt2..png"));
                Image bolt2 = end2.getImage();
                ImageIcon end3  =new ImageIcon(this.getClass().getResource("portal1.png"));
                Image portal1 = end3.getImage();
                ImageIcon end4  =new ImageIcon(this.getClass().getResource("portal2.png"));
                Image portal2 = end4.getImage();
                ImageIcon end5  =new ImageIcon(this.getClass().getResource("portal3.png"));
                Image portal3 = end5.getImage();
                ImageIcon end6  =new ImageIcon(this.getClass().getResource("portal4.png"));
                Image portal4 = end6.getImage();
                ImageIcon end7  = new ImageIcon(this.getClass().getResource("portal5.png"));
                Image portal5 = end7.getImage();
          
                if( dark < 960){
                   g2d.drawImage(bolt, 470, 0, this);
                   if(dark > 80){
                       g2d.drawImage(bolt2, 460, 20, this);
                   }
                    if(dark > 160){
                       g2d.drawImage(bolt, 465, 40, this);
                   }
                     if(dark > 240){
                       g2d.drawImage(bolt2, 460, 60, this);
                   }
                      if(dark > 320){
                       g2d.drawImage(bolt, 465, 80, this);
                   }
                       if(dark > 400){
                       g2d.drawImage(bolt2, 460, 100, this);
                   }
                        if(dark > 480){
                       g2d.drawImage(bolt, 465, 120, this);
                   }
                         if(dark > 560){
                       g2d.drawImage(bolt2, 460, 140, this);
                   }
                          if(dark > 640){
                       g2d.drawImage(bolt, 465, 160, this);
                   }
                           if(dark > 720){
                       g2d.drawImage(bolt2, 460, 180, this);
                   }
                            if(dark > 800){
                       g2d.drawImage(bolt, 465, 200, this);
                   }
                             if(dark > 880){
                       g2d.drawImage(bolt2, 460, 220, this);
                   }
                              if(dark > 940){
                       g2d.drawImage(bolt, 465, 240, this);
                       g2d.drawImage(bolt2, 460, 260, this);
                   }
                   dark+= 30;
                   
                }
                if(dark >= 940 && dark < 1020){
                    g2d.drawImage(portal1,990 + jimmy3.getCamx(), 220 + jimmy3.getCammy(), this);
                    dark+= 5;
                }
                if ( dark >= 1020) {
                    if(dark < 1210){
                    if(dark > 1080) {
                        g2d.drawImage(portal2, 1005 + jimmy3.getCamx(), 275 +jimmy3.getCammy(), this);
                    }
                    if(dark > 1140) {
                        g2d.drawImage(portal3, 1007 + jimmy3.getCamx(), 270 +jimmy3.getCammy(), this);
                    }
                    if(dark > 1180) {
                        g2d.drawImage(portal4, 1000 + jimmy3.getCamx(), 251 +jimmy3.getCammy(), this);
                    }
                    }
                    else {
                        if(dark % 80 > 39){
                            g2d.drawImage(portal5, 1000 + jimmy3.getCamx(), 245 +jimmy3.getCammy(), this);
                        }
                        else {
                            ImageIcon fin = new ImageIcon(this.getClass().getResource("portal6.png"));
                            Image turd = fin.getImage();
                            g2d.drawImage(turd, 1000 + jimmy3.getCamx(), 242 +jimmy3.getCammy(), this);
                        }
                    }
                    if(dark > 3000){
                        if(jimmy3.getX() < 490){
                        jimmy3.setX(jimmy3.getX() + 1);
                        if (jimmy3.getX() > 430){
                           end = true; 
                           ImageIcon complete = new ImageIcon(this.getClass().getResource("LevelEnd.png"));
                           Image over = complete.getImage();
                           g2d.drawImage(over, 0, 0, null);
                        }
                        }
                        else{ end = true; }
                    }
                    dark+= 4;
                } 
                
                 }
    
        Image head = lives.getImage();
        for (int i = 0; i < jimmy3.getLives(); i++) {
            g2d.drawImage( head , 10 +(30 * i), 10, null);
        }
        if(shield) {
            ImageIcon ico = new ImageIcon(this.getClass().getResource("shieldIcon.png"));
            Image protect = ico.getImage();
            g2d.drawImage(protect, 120, 10, null);
            }
            if(!jimmy3.getIntro()) {
                ImageIcon intro = new ImageIcon(this.getClass().getResource("message.png"));
                Image text = intro.getImage();
                g2d.drawImage(text, 200, 250, null);
            }
             if(jimmy3.getLives() < 0){
            ImageIcon temp = new ImageIcon(this.getClass().getResource("GameOver.png"));
            g2d.drawImage(temp.getImage(), 0, -100, this);
            jimmy3.setX(0);
            jimmy3.setY(0);
            lost = true;
             timer3.stop();
           this.removeKeyListener(keys);
        }
            Toolkit.getDefaultToolkit().sync();
            g.dispose();
    }
    
    public void setMode(int n){
           mode = n;
       }
       
       public void Carry(int n){
           if(mode == 2){
               int temp = n - 3;
               jimmy3.setLives(temp);
               
           }
       }
    
     @ Override public void actionPerformed(ActionEvent e) {
         if(!end){
         if(!ritual){
            nochange = jimmy3.getX();
            if(stop){
                jimmy3.setDx2(0);
            }
         jimmy3.move();
         if(stop){
             jimmy3.setX(nochange);
             
         }
         }
         jimmy3.Cykle();
         if(!ritual){
             sacrifice = 0;
         for(int i = 0; i < corns.length; i++) {
             if(corns[i].getDie()) {
                 sacrifice++;
             }
         }
         if(reset){
             Imortal++;
             if(Imortal > 500) {
                 Imortal = 0;
                 reset = false;
                 shield = false;
             }
         }
         if(!part2) {
         for(int i = 0; i < 4; i++) {
             corns[i].UniAI();
         }
         }
         if(part2){
              for(int i = 4; i < 10; i++) {
             corns[i].UniAI();
         }
             
         }
         for(int i = 0; i < robots.length; i++){
         robots[i].robotAI();
         if(robots[i].getDie()) {
             robots[i].Recarn();
         }
     }
         for(int i = 0; i < 2; i++) {
         aliens[i].AlienAI();
         if(aliens[i].getAlive() == false) {
                 //aliens[i].Recarn();
              }
         }
         platformz.movePlat();
         checkCollision();
         }
         if(timebonus > 0){
             timebonus--;
         }
         repaint();
         }
         else{
             timer3.stop();
              this.removeKeyListener(keys);
              done = true;
             
             
         }
     }
     
          public Rectangle getBounds() {
        int y = jimmy3.getY();
        int x = jimmy3.getX();
        return new Rectangle(x, y, 48, 57);
    }
     
     
     
     public void checkCollision() {
         Rectangle player = getBounds();
        int Xmidpoint = (player.x + 24);
        int playerBottom = player.y + 54;
         Rectangle bottom = new Rectangle(player.x + 15 , playerBottom,player.width - 30, 1);
         Rectangle Lbar = new Rectangle(player.x + 20, player.y + 2, 1, 50);
          Rectangle Rbar = new Rectangle(player.x + 24, player.y + 2, 1, 50);
         platformz.setCam(jimmy3.getCamx(), jimmy3.getCammy());
        
         Rectangle[] platforms = platformz.getPlatforms();
        if(jimmy3.getCamx() < -551) {
             jimmy3.setCam(-550, jimmy3.getCammy());
             jimmy3.setX(jimmy3.getX() + 2);
        }
         if(jimmy3.getCamx() >  1) {
             jimmy3.setCam(0, jimmy3.getCammy());
              jimmy3.setX(jimmy3.getX() - 1);
        }
         
         if(jimmy3.getCammy() > 0) {
             jimmy3.setDy(1);
         }
         if(jimmy3.getCammy() < -1100) {
             jimmy3.setDy(-1);
             
         }
        if(Xmidpoint < 2) {
                jimmy3.setDx(2);
               
             }
             else if (Xmidpoint > 500) {
                 jimmy3.setDx(-2);
             }
        if(Xmidpoint > 210 && jimmy3.getCamx() > -10 && jimmy3.getSide() == 'l') {
            jimmy3.negSide();
            jimmy3.setDx(0);
            jimmy3.setDx2(1);
        }
        if(Xmidpoint < 200 && jimmy3.getCamx() < -547 && jimmy3.getSide() == 'r') {
            jimmy3.negSide();
            jimmy3.setDx(0);
            jimmy3.setDx2(-1);
        }
        if( jimmy3.getCamx() < -547 && Xmidpoint > 200 && jimmy3.getSide() != 'r' ) {
            jimmy3.setRSide();
            jimmy3.setDx2(0);
            jimmy3.setDx(1);
        }
         if(Rbar.intersects(1020 + jimmy3.getCamx(), 500 +  jimmy3.getCammy(), 20, 40) && !part2 ) {
             part2 = true;
             def2 = 0;
             jimmy3.setX(27);
             jimmy3.setY(280);
             jimmy3.setDy(0);
             jimmy3.setDx2(0);
             jimmy3.setCam(0, -1100);
             jimmy3.jumpChange(360);
             jimmy3.setSide();
            }
     
          if(Lbar.intersects(10 + jimmy3.getCamx(), 1390 +  jimmy3.getCammy(), 5, 40) && part2) {
             part2 = false;
             def2 = 0;
             jimmy3.setX(200);
             jimmy3.setY(200);
             jimmy3.setDy(0);
             jimmy3.setDx2(0);
             jimmy3.setCam(-900,  -200);
             jimmy3.jumpChange(360);
             jimmy3.setRSide();
         }
          for(int i =0; i < platforms.length; i++) 
            {
               Rectangle temp = platforms[i];
                if(bottom.intersects(temp) && temp.height <= 2) 
                {
                    jimmy3.jumpChange(temp.y);
                    def2 = i;
                    excessive = 0;
                    jimmy3.setDy2(1);
                    down = false;
                    space = false;
                      if (part2 && i < 17 ) {
                          flicker = 0;
                      }
                     Enemybounce = false;
                    if (bounced) {
                      bounced = false;
                      jimmy3.setDy(0);
                      jimmy3.setDy2(1);
                      freeFall = false;
                  }
                    if (i == 27 && !part2) {
                        moveplat = true;
                    
                    }
                    
                
                }
                else if ( temp.height > 2) {
                        if (bottom.intersects(temp.getX(), temp.getY(), temp.getWidth(), 2)) {
                    if(i > 19 && i <= 24 && !part2) {
                       int dispose = i - 20;
                       if (!badplats[dispose]) {
                      jimmy3.jumpChange(temp.y);
                    def2 = i;
                    jimmy3.setDy2(1);
                    down = false;
                    Enemybounce = false;
                    space = false;
                       }
                    }
                    else if(i > 16 && i <= 19 && part2) {
                       int dispose = i - 12;
                       if (!badplats[dispose]) {
                      jimmy3.jumpChange(temp.y);
                    def2 = i;
                    jimmy3.setDy2(1);
                    down = false;
                    Enemybounce = false;
                    
                       }
                    }
                    else {
                    jimmy3.jumpChange(temp.y);
                    def2 = i;
                    jimmy3.setDy2(1);
                    down = false;
                     Enemybounce = false;
                     if (part2 && i < 17 ) {
                          flicker = 0;
                      }
                        }
                    if (bounced) {
                      bounced = false;
                      jimmy3.setDy(0);
                      jimmy3.setDy2(1);
                      freeFall = false;
                  }
                    if(jimmy3.getCamx() <= -370 && def2 == 3) {
                        jimmy3.setRSide();
                    }
                     
                }
                 if( Rbar.intersects(temp) && (def2 != 3 || !part2)) {
                     jimmy3.setX(jimmy3.getX() - 2);
                    if(jimmy3.getCamx() <= -500 && i == 4) {
                        jimmy3.setRSide();
                    }
                     
                     
                 }
                 if( Lbar.intersects(temp)) {
                     jimmy3.setX(jimmy3.getX() + 2);
                     
                     
                 }
                         
                }
                
            }
            Rectangle power = new Rectangle(820 + jimmy3.getCamx(), 490 + jimmy3.getCammy(), 50, 50);
                    if(part2 && player.intersects(power) && shot ) {
                        shield = true;
                        shot = false;
                        gone = true;
                    }
          int xcoord = platforms[def2].x;
             int range = xcoord + platforms[def2].width + 15;
              System.out.println(def2  );
             if (Xmidpoint > range || Xmidpoint < xcoord) {
                 jimmy3.jumpRevert();
                 jimmy3.jumpRevert();
                
                 if(jimmy3.getY() - platforms[def2].y > 40 && def2 != 25) {
                     jimmy3.setDy2(2);
                 } 
                  freeFall = true;
                 down = true;
                 blocked = false;
                 jimmy3.setDy(0);
                 moveplat = false;
                 killed = false;
             }
             if(!part2 && def2 == 13 && jimmy3.getX() < 201 && jimmy3.getCamx() < -700){
                 jimmy3.negSide();
             }
               if (jimmy3.getY() > 290 && freeFall) {
                     jimmy3.setDy(2);
                     jimmy3.setDy2(0);
                     bounced = true;
                     
                 }
               if(!part2 && def2 == 27 && moveplat && platformz.getLimit(2)) {
                   kount++;
                   if(kount % 2 == 0) {
                   jimmy3.setDy(-1);
                   }
                   else {
                       jimmy3.setDy(0);
                   }
                   
               }
               if(!part2 && def2 == 27 && moveplat && !platformz.getLimit(2)) {
                   kount++;
                   if(kount % 2 == 0) {
                   jimmy3.setDy(1);
                   }
                   else {
                       jimmy3.setDy(0);
                   }
                   
               }
                if( def2 == 25  && !platformz.getLimit(3) && !down && ! part2) {
                    if(platformz.getDx() >= 300 ) {
                        jimmy3.setDy(-1);
                    }
                
                }
                else if( def2 == 25 && platformz.getLimit(3) && platformz.getDx() >= 300 && !down && ! part2) {
                    jimmy3.setDy2(2);
                    jimmy3.setDy(1);
                }
                if(def2 == 25 && down & jimmy3.getY() <= 290 && !part2) {
                    jimmy3.setDy2(1);
                    
                   }
              
               if (def2 == 14 && jimmy3.getCammy() < -870  && !down && !part2) {
                   jimmy3.setDy(-1);
                   jimmy3.setDy2(2);
                   stop = true;
                   
               }
               else if (def2 == 14 && jimmy3.getCammy() >= -870 && !down && !part2  ) {
                   jimmy3.setDy(0);
                   jimmy3.setDy2(1);
                
               }
               if(stop && def2 != 14){
                   stop = false;
               }
               else if(stop && jimmy3.getDy() == 0){
                   stop  = false;
               }
               if (def2 == 16 && jimmy3.getCammy() < -732 && !down && ! part2) {
                   jimmy3.setDy(-1);
                   jimmy3.setDy2(2);
                   
               }
               else if (def2 == 16 && jimmy3.getCammy() >= -732 && !down && !part2 ) {
                   jimmy3.setDy(0);
                   jimmy3.setDy2(1);
               }
               if (def2 == 18 && jimmy3.getCammy() < -600 && !down && !part2) {
                   jimmy3.setDy(-1);
                   jimmy3.setDy2(2);   
               }
               else if (def2 == 18 && jimmy3.getCammy() >= -600 && !down && !part2  ) {
                   jimmy3.setDy(0);
                   jimmy3.setDy2(1);
               }
               if(part2 && def2 == 7) {
                   if(jimmy3.getY() < 190){
                       jimmy3.setDy2(3);
                       jimmy3.setDy(-1);
                       blocked = true;
                       landing = false;
               }
                   else{
                       blocked = false;
                       jimmy3.setDy2(1);
                       if(!down){
                       jimmy3.setDy(0);
                       }
                       
                   }
               }
               if(part2 && def2 == 6) {
                   if(jimmy3.getY() < 180){
                       jimmy3.setDy2(3);
              
                       jimmy3.setDy(-1);
                       blocked = true;
                      
                        jimmy3.notOnce();
                       landing = false;
                      // space = true;
               } 
                   else{
                       blocked = false;
                       jimmy3.setDy2(1);
                       jimmy3.setDy(0);
                       
                   }
               }
              if(part2 && def2 == 8) {
                   if(jimmy3.getY() < 200){
                       jimmy3.setDy2(3);
                       jimmy3.setDy(-1);
                        jimmy3.notOnce();
                       // space = true;
                       landing = false;
               }
                   else{
                       jimmy3.setDy2(1);
                       jimmy3.setDy(0);
                       
                   }
               }
               if(Enemybounce) {
                   jimmy3.jumpRevert();
               }
               if(def2 > 19 && def2 <= 24 && jimmy3.getY() < platforms[def2].y - 20 && !part2) {
                  
                   badplats[def2 - 20] = true;
                   def2 = 1;
               }
                if(def2 > 16 && def2 <= 19 && jimmy3.getY() < platforms[def2].y - 20 && part2) {
                    flicker++;
                    if(flicker > 60) {
                    badplats[def2 - 12] = true;
                    flicker = 0;
                    def2 = 1;
                    }
               }
                 if (jimmy3.getY() > 290 && freeFall) {
                     jimmy3.setDy(2);
                     jimmy3.setDy2(0);
                     bounced = true;
                     
                 }
               boolean uno = false;
               for(int i = 0; i < badplats.length; i++) {
                  if(badplats[i] == true) {
                      uno = true;
                  }
                   if(badplats[i] == true && Akount % 1000 == 0) {
                       badplats[i] = false;
               }
               }
               if(uno) { Akount++; }
               if(part2) {
                   Rectangle[] dashportals = new Rectangle[4];
                   dashportals[0] = new Rectangle(417 + jimmy3.getCamx(), 1412 + jimmy3.getCammy(), 50 ,2);
                   dashportals[1] = new Rectangle(236 + jimmy3.getCamx(), 790 + jimmy3.getCammy(),50 ,2 );
                   dashportals[2] = new Rectangle(567 + jimmy3.getCamx(), 695 + jimmy3.getCammy(),50 ,2 );
                   dashportals[3] = new Rectangle(650 + jimmy3.getCamx(), 457 + jimmy3.getCammy(),50 ,2 );
                   for(int i = 0; i < dashportals.length; i++) {
                       if(player.intersects(dashportals[i]) && space) {
                          dash = true;
                           dashflash = 1 + i;
                           jimmy3.setDy(-2);
                           jimmy3.setDy2(0);
                           jimmy3.jumpChange(player.y - 5);
                           space = false;
                          
                   }
                  }
                   for(int i = 0; i < platforms.length; i ++) {
                        if(player.intersects(platforms[i]) && landing) {
                            jimmy3.setDy(0);
                            landing = false;
                            
                        }
                   }
                  
                   if(dash) {
                       dashcount++;
                       if (dashcount > 102) {
                           jimmy3.setDy(1);
                           jimmy3.setDy2(1);
                           jimmy3.setBase(500);
                           dash = false;
                           landing = true;
                           freeFall = true;
                           blocked= false;
                           dashcount = 0;
                       }
                       
                   }
               }
               if(!part2) {
               for (int i = 0; i < 2; i ++) {
               if (aliens[i].getAlive()) {
             Rectangle temp2 = new Rectangle(aliens[i].getX() + jimmy3.getCamx() + 5, aliens[i].getY() + 5 + jimmy3.getCammy(),25, 25);
             Rectangle kill = new Rectangle(aliens[i].getX() + jimmy3.getCamx(), aliens[i].getY() - 2 + jimmy3.getCammy(),28, 2);
             if(bottom.intersects(kill) ) {
                 if(i == 0) {
                jimmy3.jumpChange(kill.y - 20);
                jimmy3.setTop(20);
                 } 
                 else {
                     jimmy3.jumpChange(kill.y);
                     
                 }
                aliens[i].die();
                Enemybounce = true;
              
                }
             else if(bottom.intersects(temp2) ) {
                 boolean skip = false;
                 if(shield) {skip = true;}
                 if( !skip) {
                 jimmy3.setX(27);
                 jimmy3.setY(110);
                 jimmy3.setDy(0);
                 jimmy3.setDx2(0);
                 jimmy3.setCam(0, -1080);
                 jimmy3.jumpChange(360);
                 jimmy3.setSide();
                 part2 = false;
                 jimmy3.setLives(-1);
                 lifebonus -= 400;
                  shot = true;
                 gone = false;
             }
                 else if (skip){ reset = true; }
            
     }
     }
               }
               }
               if(part2 && def2 == 9 && jimmy3.getX() < 201 && jimmy3.getCamx() < -700){
                 jimmy3.negSide();
                 
             }
        for(int i = 1; i < robots.length; i++) {
             int k = 0; 
        if(part2) { k = i; }
       boolean dedRob = robots[k].getDie();
       if(!dedRob) {
          Rectangle murder = new Rectangle(robots[k].getXy() + jimmy3.getCamx() + 5, robots[k].getY() + jimmy3.getCammy() + 5, 30, 10);
          Rectangle Yodeth = new Rectangle(robots[k].getXy() + 10 + jimmy3.getCamx(), robots[k].getY() + jimmy3.getCammy()  + 30, 20, 20);
          boolean dead = false;
          if(bottom.intersects(Yodeth) ) {
              boolean skip = false;
                 if(shield) {skip = true;}
               if( !skip){
              jimmy3.setX(27);
                 jimmy3.setY(110);
                 jimmy3.setDy(0);
                 jimmy3.setDx2(0);
                 jimmy3.setCam(0, -1080);
                 jimmy3.jumpChange(360);
                 jimmy3.setSide();
                 part2 = false;
                 jimmy3.setLives(-1);
                 lifebonus -= 400;
                 dead = true;
                  shot = true;
                 gone = false;
               }
               else if (skip){ reset = true; }
          }
          if(bottom.intersects(murder) && !dead) {
             jimmy3.jumpChange(murder.y - 10);
                     jimmy3.setTop(10);
                    Enemybounce = true;
                    robots[k].die( murder.y - bottom.y);
          
          
          }
               
               
       }
       
        if(!part2) {
            break;
        }
        }
        
       int start = 0;
       int finish = 4;
       if(part2) {
           start = 4;
           finish = 10;
       }
       for (int i = 0 + start; i < finish; i++) {
        boolean uniKill =  corns[i].getDie();
        if(!uniKill) {
            Rectangle murder = new Rectangle(corns[i].getX() + jimmy3.getCamx() , corns[i].getY() + jimmy3.getCammy() + 30, 90, 5);
            Rectangle youlose = new Rectangle(corns[i].getX() + 5 + jimmy3.getCamx() , corns[i].getY() + 7 + jimmy3.getCammy() + 30, 80, 12);
            if(corns[i].getShot()) {
            Rectangle blast = corns[i].getLaser();
             Rectangle middle = new Rectangle(jimmy3.getX() + 8, jimmy3.getY() + 3, 9, 40);
            if(jimmy3.getKount() > 0) {
                Rectangle barrier1 = new Rectangle(jimmy3.getX() - 12, jimmy3.getY() - 3, 20, 60);
                Rectangle barrier2 = new Rectangle(jimmy3.getX() + 17, jimmy3.getY() - 3, 20, 60);
               
                if(blast.intersects(barrier1) || blast.intersects(barrier2)) {
                    deflect = true;
                    corns[i].setDeflect(deflect);
                }
            }
            else if(blast.intersects(middle) ) {
                boolean skip = false;
                 if(shield) {skip = true;}
               if( !shield){
                jimmy3.setX(27);
                 jimmy3.setY(110);
                 jimmy3.setDy(0);
                 jimmy3.setDx2(0);
                 jimmy3.setCam(0, -1080);
                 jimmy3.jumpChange(360);
                 jimmy3.setSide();
                 part2 = false;
                 def2 = 0;
                 jimmy3.setLives(-1);
                 lifebonus -= 400;
                  shot = true;
                 gone = false;
               }
               else if(skip && !deflect){ reset = true;
            }
            }
            }
            if(bottom.intersects(murder)) {
                 jimmy3.jumpChange(murder.y - 10);
                     jimmy3.setTop(10);
                    Enemybounce = true;
                    corns[i].die( murder.y - bottom.y);
                    if( i == 5){
                        corns[i].die( 0);
                        corns[i].die( 0);
                         corns[i].die( 0);
                    }
                    def2 = 0;
            }
            else if(bottom.intersects(youlose)) {
                boolean skip = false;
                 if(shield) {skip = true;}
                if( !skip){
                jimmy3.setX(27);
                 jimmy3.setY(110);
                 jimmy3.setDy(0);
                 jimmy3.setDx2(0);
                 jimmy3.setCam(0, -1080);
                 jimmy3.jumpChange(360);
                 jimmy3.setSide();
                 part2 = false;
                 jimmy3.setLives(-1);
                 lifebonus -= 400;
                 shot = true;
                 gone = false;
                }
                else if(skip){ reset = true; }
            }
        
       }
       } 
       if(part2 && sacrifice == 10 && def2 == 16 && player.x > 400){
           jimmy3.setCam( -549, jimmy3.getCammy());
           ritual = true;
           if(finalscore == 0){
               finalscore = timebonus + lifebonus + 5000;
           }
       }
       if(jimmy3.getDy() < 0 && !moveplat && def2 != 25){
           excessive++;
           if(excessive > 220){
               jimmy3.setBase(2000);
               down = true;
               freeFall = true;
               fall = true;
               blocked= false;
               jimmy3.setDy(1);
           }
     }
        else{
               excessive = 0;
           }
     }
     
     
      public class TAdapter extends KeyAdapter {
          public void keyReleased(KeyEvent e) {
               jimmy3.keyReleased(e);
           }
           
           public void keyPressed(KeyEvent e) {
               if(!(e.getKeyCode() == KeyEvent.VK_SPACE && blocked)){
              jimmy3.keyPressed(e);
               }
              
              if( e.getKeyCode() == KeyEvent.VK_SPACE ){
                  space = true;
              }
            
           }
       }
     
     
    
}
