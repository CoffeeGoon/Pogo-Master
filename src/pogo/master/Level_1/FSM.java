/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pogo.master.Level_1;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Timer;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.awt.Rectangle;
import javax.imageio.ImageIO;
/**
 *
 * @author Kai
 */
public class FSM {
    private int hp =  12;
    private  BufferedImage sheet;
    private BufferedImage frames[];
    private Image noodlepillars[] = new Image[4];
    private Image noodleWhip[] = new Image[6];
    private Image shockwaves[] = new Image[9];
    private Image speach[] = new Image[4];
    private boolean alt = false;
    private int minions = 0;
    private int x;
    private int y;
    private int extraD = 0;
    private int targetX = 0;
    private int targetY = 0;
    private int camX = -700;
    private int dimension = 342;
    private int row = 0;
    private int column = 0;
   private int bloodSport = 180;
    private int framenum = 0;
    private int xshift = 0;
    private int yshift = 0;
    private int moves = 4;
    private int stanza = 0;
    private int toomany[] = new int[8];
    private int flux = 0;
    private int doubleTrouble = 2;
    private int compose = 0;
    private Rectangle snacktime;
    private int cooldown = 1000;
    private boolean finish = false;
    private boolean monlogue = true;
    private boolean idle = true;
    private boolean toleft = true;
    private boolean raise = false;
    private boolean rise = false;
    private boolean avoid = false;
    private boolean slam = false;
    private boolean laser = false;
    private boolean thorns = false;
    private boolean swingbatter = false;
    private boolean setUp = false;
    private boolean locked = false;
    private boolean hurt = false;
    private boolean angry = false;
    private boolean mineflurry = false;
    private boolean summon = false;
    private boolean killer = false;
    private boolean finalblow = false;
    FSM(){
        try{
        sheet = ImageIO.read(new File("src/pogo/master/Level_1/FSMsprite.png"));
        }catch(IOException a){
            System.out.print("CrIIIIIIIIIkey");
        }
        frames = new BufferedImage[16];
        ImageIcon pill = new ImageIcon(this.getClass().getResource("noodlepillar1.png"));
        noodlepillars[0] = pill.getImage();
        ImageIcon pill2 =  new ImageIcon(this.getClass().getResource("noodlepillar2.png"));
        noodlepillars[1] = pill2.getImage();
        ImageIcon pill3 =  new ImageIcon(this.getClass().getResource("noodlepillar3.png"));
         noodlepillars[2] = pill3.getImage();
         ImageIcon pill4 =  new ImageIcon(this.getClass().getResource("noodlepillar4.png"));
         noodlepillars[3] = pill4.getImage();
         ImageIcon yack = new ImageIcon(this.getClass().getResource("speach1.png"));
          ImageIcon yack2 = new ImageIcon(this.getClass().getResource("speach2.png"));
           ImageIcon yack3 = new ImageIcon(this.getClass().getResource("speach3.png"));
            ImageIcon yack4 = new ImageIcon(this.getClass().getResource("speach4.png"));
            speach[0] = yack.getImage();
            speach[1] = yack2.getImage();
            speach[2] = yack3.getImage();
            speach[3] = yack4.getImage();
            toomany[0] = 0;
            toomany[1] = 0;
            toomany[2] = 0;
            toomany[3] = 0;
            toomany[4] = 0;
            toomany[5] = 0;
            toomany[6] = 0;
            toomany[7] = 2;
            ImageIcon bz = new ImageIcon(this.getClass().getResource("shock1.png"));
             ImageIcon bz2 = new ImageIcon(this.getClass().getResource("shock2.png"));
              ImageIcon bz3 = new ImageIcon(this.getClass().getResource("shock3.png"));
               ImageIcon bz4 = new ImageIcon(this.getClass().getResource("shock4.png"));
                ImageIcon bz5 = new ImageIcon(this.getClass().getResource("shock5.png"));
                 ImageIcon bz6 = new ImageIcon(this.getClass().getResource("shock6.png"));
                  ImageIcon bz7 = new ImageIcon(this.getClass().getResource("shock7.png"));
                   ImageIcon bz8 = new ImageIcon(this.getClass().getResource("shock8.png"));
                    ImageIcon bz9 = new ImageIcon(this.getClass().getResource("shock9.png"));
                    shockwaves[0] = bz.getImage();
                    shockwaves[1] = bz2.getImage();
                    shockwaves[2] = bz3.getImage();
                    shockwaves[3] = bz4.getImage();
                    shockwaves[4] = bz5.getImage();
                    shockwaves[5] = bz6.getImage();
                    shockwaves[6] = bz7.getImage();
                    shockwaves[7] = bz8.getImage();
                    shockwaves[8] = bz9.getImage();
                    x = 880;
                    y = 1085;
                    ImageIcon tube = new ImageIcon(this.getClass().getResource("hammer2.png"));
                    noodleWhip[0] = tube.getImage();
                     ImageIcon tube2 = new ImageIcon(this.getClass().getResource("hammer3.png"));
                    noodleWhip[1] = tube2.getImage();
                     ImageIcon tube3 = new ImageIcon(this.getClass().getResource("hammer1.png"));
                    noodleWhip[2] = tube3.getImage();
                     ImageIcon tube4 = new ImageIcon(this.getClass().getResource("hammer4.png"));
                    noodleWhip[3] = tube4.getImage();
                     ImageIcon tube5 = new ImageIcon(this.getClass().getResource("hammer7.png"));
                    noodleWhip[4] = tube5.getImage();
                     ImageIcon tube6 = new ImageIcon(this.getClass().getResource("hammer6.png"));
                    noodleWhip[5] = tube6.getImage();
    }
    
    public int getX(){
        return x + xshift;
    }
    public Image[] getPill(){
        return noodlepillars;
    }
    public boolean getRise(){
        return avoid;
    }
    public void move(int dx, int dy){
        x = dx;
        y = dy;
    }
    
    public boolean getAngry(){
        return angry;
    }
    public void reis(){
        raise = true;
     
    }
    public void Mugen(int dx, int dy){
        xshift = 0;
        yshift = 0;
        x = dx;
        y = dy;
        
    }
    
    public boolean getRei(){
        return raise;
    }
    public boolean getK(){
        return killer;
    }
    public void Finishem(){
        finalblow = true;
    }
    public boolean getDeth(){
        return finalblow;
    }
    public void happy(){
        angry = false;
    }
    public void antiRise(){
        avoid = false;
    }
    public void noPill(){
        thorns = false;
    }
    public boolean getthorn(){
        return thorns;
    }
    public boolean getIdle(){
    return idle;    
    }
    public void setFrame(int q){
        framenum = q;
    }
    public int getY(){
        return y + yshift;
        
    }
    public void setTarget(int a){
        xshift = a - x;
    }
    public void Aim(int  a, int b, int c){
        targetX = a;
        targetY = b;
        camX = c;
    }
    public boolean getIntro(){
        return monlogue;
    }
    public boolean getSlam(){
        return slam;
    }
    public void reset(){
        cooldown = 1800;
        if(angry){
            cooldown = 1400;
        }
        
        setUp = false;
         Random rand = new Random();
         moves = rand.nextInt(7) + 1;
         
         for(int i = 1; i <= 7; i++){
            if(moves != i){
                if(toomany[moves] - toomany[i] >= 2){
                    moves = i; 
                    break;
                }
            }
                
                
         }
         locked = false;
         System.out.println("moves " + moves);
         toomany[moves] = toomany[moves] + 1;
         extraD = 0;
         doubleTrouble = 2;
         summon = false;
         
    }
    public boolean getHam(){
        return setUp;
    }
    public void getVert(){
        int dex = 0;
        for(int i = 0; i < 4; i++){
            for(int k = 0; k < 4; k++){
               int xbegin = k * dimension;
               int ybegin = i * dimension;
                BufferedImage temp = sheet.getSubimage(  xbegin,  ybegin,  341,  341);
                frames[dex] = temp;
                dex++;
            }
        }
        
        
    }
    public Image getSpeach(){
    return speach[stanza];    
    
    }
    public int getYshift(){
        return yshift;
    }
    public void Interate(){
        doubleTrouble--;
    }
    public int getFlux(){
        return flux;
    }
    public Image[] getWhip(){
        return noodleWhip;
    }
    public boolean getSwing(){
        return swingbatter;
    }
    public Image[] getShock(){
        return shockwaves;
    }
    public Image getFrame(){
        return frames[framenum];
    }
    public int getCool(){
        return cooldown;
    }
    public int getMoves(){
        return moves;
    }
    public boolean getzap(){
        return laser;
    }
    public void nobeam(){
        laser = false;
    }
     private void RandomMove(){
         
     }
     public int getCompose(){
         return compose;
     }
     public boolean getKill(){
         return killer;
     }
     public boolean dead(){
         boolean ugh = false;
         if(hp <= 0){
             ugh = true;
         }
    return ugh;
     }
     
     public int summonRequest(){
         
         int value = (3 - minions);
         minions = 3;
          
         return value;
     }
     public void vanquish(){
         if(minions > 0){
             minions--;
         }
     }
     public boolean getSum(){
         return summon;
     }
     
     public void Damage(){
         if(compose <= 0){
         hp--;
         hp-= extraD;
         hurt = true;
         compose = 900;
         if(hp <= 6){
             compose = 1200;
             angry = true;
         }
         cooldown = 40;
         }
     }
     public boolean getHurt(){
         return hurt;
     }
     public int getDoubT(){
         return doubleTrouble;
     }
    public Rectangle getSnack( int camx, int camy){
        snacktime = new Rectangle(x + xshift + 170 + camx, y + yshift + camy + 180, 50, 50);
        return snacktime;
    }
    public boolean getMine(){
        return mineflurry;
    }
    public void Moar(int n){
        if(n > 1){
            extraD = n;
        }
    }
    public void noMine(){
        mineflurry = false;
    }
    public Rectangle getHit(int camx, int camy){
        return new Rectangle(x + xshift + camx + 150, y + yshift + camy + 140, 40, 55);
    }
    public void FSMai(){
        flux++;
        if (hp <= 0){
            finish = true;
            moves = 8;
            
        }
        if(compose > 0){
            compose--;
        }
        if(flux % 1000  >= 501 ){
            alt = true;
        }
        if(flux % 1000 < 501 ){
            alt = false;
        }
        
        if(monlogue){
            if(flux % 60 < 11 ){
                framenum = 0;
                if(alt){
                    framenum = 3;
                }
            }
             if(flux % 60 >= 11 && flux % 60 < 21 ){
               framenum = 1;
               if(alt){
                   framenum = 5;
               }
            }
             if(flux % 60 >= 21 && flux % 60 < 31 ){
               framenum = 2;
               if(alt){
                   framenum = 4;
               }
            }
             if(flux % 60 >= 31 && flux % 60 < 41 ){
                framenum = 3;
                if(alt){
                    framenum = 2;
                }
            }
             if(flux % 60 >= 41 && flux % 60 < 51){
                framenum = 4;
            }
              if(flux % 60 >= 51 && flux % 60 < 60){
                framenum = 5;
            }
             
              if(flux >= 485 && flux < 840){
                  stanza = 1;
              }
             if(flux >= 840 && flux < 1110){
                  stanza = 2;
              }
             if(flux >= 1110 && flux < 1340){
                  stanza = 3;
              }
             if(flux >= 1380){
                 monlogue = false;
                 
             }
        }
        else if(idle && !hurt ){
            
            
               if(flux % 60 < 11 ){
                framenum = 0;
                if(alt){
                    framenum = 3;
                }
            }
             if(flux % 60 >= 11 && flux % 60 < 21 ){
               framenum = 1;
               if(alt){
                   framenum = 5;
               }
            }
             if(flux % 60 >= 21 && flux % 60 < 31 ){
               framenum = 2;
               if(alt){
                   framenum = 4;
               }
            }
             if(flux % 60 >= 31 && flux % 60 < 41 ){
                framenum = 3;
                if(alt){
                    framenum = 2;
                }
            }
             if(flux % 60 >= 41 && flux % 60 < 51){
                framenum = 4;
            }
              if(flux % 60 >= 51 && flux % 60 < 60){
                framenum = 5;
            }
              if(  !finish  && toleft && cooldown != 0 && !slam){
                  xshift--;
                  if(angry && !alt){
                      xshift -= 2;
                  }
              }
              else if( !finish  && cooldown!= 0 && !slam){
                  xshift++;
                  if(angry && !alt){
                      xshift += 2;
                  }
                  
              }
              if(xshift < -360){
                  toleft = false;
              }
              if(xshift > 130){
                  toleft = true;
              }
              if( !raise  && !slam && rise && cooldown != 0){
                  if(!alt){
                  yshift-= 2;
                
                      
                  
                  }
                  else if( !raise){
                      yshift -= 3;
                  }
              }
              else if(!slam && !rise && cooldown != 0 && !raise  ){
                      
                      if(!alt){
                  yshift+= 2;
                  if(angry){
                      yshift--;
                  }
                      }
                      else{
                          yshift += 3;
                      }
                      
              }
              if(!slam && !mineflurry && rise && yshift <= -200){
                  rise = false;
              }
              if(!slam && !mineflurry && !rise && yshift >= 0){
                  rise = true;
              }
              if(!slam && !mineflurry && !rise && angry && !alt && yshift >= -10){
                  rise = true;
              }
              if(cooldown > 0){
                  cooldown--;
              }
              if(slam && cooldown != 0){
                  if(flux % 7 == 0){
                  yshift--;
                  }
                  if(yshift <= 0){
                      
                      slam = false;
                  }
              }
              
    }
     if(hurt && !finish){
         bloodSport-= 2;
         if(bloodSport > 79){
             framenum = 6;
         }
         if(bloodSport <= 79 && bloodSport > 49 ){
             framenum = 7;
         }
         if(bloodSport <= 49 && bloodSport > 19 ){
             framenum = 8;
         }
         if(bloodSport <= 19){
             framenum = 9;
         }
         if(bloodSport <= 0){
             hurt = false;
             bloodSport = 180;
         }
     }
    if(cooldown == 0 && moves == 1 ){
        if(!slam){
        yshift-= 4;
        if( yshift < -630){
            slam = true;
            
        }
        }
        if(slam){
            yshift += 5;
            framenum = 10;
            if(yshift >= 60 && !angry){
                cooldown = 1800;
                Random rand = new Random();
         moves = rand.nextInt(6) + 2;
         if(hp <= 10){
             angry = true;
         }
            }
            else if(yshift >= 60){
                cooldown = 0;
                moves = 1;
                slam = false;
                doubleTrouble--;
            }
            if(doubleTrouble <= 0){
                doubleTrouble = 2;
                angry = false;
                slam = false;
            }
        }
        
    }
    if(cooldown == 0 && moves == 2){
       if(angry && doubleTrouble == 1){
        if( yshift + y + 171 > targetY - 60 ){
         yshift -= 2;
     }
           else{
              yshift += 2; 
           }
               framenum = 11;
         if(flux % 50 >= 24){
             framenum = 12;
             laser = true;
           }
           
       }
       else{
     if( yshift < 0){
         yshift++;
     }
     else if( xshift < 130){
         xshift++;
     }
     else{
         framenum = 11;
         if(flux % 50 >= 24){
             framenum = 12;
             laser = true;
         }
     }
       }
    }
    if(cooldown == 0 && moves == 3){
        if( yshift < 0){
         yshift++;
     }
     else if( xshift < 55){
         xshift++;
     }
     else{
         framenum = 15;
         thorns = true;
         
     }
    }
    
    if(cooldown == 0 && moves == 4){
        swingbatter = true;
        setUp = true;
          if(!(xshift + x + camX > targetX + 40 && xshift + x + camX < targetX + 80) && !locked){
              if(xshift + x + camX <=  targetX + 50){
              xshift+= 3;
              if(yshift > -180){
              yshift-= 2;
              }
              }
              else{
                  xshift-= 2;
                  if(yshift > -180){
                  yshift-= 2;
                  }
              }
              swingbatter = false; 
          }
          
          else if( yshift <  20 && !locked){
              yshift++;
              if(angry){
                  yshift+= 2;
              }
              swingbatter = false;
          }
          else if(swingbatter){
              locked = true;
              framenum = 4;
              if(flux % 54 > 26){
                  framenum = 5;
              }
              
          }
          
          
    }
    
    if(cooldown == 0 && moves == 5){
    
        avoid = true;
        
        
    }
    if(cooldown == 0 && moves == 6){
        mineflurry = true;
        if( yshift <= -290){
                  rise = false;
              }
              if( yshift >= -100){
                  rise = true;
              }
              if(rise){
                 
                      yshift-= 2;
                  
              }
              else{
                   if(flux % 2 == 0){
                      yshift++;
                  }
              }
              if(toleft){
                  xshift-= 3;
              }
              else{
                  xshift += 3;
              }
        
    }
    if (cooldown == 0 && moves == 7){
        
        summon = true;
    }
     
    if(finish && !raise){
        bloodSport-=2;
        if(bloodSport > 79){
             framenum = 6;
         }
         if(bloodSport <= 79 && bloodSport > 49 ){
             framenum = 7;
         }
         if(bloodSport <= 49 && bloodSport > 19 ){
             framenum = 8;
         }
         if(bloodSport <= 19){
             framenum = 9;
         }
         if(bloodSport <= 0){
           
             bloodSport = 150;
         }
        
        
        
        
        boolean right = true;
        if(x + xshift  > 790){
            xshift--;
            right = false;
            
        }
        if(x + xshift < 780){
            xshift++;
            right = false;
        }
        if(yshift > - 220){
            yshift--;
            right = false;
        }
        if(right){
            killer = true;
        }
        
        
    }
    
    }       
            
            
            
            
    }
    

