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
public class LevelTwo extends JPanel implements ActionListener {
    private Timer timer2;
    private Jimmy jimmy2;
    private Robot rob1;
    private Robot rob2;
    private Robot rob3;
    private Robot rob4;
    private Robot rob5;
    private Robot rob6;
    Robot evil[] = new Robot[6];
    private int delay = 0;
    private int move = 0;
    private int mode = 1;
    private int def2 = 0;
    private int timebonus = 16000;
    private int lifebonus = 1200;
    private int finalscore = 0;
    private int nochange = 0;
    private boolean lost = false;
    private boolean stop = false;
    private boolean down = false;
     private boolean moveplat = false;
      private boolean freeFall = false;
      private boolean killed = false;
      private boolean shipParts[] = new boolean[4];
      private boolean complete = false;
      private boolean blastOff = false;
      private boolean done = false;
      private Image ship;
    private int touched = 0;
    TAdapter keys = new TAdapter();
   Rectangle[] scenery2;
    ImageIcon Frames[];
    private boolean bounced = false;
   private platforms platformz;
   private ImageIcon lives = new ImageIcon(this.getClass().getResource("jimmyHead.png"));
    public LevelTwo() {
       addKeyListener(keys);
        setFocusable(true);
        jimmy2 = new Jimmy();
        rob1 = new Robot();
        rob2 = new Robot();
        rob3 = new Robot();
        rob4 = new Robot();
        rob5 = new Robot();
        rob6 = new Robot();
        shipParts[0] = false;
         shipParts[1] = false;
          shipParts[2] = false;
          shipParts[3] = false;
        rob1.setY(1390);
        rob2.setY(1221);
        rob2.setX(790);
        rob2.setBound( 760, 810);
        rob3.setX(340);
        rob3.setY(860);
        rob3.setBound(310, 500);
        rob4.setX(450);
        rob4.setY(1300);
        rob4.setBound(440,570);
        rob5.setX(200);
        rob6.setX(300);
        rob5.setY(426);
        rob6.setY(426);
        rob5.setBound(280, 500);
        rob6.setBound(300, 620);
        jimmy2.setLevel(2);        
        platformz = new platforms();
        platformz.setLevel(2);
      Frames = new ImageIcon[6];
         Frames[0] = new ImageIcon(this.getClass().getResource("frame1.png"));
         Frames[1] = new ImageIcon(this.getClass().getResource("frame2.png"));
         Frames[2]= new ImageIcon(this.getClass().getResource("frame4.png"));
         Frames[3]= new ImageIcon(this.getClass().getResource("frame5.png"));
         Frames[4] = new ImageIcon(this.getClass().getResource("frame6.png"));
       timer2 = new Timer(13, this);
         timer2.start();
        
        setDoubleBuffered(true);
    }
    public boolean getLost(){
        return lost;
    }
      public int survive(){
           return (jimmy2.getLives());
       }
    public void setMode(int n){
           mode = n;
       }
    public int getScore(){
        return finalscore;
    }
       public void Carry(int n){
           if(mode == 2){
               int temp = n - 3;
               jimmy2.setLives(temp);
           }
       }
    
     @ Override public void paint(Graphics g) {
         super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
   ImageIcon level2 = new ImageIcon(this.getClass().getResource("level2.png"));
            Image lvl2 = level2.getImage();
            g2d.drawImage(lvl2, jimmy2.getCamx(), jimmy2.getCammy() -8, null);
             Graphics2D p2d = (Graphics2D) g;
             scenery2 = platformz.getPlatforms();
             for(int i = 19; i <= 21; i++) {
                 Rectangle temp = scenery2[i];
                     g2d.fill(temp); 
             }
            
              Rectangle parts[] = new Rectangle[4];
            parts[0] = new Rectangle(532 + jimmy2.getCamx(), 1174 + jimmy2.getCammy(),42, 60);
            parts[1] = new Rectangle(224 + jimmy2.getCamx(), 1205 + jimmy2.getCammy(),46, 47);
            parts[2] = new Rectangle(42 + jimmy2.getCamx(), 113 + jimmy2.getCammy(), 93, 40);
            parts[3] = new Rectangle(484 + jimmy2.getCamx(), 31 + jimmy2.getCammy(), 75, 55);
             for(int i = 0; i < parts.length; i ++) {
                 
                 if(shipParts[i] && i == 1) { 
                     Color temp = new Color(147, 172, 147, 255);
                     g2d.setColor(temp);
                     g2d.fill(parts[i]);
                 }
                  if(shipParts[i] && i == 0) { 
                     Color temp = new Color(153, 153, 153, 255);
                     g2d.setColor(temp);
                     g2d.fill(parts[i]);
                 }
                  if(shipParts[i] && i == 2) { 
                     Color temp = new Color(255, 127, 42, 255);
                     g2d.setColor(temp);
                     g2d.fill(parts[i]);
                 }
                   if(shipParts[i] && i == 3) { 
                     Color temp = new Color(255, 127, 42, 255);
                     g2d.setColor(temp);
                     g2d.fill(parts[i]);
                 }
             }
             
        int y = jimmy2.getY();
        int base = jimmy2.getBase();
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
        if (!blastOff){
        p2d.drawImage(Image, jimmy2.getX(), jimmy2.getY(), this);
        }
        Image baddy = rob1.getImage();
        
        if (! rob1.getDie() ||  rob1.getDframe() != 15) {
        g2d.drawImage(baddy, rob1.getXy() + jimmy2.getCamx() , 1390 +jimmy2.getCammy(), this );
        }
        Image baddy2 = rob2.getImage();
         if (! rob2.getDie() ||  rob2.getDframe() != 15) {
        g2d.drawImage(baddy2, rob2.getXy() + jimmy2.getCamx() , rob2.getY() +jimmy2.getCammy(), this );
         }
        Image baddy3 = rob3.getImage();
         if (! rob3.getDie() ||  rob3.getDframe() != 15) {
        g2d.drawImage(baddy3, rob3.getXy() + jimmy2.getCamx() , rob3.getY() +jimmy2.getCammy(), this );
         }
        Image baddy4 = rob4.getImage();
         if (! rob4.getDie() ||  rob4.getDframe() != 15) {
        g2d.drawImage(baddy4, rob4.getXy() + jimmy2.getCamx() , rob4.getY() +jimmy2.getCammy(), this );
         }
        Image baddy5 = rob5.getImage();
         if (! rob5.getDie() ||  rob5.getDframe() != 15) {
        g2d.drawImage(baddy5, rob5.getXy() + jimmy2.getCamx() , rob5.getY() +jimmy2.getCammy(), this );
         }
        Image baddy6 = rob6.getImage();
         if (! rob6.getDie() ||  rob6.getDframe() != 15) {
        g2d.drawImage(baddy6, rob6.getXy() + jimmy2.getCamx() , rob6.getY() +jimmy2.getCammy(), this );
         }
         
         evil[0] = rob1;
         evil[1] = rob2;
         evil[2] = rob3;
         evil[3] = rob4;
         evil[4] = rob5;
         evil[5] = rob6;
         for(int i = 0; i < evil.length; i++) {
             if(evil[i].getDie() && evil[i].getDframe() != 15) {
                 Image temp = evil[i].getDeth();
                 if(evil[i].getDframe() == 0) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx() + 22 , evil[i].getY() + jimmy2.getCammy() + 5 , this);
                 }
                  if(evil[i].getDframe() == 1) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx() + 20 , evil[i].getY() + jimmy2.getCammy() + 2 , this);
                 }
                    if(evil[i].getDframe() == 2) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx() + 16 , evil[i].getY() + jimmy2.getCammy()   , this);
                 }
                    if(evil[i].getDframe() == 3) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx() + 10 , evil[i].getY() + jimmy2.getCammy() - 3 , this);
                 }
                 if(evil[i].getDframe() == 4) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx()  , evil[i].getY() + jimmy2.getCammy()  - 5 , this);
                 }
                  if(evil[i].getDframe() == 5) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx() - 6, evil[i].getY() + jimmy2.getCammy() - 10, this);
                 }
                   if(evil[i].getDframe() == 6) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx()  - 4 , evil[i].getY() + jimmy2.getCammy()  - 25, this);
                 }
                    if(evil[i].getDframe() == 7) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx()   - 8, evil[i].getY() + jimmy2.getCammy() - 30 , this);
                 }
                       if(evil[i].getDframe() == 8) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx()   - 30, evil[i].getY() + jimmy2.getCammy() - 70 , this);
                 }
                   if(evil[i].getDframe() == 9) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx()   - 40, evil[i].getY() + jimmy2.getCammy() - 55 , this);
                 }
                    if(evil[i].getDframe() == 10) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx()   - 52, evil[i].getY() + jimmy2.getCammy() - 55 , this);
                 }
                       if(evil[i].getDframe() == 11) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx()   - 57, evil[i].getY() + jimmy2.getCammy() - 55 , this);
                 }
                          if(evil[i].getDframe() == 12) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx()   - 57, evil[i].getY() + jimmy2.getCammy() - 55 , this);
                 }
                              if(evil[i].getDframe() == 13) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx()   - 47, evil[i].getY() + jimmy2.getCammy() - 50 , this);
                 }
                                  if(evil[i].getDframe() == 14) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx()   - 20, evil[i].getY() + jimmy2.getCammy() - 45 , this);
                 }
                                      if(evil[i].getDframe() == 15) {
                 g2d.drawImage(temp, evil[i].getXy() + jimmy2.getCamx()   + 10, evil[i].getY() + jimmy2.getCammy() - 60 , this);
                 }
                 if (i == 0) {
                     rob1 = evil[0];
                 }
                 if (i == 1) {
                     rob2 = evil[1];
                 }
                 if (i == 2) {
                     rob3 = evil[2];
                 }
                 if (i == 3) {
                     rob4 = evil[i];
                 }
                 if (i == 4) {
                     rob5 = evil[i];
                 }
                 if (i == 5) {
                     rob6 = evil[i];
                 }
         }
         }
         if(complete) {
             g2d.drawImage(ship, 620 + jimmy2.getCamx(), 20 + jimmy2.getCammy() - move, null);
             if(blastOff) {
                 delay+= 2;
                 ImageIcon temp = new ImageIcon(this.getClass().getResource("burner.png"));
                 Image burner = temp.getImage();
                 if(delay % 2 == 0) {
                     move++;
                 }  int dy = 0;
                 
                    
                     if(move / 30 >= 1) {
                         dy = 1;
                     }
                     if(move / 30 >= 2) {
                         dy = 2;
                     }
                     if(move / 30 >= 3) {
                         dy = 3;
                     }
                     if(move / 30 >= 4) {
                         dy = 4;
                     }
                     if(move / 30 >= 5) {
                         dy = 5;
                     }
                     for (int i = dy; i > 0; i--) {
                         g2d.drawImage(burner,622 + jimmy2.getCamx() - 3, 50 + jimmy2.getCammy() - move - 5  +((i + 1) * 29) , this);
                     }
                 
             }
             if(blastOff && move >= 200) {
                  ImageIcon end = new ImageIcon(this.getClass().getResource("LevelEnd.png"));
            Image complete = end.getImage();
            g2d.drawImage(complete,0,0, null);
                 timer2.stop();
                 this.removeKeyListener(keys);
                 done = true;
                 
             }
         }
         Image head = lives.getImage();
        for (int i = 0; i < jimmy2.getLives(); i++) {
            g2d.drawImage( head , 10 +(30 * i), 10, null);
        }
            if(!jimmy2.getIntro()) {
                ImageIcon intro = new ImageIcon(this.getClass().getResource("intro.png"));
                Image temp = intro.getImage();
                g2d.drawImage(temp, 200, 250, null);
            }
             if(jimmy2.getLives() < 0){
            ImageIcon temp = new ImageIcon(this.getClass().getResource("GameOver.png"));
            g2d.drawImage(temp.getImage(), 0, -100, this);
            jimmy2.setX(0);
            jimmy2.setY(0);
            lost = true;
             timer2.stop();
           this.removeKeyListener(keys);
        }
            Toolkit.getDefaultToolkit().sync();
            g.dispose();
     }
     
     @ Override public void actionPerformed(ActionEvent e) {
         if(!blastOff) {
            nochange = jimmy2.getX();
         jimmy2.move();
         if(stop){
             jimmy2.setX(nochange);
         }
         jimmy2.Cykle();
         rob1.robotAI();
         if (rob1.getDie()) { rob1.Recarn(); }
         rob2.robotAI();
         if (rob2.getDie()) { rob2.Recarn(); }
         rob3.robotAI();
         if (rob3.getDie()) { rob3.Recarn(); }
         rob4.robotAI();
         if (rob4.getDie()) { rob4.Recarn(); }
         rob5.robotAI();
         if (rob5.getDie()) { rob5.Recarn(); }
         rob6.robotAI();
         if (rob6.getDie()) { rob6.Recarn(); }
         platformz.movePlat();
         }
         checkCollision();
          if(timebonus > 0){
              timebonus--;
          }
        repaint();
        
    }
     
         public Rectangle getBounds() {
        int y = jimmy2.getY();
        int x = jimmy2.getX();
        return new Rectangle(x, y, 48, 57);
    }
         
    public boolean getDone() {
        return done;
    }
         
    public void checkCollision() {
        Rectangle player = getBounds();
        int Xmidpoint = (player.x + 24);
        int playerBottom = player.y + 54;
         Rectangle bottom = new Rectangle(player.x + 5 , playerBottom,player.width - 30, 1);
         platformz.setCam(jimmy2.getCamx(), jimmy2.getCammy());
         scenery2 = platformz.getPlatforms();
        if(jimmy2.getCamx() < -550) {
             jimmy2.setCam(-550, jimmy2.getCammy());
        }
         if(jimmy2.getCamx() > 0) {
             jimmy2.setCam(0, jimmy2.getCammy());
        }
         
         if(jimmy2.getCammy() > 0) {
             jimmy2.setDy(1);
         }
         if(jimmy2.getCammy() < -1100) {
             jimmy2.setDy(-1);
         }
         if(Xmidpoint < 2) {
                 jimmy2.setDx(2);
               
             }
             else if (Xmidpoint > 500) {
                 jimmy2.setDx(-2);
             }
          for(int i =0; i < scenery2.length; i++) 
            {
               Rectangle temp = scenery2[i];
                if(bottom.intersects(temp)) 
                {
                    touched = i;
                  jimmy2.jumpChange(temp.y);
                  killed = false;
                  jimmy2.setDy2(1);
                  if (bounced) {
                      bounced = false;
                      jimmy2.setDy(0);
                      jimmy2.setDy2(1);
                      freeFall = false;
                  }
                  if (i == 12 || i == 15){
                      if (jimmy2.getY() < 250) {
                  jimmy2.setDy(-1);
                  jimmy2.setDy2(2);  
                  
                      stop = true;
                      }
                      else {
                          jimmy2.setDy(0);
                           jimmy2.setDy2(1);
                           stop = false;
                      }
                  }
                   if (i == 22){
                      if (temp.y > 100) {
                  jimmy2.setDy(-1);
                  jimmy2.setDy2(2);                      }
                      else {
                       
                          jimmy2.setDy(0);
                           jimmy2.setDy2(1);
                         
                      }
                  }
                  if(i == 17){
                       if (jimmy2.getY() < 270) {
                  jimmy2.setDy(-1);
                  jimmy2.setDy2(2);     
                  stop = true;
                       }
                      else {
                          jimmy2.setDy(0);
                           jimmy2.setDy2(1);
                           stop = false;
                         
                  }
                  }
               
                  if( i == 19 || i == 21) {
                       moveplat = true;
                      if(platformz.getLimit(1)) {
                          down = true;
                          if ( i == 19) {
                          jimmy2.setDy(1);
                         
                          moveplat = true;
                          }
                          if ( i == 21) {
                            if( jimmy2.getCammy() < 0){ 
                          jimmy2.setDy(-1);
                            }
                           else{
                               jimmy2.setDy(0);
                           }
              
                         
                          }
                       
                      }
                      else {
                           if ( i == 19) {
                          jimmy2.setDy(-1);
                        
                          }
                            if ( i == 21) {
                       
                          jimmy2.setDy(1);
                           
                          
                      }
                  }
                  }
                  if( i == 20) {
                      moveplat = true;
                      if(platformz.getLimit(2)) {
                          down = true;
                          jimmy2.setDy(-1);
                           jimmy2.negSide();
                      }
                      else {
                          jimmy2.setDy(1);
                           
                      }
                  }
                   def2 = i;
                   if(jimmy2.getZoom()) {
                       jimmy2.setDx(0);
                       jimmy2.setDx2(0);
                       jimmy2.setZoom(false);
                   }
                }
            }
            
            Rectangle dashPortal[] = new Rectangle[15];
            dashPortal[0] = new Rectangle(184 + jimmy2.getCamx(), 1268 + jimmy2.getCammy(), 22, 26);
            dashPortal[1] = new Rectangle(822 + jimmy2.getCamx(), 1108 + jimmy2.getCammy(), 30, 26);
            dashPortal[2] = new Rectangle(1018 + jimmy2.getCamx(), 1020 + jimmy2.getCammy(), 22, 26);
            dashPortal[3] = new Rectangle(977 + jimmy2.getCamx(), 999 + jimmy2.getCammy(), 22, 26);
            dashPortal[4] = new Rectangle(938 + jimmy2.getCamx(), 978 + jimmy2.getCammy(), 22, 26);
            dashPortal[5] = new Rectangle(899 + jimmy2.getCamx(), 957 + jimmy2.getCammy(), 22, 26);
            dashPortal[6] = new Rectangle(860 + jimmy2.getCamx(), 936 + jimmy2.getCammy(), 22, 26);
            dashPortal[7] = new Rectangle(821 + jimmy2.getCamx(), 915 + jimmy2.getCammy(), 22, 26);
            dashPortal[8] = new Rectangle(34 + jimmy2.getCamx(), 403 + jimmy2.getCammy(), 20, 15);
            dashPortal[9] = new Rectangle(174 + jimmy2.getCamx(), 368 + jimmy2.getCammy(), 20, 15);
            dashPortal[10] = new Rectangle(34 + jimmy2.getCamx(), 333 + jimmy2.getCammy(), 20, 15);
            dashPortal[11] = new Rectangle(174 + jimmy2.getCamx(), 298 + jimmy2.getCammy(), 20, 15);
            dashPortal[12] = new Rectangle(34 + jimmy2.getCamx(), 250 + jimmy2.getCammy(), 20, 15);
            dashPortal[13] = new Rectangle(174 + jimmy2.getCamx(), 200 + jimmy2.getCammy(), 20, 20);
            dashPortal[14] = new Rectangle(983 + jimmy2.getCamx(), 205 + jimmy2.getCammy(), 26, 43);
            for(int i = 0; i <dashPortal.length; i++) {
                Rectangle temp = dashPortal[i];
                if(bottom.intersects(temp) && (i == 0 || i == 1)){
                    jimmy2.setDx(1);
                    if(i == 0){
                    jimmy2.setDx2(1);
                    }
                    jimmy2.jumpChange(temp.y );
                    jimmy2.setTop(2);
                    jimmy2.setZoom(true);
                }
                 if(bottom.intersects(temp) && i == 2){
                    jimmy2.setDx(-2);
                    jimmy2.jumpChange(temp.y);
                    jimmy2.setTop(10);
                    jimmy2.setZoom(true);
                }
                  if(bottom.intersects(temp) && (i == 8 || i == 10 || i == 12)){
                    jimmy2.setDx(2);
                    jimmy2.jumpChange(temp.y);
                    jimmy2.setTop(10);
                    if (i == 12) {
                        jimmy2.setTop(10);
                    }
                    jimmy2.setZoom(true);
                   
                }
                    if(bottom.intersects(temp) && (i == 9 || i == 11 || i == 13 )){
                    jimmy2.setDx(-2);
                    jimmy2.jumpChange(temp.y);
                    jimmy2.setTop(10);
                    if (i == 11) {
                        jimmy2.setTop(10);
                    }
                    jimmy2.setZoom(true);
                    if (i == 13) {
                        jimmy2.setBase(400);
                         jimmy2.setZoom(false);
                    
                }
                   
            }
                    if(bottom.intersects(temp) && i == 14) {
                        jimmy2.setDx(-1);
                        
                     jimmy2.jumpChange(temp.y - 20);
                    jimmy2.setTop(70);
                    jimmy2.setZoom(true);
                    }
            }
             if( down && platformz.getLimit(1) && touched == 19)  {
                 jimmy2.setDy(1);
                 
             }  
             if( down && !platformz.getLimit(1) && touched == 21)  {
                 jimmy2.setDy(1);
                 
             }  
             if( down && !platformz.getLimit(2) && touched == 20)  {
                 jimmy2.setDy(1);
                 
             }  
             if((touched == 21 || touched == 10) && jimmy2.getCamx() < -540){
                 jimmy2.setRSide();
                 
             }
           
             int xcoord = scenery2[def2].x;
             int range = xcoord + scenery2[def2].width + 15;
             if (Xmidpoint > range || Xmidpoint < xcoord) {
                 jimmy2.jumpRevert();
                 jimmy2.jumpRevert();
                 if(jimmy2.getY() - scenery2[def2].y > 40) {
                     jimmy2.setDy2(2);
                 }
                  freeFall = true;
                 down = false;
                 jimmy2.setDy(0);
                 moveplat = false;
                 killed = false;
             }
               if (jimmy2.getY() > 290 && freeFall) {
                     jimmy2.setDy(2);
                     jimmy2.setDy2(0);
                     bounced = true;
                     
                 }
               
             if((scenery2[touched].y - jimmy2.GetBase() > 50 || scenery2[touched].y - jimmy2.getBase() < -30)
               && moveplat && (touched == 19 || touched == 20 ||touched == 21)) {
                 jimmy2.jumpRevert();
             }
             boolean dead[] = new boolean[6];
             if(rob1.getDie()) { dead[0] = true;}
             if(rob2.getDie()) { dead[1] = true;}    
             if(rob3.getDie()) { dead[2] = true;}
             if(rob4.getDie()) { dead[3] = true;}
             if(rob5.getDie()) { dead[4] = true;}
             if(rob6.getDie()) { dead[5] = true;}
             
           Rectangle deths[] = new Rectangle[6];
             deths[0] = new Rectangle(rob1.getXy() + 5 + jimmy2.getCamx(), 1390 + jimmy2.getCammy(), 30, 10);
             deths[1] = new Rectangle(rob2.getXy() + 5 + jimmy2.getCamx(), rob2.getY()+ jimmy2.getCammy(), 30, 10);
             deths[2] = new Rectangle(rob3.getXy() + 5 + jimmy2.getCamx(), rob3.getY() + jimmy2.getCammy(), 30, 10);
             deths[3] = new Rectangle(rob4.getXy() + 5  + jimmy2.getCamx(), rob4.getY() + jimmy2.getCammy(), 30, 10);
             deths[4] = new Rectangle(rob5.getXy() + 5 + jimmy2.getCamx(), rob5.getY() + jimmy2.getCammy(), 30, 10);
             deths[5] = new Rectangle(rob6.getXy() + 5 + jimmy2.getCamx(), rob6.getY() + jimmy2.getCammy(), 30, 10);
           
           Rectangle parts[] = new Rectangle[4];
            parts[0] = new Rectangle(532 + jimmy2.getCamx(), 1174 + jimmy2.getCammy(),42, 60);
            parts[1] = new Rectangle(224 + jimmy2.getCamx(), 1205 + jimmy2.getCammy(),46, 47);
            parts[2] = new Rectangle(42 + jimmy2.getCamx(), 113 + jimmy2.getCammy(), 93, 22);
            parts[3] = new Rectangle(484 + jimmy2.getCamx(), 31 + jimmy2.getCammy(), 75, 55);
            int g = 0;

            for(int i = 0; i < parts.length; i++) {
                if(player.intersects(parts[i])) 
                {
                    shipParts[i] = true;
                }
                if(shipParts[i] == true) {
                    g++;
                }
                
            }
            if(g == 4) { 
                ImageIcon temp = new ImageIcon(this.getClass().getResource("ship.png"));
                ship = temp.getImage();
                complete = true;
            
            } 
            Rectangle space = new Rectangle(620 + jimmy2.getCamx(), 20 + jimmy2.getCammy(), 60, 180);
            if(complete && player.intersects(space)) {
                blastOff = true;
                if(finalscore == 0){
                    finalscore = timebonus + lifebonus + 2000;
                }
                
            }
                     Rectangle Ydeths[] = new Rectangle[6];
             Ydeths[0] = new Rectangle(rob1.getXy() + 10 + jimmy2.getCamx(), 1390 + jimmy2.getCammy() + 30, 30, 10);
             Ydeths[1] = new Rectangle(rob2.getXy() + 10 + jimmy2.getCamx(), rob2.getY()+ jimmy2.getCammy() + 30 , 20, 20);
             Ydeths[2] = new Rectangle(rob3.getXy() + 10 + jimmy2.getCamx(), rob3.getY() + jimmy2.getCammy()  + 30, 20, 20);
             Ydeths[3] = new Rectangle(rob4.getXy() + 10  + jimmy2.getCamx(), rob4.getY() + jimmy2.getCammy()  + 30, 20, 20);
             Ydeths[4] = new Rectangle(rob5.getXy() + 10 + jimmy2.getCamx(), rob5.getY() + jimmy2.getCammy() + 30, 20, 20);
             Ydeths[5] = new Rectangle(rob6.getXy() + 10 + jimmy2.getCamx(), rob6.getY() + jimmy2.getCammy() + 30, 20, 20);
             boolean alreadyDead = false;
             for(int i = 0; i < Ydeths.length; i++) {
                 if(bottom.intersects(Ydeths[i]) && !dead[i]) {
                     jimmy2.setX(30);
                     jimmy2.setY(300);
                     jimmy2.setDy(0);
                     jimmy2.setDx2(0);
                     jimmy2.setCam(0, -1080);
                     jimmy2.jumpChange(360);
                     jimmy2.setSide();
                     jimmy2.setLives(-1);
                     lifebonus -= 400;
                     alreadyDead = true;
                 }
             }
             for(int i = 0; i < deths.length; i++) {
                 if(bottom.intersects(deths[i]) && !dead[i] ) {
                     jimmy2.jumpChange(deths[i].y - 10);
                     jimmy2.setTop(10);
                     killed = true;
                     if(i == 0) {
                         rob1.die( deths[i].y - bottom.y);
                     }
                     if(i == 1) {
                         rob2.die( deths[i].y - bottom.y);
                     }
                     if(i == 2) {
                         rob3.die( deths[i].y - bottom.y);
                     }
                     if(i == 3) {
                         rob4.die( deths[i].y - bottom.y);
                     }
                     if(i == 4) {
                         rob5.die(deths[i].y - bottom.y);
                     }
                     if(i == 5) {
                         rob6.die(deths[i].y - bottom.y);
                     }
                 }
                 if(killed) {
                     jimmy2.jumpRevert();
                 }
             }
     
         
    
    
    }
    
     public class TAdapter extends KeyAdapter {
          public void keyReleased(KeyEvent e) {
               jimmy2.keyReleased(e);
           }
           
           public void keyPressed(KeyEvent e) {
              jimmy2.keyPressed(e);
            
           }
       }
}
