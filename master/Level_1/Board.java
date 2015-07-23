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


public class Board extends JPanel implements ActionListener {
     private Timer timer;
    private Vine beanstalk; 
    private Image[] background;
    private Jimmy jimmy;
    private Alien alien1;
    private Alien alien2;
    private Alien alien3;
    private Alien alien4;
    private Alien alien5;
    private Alien[] aliens;
    private platforms platforms;
    private ImageIcon Frames[];
    private int mode = 1;
    private int timebonus = 12000;
    private int lifebonus = 1200;
    private int finalscore = 0;
    private int width = 48;
    private int height = 57;
    private int stalky = 0;
    private int stalky2 = 0;
    private int stalky3 = 0;
    private int stalky4 = 0;
    private int stalky5 = 0;
    private Rectangle[] scenery;
    private Rectangle obstacle1 = new Rectangle(155, 268, 12, 15);
     private Rectangle obstacle2 = new Rectangle(225, 268, 12, 15);
     private boolean lost = false;
    private boolean bounce = false;
    private boolean part2 = false;
    private boolean reset = false;
    private boolean movPlat = false;
    private boolean gotKey = false;
    private boolean chain1 = false;
    private boolean chain2 = false;
     private boolean chain3 = false;
     private boolean overkill = true;
     private boolean touch = false;
     private boolean next = false;
     private boolean bluemoon = true;
      boolean leveldone = false; 
    private  int def = 14;
    private int keyx = 250;
    private int seedy = 190;
    private boolean growth = false;
    private boolean unBouncedPlat = true;
    TAdapter keys = new TAdapter();
    private ImageIcon lives = new ImageIcon(this.getClass().getResource("jimmyHead.png"));
    public  Board() {
        addKeyListener(keys);
        //addMouseListener(new MAdapter());
        setFocusable(true);
         ImageIcon ii = new ImageIcon(this.getClass().getResource("background.jpg"));
         ImageIcon iii = new ImageIcon(this.getClass().getResource("background2.jpg"));
         Frames = new ImageIcon[6];
         Frames[0] = new ImageIcon(this.getClass().getResource("frame1.png"));
         Frames[1] = new ImageIcon(this.getClass().getResource("frame2.png"));
         Frames[2]= new ImageIcon(this.getClass().getResource("frame4.png"));
         Frames[3]= new ImageIcon(this.getClass().getResource("frame5.png"));
         Frames[4] = new ImageIcon(this.getClass().getResource("frame6.png"));
        background  = new Image[10];
             background[0] = ii.getImage();
             background[1] = iii.getImage();
          jimmy = new Jimmy();
          alien1 = new Alien();
          alien2 = new Alien();
          alien3 = new Alien();
          alien4 = new Alien();
          alien5 = new Alien();
           aliens = new Alien[5];
           aliens[0] = alien1;
           aliens[1] = alien2;
           aliens[2] = alien3;
            aliens[3] = alien4;
             aliens[4] = alien5;
           aliens[0].Alien(267, 340);
          aliens[1].Alien(340, 225);
          aliens[2].Alien(300, 190);
          aliens[3].Alien(200, 190);
          aliens[4].Alien(350, 190);
          beanstalk = new Vine();
          platforms = new platforms();
         timer = new Timer(15, this);
         timer.start();
        setDoubleBuffered(true);
      
       }
       public void setMode(int n){
           mode = n;
       }
       
       public int getScore(){
           return finalscore;
       }
       
       public int survive(){
           return (jimmy.getLives());
       }
       public void Carry(int n){
           if(mode == 2){
               int temp = n - 3;
               jimmy.setLives(temp);
           }
       }
 
      public Rectangle getBounds() {
        int y = jimmy.getY();
        int x = jimmy.getX();
        return new Rectangle(x, y, 48, 57);
    }
     public boolean getLost(){
         return lost;
     }
    
    public void paint(Graphics g) {
        
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        if(leveldone){
          timer.stop();
           this.removeKeyListener(keys);
           
              
              
            //ImageIcon level2 = new ImageIcon(this.getClass().getResource("level2.png"));
            //Image lvl2 = level2.getImage();
            //g2d.drawImage(lvl2, jimmy.getCamx(), jimmy.getCammy(), null);
        }
        if(!next) {
        if(!part2) {
        g2d.drawImage(background[0], 0, -8, null);
        if(gotKey) {
            ImageIcon ky = new ImageIcon(this.getClass().getResource("key.png"));
            Image key = ky.getImage();
            if(keyx > 215) {
            g2d.drawImage(key, keyx, 225, null);
            keyx--;
        }
             if(keyx <= 215) {
                 ImageIcon circle = new ImageIcon(this.getClass().getResource("seed.png"));
                 Image seed = circle.getImage();
                 if(seedy < 370) {
                 g2d.drawImage(seed, 30, seedy, null);
                 seedy++; }
             }
             if(seedy >= 370) {
                  ImageIcon bud = new ImageIcon(this.getClass().getResource("beanstalk1.png"));
                  Image sprout = bud.getImage();
                   growth = true;
                   int frame = 0;
                  if(frame < 1 && bluemoon){
                  g2d.drawImage(sprout, 5, 310, null);
                  }
                
                   if(touch) {
                     
                        stalky++;
                         frame = stalky/15;
                        if (frame > 5) {frame = 5;}
                      if(chain3) {
                            int part1 = stalky5/18;
                         stalky5++;
                         if (part1 > 5) {part1 = 5;}
                           if (part1 == 5) {
                             g2d.drawImage(beanstalk.getSection(part1), -50, -70, null );
                         }
                           else if(part1 > 1) {
                      g2d.drawImage(beanstalk.getSection(part1), -25, -70, null );
                         }
                      }
                       if(chain2) {
                            int part1 = stalky4/15;
                         stalky4++;
                         if (part1 > 5) {part1 = 5;}
                           if (part1 == 5) {
                             g2d.drawImage(beanstalk.getSection(part1), -50, -10, null );
                         }
                           else if(part1 > 1) {
                      g2d.drawImage(beanstalk.getSection(part1), -25, -10, null );
                         }
                           if (part1 > 2) { chain3 = true; }
                      }
                       
                  
                   if (chain1) {
                         int part1 = stalky3/15;
                         stalky3++;
                         if (part1 > 5) {part1 = 5;}
                        if (part1 == 5) {
                             g2d.drawImage(beanstalk.getSection(part1), -50, 60, null );
                         }
                        else if (part1 > 1) {
                      g2d.drawImage(beanstalk.getSection(part1), -25, 60, null );
                         }
                        if (part1 > 2) { chain2 = true; }
                  }
                     if (frame > 2) {
                         int part1 = stalky2/15;
                         stalky2++;
                         if (part1 > 5) {part1 = 5;}
                         if (part1 == 5) {
                             g2d.drawImage(beanstalk.getSection(part1), -50, 130, null );
                         }
                         else if (part1 > 1) {
                      g2d.drawImage(beanstalk.getSection(part1), -25, 130, null );
                         }
                         if (part1 > 2) { chain1 = true; }
                  } 
                    
                     if (frame == 5) {
                         g2d.drawImage(beanstalk.getSection(frame), -50, 200, null);
                     }
                     else if (frame > 1) {
                          bluemoon = false;
                     g2d.drawImage(beanstalk.getSection(frame), -25, 200, null);
                     }
                   }
             }
        }
        }
        
        else {
            g2d.drawImage(background[1], 0, 0, null);
            
            if(gotKey){
                Rectangle cover = new Rectangle(430, 35, 50, 80);
                Graphics2D g2x = (Graphics2D) g;
                g2x.setColor(Color.CYAN);
                g2x.draw(cover);
                g2x.fill(cover);
            }
            g2d.setColor(Color.BLACK);
          }
        Image head = lives.getImage();
        for (int i = 0; i < jimmy.getLives(); i++) {
            g2d.drawImage( head , 10 +(30 * i), 10, null);
        }
         if(unBouncedPlat) {
                ImageIcon bouncy = new ImageIcon(this.getClass().getResource("bouncy1.png"));
                Image trampolene = bouncy.getImage();
                int xcoor = 275;
                int ycoor = 0;
                if (part2) { xcoor =390; ycoor = 140;}
                g2d.drawImage(trampolene,xcoor, ycoor, null);
         }
       
                  if(!unBouncedPlat && jimmy.getY() + 54 < 5 && jimmy.getY() + 65 > 0 && !part2) {
                  ImageIcon bouncy = new ImageIcon(this.getClass().getResource("bouncy3.png"));
                Image trampolene = bouncy.getImage();
                int xcoor = 260;
                int ycoor = 0;
                g2d.drawImage(trampolene,xcoor, ycoor, null); 
                platforms.setBouncy(0);
             
         }
                  else if(!unBouncedPlat && jimmy.getY() + 54 < 160 && jimmy.getY() > 120 + 54 && part2) {
                    ImageIcon bouncy = new ImageIcon(this.getClass().getResource("bouncy3.png"));
                    Image trampolene = bouncy.getImage();
                    int xcoor =385; 
                    int ycoor = 140;
                g2d.drawImage(trampolene,xcoor, ycoor, null); 
                platforms.setBouncy(0);
                
                  }
           else if(!unBouncedPlat ) {
                int xcoor = 270;
                int ycoor = 0;
                ImageIcon bouncy2 = new ImageIcon(this.getClass().getResource("boucy2.png"));
                Image trampolene = bouncy2.getImage();
                if (part2) { xcoor = 390; ycoor = 140;
                if (jimmy.getY() + 54 < 120) {
                    gotKey = true;
                }    
                }
                g2d.drawImage(trampolene,xcoor, ycoor, null);
                if(jimmy.getY() + 70 < 5 && !part2) {
                    unBouncedPlat = true;
                }
                if(jimmy.getY() + 60 > 210 && part2) {
                    unBouncedPlat = true;
                }
                
        }
         if(touch && part2) 
         {
             int frame = 0;
             if(jimmy.getY() > 350 ){
             stalky = 0;
             stalky2 = 0;
             stalky3 = 0;
             stalky4 = 0;
             stalky5 = 0;
             chain1 = false;
             chain2 = false;
             chain3 = false;
             
             }
             if(touch) {
                     
                        stalky++;
                         frame = stalky/15;
                        if (frame > 5) {frame = 5;}
                      if(chain3) {
                            int part1 = stalky5/18;
                         stalky5++;
                         if (part1 > 5) {part1 = 5;}
                           if (part1 == 5) {
                             g2d.drawImage(beanstalk.getSection(part1), -50, -70, null );
                         }
                           else if(part1 > 1) {
                      g2d.drawImage(beanstalk.getSection(part1), -25, -70, null );
                         }
                      }
                       if(chain2) {
                            int part1 = stalky4/15;
                         stalky4++;
                         if (part1 > 5) {part1 = 5;}
                           if (part1 == 5) {
                             g2d.drawImage(beanstalk.getSection(part1), -50, -10, null );
                         }
                           else if(part1 > 1) {
                      g2d.drawImage(beanstalk.getSection(part1), -25, -10, null );
                         }
                           if (part1 > 2) { chain3 = true; }
                      }
                       
                  
                   if (chain1) {
                         int part1 = stalky3/15;
                         stalky3++;
                         if (part1 > 5) {part1 = 5;}
                        if (part1 == 5) {
                             g2d.drawImage(beanstalk.getSection(part1), -50, 60, null );
                         }
                        else if (part1 > 1) {
                      g2d.drawImage(beanstalk.getSection(part1), -25, 60, null );
                         }
                        if (part1 > 2) { chain2 = true; }
                  }
                     if (frame > 2) {
                         int part1 = stalky2/15;
                         stalky2++;
                         if (part1 > 5) {part1 = 5;}
                         if (part1 == 5) {
                             g2d.drawImage(beanstalk.getSection(part1), -50, 130, null );
                         }
                         else if (part1 > 1) {
                      g2d.drawImage(beanstalk.getSection(part1), -25, 130, null );
                         }
                         if (part1 > 2) { chain1 = true; }
                  } 
                    
                     if (frame == 5) {
                         g2d.drawImage(beanstalk.getSection(frame), -50, 220, null);
                     }
                     else if (frame > 1) {
                     g2d.drawImage(beanstalk.getSection(frame), -25, 220, null);
                     }
                   }
             }
        
         
      
         if(part2) {
          Rectangle temp = new Rectangle(platforms.getZ(), 270, 63, 10);
          g2d.draw(temp);
         g2d.fill(temp);
         
         g2d.draw(obstacle1);
         g2d.draw(obstacle2);
         }
        Graphics2D p2d = (Graphics2D) g;
        
        int y = jimmy.getY();
        int base = jimmy.getBase();
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
        p2d.drawImage(Image, jimmy.getX(), jimmy.getY(), this);
        int start = 0;
        int ender = 2;
        if(part2) {
          start = 2;
          ender = aliens.length;  
        }
        for(int i = start; i < ender; i++) {
               Alien clone = aliens[i];
         if (clone.getFnum() < 8) {
          Image enemy = clone.getFrame();
         g2d.drawImage(enemy, clone.getX(), clone.getY(), this);
          }
           }
        if(leveldone) {
            ImageIcon end = new ImageIcon(this.getClass().getResource("LevelEnd.png"));
            Image complete = end.getImage();
            g2d.drawImage(complete,0,0, this);
        }
        }
         if(jimmy.getLives() < 0){
            ImageIcon temp = new ImageIcon(this.getClass().getResource("GameOver.png"));
            g2d.drawImage(temp.getImage(), 0, -100, this);
            jimmy.setX(0);
            jimmy.setY(0);
            lost = true;
             timer.stop();
           this.removeKeyListener(keys);
        }
        if(!next) {
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
        }
    }
    
  
        public void actionPerformed(ActionEvent e) {
         if(touch) {
                  jimmy.setTop(400);
                  jimmy.setDx(0);
                  
              }
        jimmy.move();
        jimmy.Cykle();
        if(movPlat) {
        platforms.movePlat();
        }
        if(growth) {
            beanstalk.growthPattern();
        }
         overkill = true;
         int start = 0;
         int ender = 2;
         if(part2){
             start = 2;
             ender = aliens.length;
         }
        for(int i = start; i < ender; i++) {
            checkCollision(aliens[i]);
            aliens[i].AlienAI();
            if(aliens[i].getAlive() == false) {
                // aliens[i].Recarn();
              }
        }
       
       
       if(touch && part2 && jimmy.getY() < -50) {
           leveldone = true;
           finalscore = timebonus + lifebonus + 500;
       }
      if(timebonus > 0){
          timebonus--;
      }
        repaint(); 
        
        }
        
        public void checkCollision(Alien a) {
            scenery = platforms.getPlatforms();
            Rectangle player = getBounds();
            int Xmidpoint = (player.x + 24);
            int playerBottom = player.y + 54;
            Rectangle bottom = new Rectangle(player.x + 5 , playerBottom,player.width - 30, 1);
          if (jimmy.getY() + 80 < 5) {
              part2 = true;
              platforms.setPart();
              jimmy.setY(360);
              jimmy.setBase(600);
              jimmy.setTop(-350);
              
              scenery = platforms.getPlatforms();
             
          }
          if(bottom.intersectsLine(290, 24, 370, 24) && unBouncedPlat == false && !part2) {
              jimmy.setTop(50);
          }
          else if (bottom.intersectsLine(422, 180, 500, 180) && unBouncedPlat == false && part2) {
              jimmy.setTop(50);
          }
          if (part2){
          scenery[0] = new Rectangle(platforms.getZ(), 270, 63, 10);
          }
            for(int i =0; i < scenery.length; i++) 
            {
               Rectangle temp = scenery[i];
               
               
             
              
                  if((bottom.intersectsLine(290, 20, 370, 20) && !part2) || (bottom.intersectsLine(432, 154, 500, 154) && part2)) 
                {  
                    if(platforms.getBouncy()) {
                    unBouncedPlat = false;
                }
                    platforms.setBouncy(1);
                }
                  
       
              
                if(bottom.intersects(temp)) 
                {
                  jimmy.jumpChange(temp.y);
                   def = i;
                     if(i == 3 && part2){
              jimmy.setTop(40);
      
               
            }
                }
              
               
                if(!part2 || reset) {
                    if(def > scenery.length - 1){
                        def = 1;
                    }
             int xcoord = scenery[def].x;
             int range = xcoord + scenery[def].width;
             if (Xmidpoint > range || Xmidpoint < xcoord) {
                 jimmy.jumpRevert();
             }
                }
              if(part2 && bottom.intersects(scenery[0])) {
                  reset = true;
                 movPlat = true;
              }
              if(!part2 && gotKey && jimmy.getX() < 40 && jimmy.getY() > 300 && growth){
                  touch = true;
              }
             
             if(part2 && jimmy.getY() < 5) {
                 jimmy.setTop(-50);
                 jimmy.setDy(-1);
             }
             if(Xmidpoint < 10) {
                 jimmy.setDx(2);
               
             }
             else if (Xmidpoint > 490) {
                 jimmy.setDx(-2);
             }
             if (a.getAlive()) {
             Rectangle temp2 =new Rectangle(a.getX() + 4, a.getY() + 5,20, 20);
             Rectangle kill = new Rectangle(a.getX(), a.getY() - 2,28, 1);
             if(bottom.intersects(kill) ) {
               a.die();
                jimmy.jumpChange(a.getY() - 1);
                bounce = true;
                }
             else if(bottom.intersects(temp2)) {
                 jimmy.setX(30);
                 jimmy.setY(300);
                 jimmy.jumpChange(380);
                 if(overkill){
                  jimmy.setLives(-1);
                  lifebonus -= 400;
                  
                  overkill = false;
                 }
                 if(part2) {
                     part2 = false;
                     platforms.setPart();
                     reset = false;
                //aliens[0].setFnum(0);
                //aliens[1].setFnum(0);
                //aliens[0].Alien(267, 340);
                //aliens[1].Alien(340, 225);
                 }
                
             }
             }
             if (part2 && (bottom.intersects(obstacle1) || bottom.intersects(obstacle2))){
                 jimmy.setX(30);
                 jimmy.setY(300);
                 jimmy.jumpChange(380);
                  part2 = false;
                 platforms.setPart();
                 jimmy.setLives(-1);
                 lifebonus -= 400;
                 reset = false;
               // aliens[0].setFnum(0);
               // aliens[1].setFnum(0);
                //aliens[0].Alien(267, 340);
                //aliens[1].Alien(340, 225);
             }
             if(bounce && !jimmy.getJump()) {
                 for(int m = 1; m < 25; m++) {
                     jimmy.jumpRevert();
                 }
                  bounce = false;
             }
            if(jimmy.getY() > 360) {
                part2 = false;
                reset = false;
                platforms.setPart();
                jimmy.setY(0);
                //aliens[0].setFnum(0);
                //aliens[1].setFnum(0);
                //aliens[0].Alien(267, 340);
                //aliens[1].Alien(340, 225);
            }
                 
        }

              
       /* public class MAdapter extends MouseAdapter{
          public void mouseClicked(MouseEvent e) {
               if(leveldone && e.getY() > 290 && e.getY() < 350 && e.getX() < 280 && e.getX() > 150 && !next){
             // next = true;  
 
               }
            
        }
        }  */
        
        }
        public boolean getDone() {
            return leveldone;
        }
        
        
        private class TAdapter extends KeyAdapter {
           public void keyReleased(KeyEvent e) {
               jimmy.keyReleased(e);
           }
           
           public void keyPressed(KeyEvent e) {
              jimmy.keyPressed(e);
           }
       }
}
    
     

 
    

      





        /**
         * @param args the command line arguments
         */
