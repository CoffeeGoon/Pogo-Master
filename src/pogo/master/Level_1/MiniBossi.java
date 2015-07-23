/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pogo.master.Level_1;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.util.Random;
/**
 *
 * @author Kai
 */
public class MiniBossi {
    private int x = 300;
    private int y =  120;
     private int xshift = 0;
      private int yshift = 0;
      private int stammer = 0;
      private int hp = 7;
      private int move = 0;
      private int minions = 0;
      private int wait = 0;
      private int coundown = 4000;
      private int cooldown = 0;
      private Rectangle bite;
      private boolean alive = false;
      private boolean spawn = false;
      private boolean damaged = false;
      private boolean tooclose = false;
      private boolean movereset = true;
      private boolean up = false;
       int xreset = x; 
        private boolean sited = false;
        private int framenum = 0;
        Image frames[] = new Image[5];
        MiniBossi(){
            alive = true;
        }
        public boolean getC(){
            return tooclose;
        }
        public int getMinions(){
            return minions;
        }
        public void setAxis(int a, int b){
            yshift = a;
            xshift = b;
        }
        public void noid(){
            minions = 0;
        }
        public int getWait(){
            return wait;
        }
        public void damage(int w){
            if(!damaged){
            hp -= w;
            damaged = true;
            if(hp <= 0){
                alive = false;
            }
            }
        }
        public void setC(boolean t){
            tooclose = t;
        }
        public boolean getSite(){
            return sited;
        }
        public int getMove(){
            return move;
        }
        public boolean getSpawn(){
            return spawn;
        }
        public int getXpos(){
            return x + xshift;
        }
        public int getYpos(){
            return y + yshift;
        }
        public boolean getDead(){
            return alive;
        }
        public int getCountDown(){
            return coundown;
        }
        public Rectangle getBite(){
            return  new Rectangle(x + xshift + 60, y + yshift + 133, 100, 35);
        }
        public Image getImage(){
            ImageIcon un = new ImageIcon(this.getClass().getResource("pastaminiboss1.png"));
            frames[0] = un.getImage();
            ImageIcon un1 = new ImageIcon(this.getClass().getResource("pasta miniboss2.png"));
            frames[1] = un1.getImage();
            ImageIcon un2 = new ImageIcon(this.getClass().getResource("pasta miniboss3.png"));
            frames[2] = un2.getImage();
            ImageIcon un3 = new ImageIcon(this.getClass().getResource("pastaminiboss4.png"));
            frames[3] = un3.getImage();
            ImageIcon un4 = new ImageIcon(this.getClass().getResource("pastaminiboss5.png"));
            frames[4] = un4.getImage();
            return frames[framenum];
        }
        public void AI(int jx, int jy){
            if(!sited && !spawn){
                stammer++;
                if(damaged){
                    wait++;
                if(stammer % 25 >= 16){
                    framenum = 4;
                }
               else if(stammer % 25 > 8 && stammer % 25 < 16){
                    framenum = 3;
                    
                }
               else if(stammer % 25 <= 8){
                    framenum = 2;
                            
                }
                 if(stammer % 25 == 0){
                        stammer = 0;
                    }
                 if(wait >= 900){
                     wait = 0;
                     damaged = false;
                     movereset = true;
                 }
                }
                else{
                    if(stammer % 32 > 15){
                        framenum = 1;
                    }
                    if(stammer % 32 <= 15){
                        framenum = 0;
                    }
                    
                    if(stammer % 32 == 0){
                        stammer = 0;
                    }
                }
                if(!up){
                yshift++;
                if(yshift > 360){
                    up = true;
                }
                }
                else if(up){
                   yshift--; 
                    if(yshift < -200){
                        up = false;
                    }
                    
                }
                if(jy + 20 > y + yshift + 110 && jy - 20 < y + yshift + 110 &&  !damaged && cooldown <= 0){
                    sited = true;
                }
                
                if(cooldown > 0){
                    cooldown--;
                }
            }
            if(sited && move == 1 && !spawn){
                wait++;
                if (wait > 70){ 
                xshift -= 4;
                if(xshift + x < -230){
                    xshift = 0;
                    wait = 0;
                    movereset = true;
                    sited = false;
                }
                }
                stammer++;
                if(stammer % 32 > 15){
                        framenum = 1;
                    }
                    if(stammer % 32 <= 15){
                        framenum = 0;
                    }
                    
                    if(stammer % 32 == 0){
                        stammer = 0;
                    }
            }
            if(sited && move == 2 && !spawn ){
                framenum = 1;
            wait++;
            if(!up){
                yshift++;
                if(yshift > 360){
                    up = true;
                }
                }
                else if(up){
                   yshift--; 
                    if(yshift < -200){
                        up = false;
                    }
                    
                }
            if(wait > 450){
                sited = false;
                wait = 0;
                movereset = true;
            }
            
            
            
            
        }
            if(sited && move == 3 && !spawn){
                wait++;
                framenum = 1;
                if(wait > 150){
                    sited = false;
                    wait = 0;
                    movereset = true;
                }
                
                
            }
            if(!spawn && minions == 0){
                coundown--;
                 if(coundown <= 0){
                     coundown = 4000;
                     spawn = true;
                 }
    
        }
            if(spawn){
                wait++;
                if(wait > 50){
                    wait = 0;
                    minions = 3;
                    spawn = false;
                    sited = false;
                    cooldown = 500;
                }
                stammer++;
                 if(stammer % 32 > 15){
                        framenum = 1;
                    }
                    if(stammer % 32 <= 15){
                        framenum = 0;
                    }
                    
                    if(stammer % 32 == 0){
                        stammer = 0;
                    }
            }
            if(jx > x + 70){
                tooclose = true;
            }
            if(tooclose && xshift < 70){
                xshift++;
            }
            if(movereset){
             Random rand = new Random();
             int chance = rand.nextInt(1000) + 40;
             if( chance % 40 > 23 ){
                 move = 2;
             }
             else if(chance % 40 <= 23 && chance % 40 > 11){
                 move = 1;
             }
             else if(chance % 40 <= 11){
                 move = 3;
             }
             
             movereset = false;
             sited = false;
              cooldown = 500;
                
            }
            }
        
           
}
    
    

