/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogo.master.Level_1;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.image.BufferedImage;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;
/**
 *
 * @author Kai
 */
public class Level4 extends JPanel implements ActionListener {
    private Timer timer4;
    private Jimmy jimmy4;
    private MiniBossi Rav;
    private pastaAngel[] legion1;
     private pastaAngel[] legion2;
      private pastaAngel[] legion3;
       private pastaAngel[] legion4;
    private Unicorn[] U2 = new Unicorn[3];
     private Robot[] robots = new Robot[3];
     private mine swarm[] = new mine[3];
     private mine swarm2[] = new mine[6];
     private Rectangle middle;
     private Rectangle Tip;
     private int toomuch = 0;
    private int minenum = 0;
    private int mode = 1;
    private int timebonus = 60000;
    private int lifebonus = 1200;
    private int finalscore = 0;
    private int part;
    private int delay;
    private int wark = 0;
    private int Delta = 0;
    private int vulnerable = 80;
    private int shift = 0;
    private int yshift = 0;
    private int gauntlet = 0;
    private int mover = 0;
    private int level = 4;
    private int dark = 0;
    private int repeat = 0;
    private int ysave = 0;
    private int frame1kills = 0;
    private int kount2 = 0;
    private int divecount;
     private int Imortal = 0;
     private int wait = 0;
     private int onscreen = 0;
     private int recent = 0;
     private int dashflash = 0;
     private int dashcount = 0; 
     private int ypos = 0;
      private int xpos = 0;
      private int choice = 1;
      private int begin;
      private int end;
      private int frameFin = 0;
      private int reboot = 0;
      private int hopscotch = 0;
      private int redshift = 0;
      private int nshift = 0;
      private int EndWhipShift[] = new int[6];
      private int finalXshift = 0;
      private int finalyShift = 0;
      private boolean Nback = false;
      private String sector = "sine";
      private Rectangle[] spikeballs = new Rectangle[15];
      private Rectangle[] dashP2 = new Rectangle[3];
      private boolean L = false;
      private boolean done = false;
      private boolean lost = false;
     private boolean freeFall = false;
     private boolean smooth = false;
     private boolean opening = true;
     private boolean over = false;
      private boolean down = false;
      private boolean ending = false;
     private boolean bounced = false;
     private boolean transistion1 = false;
     private boolean Enemybounce = false;
     private boolean deflect = false;
     private boolean shield = false;
     private boolean downgrade = false;
     private boolean launch = false;
     private boolean cloudmode = false;
     private boolean edge = false;
     private boolean once = true;
     private boolean laserfire = true;
     private boolean landing = false;
     private boolean uber = false;
     private boolean dash;
     private boolean available = true;
     private boolean finalfall = false;
     private boolean miniboss = false;
     private boolean finalboss = false;
     private boolean space = false;
     private boolean deadly;
     private boolean message = true;
     int vertigo = 0;
     int loop = 0;
     private boolean endzone = false;
     private Rectangle Hammer;
     private FSM G;
     private boolean munch = false;
     private boolean Noodlereverse = false;
     private boolean move = false;
     private Image portions[] = new Image[7];
     private platforms platforms4 = new platforms();
     private Image halo[] = new Image[3];
      private Image portal1;
       private Image portal2;
        private Image portal3;
         private Image portal4;
          private Image portal5;
           private GigaPos finisher;
            private int up = 600;
     private ImageIcon Frames[];
     private BufferedImage recarn[] = new BufferedImage[60];
     private ImageIcon lives = new ImageIcon(this.getClass().getResource("jimmyHead.png"));
     private ImageIcon Marinara[] = new ImageIcon[2];
     private Image Ending[] = new Image[43];
    TAdapter keys = new TAdapter();
    public Level4(){
        addKeyListener(keys);
       setFocusable(true);
       jimmy4 = new Jimmy();
       jimmy4.setLevel(4);
       jimmy4.setX(27);
       jimmy4.setY(240);
       legion1 = new pastaAngel[5];
        legion1[0] = new pastaAngel(1, false);
        legion1[1] = new pastaAngel(1, false);
        legion1[2] = new pastaAngel(1, false);
        legion1[3] = new pastaAngel(1, false);
        legion1[4] = new pastaAngel(1, false);
        legion2 = new pastaAngel[2];
        legion2[0] = new pastaAngel(2, false);
         legion2[1] = new pastaAngel(2, false);
         legion3 = new pastaAngel[6];
          legion3[0] = new pastaAngel(1, false);
        legion3[1] = new pastaAngel(1, false);
        legion3[2] = new pastaAngel(1, false);
        legion3[3] = new pastaAngel(1, false);
        legion3[4] = new pastaAngel(1, false);
        legion3[5] = new pastaAngel(1, false);
        legion4 = new pastaAngel[6];
        legion4[0] = new pastaAngel(1, false);
        legion4[1] = new pastaAngel(1, false);
        legion4[2] = new pastaAngel(1, false);
        legion4[3] = new pastaAngel(1, false);
        legion4[4] = new pastaAngel(1, false);
        legion4[5] = new pastaAngel(1, false);
        finisher = new GigaPos();
        ImageIcon warp = new ImageIcon(this.getClass().getResource("halo3.png"));
         ImageIcon warp2 = new ImageIcon(this.getClass().getResource("halo2.png"));
          ImageIcon warp3 = new ImageIcon(this.getClass().getResource("halo1.png"));
          halo[0] = warp.getImage();
          halo[1] = warp2.getImage();
          halo[2] = warp3.getImage();
       U2[0] = new Unicorn();
        U2[0].setBound(2300, 2600);
        U2[0].setX(2400);
        U2[0].setY(812);
          U2[1] = new Unicorn();
        U2[1].setBound(2900, 3100);
        U2[1].setX(2800);
        U2[1].setY(500);
         U2[2] = new Unicorn();
        U2[2].setBound(2500, 2900);
        U2[2].setX(2600);
        U2[2].setY(200);
        robots[0] = new Robot();
        robots[0].setBound(2800, 2970);
        robots[0].setX(2810);
        robots[0].setY(975);
        robots[1] = new Robot();
        robots[1].setBound(2590, 2760);
        robots[1].setX(2620);
        robots[1].setY(900);
        robots[2] = new Robot();
         robots[2].setBound(2700, 2820);
        robots[2].setX(2740);
        robots[2].setY(595);
       platforms4.setLevel(4);
       Frames = new ImageIcon[8];
        Frames[0] = new ImageIcon(this.getClass().getResource("frame1.png"));
         Frames[1] = new ImageIcon(this.getClass().getResource("frame2.png"));
         Frames[2]= new ImageIcon(this.getClass().getResource("frame4.png"));
         Frames[3]= new ImageIcon(this.getClass().getResource("frame5.png"));
         Frames[4] = new ImageIcon(this.getClass().getResource("frame6.png"));
         Frames[5] = new ImageIcon(this.getClass().getResource("spin1.png"));
         Frames[6] = new ImageIcon(this.getClass().getResource("spin2.png"));
         Frames[7] = new ImageIcon(this.getClass().getResource("spin3.png"));
          ImageIcon Heaven1 = new ImageIcon(this.getClass().getResource("pastaHeaven1.png"));
        portions[0] = Heaven1.getImage();
        ImageIcon Heaven2 = new ImageIcon(this.getClass().getResource("pastaHeaven2.png"));
        portions[1] = Heaven2.getImage();
        ImageIcon Heaven3 = new ImageIcon(this.getClass().getResource("pastaHeaven3.png"));
        portions[2] = Heaven3.getImage();
        ImageIcon Heaven4 = new ImageIcon(this.getClass().getResource("pastaHeaven4.png"));
        portions[3] = Heaven4.getImage();
        ImageIcon Heaven5 = new ImageIcon(this.getClass().getResource("pastaHeaven5.png"));
         portions[4] = Heaven5.getImage();
        ImageIcon buffer = new ImageIcon(this.getClass().getResource("cloudbuffer.png"));
         Marinara[0] = new ImageIcon(this.getClass().getResource("Mar.png"));
          Marinara[1] = new ImageIcon(this.getClass().getResource("Mar2.png"));
      part = 1;
       ImageIcon end3  = new ImageIcon(this.getClass().getResource("portal1.png"));
       ImageIcon end4  = new ImageIcon(this.getClass().getResource("portal2.png"));
       ImageIcon end5  =new ImageIcon(this.getClass().getResource("portal3.png"));
       ImageIcon end6  =new ImageIcon(this.getClass().getResource("portal4.png"));
       ImageIcon end7  = new ImageIcon(this.getClass().getResource("portal5.png"));
       portal1 = end3.getImage();
                
       portal2 = end4.getImage();
                
       portal3 = end5.getImage();
                
        portal4 = end6.getImage();
                
        portal5 = end7.getImage();
        //part = 3;
                 /* recent = 0;
                  edge = true;
                  shift = 0;
                  dark = 0;
                  jimmy4.setCam(0, 0);
                  jimmy4.setX(130);
                  jimmy4.setY(190);
                  jimmy4.setpart(1);
                  legion3[0].activate(1100, 500);
                  legion3[1].activate(600, 100);
        */
        /*
       part = 4;
                    jimmy4.setpart(4);
                    dark = 0;
                    recent = 0;
                    opening = false;
                    transistion1 = false;
                    jimmy4.setCam(-650, -960);
                    jimmy4.setX(90);
                    jimmy4.setY(200);
                     jimmy4.setX(190);
                     jimmy4.Finale();
                finalboss = true;
                G = new FSM();
                G.getVert();
                dark = 0;
                redshift = 0;
                platforms4.setPortion(4);
          */  
                    //legion4[0].activate(170, 500);
                   // legion4[0].changeStagger(150);
                    //legion4[1].activate(300, 350);
                    // legion4[1].changeStagger(150);
        
       
        
       ImageIcon foo1 = new ImageIcon(this.getClass().getResource("lines1.png"));
       Ending[0] = foo1.getImage();
        foo1 = new ImageIcon(this.getClass().getResource("lines2.png"));
         Ending[1] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("folly3.png"));
       Ending[2] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("folly2.png"));
       Ending[3] = foo1.getImage();
        foo1 = new ImageIcon(this.getClass().getResource("fallin1.png"));
       Ending[4] = foo1.getImage();
        foo1 = new ImageIcon(this.getClass().getResource("fallin2.png"));
       Ending[5] = foo1.getImage();
        foo1 = new ImageIcon(this.getClass().getResource("firefall.png"));
       Ending[6] = foo1.getImage();
        foo1 = new ImageIcon(this.getClass().getResource("firefall2.png"));
       Ending[7] = foo1.getImage();
        foo1 = new ImageIcon(this.getClass().getResource("MapofDoom.png"));
       Ending[8] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("bats2.png"));
         Ending[9] = foo1.getImage();
          foo1 = new ImageIcon(this.getClass().getResource("batty3.png"));
         Ending[10] = foo1.getImage();
          foo1 = new ImageIcon(this.getClass().getResource("batty2.png"));
         Ending[11] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("fallin3.png"));
         Ending[12] = foo1.getImage();
      foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF1.png"));
         Ending[13] = foo1.getImage();
          foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF2.png"));
         Ending[14] = foo1.getImage();
          foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF3.png"));
         Ending[15] = foo1.getImage();
          foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF4.png"));
         Ending[16] = foo1.getImage();
          foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF5.png"));
         Ending[17] = foo1.getImage();
          foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF6.png"));
         Ending[18] = foo1.getImage();
          foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF7.png"));
         Ending[19] = foo1.getImage();
          foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF8.png"));
         Ending[20] = foo1.getImage();
          foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF9.png"));
         Ending[21] = foo1.getImage();
        foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF10.png"));
         Ending[22] = foo1.getImage();
       foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF11.png"));
         Ending[23] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF12.png"));
         Ending[24] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF13.png"));
         Ending[25] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF14.png"));
         Ending[26] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF15.png"));
         Ending[27] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF16.png"));
         Ending[28] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF17.png"));
         Ending[29] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF18.png"));
         Ending[30] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF19.png"));
         Ending[31] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF20.png"));
           Ending[32] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF21.png"));
         Ending[33] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF22.png"));
         Ending[34] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF23.png"));
         Ending[35] = foo1.getImage();
          foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF24.png"));
         Ending[36] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/EndF25.png"));
         Ending[37] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/blankCano.png"));
         Ending[38] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/zoom1.png"));
         Ending[39] = foo1.getImage();
         foo1 = new ImageIcon(this.getClass().getResource("EndFrames/zoom2.png"));
         Ending[40] = foo1.getImage();
         BufferedImage sheet;
         BufferedImage sheet2;
         BufferedImage sheet3;
         BufferedImage sheet4;
         BufferedImage sheet5;
         
           try{
        sheet =  ImageIO.read( new File("src/pogo/master/Level_1/lastscene/jimmysmokeshow200.png") );
        int basx = 165;
        int basy = 165;
        int counter = 0;
        for(int k = 1; k <= 4; k++){
        for(int i = 1; i <= 3; i++){
            recarn[counter] = sheet.getSubimage( basx*i - 165, basy*k - 165, 165, 165);
            ++counter;
        }
        }
        
         sheet2 =  ImageIO.read( new File("src/pogo/master/Level_1/lastscene/jimmysmokeshow250.png") );
           basx = 283;
        basy = 283;
        for(int k = 1; k <= 4; k++){
        for(int i = 1; i <= 3; i++){
            recarn[counter] = sheet2.getSubimage( basx*i - 283, basy*k - 283, 283, 283);
             ++counter;
        }
        }
          sheet3 =  ImageIO.read( new File("src/pogo/master/Level_1/lastscene/jimmysmokeshow300.png") );
            basx = 300;
        basy = 300;
        for(int k = 1; k <= 4; k++){
        for(int i = 1; i <= 3; i++){
            recarn[counter] = sheet3.getSubimage( basx*i - 300, basy*k - 300, 300, 300);
             ++counter;
        }
        }
           sheet4 =  ImageIO.read( new File("src/pogo/master/Level_1/lastscene/jimmysmokeshow350.png") );
             basx = 350;
        basy = 350;
        for(int k = 1; k <= 4; k++){
        for(int i = 1; i <= 3; i++){
            recarn[counter] = sheet4.getSubimage( basx*i - 350, basy*k - 350, 350, 350);
             ++counter;
        }
        }
            sheet5 =  ImageIO.read( new File("src/pogo/master/Level_1/lastscene/jimmysmokeshow400.png") );
              basx = 400;
        basy = 400;
        for(int k = 1; k <= 4; k++){
        for(int i = 1; i <= 3; i++){
            recarn[counter] = sheet5.getSubimage( basx*i - 400, basy*k - 400, 400, 400);
             ++counter;
        }
        }
        
        }catch(IOException a){
            System.out.println("Yikes!");
        }
   
         
        Ending[31] = foo1.getImage();
       timer4 = new Timer(13, this);
         timer4.start();
         setDoubleBuffered(true); 
    }
    
    public void setMode(int n){
           mode = n;
       }
       public boolean getDone(){
           return done;
       }
       
       public void Carry(int n){
           if(mode == 2){
               int temp = n - 3;
               jimmy4.setLives(temp);
           }
       }
    
    public void Die(){
        if(!shield){
          jimmy4.setLives(-1);
          lifebonus -= 400;
        if(part == 1){
        transistion1 = false;
        opening = true;
        onscreen = 0;
        legion1[0] = new pastaAngel(1, false);
        legion1[1] = new pastaAngel(1, false);
        legion1[2] = new pastaAngel(1, false);
        legion1[3] = new pastaAngel(1, false);
        legion1[4] = new pastaAngel(1, false);
        //legion2 = new pastaAngel[2];
        jimmy4.setX(27);
       jimmy4.setY(240);
       dark = 0;
       frame1kills = 0;
    
        }
        if(part == 2 ){
            jimmy4.setX(27);
                     jimmy4.setY(275);
                     jimmy4.jumpChange(300);
                     jimmy4.setCam(0, -35);
                      jimmy4.setpart(2);
                      smooth = false;
                      dark = 0;
                      laserfire = true;
                      transistion1 = false;
        }
        if(part == 3){
             miniboss  = false;
              gauntlet = 0;
                  recent = 0;
                  edge = true;
                  shift = 0;
                  dark = 0;
                  jimmy4.setCam(0, 0);
                  jimmy4.setX(130);
                  jimmy4.setY(200);
                  //jimmy4.setTop(-40);
                  jimmy4.jumpChange(210);
                  jimmy4.setpart(1);
        }
        if(part == 4){
            
             miniboss = false;
             finalboss = false;
             jimmy4.NoFin();
                   jimmy4.setpart(4);
                    jimmy4.swoosh(false);
                    jimmy4.setDy2(2);
                     dark = 0;
                     redshift = 0;
                    recent = 0;
                    repeat = 0;
                    transistion1 = false;
                    jimmy4.setCam(0, -950);
                    jimmy4.setX(90);
                    jimmy4.setY(260);
                     legion4[0] = new pastaAngel(1, false);
                     legion4[1] = new pastaAngel(1, false);
                    legion4[0].activate(170, 500);
                    legion4[0].changeStagger(150);
                    legion4[1].activate(300, 350);
                    legion4[1].changeStagger(150);
                    legion4[2] = new pastaAngel(1, false);
                    legion4[3] = new pastaAngel(1, false);
                    legion4[4] = new pastaAngel(1, false);
                    legion4[5] = new pastaAngel(1, false);
                   
        }
        vulnerable = 200;
        available = true;
        }
        else{
          downgrade = true;
            
            
            
        }
    }
    
      public int survive(){
           return (jimmy4.getLives());
       }
    
    public boolean getLost(){
        return lost;
    }
    public void updateSpikes(){
        int co[] = new int[26];
        co[0] = 240;
        co[1] = 327;
        co[2] = 545;
        co[3] = 351;
        co[4] = 600;
        co[5] = 170;
        co[6] = 1410;
        co[7] = 220;
        co[8] = 1780;
        co[9] = 250;
        co[10] = 1868;
        co[11] = 250;
        co[12] = 1973;
        co[13] = 250;
        co[14] = 549;
        co[15] = 740;
        co[16] = 1555;
        co[17] = 672;
        co[18] = 1678;
        co[19] = 672;
        co[20] = 3010;
        co[21] =  245;
        co[22] = 3130;
        co[23] = 245;
        //co[10] = 2700;
       // co[11] = 270;
        //co[12] = 327;   
       // co[13] = 3135;
        int xshift = jimmy4.getCamx();
         int Maxshift = 0;
         int slippy = 0;
        int next = 0;
         //540 , 1820, 3010
        for(int i = 0; i < 12; i++){
               int bonus = 0;
            if(gauntlet < 15){
                if(i == 3){
                    bonus = 60;
                }
            spikeballs[i] = new Rectangle(co[i + next] + xshift + xpos + 582 , co[i + 1 + next] + ypos - 7, 18, 25 + bonus);
            }
            else{
                if( i == 3 || i == 4){
                Maxshift = 370;
                if(i == 4){
                slippy = 120;
                }
                if(i == 3){
                    Maxshift = 635;
                }
                }
                spikeballs[i] = new Rectangle(co[i + next]  + xshift + 549 + Maxshift + slippy, co[i + 1 + next] - 25 , 20, 20);
            }
            next++; 
        }
   
    }
    
    @ Override public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        if(part == 1){
            if(!transistion1){
            g2d.drawImage(portions[0], 0 -shift, -60, this);
        }
             if (transistion1){
                 dark++;
                 if(dark < 300){
                     if(dark % 18 > 12){
                     ImageIcon swap = new ImageIcon(this.getClass().getResource("transistion1.png"));
                     g2d.drawImage(swap.getImage(), 0 -shift, -60, this);
                     }
                     else if(dark % 18 > 6 && dark % 18 <= 12){
                         ImageIcon swap = new ImageIcon(this.getClass().getResource("transistionC.png"));
                     g2d.drawImage(swap.getImage(), 0 -shift, -60, this);
                         
                     }
                     else{
                          ImageIcon swap = new ImageIcon(this.getClass().getResource("transistion1B.png"));
                     g2d.drawImage(swap.getImage(), 0 -shift, -60, this);
                         
                     }
                     
                 }
                 else if(dark < 600){
                     if(dark % 10 > 5){
                     ImageIcon swap = new ImageIcon(this.getClass().getResource("transistion2.png"));
                     g2d.drawImage(swap.getImage(), 0 -shift, -60, this);
                     }
                     else{
                         ImageIcon swap = new ImageIcon(this.getClass().getResource("transistion2B.png"));
                     g2d.drawImage(swap.getImage(), 0 -shift, -60, this);
                     }
                 }
                 else{
                     part = 2;
                     jimmy4.setX(27);
                     jimmy4.setY(282);
                     jimmy4.setCam(0, -35);
                      jimmy4.setpart(2);
                      legion2[0].activate(610, 100);
                      legion2[1].activate(1700, 180);
                     transistion1 = false;
                     dark = 0;
                 }
            
        }
            if(!opening && part == 1){
            for(int i = 0; i < 5; i ++){
                if(legion1[i].getAct()){
            Image prox = legion1[i].findImage();
            g2d.drawImage(prox, legion1[i].getX(), legion1[i].getY(), this);
            
            if(legion1[i].fnum() == 7){
               // g2d.draw(legion1[i].getSpear());
            }
            if(legion1[i].getHit()){
                if(legion1[i].getStagger() % 12 <= 5){
                    g2d.drawImage(halo[0], legion1[i].getX() -118 , legion1[i].getY() - 59, this);
                }
                else{
                   g2d.drawImage(halo[1], legion1[i].getX() -118, legion1[i].getY() - 59, this); 
                }
            }
        //    g2d.draw(legion1[i].getBody());
            if(legion1[i].getToss() && !legion1[i].getPhase()){
                Image spear = legion1[i].spearThrow();
                g2d.drawImage(spear, legion1[i].getPx() , legion1[i].getPy() , this);
                int sx = legion1[i].getPx() + 40;
                int sy = legion1[i].getPy() + 60;
                Rectangle yikes = new Rectangle(sx, sy, 10, 10);
              //  g2d.draw(yikes);
                
            }
           // else{legion1[i].setLaunch(false);}
               
                }
                 if( i > 0 && legion1[i - 1].getHp() < 3 && !legion1[i].getAct() && onscreen < 2){
                    if(wait < 30 && frame1kills < 4){
                       ImageIcon temp = new ImageIcon(this.getClass().getResource("spawner2.png"));
                       g2d.drawImage(temp.getImage(), 260 - shift, 80, this);
                       wait++;
                    }
                    else{
                        wait = 0;
                        int alter = 0;
                        if(i == 2){
                            alter = 20;
                        }
                        if(i == 3){
                           alter = 60;
                        }
                        legion1[i].activate(160 + alter, 120);
                        onscreen++;
                    }
                }
            
        }
        int frameNum = 0;
        int y = jimmy4.getY();
        int base = jimmy4.getBase();
        
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
            if(jimmy4.getDive()){
            divecount++;
            if(divecount <= 5){
                frameNum = 5;
            }
            else if(divecount > 5 && divecount <= 10){
                frameNum = 6;
            }
            else if(divecount > 10 && divecount <= 15){
                frameNum = 7;
            }
            else{
                divecount = 0;
            }
            }
        
        
        Image Image = Frames[frameNum].getImage();
        if(message){
            ImageIcon temp = new ImageIcon(this.getClass().getResource("lastMessage.png"));
            g2d.drawImage(temp.getImage(),jimmy4.getX() + 50, jimmy4.getY() - 15, this);
        }
        g2d.drawImage(Image, jimmy4.getX(), jimmy4.getY(), null);
        Image barrier2 = jimmy4.getReflect2();
        Image barrier = jimmy4.getReflect();
        g2d.drawImage(barrier, jimmy4.getX() + 3, jimmy4.getY() - 30, this);
        g2d.drawImage(barrier2, jimmy4.getX() - 12, jimmy4.getY() - 30, this);
          Image head = lives.getImage();
        for (int i = 0; i < jimmy4.getLives(); i++) {
            g2d.drawImage( head , 10 +(30 * i), 10, null);
        }
        
         if(shield){
            ImageIcon fresh = new ImageIcon(this.getClass().getResource("shieldIcon.png"));
            g2d.drawImage(fresh.getImage(), 130 , 10,  null);
        }
        
        if(frame1kills >= 3 && jimmy4.getX() > 290){
           transistion1 = true; 
        }
        
      
       
            }
        
        if(opening){
           
                
                if( dark <= 70){
                 dark = 71;
                }
                if(dark >= 70 && dark < 2000){
                    if(dark <= 250){
                        if(dark > 130){
                            g2d.drawImage(portal2, 35 + jimmy4.getX(), 5 +jimmy4.getY(), this);
                        }
                        if(dark > 190){
                            g2d.drawImage(portal3, 37 + jimmy4.getX(), -2 +jimmy4.getY(), this);
                        }
                        if(dark > 230){
                             g2d.drawImage(portal4, 30 + jimmy4.getX(), -21 +jimmy4.getY(), this);
                        }
                    }
                
                    else if(dark < 1020) {
                        if(dark % 80 > 39){
            g2d.drawImage(portal5, 30 + jimmy4.getX(), -27 + jimmy4.getY(), this);
             }
                        else {
                            ImageIcon fin = new ImageIcon(this.getClass().getResource("portal6.png"));
                            Image turd = fin.getImage();
                            g2d.drawImage(turd, 30 + jimmy4.getX(), -27 +jimmy4.getY(), this);
                        }
                }
                     dark+= 5;
                     if( dark > 1000){
                         if(dark >= 1000 && dark < 1024){
                             ImageIcon collapse = new ImageIcon(this.getClass().getResource("splosion10.png"));
                             g2d.drawImage(collapse.getImage(), jimmy4.getX() -18, jimmy4.getY() - 27, this);
                         }
                         if(dark >= 1024 && dark < 1048){
                             ImageIcon collapse = new ImageIcon(this.getClass().getResource("splosion11.png"));
                             g2d.drawImage(collapse.getImage(), jimmy4.getX() - 7, jimmy4.getY() - 20, this);
                         }
                         if(dark >= 1048 && dark < 1080){
                             ImageIcon collapse = new ImageIcon(this.getClass().getResource("splosion12.png"));
                             g2d.drawImage(collapse.getImage(), jimmy4.getX() -7, jimmy4.getY() -20, this);
                         }
                         if(dark >= 1080 && dark < 1110){
                             ImageIcon collapse = new ImageIcon(this.getClass().getResource("splosion14.png"));
                             g2d.drawImage(collapse.getImage(), jimmy4.getX() -7, jimmy4.getY() - 30, this);
                         }
                         if(dark >= 1110 && dark < 1134){
                             ImageIcon collapse = new ImageIcon(this.getClass().getResource("splosion15.png"));
                             g2d.drawImage(collapse.getImage(), jimmy4.getX() + 8, jimmy4.getY() - 41, this);
                         }
                         if(dark >= 1134 && dark < 1059){
                             ImageIcon collapse = new ImageIcon(this.getClass().getResource("splosion16.png"));
                             g2d.drawImage(collapse.getImage(), jimmy4.getX() + 25, jimmy4.getY()  -13, this);
                         dark = 2000;
                         }
                         
                }
                }
                if(dark > 800){
                    int y = jimmy4.getY();
        int base = jimmy4.getBase();
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
        g2d.drawImage(Image, jimmy4.getX() + mover + 30, jimmy4.getY(), null);
        if(mover < 190 && jimmy4.getX() < 100){
                mover++;
                }
        else{
            if(dark > 1950 && dark <= 2070){
                jimmy4.setX(jimmy4.getX() + mover);
                mover = 0;
            ImageIcon beam = new ImageIcon(this.getClass().getResource("spawner1.png"));
            g2d.drawImage(beam.getImage(), 375, 90, this);
             if(dark > 1980){
                legion1[0].activate(310, 115);
                opening = false;
                dark = 0;
            }
        }
            
            dark++;
        }
        }
          
        }
      
        }
        
        if(part == 4){
        g2d.drawImage(portions[4], 0 + jimmy4.getCamx() + finalXshift, jimmy4.getCammy(), null);
        if(wark > 2200){
              int kril;
            if( wark % 180 < 60){
                kril = 0;                 
            }
            else if( wark % 180 >= 60 && wark % 180 < 120){
                kril = 1;
            }
            else{
                kril = 2;
            }
            if(!endzone){
            ImageIcon fall1 = new ImageIcon(this.getClass().getResource("fallbegin.png"));
            ImageIcon lon = new ImageIcon(this.getClass().getResource("fallLong.png"));
            g2d.drawImage(fall1.getImage(), 1370 + jimmy4.getCamx() + finalXshift , jimmy4.getCammy() + 890, this);
            //g2d.drawImage(lon.getImage(), 1340 + jimmy4.getCamx() + finalXshift , jimmy4.getCammy() + 1870 + finalyShift, this );
      
           
            g2d.drawImage(lon.getImage(), 1380 + jimmy4.getCamx() + finalXshift , jimmy4.getCammy() + 2000 + finalyShift, this);
        
            }
            else if(endzone){
                g2d.drawImage(Ending[8],1450 + jimmy4.getCamx() + finalXshift, jimmy4.getCammy() + 5000 + finalyShift, this);
                if(finalyShift < -5800 && finalyShift > -8500){
                    int change = 0;
                    if (kril == 0){ change = 1; }
                    g2d.drawImage(Ending[kril + 5 + change], 1600 + jimmy4.getCamx() + finalXshift, - up + -50, this);
                    g2d.drawImage(Ending[kril + 5 + change], 1700 + jimmy4.getCamx() + finalXshift, - up + 100, this);
                    g2d.drawImage(Ending[kril + 5 + change], 1300 + jimmy4.getCamx() + finalXshift, - up + -220, this);
                    g2d.drawImage(Ending[kril + 5 + change], 1500 + jimmy4.getCamx() + finalXshift, - up + - 30, this);
                    g2d.drawImage(Ending[kril + 5 + change], 1600 + jimmy4.getCamx() + finalXshift, - up + 20, this);
                     g2d.drawImage(Ending[kril + 9], 1400 + jimmy4.getCamx() + finalXshift - up,  100, this);
                    g2d.drawImage(Ending[kril + 9], 1700 + jimmy4.getCamx() + finalXshift - up, + 220, this);
                    g2d.drawImage(Ending[kril + 9], 1500 + jimmy4.getCamx() + finalXshift - up,  30, this);
                    g2d.drawImage(Ending[kril + 9], 1600 + jimmy4.getCamx() + finalXshift - up, 400, this);
                    g2d.drawImage(Ending[kril + 9], 2000 + jimmy4.getCamx() + finalXshift + up, 170, this);
                }
                if(finalyShift <= -8315){
                g2d.drawImage(Ending[38], -100, finalyShift + 8700, this );
                }
                if(finalyShift <= -8860){     
                vertigo+= 4;
                }
            }
            if(wark > 5000 && finalyShift > -5900){
            g2d.drawImage(Ending[kril], 1500 + jimmy4.getCamx() + finalXshift,  up, this);
            g2d.drawImage(Ending[kril], 1500 + jimmy4.getCamx() + finalXshift,  up + 400, this);
            g2d.drawImage(Ending[kril], 1500 + jimmy4.getCamx() + finalXshift,  up + 600, this);
            g2d.drawImage(Ending[kril], 1200 + jimmy4.getCamx() + finalXshift,  up, this);
            g2d.drawImage(Ending[kril], 1200 + jimmy4.getCamx() + finalXshift,  up + 400, this);
            g2d.drawImage(Ending[kril], 1200 + jimmy4.getCamx() + finalXshift,  up + 600, this);
            }
            if(up > -450){
             up-= 8;
             if(finalyShift < -5800){
                 up += 3;
             }
            }
            else{
             up = 200;   
            }
            
            
            
        }
        
         Rectangle[] Platforms = platforms4.getPlatforms();
         g2d.fillRect(Platforms[22].x, Platforms[22].y, Platforms[22].width, Platforms[22].height);
               
             int frameNum = 0;
        int y = jimmy4.getY();
        int base = jimmy4.getBase();
        
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
            if(jimmy4.getDive()){
            divecount++;
            if(divecount <= 5){
                frameNum = 5;
            }
            else if(divecount > 5 && divecount <= 10){
                frameNum = 6;
            }
            else if(divecount > 10 && divecount <= 15){
                frameNum = 7;
            }
            else{
                divecount = 0;
            }
            }
            
            if(wark > 1700){
            ImageIcon temp;
            if(finalyShift > -2400){
              if(wark % 90 < 30){
                  temp = new ImageIcon(this.getClass().getResource("hammer3.png"));
            g2d.drawImage( temp.getImage(), G.getX() + jimmy4.getCamx() + 20, G.getY() + jimmy4.getCammy() - 60, this);
            jimmy4.setX(EndWhipShift[0]);
            jimmy4.setY(EndWhipShift[1]);
        }
            if(wark % 90 >= 30 && wark % 90 <= 59 ){
                temp = new ImageIcon(this.getClass().getResource("hammer1.png"));
                  jimmy4.setX(EndWhipShift[2]);
            jimmy4.setY(EndWhipShift[3]);
            g2d.drawImage( temp.getImage(), G.getX() + jimmy4.getCamx() + 20, G.getY() + jimmy4.getCammy() - 60, this);
        }
             if(wark % 90 >= 60 ){
                 temp = new ImageIcon(this.getClass().getResource("hammer2.png"));
            g2d.drawImage( temp.getImage(), G.getX() + jimmy4.getCamx() + 26, G.getY() + jimmy4.getCammy() - 62, this);
              jimmy4.setX(EndWhipShift[4]);
            jimmy4.setY(EndWhipShift[5]);
        }
            }
             if(wark > 2300){
                 if( jimmy4.getCamx() + finalXshift > -1460 ){
                     finalXshift-= 2;
                 }
                 else if(wark > 2900){
                      int temx = jimmy4.getCamx();
                      int temy = jimmy4.getCammy();
                      if(jimmy4.getCammy() > -2000){
                           jimmy4.setCam( temx, temy - 5);
                      }
                      else {
                          if(finalyShift > -2500 || finalyShift < -2999){
                              if(finalyShift > -1600){
                               finalyShift -= 5;   
                              }
                              else if(finalyShift > -2999){
                          finalyShift-= 2;
                              }
                              else{
                                  if(finalyShift > -8860){
                                  finalyShift -= 1;
                                  jimmy4.setY(EndWhipShift[3]);
                                  }
                              }
                          }
                          else if(!endzone){
                              int current = jimmy4.getY() + 5;
                              jimmy4.setY(current);
                              if(jimmy4.getY() > 600){
                                  endzone = true;
                                  jimmy4.setY(220);
                                  finalyShift = -3001;
                              }
                          }
                      }
                    
                 }
             }
            }
            
            Image Image = Frames[frameNum].getImage();
            if(wark > 3000){
             int swap = wark % 120;
              
             if(swap >= 80){
              Image = Ending[4];   
             }
             else if(swap >= 40){
             Image = Ending[5];
             }
             else{
                 Image = Ending[12];
             }
            }
            if(vertigo < 500){
        g2d.drawImage(Image, jimmy4.getX(), jimmy4.getY(), null);
            }
        
        Image barrier2 = jimmy4.getReflect2();
        Image barrier = jimmy4.getReflect();
        g2d.drawImage(barrier, jimmy4.getX() + 3, jimmy4.getY() - 30, this);
        g2d.drawImage(barrier2, jimmy4.getX() - 12, jimmy4.getY() - 30, this);
          Image head = lives.getImage();
        for (int i = 0; i < jimmy4.getLives(); i++) {
            g2d.drawImage( head , 10 +(30 * i), 10, null);
        }
         if(shield){
            ImageIcon fresh = new ImageIcon(this.getClass().getResource("shieldIcon.png"));
            g2d.drawImage(fresh.getImage(), 130 , 10,  null);
        }
        
        ImageIcon panel = new ImageIcon(this.getClass().getResource("jumpad1.png"));
        g2d.drawImage(panel.getImage(), 420 + jimmy4.getCamx(), 960 + jimmy4.getCammy(), this);
        
        if (dash){
             ImageIcon blueblur = new ImageIcon(this.getClass().getResource("energy1.png"));
            ImageIcon blueblur2 = new ImageIcon(this.getClass().getResource("energy2.png"));
            if(dashflash == 1){
                dashcount+= 3;
                if(dashcount > 10 && dashcount <= 50){
                    g2d.drawImage(blueblur.getImage(), 400 + jimmy4.getCamx(), 950 + jimmy4.getCammy(), null);
                }
                 if(dashcount > 40 && dashcount <= 100){
                    g2d.drawImage(blueblur2.getImage(),400 + jimmy4.getCamx(), 830 + jimmy4.getCammy(), null);
                    
                }
               
             
            }
            
        }
        if(!finalboss){
         for(int i = 0; i < 2; i ++){
                if(legion4[i].getAct()){
            Image prox = legion4[i].findImage();
            g2d.drawImage(prox, legion4[i].getX() , legion4[i].getY() , this);
            
            if(legion4[i].getHit()){
                if(legion4[i].getStagger() % 12 <= 5){
                    g2d.drawImage(halo[0], legion4[i].getX() -118 , legion4[i].getY() - 59, this);
                }
                else{
                   g2d.drawImage(halo[1], legion4[i].getX() -118 , legion4[i].getY() - 59, this); 
                }
            }
          //  g2d.draw(legion4[i].getBody());
            
            if(legion4[i].getToss() && !legion4[i].getPhase()){
                Image spear = legion4[i].spearThrow();
                g2d.drawImage(spear, legion4[i].getPx() , legion4[i].getPy() , this);
                 int sx = legion4[i].getPx() + 40;
                int sy = legion4[i].getPy() + 60;
                Rectangle yikes = new Rectangle(sx, sy, 10, 10);
               // g2d.draw(yikes);
            }
            
               
                }
            
             }
       
        if(dark > 500 && recent != 20){
            int piv = dark % 50;
            if(piv > 25){
                piv = 1;
            }
            else{
                piv = 0;
            }
            if(jimmy4.getY() < 360){
            g2d.drawImage(Marinara[piv].getImage(), 0, - 16 + redshift, this);
            }
            else {
                redshift--;
                g2d.drawImage(Marinara[piv].getImage(), 0,   -16 + redshift , this); 
            }
        if(redshift < -365){
             miniboss = false;
                   jimmy4.setpart(4);
                    jimmy4.swoosh(false);
                    jimmy4.setDy2(2);
                     dark = 0;
                     redshift = 0;
                    recent = 0;
                    transistion1 = false;
                    jimmy4.setCam(0, -950);
                    jimmy4.setX(90);
                    jimmy4.setY(260);
                     legion4[0] = new pastaAngel(1, false);
                     legion4[1] = new pastaAngel(1, false);
                    legion4[0].activate(170, 500);
                    legion4[0].changeStagger(150);
                    legion4[1].activate(300, 350);
                     legion4[1].changeStagger(150);
                     jimmy4.setLives(-1);
                     lifebonus -= 400;
        }
        }
        if (recent == 20){
            int piv = dark % 50;
            if(piv > 25){
                piv = 1;
            }
            else{
                piv = 0;
            }
            delay++;
            if(delay > 170 && delay < 250){
                redshift--;
                 g2d.drawImage(Marinara[piv].getImage(), 0,   -16 + redshift , this); 
                
            }
            else if( delay >= 250){
                redshift+= 1;
                 g2d.drawImage(Marinara[piv].getImage(), 0,   -16 + redshift , this); 
            }
            jimmy4.setX(190);
            if(delay > 400){
                finalboss = true;
                shield = true;
                G = new FSM();
                G.getVert();
                dark = 0;
                redshift = 0;
            }
        }
        }
        if(finalboss){
         //   System.out.println("repeat " + repeat + "moves " + G.getMoves() );
            if(G.getSlam() && G.getY() < 500){
                G.setTarget(jimmy4.getX() -  170 - jimmy4.getCamx());
            }
            
            if(!G.getSlam()){
                hopscotch = 0;
            }
            if(G.getIdle() &&  munch && !G.getSlam() && !G.getIntro() ){
             
             dark++;
             if(dark < 30){
                 G.setFrame(13);
                 jimmy4.setX(G.getX() + jimmy4.getCamx() + 127);
                 jimmy4.setY(G.getY() + jimmy4.getCammy() + 130);
             }
             else if(dark >= 30 && dark < 61){
                 G.setFrame(14);
                  jimmy4.setX(G.getX() + jimmy4.getCamx() + 180);
                  jimmy4.setY(G.getY() + jimmy4.getCammy() + 130);
                  if(dark > 55){
                      Die();
                    //  System.out.println("munched by Dinner");
                  }
             }
            
            }
            else if(G.getIdle()){
                 dark = 0;
                 
             }
             if(G.getHam()){
         
         if(repeat >= 0 && repeat < 10){
             G.Aim(jimmy4.getX(), jimmy4.getY(), jimmy4.getCamx());
         }
         if(repeat < 10){
         repeat++;
         }
         else if(!G.getSwing()){
             repeat = 80;
         }
          Rectangle sample = getBounds();
              Rectangle Targ = new Rectangle(sample.x + 17, sample.y + 30, 4, 20);
             // g2d.draw(Targ);
              
     if(G.getSwing()){
         repeat+= 2;
         Image arc[] = G.getWhip();
         int xbase = G.getX() + jimmy4.getCamx();
         int ybase = G.getY() + jimmy4.getCammy();
         if(repeat > 176 && repeat < 186){
             g2d.drawImage(arc[0], xbase + 60, ybase - 80, null);
         }
         if(repeat >= 186 && repeat < 196){
             g2d.drawImage(arc[1], xbase - 35, ybase - 35, null);
         }
         if(repeat >= 196 && repeat < 206){
             g2d.drawImage(arc[2], xbase - 10, ybase - 100, null);
         }
         if(repeat >= 206 && repeat < 216){
             g2d.drawImage(arc[3], xbase - 93, ybase +  50, null);
         }
         if(repeat >= 216 && repeat < 319){
             deadly = true;
             Hammer = new Rectangle(xbase -140, 1280 + jimmy4.getCammy(), 140, 70);
             g2d.drawImage(arc[4], xbase - 160, 1248 + jimmy4.getCammy(), null);
         }
         if(repeat >= 319 && repeat < 322){
             g2d.drawImage(arc[4], xbase - 152, 1248 + jimmy4.getCammy(), null);
         }
         if(repeat >= 322 && repeat < 325){
             g2d.drawImage(arc[4], xbase - 149, 1248 + jimmy4.getCammy(), null);
         }
         if(repeat >= 325 && repeat < 328){
             g2d.drawImage(arc[4], xbase - 146, 1248 + jimmy4.getCammy(), null);
             deadly = false;
         }
          if(repeat >= 328 && repeat < 331){
             g2d.drawImage(arc[4], xbase - 143, 1248 + jimmy4.getCammy(), null);
         }
         if(repeat >= 331 && repeat < 334){
             g2d.drawImage(arc[4], xbase - 140, 1248 + jimmy4.getCammy(), null);
         }
         if(repeat >= 334 && repeat < 337){
             g2d.drawImage(arc[4], xbase - 138, 1248 + jimmy4.getCammy(), null);
         }
          if(repeat >= 337 && repeat < 340){
             g2d.drawImage(arc[4], xbase - 131, 1248 + jimmy4.getCammy(), null);
         }
         if(repeat >= 340 && repeat < 343){
             g2d.drawImage(arc[4], xbase - 125, 1248 + jimmy4.getCammy(), null);
         }
         if(repeat >= 343 && repeat < 349){
             g2d.drawImage(arc[5], xbase - 118, 1252 + jimmy4.getCammy(), null);
         }
          if(repeat >= 349 && repeat < 359){
             g2d.drawImage(arc[5], xbase - 113, 1252 + jimmy4.getCammy(), null);
         }
           if(repeat >= 359 && repeat < 369){
             g2d.drawImage(arc[5], xbase - 90, 1252 + jimmy4.getCammy(), null);
         }
         if(repeat > 600){
             G.reset();
             repeat = 0;
         }
         
         if(deadly){
           //  g2d.draw(Hammer);
             if(Targ.intersects(Hammer)){
                 Die();
                // System.out.println("slammed!!");
             }
         }
     }
     }
              for(int i = 2; i < 6; i ++){
                if(legion4[i].getAct() && !G.getK()){
            Image prox = legion4[i].findImage();
            g2d.drawImage(prox, legion4[i].getX() , legion4[i].getY() , this);
            
            if(legion4[i].getHit()){
                if(legion4[i].getStagger() % 12 <= 5){
                    g2d.drawImage(halo[0], legion4[i].getX() -118 , legion4[i].getY() - 59, this);
                }
                else{
                   g2d.drawImage(halo[1], legion4[i].getX() -118 , legion4[i].getY() - 59, this); 
                }
            }
           // g2d.draw(legion4[i].getBody());
            
            if(legion4[i].getToss() && !legion4[i].getPhase()){
                Image spear = legion4[i].spearThrow();
                g2d.drawImage(spear, legion4[i].getPx() , legion4[i].getPy(), this);
                 int sx = legion4[i].getPx() + 40;
                int sy = legion4[i].getPy() + 60;
                Rectangle yikes = new Rectangle(sx, sy, 10, 10);
               // g2d.draw(yikes);
            }
           
               
                }
            
             }
             
             if(G.getCompose() > 0){
                 if(G.getFlux() % 33 < 11){
                     g2d.drawImage(halo[0], G.getX() + jimmy4.getCamx() - 12 , G.getY() + jimmy4.getCammy() + 35, null);
                 }
                 else if(G.getFlux() % 33 >= 11 && G.getFlux() % 33 < 22){
                     g2d.drawImage(halo[1], G.getX() + jimmy4.getCamx() - 12 , G.getY() + jimmy4.getCammy() + 35, null);
                 }
                 else{
                     g2d.drawImage(halo[2], G.getX() + jimmy4.getCamx() - 20 , G.getY() + jimmy4.getCammy() + 35, null);
                 }
             }
             
             
              ImageIcon pad1 = new ImageIcon(this.getClass().getResource("jumpad1.png"));
          if(!over){
         g2d.drawImage(pad1.getImage(), jimmy4.getCamx() + 700, jimmy4.getCammy() + 1310, null);
         g2d.drawImage(pad1.getImage(), jimmy4.getCamx() + 1160, jimmy4.getCammy() + 1310, null);
          }
         if(dashflash == 1){
             dashcount++;
             if(dashcount < 100){
                 ImageIcon pad2 =  new ImageIcon(this.getClass().getResource("jumpad2.png"));
                 g2d.drawImage(pad2.getImage(), jimmy4.getCamx() + 694, jimmy4.getCammy() + 1080, null);
                 
             }
             else{
                 dashflash = 0;
                 dashcount = 0;
             }
             
         }
         
         if(dashflash == 2){
             dashcount++;
             if(dashcount < 100){
                 ImageIcon pad2 =  new ImageIcon(this.getClass().getResource("jumpad2.png"));
                 g2d.drawImage(pad2.getImage(), jimmy4.getCamx() + 1154, jimmy4.getCammy() + 1080, null);
                 
             }
             else{
                 dashflash = 0;
                 dashcount = 0;
                 
             }
             
         }
           if( wark > 1700){
                     //.Image.System.out.println(G.getX());
        //  System.out.println(G.getY());
         
          
               
           }
             
             if(over && jimmy4.getDive() && jimmy4.getCammy()  < -420){
               finisher.alter();
               Image kandu = finisher.getDrill();
               g2d.drawImage(kandu, jimmy4.getX()  + finisher.getSX() , jimmy4.getY() + 40 + finisher.getSY(), this);
             
             }
             
     g2d.drawImage(G.getFrame(), G.getX() + jimmy4.getCamx() , G.getY() + jimmy4.getCammy() ,  null);
     
     if(over && jimmy4.getDive() && jimmy4.getCammy()  < -420 && !ending){
               //finisher.alter();
                //Image kandu = finisher.getDrill();
               // g2d.drawImage(kandu, jimmy4.getX()  + finisher.getSX() , jimmy4.getY() + 40 + finisher.getSY(), this);
                ImageIcon temp;
                if(frameFin % 100 < 50 && jimmy4.getCammy()  < -700){
            temp = new ImageIcon(this.getClass().getResource("blood6.png"));
            g2d.drawImage(temp.getImage(), G.getX()  + jimmy4.getCamx(), G.getY() - 30 + jimmy4.getCammy(), null);
        }
        if(frameFin % 100 > 60 && jimmy4.getCammy()  < -800){
             temp = new ImageIcon(this.getClass().getResource("blood7.png"));
              g2d.drawImage(temp.getImage(), G.getX()  + jimmy4.getCamx(), G.getY() - 30 + jimmy4.getCammy(), null);
        }
          if(frameFin % 200 < 20 && jimmy4.getCammy()  < -700){
            temp = new ImageIcon(this.getClass().getResource("blood6.png"));
            g2d.drawImage(temp.getImage(), G.getX() + 80 + jimmy4.getCamx(), G.getY() - 70 + jimmy4.getCammy(), null);
        }
            if(frameFin % 200 > 160 && jimmy4.getCammy()  < -700){
            temp = new ImageIcon(this.getClass().getResource("blood7.png"));
            g2d.drawImage(temp.getImage(), G.getX() - 60  + jimmy4.getCamx(), G.getY() - 50 + jimmy4.getCammy(), null);
        }
        
       
        }
     
     if(munch){
         g2d.drawImage(Image, jimmy4.getX(), jimmy4.getY(), null);
     }
     Rectangle crush = new Rectangle(G.getX() + 80, G.getY() + 220, 90, 70);
     if(G.getSlam() && G.getYshift() > 0 || G.getMoves() == 1 && G.getAngry() && G.getYshift() > 10){
         Rectangle sample = getBounds();
              Rectangle Targ = new Rectangle(sample.x + 17, sample.y + 30, 4, 20);
                Image wav[] = G.getShock();
                int fin = G.getCool();
                 
             if(G.getYshift() > 10 && fin == 0){
                 g2d.drawImage(wav[0], G.getX() + jimmy4.getCamx() + 110, G.getY() + jimmy4.getCammy() + 170, null);   
             }
             if(G.getYshift() > 30 && fin == 0){
                 g2d.drawImage(wav[1], G.getX() + jimmy4.getCamx() + 66, G.getY() + jimmy4.getCammy() + 160, null);   
                 if(G.getHit(jimmy4.getCamx(), jimmy4.getCammy()).intersects(Targ)){
                     Die();
                     //System.out.println("Death by sitting!");
                 }
             }
             if(G.getYshift() > 43 && fin == 0){
                 g2d.drawImage(wav[2], G.getX() + jimmy4.getCamx() + 5 , G.getY() + jimmy4.getCammy() + 135, null);  
                 if(G.getHit(jimmy4.getCamx(), jimmy4.getCammy()).intersects(Targ)){
                     Die();
                     //System.out.println("Death by sitting!");
                 }
             }
            
             if(G.getYshift() > 58 && G.getCool() != 0 || (G.getAngry() && G.getYshift() > 50 && G.getDoubT()  <= 0)){
                 g2d.drawImage(wav[4], G.getX() + jimmy4.getCamx() -20, G.getY() + jimmy4.getCammy() + 110, null); 
                 g2d.drawImage(wav[4], G.getX() + jimmy4.getCamx() -20, G.getY() + jimmy4.getCammy() + 130, null); 
                 if(G.getHit(jimmy4.getCamx(), jimmy4.getCammy()).intersects(Targ)){
                     Die();
                    // System.out.println("Death by sitting!");
                 }
             }
             if(G.getCool() != 0 && G.getYshift() < 56 || (G.getAngry() && G.getYshift() > 55 && G.getDoubT()  <= 0)){
                 hopscotch-= 2;
                 int deviate = G.getFlux() % 25;
                 int oss = 5;
                 if(deviate > 11){
                     oss = 6;
                 }
                 Rectangle lef = new Rectangle (G.getX() + jimmy4.getCamx()  + hopscotch, 1300 + jimmy4.getCammy(), 20, 20);
                 g2d.drawImage(wav[oss], G.getX() + jimmy4.getCamx()- 15 + hopscotch, 1280 + jimmy4.getCammy(), null);
                 g2d.drawImage(wav[oss + 2], G.getX() + jimmy4.getCamx() + 315 - hopscotch, 1280 + jimmy4.getCammy(), null);
                  Rectangle Rai = new Rectangle (G.getX() + jimmy4.getCamx() + 330 - hopscotch, 1300 + jimmy4.getCammy(), 20, 20);
                // g2d.draw(lef);
               // g2d.draw(Rai);
                 if(Targ.intersects(lef) || Targ.intersects(Rai)){
                     Die();
                    // System.out.println("Waves of Doom!!");
                 }
             }
             
            }
     //g2d.draw(crush);
     
     if(G.getIntro() && !G.dead()){
         jimmy4.setX(190);
         g2d.drawImage(G.getSpeach(), G.getX() -30 + jimmy4.getCamx(), G.getY() + 50 + jimmy4.getCammy(), null);
     }
     if(G.getAngry() && !G.getHam()){
        G.Aim(jimmy4.getX(), jimmy4.getY(), jimmy4.getCamx()); 
     }
     
     if(G.getzap()){
         repeat+= 3;
         int xview = jimmy4.getCamx();
         int yview = jimmy4.getCammy();
         int q = G.getX();
         int v = G.getY();
         G.Aim(jimmy4.getX(), jimmy4.getY(), jimmy4.getCamx());
         if(repeat <= 68 && repeat > 40){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("splosion2.png"));
                        g2d.drawImage(temp.getImage(),  q + xview + 146 , v + yview + 155, this);
                    }
                    if(repeat >= 69 && repeat < 98 ){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("splosion3.png"));
                        g2d.drawImage(temp.getImage(),  q + xview + 145, v + yview + 155, this);
                    }
                    if(repeat >= 98 && repeat < 117 ){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("splosion4.png"));
                        g2d.drawImage(temp.getImage(),  q + xview + 132, v + yview + 132, this);
                    }
                    if(repeat >= 117 && repeat < 136 ){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("splosion9.png"));
                        g2d.drawImage(temp.getImage(), q + xview + 88, v + yview + 103, this);
                    }
                    if(repeat >= 136 && repeat < 165 ){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("splosion10.png"));
                        g2d.drawImage(temp.getImage(), q + xview + 73, v + yview + 100, this);
                    }
                    if(repeat >= 165 && repeat < 194 ){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("splosion11.png"));
                        g2d.drawImage(temp.getImage(),  q + xview + 89, v + yview + 127, this);
                    }
                    if(repeat >= 194 && repeat < 223 ){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("splosion12.png"));
                        g2d.drawImage(temp.getImage(),  q + xview + 89, v + yview + 127 , this);
                    }
                    if( repeat >= 223 && repeat < 450){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("splosion13.png"));
                        ImageIcon temp2 = new ImageIcon(this.getClass().getResource("splosion14.png"));
                        if(repeat % 24 > 11){
                             g2d.drawImage(temp.getImage(),  q + xview + 89, v + yview + 120 , this);
                        }
                        else{
                            g2d.drawImage(temp2.getImage(),  q + xview + 93, v + yview + 128 , this);
                        }
                    }
                    if(repeat >= 450 && repeat < 570 ){
                        if(repeat % 48 > 12 ){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("rainbowlaser.png"));
                        g2d.drawImage(temp.getImage(), q + xview  - 115,  v + yview + 125, this);
                        g2d.drawImage(temp.getImage(), q + xview  - 290, v + yview + 125, this);
                        g2d.drawImage(temp.getImage(), q + xview  - 115,  v + yview + 166, this);
                        g2d.drawImage(temp.getImage(), q + xview  - 290, v + yview + 166, this);
                        g2d.drawImage(temp.getImage(), q + xview  - 460,  v + yview + 125, this);
                        g2d.drawImage(temp.getImage(), q + xview  - 460, v + yview + 166, this);
                        //g2d.drawImage(temp.getImage(), Rav.getXpos() -320, Rav.getYpos() + 150, this);
                       
                           
                    }
                          middle = new Rectangle(jimmy4.getX() + 8, jimmy4.getY() + 3, 9, 40);
                        Rectangle megaDead = new Rectangle(q + xview - 290, v + yview + 145, 600, 70);
                        if(middle.intersects(megaDead) && repeat > 560){
                               Die();
                              //  System.out.println("Firing my Laser!");
                           }
                    }
                    if(repeat > 670){
                        G.nobeam();
                       
                        repeat = 0;
                         if(!G.getAngry()){
                             repeat = 0;
                        G.reset();
                        }
                        else if(G.getAngry() && G.getDoubT() > 0){
                            G.Interate();
                            repeat = 300;
                        }
                        if(G.getAngry() && G.getDoubT() <= 0){
                            repeat = 0;
                         G.reset();
                        }
                    }
                   
         
     }
  
     
     if(G.getthorn()){
         Image hazzard[] = G.getPill();
         if(!Noodlereverse){
         repeat+=  1;
     }
         else{
              repeat-= 1;   
                 }
         int done2 = 1150;
         int type = 0;
         int pivot = G.getFlux();
         int travel = 0;
         if(!G.getAngry()){
             travel = 0;
         }
         else{
             if(pivot % 2 == 0 && !Nback){
                 nshift++;
             }
             if(pivot % 2 == 0 && Nback){
                 nshift--;
             }
             if(nshift >= 90){
                 Nback = true;
             }
             if(nshift <= -90){
                 Nback = false;
             }
             travel = nshift;
             
         }
         if(pivot % 120 < 21){
             type = 0;
         }
         if(pivot % 120 >= 21 && pivot % 120 <= 40){
             type = 3;
         }
         if(pivot % 120 >= 41 && pivot % 120 <= 59){
             type = 2;
         }
         if(pivot % 120 >= 60 && pivot % 120 < 80){
             type = 1;
         }
          if(pivot % 120 >= 80 && pivot % 120 < 101){
             type = 2;
         }
           if(pivot % 120 >= 101 ){
             type = 3;
         }
         int startx = jimmy4.getCamx() + 680;
         int starty = jimmy4.getCammy() + 1380;
         int displace = 180;
         for(int i = 0; i < 5; i++){
            int xtweak = 0;
            int ytweak = 0;
            if(type == 3 || type == 2){
                xtweak =  -4;
                 ytweak = -9;
            }
            if(type == 1){
                xtweak =  -39;
                 ytweak = 0;
            }
                int wilt = repeat; 
                if(G.getAngry() && 1460 - repeat <= done2){
                    wilt = 300;
                }
       
             g2d.drawImage(hazzard[type], startx + (displace * i) + xtweak + travel, ytweak + starty - wilt, null);
             
              Rectangle match = new Rectangle(startx + (displace * i) + xtweak + travel + 9, ytweak + starty - wilt + 15, 30, 300);
             // g2d.draw(match);
               Rectangle sample = getBounds();
              Rectangle Targ2 = new Rectangle(sample.x + 2, sample.y + 30, 4, 17);
             // g2d.draw(Targ2);
              if(Targ2.intersects(match)){
                //  System.out.println("Grappled!!!");
                  Die();
                  
              }
         }
         if(1460 - repeat <= done2 && !G.getAngry()){
             Noodlereverse = true;
         }
         else if(2000 - repeat <= done2){
             Noodlereverse = true;
         }
         if(Noodlereverse && repeat <= 0){
             G.reset();
             G.noPill();
             Noodlereverse = false;
             repeat = 0;
            
            
         }
     }
     if(G.getMine()){
           ImageIcon temp = new ImageIcon(this.getClass().getResource("bloop.png"));
        Image seeker = temp.getImage();
        repeat+= 4;
        int degree = 0;
        if(repeat < 80){
            minenum = 0;
        }
        if(repeat == 80 && minenum == 0){
            minenum++;
            swarm2[0] = new mine( jimmy4.getCamx() + G.getX() + 60, jimmy4.getCammy() + G.getY() + 230);
        }
        if(repeat == 160 && minenum == 1 ){
            minenum++;
             swarm2[1] = new mine( jimmy4.getCamx() + G.getX() + 180, jimmy4.getCammy() + G.getY() + 230);
        }
        if(repeat == 240  && minenum == 2){
            minenum++;
            swarm2[2] = new mine( jimmy4.getCamx() + G.getX() + 400, jimmy4.getCammy() + G.getY() + 230);
        }
         if(repeat == 320 && minenum == 3){
            minenum++;
            swarm2[3] = new mine( jimmy4.getCamx() + G.getX() + 80, jimmy4.getCammy() + G.getY() + 230);
        }
          if(repeat == 400 && minenum == 4){
            minenum++;
            swarm2[4] = new mine( jimmy4.getCamx() + G.getX(), jimmy4.getCammy() + G.getY() + 230);
        }
           if(repeat == 480 && minenum == 5){
            minenum++;
            swarm2[5] = new mine( jimmy4.getCamx() + G.getX() + 300, jimmy4.getCammy() + G.getY() + 230);
        }
           
           
             for(int i = 0; i < minenum; i++){
                        g2d.drawImage(seeker, swarm2[i].getX() , swarm2[i].getY(), this);
                         ImageIcon boom1 = new ImageIcon(this.getClass().getResource("bomb1.png"));
                                ImageIcon boom2 = new ImageIcon(this.getClass().getResource("bomb2.png"));
                                ImageIcon boom3 = new ImageIcon(this.getClass().getResource("bomb3.png"));
                                if(repeat > 1700){
                                g2d.drawImage(boom1.getImage(),swarm2[i].getX() - 30, swarm2[i].getY() - 40, this);
                                }
                                if(repeat > 1796){
                                     g2d.drawImage(boom2.getImage(),swarm2[i].getX() - 50, swarm2[i].getY() - 60, this);
                                }
                                if(repeat > 1882){
                                     g2d.drawImage(boom3.getImage(),swarm2[i].getX() - 70, swarm2[i].getY() - 75, this);
                                }
                        
                        
                        if( getBounds().intersects(swarm2[i].getCollide()) && jimmy4.counter()){
                            swarm2[i].setBack(true);
                        }
                        if(!swarm2[i].getBack()){
                        swarm2[i].shift(jimmy4.getX() + 8, jimmy4.getY() + 30);
                    }
                     else{
                            int up2 = 0;
                            int right = 0;
                            if(i == 0 || i == 5){
                                up2 = - 60;
                                if (i == 0){
                                    right = 70;
                                }
                            }
                             swarm2[i].shift(G.getX() + right + jimmy4.getCamx() + (35 * (i + 1)), G.getY() + jimmy4.getCammy() + 180 + up2);
                             if(swarm2[i].getY() < G.getY() + jimmy4.getCammy() + 320){
                                 degree++;
                             }
                               
                                 
                            }
                        
                         middle = new Rectangle(jimmy4.getX() + 8, jimmy4.getY() + 3, 9, 40);
                      
                        if(repeat > 1800 && swarm2[i].getCollide().intersects(getBounds()) && !jimmy4.counter()){
                          //  System.out.println("minesplosion!");
                            Die();
                            
                        }
             }
                        if(repeat >= 1750){
                            if(degree > 0){
                                G.Moar(degree);
                                G.Damage();
                            }
                        
                        G.noMine();
                        repeat = 0;
                        G.antiRise();
                        G.reset();
                        minenum = 0;
                        }
      
     }
     
     
    if(G.getRise()){
        available = true;
        repeat++;
        if(repeat > 200){
        redshift--;
        int piv = G.getFlux() % 50;
            if(piv > 25){
                piv = 1;
            }
            else{
                piv = 0;
            }
         g2d.drawImage(Marinara[piv].getImage(), 0,   1300 + redshift + jimmy4.getCammy()  , this);
         ImageIcon safe = new ImageIcon(this.getClass().getResource("cloudsafe.png"));
         if(available && !shield){
               ImageIcon circle = new ImageIcon(this.getClass().getResource("shield.png"));
               g2d.drawImage(circle.getImage(), 900 + jimmy4.getCamx(), 1040 + jimmy4.getCammy(), this);
               Rectangle protection = new Rectangle(900 + jimmy4.getCamx(), 1040 + jimmy4.getCammy(), 80, 150);
              // g2d.draw(protection);
               }
         g2d.drawImage(safe.getImage(),771 + jimmy4.getCamx(), 1100 + jimmy4.getCammy(), this);
    
    if(1300 + redshift < 800 ){
     redshift = 0;
     G.antiRise();
     G.reset();
     //recent = 20;
     repeat  = 0;
     jimmy4.setBase(500);
        }
    }
    }
    
    if(G.getSum()){
        repeat++;
        if(repeat > 230){
        int quant = G.summonRequest();
        Random rand = new Random();
        for(int i = 0; i < quant; i++){
        int alf = rand.nextInt(6);
        int mal = rand.nextInt(6);
       
            
                legion4[i + 2] = new pastaAngel(1, false);
            
            legion4[i + 2].activate(800 + (alf * 35), 1170 - (mal * 20));
        }
                }
                
        if( repeat >= 500){
            G.reset();
            repeat = 0;
        }
    }
    if(over && jimmy4.getCammy() < -680 && jimmy4.getDive() && !ending){
      
        frameFin+= 5;
        
        if(frameFin == 250){
            jimmy4.setY(jimmy4.getY() + 2);
        }
        if(frameFin == 500){
            jimmy4.setY(jimmy4.getY() + 2);
        }
        if(frameFin == 750){
            jimmy4.setY(jimmy4.getY() + 2);
        }
        if(frameFin == 1000){
            jimmy4.setY(jimmy4.getY() + 2);
        }
        if(frameFin == 1250){
            jimmy4.setY(jimmy4.getY() + 3);
        }
        if(frameFin == 1800){
            jimmy4.setY(jimmy4.getY() + 10);
            ending = true;
        }
        
    }
    
    if(ending ){
        wark+= 4;
      if(wark < 1700){
          EndWhipShift[4] = jimmy4.getX() - 50;
          EndWhipShift[5] = jimmy4.getY() - 10;
          EndWhipShift[2] = jimmy4.getX()  - 62;
          EndWhipShift[3] = jimmy4.getY() - 7;
           EndWhipShift[0] = jimmy4.getX()  - 66;
          EndWhipShift[1] = jimmy4.getY() - 3;
    
      }
        if(jimmy4.getDive()){
                    jimmy4.setDy(0);
                    
                     ImageIcon fog = new ImageIcon(this.getClass().getResource("prewhite.png"));
                g2d.setColor(Color.white);
                if(wark > 100 ){
                    g2d.drawImage(fog.getImage(), 0,  310, this);
                }
                if(wark > 250 ){
                    Rectangle blu = new Rectangle(0, 320, 510, 100);
                    g2d.draw(blu);
                    g2d.fill(blu);
                }
                if(wark > 400){
                    
                    g2d.drawImage(fog.getImage(), 0, 230, this);
                }
                if(wark > 550){
                     Rectangle blu = new Rectangle(0, 240, 510, 80);
                    g2d.draw(blu);
                    g2d.fill(blu);
                }
                 if(wark > 700){
                    
                    g2d.drawImage(fog.getImage(), 0, 150, this);
                }
                if(wark > 850){
                    Rectangle blu = new Rectangle(0, 160, 510, 80);
                    g2d.draw(blu);
                    g2d.fill(blu);
                }
                 if(wark > 1000){
                    
                    g2d.drawImage(fog.getImage(), 0, 70, this);
                }
                if(wark > 1150){
                   Rectangle blu = new Rectangle(0, 80, 510, 80);
                   g2d.draw(blu);
                    g2d.fill(blu);
                }
                if(wark > 1300){
                   Rectangle blu = new Rectangle(0, 0, 510, 80);
                   g2d.draw(blu);
                    g2d.fill(blu);
                     
                }
                if(wark > 1600){
                    
                    jimmy4.setCam(jimmy4.getCamx() - 85, -821);
                }    
                }
        if(wark > 1600 && wark < 1700){
            jimmy4.diveEnd();
            G.reis();
            if(wark % 270 < 90){
           jimmy4.setX(G.getX() + jimmy4.getCamx() + 100);
           // jimmy4.setY(G.getY() + jimmy4.getCammy() + 80);
            
        }
            if(wark % 270 >= 90 && wark % 270 <= 180){
          // jimmy4.setX(G.getX() + jimmy4.getCamx() + 102);
           // jimmy4.setY(G.getY() + jimmy4.getCammy() + 86);
            
        }
             if(wark % 270 >= 181){
         //  jimmy4.setX(G.getX() + jimmy4.getCamx() + 1);
           // jimmy4.setY(G.getY() + jimmy4.getCammy() + 86);
            
        }
     jimmy4.setCam( -775, -900);
      G.Mugen( 790 , 991);
        }
        //jimmy4.setCam(100, -90);
        //jimmy4.setCam(G.getX() - 120, G.getY() - 220);
        
        
        
        }
        }
        }
        if(vertigo > 600){
            int bask = 13;
            int offset = vertigo/30 - 20;
            if(offset >= 14 && vertigo < 2000){
                offset = 13 + (vertigo % 72)/24;
            }
            else if(loop < 15 && vertigo >= 2000){
                offset = vertigo/20 - 83;
                 if( loop < 15 && 24 <= offset){
                loop++;
                vertigo = 2100;
                offset = 22;  
            }
            }
           
            if(loop < 15){
             // System.out.println("offset " + offset );
        g2d.drawImage( Ending[bask + offset] , -110  , -135  , null);
            }
            else if(loop >= 15){
                int modifier = 240;
                vertigo += 1;
             int gats = (vertigo % modifier)/40;
                //if(loop >= 15){
                //  gats = (vertigo % modifier)/80 + 6;
              // }
            // if(loop < 30 && vert){
                 
            // }
              if(loop >= 30 && loop <= 37){
                  gats +=  12;
                  if(loop >= 30){
                      gats += 12;
                  }
                  if(loop >= 45){
                      gats += 12;
                  }
                  
              }
              if(loop > 37 && loop <= 47){
                  gats = (vertigo % 120)/40 + 54;
              }
              
              if(loop > 47){
                  gats = (vertigo % 120)/40 + 54;
                  if(loop > 60){
                      gats += 1;
                  }
                  if(loop >= 70){
                      gats += 2;
                  }
              }
             
              
                if(loop <= 37 &&  (vertigo % modifier) + 5 >= 240){
                    loop++;
                }
                else if(loop > 37 && loop <= 47  && (vertigo % 120) + 5 >= 120 ){
                    loop++;
                }
                 else if(loop > 47 && (vertigo % 80) + 5 >= 80 ){                
                    loop++;
                }
                
                 if(gats < 60){
                     int shift3 = 0;
                     int shift2 = 0;
                     if(gats < 12){
                         shift2 = 170;
                         shift3 = 70;
                         
                     }
                   
                    // if(gats == 1 || gats == 3){
                        // shift += -5;
                   //  }
                   //  if(gats == 2 || gats == 4){
                      //   shift -= 4;
                  //   }
                     if(  gats  < 24){
                         g2d.drawImage(Ending[39], -220, -160, this);
                     }
                     else if(gats >= 24){
                         g2d.drawImage(Ending[40], -130, -200, this);
                     }
                     if(gats < 48 && gats >= 36){
                         shift = -30;
                         shift2 = - 15;
                         //if()
                     }
                    // if(gats % 12 == 8){
                       //  shift += -3;
                        
                    // }
                    // if(gats % 12 == 0 || gats % 12 == 2 || gats % 12 == 3 || gats % 12 == 5){
                        // shift += -2;
                    // }
                     
                      
                     if(gats >= 48){
                         shift = -90;
                         shift2 = -80;
                     }
                    // if(gats % 12 == 6){
                      //   shift += -10;
                     //}
                    
                   //  if(gats == 57){
                     //    shift = -47;
                       //  shift2 = -85;
                     //}
                     if(gats == 58){
                         shift = -115;
                         shift2 = -85;
                     }
                    // if(gats % 12 == 8){
                      //   shift += 10;
                        // shift2 += 3;
                        
                     //}
                     //if(gats % 12 == 0 || gats % 12 == 2 || gats % 12 == 3 || gats % 12 == 5){
                        // shift += -3;
                     //}
                     //if(gats % 12 == 7){
                       //  shift += 10;
                         //shift2 += 10;
                     //}
                     if(gats == 59){
                         toomuch++;
                     }
                     if(toomuch > 24){
                   timer4.stop();
                 this.removeKeyListener(keys);
                         done = true;
                     }
                g2d.drawImage(recarn[gats], 100 + shift, 70 + shift2, null);
                 }
         
            }
                    
        }
        if (part == 2){
              g2d.drawImage(portions[2], 2110 + jimmy4.getCamx(), jimmy4.getCammy(), null);
              
              if(available){
               ImageIcon circle = new ImageIcon(this.getClass().getResource("shield.png"));
           g2d.drawImage( circle.getImage(), 650 + jimmy4.getCamx(), 154 + jimmy4.getCammy(), null);
              } 
             
              
              
              
            if(!smooth){
            g2d.drawImage(portions[1], jimmy4.getCamx(), jimmy4.getCammy(), null);
            ysave = jimmy4.getCammy();
            }
            else if(smooth){
               
                if(dark > 60){
                g2d.drawImage(portions[1], jimmy4.getCamx() + 130, ysave, null);
                 jimmy4.setCam(jimmy4.getCamx() - 2, -850);
                 jimmy4.setX(jimmy4.getX() - 1);
                 dark--;
                
                }
               
                else{
                    smooth = false;
                dark = 0;
                jimmy4.setRSide();
                shift = 0;
                }
            }
      
             for(int i = 0; i < 2; i ++){
                if(legion2[i].getAct()){
            Image prox = legion2[i].findImage();
            g2d.drawImage(prox, legion2[i].getX() , legion2[i].getY() , this);
            
            if(legion2[i].getHit()){
                if(legion2[i].getStagger() % 12 <= 5){
                    g2d.drawImage(halo[0], legion2[i].getX() -118 , legion2[i].getY() - 59, this);
                }
                else{
                   g2d.drawImage(halo[1], legion2[i].getX() -118 , legion2[i].getY() - 59, this); 
                }
            }
           // g2d.draw(legion2[i].getBody());
            
            
            
            if(legion2[i].getToss() && !legion2[i].getPhase()){
                Image spear = legion2[i].spearThrow();
                g2d.drawImage(spear, legion2[i].getPx() , legion2[i].getPy() , this);
                 int sx = legion2[i].getPx() + 40;
                int sy = legion2[i].getPy() + 60;
                Rectangle yikes = new Rectangle(sx, sy, 10, 10);
             //   g2d.draw(yikes);
            }
          
               
                }
            
             }
            if(available){
               ImageIcon circle = new ImageIcon(this.getClass().getResource("shield.png"));
           g2d.drawImage( circle.getImage(), 650 + jimmy4.getCamx(), 154 + jimmy4.getCammy(), null);
              } 
             
            for (Unicorn U21 : U2) {
                Image corn = U21.getImage();
                int change = 0;
                if (U21.getFrameNum() == 13) {
                    change = 20;
                }
                if (U21.getFrameNum() == 12) {
                    change = 8;
                }
                if (!U21.getDie() || U21.getDframe() != 4) {
                    g2d.drawImage(corn, U21.getX() + jimmy4.getCamx(), U21.getY() + change + jimmy4.getCammy(), null);
                }
                if (U21.getDframe() < 4 && U21.getDie()) {
                    Image bloody = U21.getDeath();
                    g2d.drawImage(bloody, U21.getX() + jimmy4.getCamx() - 138, U21.getY() + jimmy4.getCammy() - 132, null);
                }
                if (!U21.getDie()) {
                    if (U21.getShot()) {
                        U21.setCam(jimmy4.getCamx(), jimmy4.getCammy());
                        Rectangle temper = U21.getLaser();
                        if (kount2 % 10 < 5) {
                            g.setColor(Color.red);
                            
                        }
                        else {
                            g.setColor(Color.blue);
                        }           kount2++;
                        g2d.fillRect(temper.x, temper.y, temper.width, temper.height);
                    }
                }
            }
              
              
              for(int i = 0; i < robots.length; i++) {
           int j = i;
        Image bot = robots[j].getImage();
        if(!robots[j].getDie() || robots[j].getDframe() != 15) {
        g2d.drawImage(bot, robots[j].getXy() + jimmy4.getCamx(), robots[j].getY() + jimmy4.getCammy(), null);
        }
        if(robots[j].getDie() && robots[j].getDframe() != 15) {
                 Image temp = robots[j].getDeth();
                 if(robots[j].getDframe() == 0) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx() + 22 , robots[j].getY() + jimmy4.getCammy() + 5 , this);
                 }
                  if(robots[j].getDframe() == 1) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx() + 20 , robots[j].getY() + jimmy4.getCammy() + 2 , this);
                 }
                    if(robots[j].getDframe() == 2) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx() + 16 ,robots[j].getY() + jimmy4.getCammy()   , this);
                 }
                    if(robots[j].getDframe() == 3) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx() + 10 , robots[j].getY() + jimmy4.getCammy() - 3 , this);
                 }
                 if(robots[j].getDframe() == 4) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx()  , robots[j].getY() + jimmy4.getCammy()  - 5 , this);
                 }
                  if(robots[j].getDframe() == 5) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx() - 6, robots[j].getY() + jimmy4.getCammy() - 10, this);
                 }
                   if(robots[j].getDframe() == 6) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx()  - 4 , robots[j].getY() + jimmy4.getCammy()  - 25, this);
                 }
                    if(robots[j].getDframe() == 7) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx()   - 8, robots[j].getY() + jimmy4.getCammy() - 30 , this);
                 }
                       if(robots[j].getDframe() == 8) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx()   - 30, robots[j].getY() + jimmy4.getCammy() - 70 , this);
                 }
                   if(robots[j].getDframe() == 9) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx()   - 40, robots[j].getY() + jimmy4.getCammy() - 55 , this);
                 }
                    if(robots[j].getDframe() == 10) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx()   - 52, robots[j].getY() + jimmy4.getCammy() - 55 , this);
                 }
                       if(robots[j].getDframe() == 11) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx()   - 57, robots[j].getY() + jimmy4.getCammy() - 55 , this);
                 }
                          if(robots[j].getDframe() == 12) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx()   - 57, robots[j].getY() + jimmy4.getCammy() - 55 , this);
                 }
                              if(robots[j].getDframe() == 13) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx()   - 47, robots[j].getY() + jimmy4.getCammy() - 50 , this);
                 }
                                  if(robots[j].getDframe() == 14) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx()   - 20, robots[j].getY() + jimmy4.getCammy() - 45 , this);
                 }
                                      if(robots[j].getDframe() == 15) {
                 g2d.drawImage(temp, robots[j].getXy() + jimmy4.getCamx()   + 10, robots[j].getY() + jimmy4.getCammy() - 60 , this);
                  }
        }
      
        }
        
           // Rectangle[] Platforms = platforms4.getPlatforms();
           
           // for(int i = begin; i < end; i++){
               // g2d.drawRect(Platforms[i].x, Platforms[i].y, Platforms[i].width, Platforms[i].height);
           // }
            
            int frameNum = 0;
        int y = jimmy4.getY();
        int base = jimmy4.getBase();
        
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
            if(jimmy4.getDive()){
            divecount++;
            if(divecount <= 5){
                frameNum = 5;
            }
            else if(divecount > 5 && divecount <= 10){
                frameNum = 6;
            }
            else if(divecount > 10 && divecount <= 15){
                frameNum = 7;
            }
            else{
                divecount = 0;
            }
            }
            Image Image = Frames[frameNum].getImage();
        g2d.drawImage(Image, jimmy4.getX(), jimmy4.getY(), null);
             
                            
                     
        Image barrier2 = jimmy4.getReflect2();
        Image barrier = jimmy4.getReflect();
        g2d.drawImage(barrier, jimmy4.getX() + 3, jimmy4.getY() - 30, this);
        g2d.drawImage(barrier2, jimmy4.getX() - 12, jimmy4.getY() - 30, this);
          Image head = lives.getImage();
        for (int i = 0; i < jimmy4.getLives(); i++) {
            g2d.drawImage( head , 10 +(30 * i), 10, null);
        }
         if(shield){
            ImageIcon fresh = new ImageIcon(this.getClass().getResource("shieldIcon.png"));
            g2d.drawImage(fresh.getImage(), 130 , 10,  null);
        }
        
        ImageIcon panel = new ImageIcon(this.getClass().getResource("jumpad1.png"));
        g2d.drawImage(panel.getImage(), 250 + jimmy4.getCamx(), 305 + jimmy4.getCammy(), this);
        g2d.drawImage(panel.getImage(), 2350 + jimmy4.getCamx(), 860 + jimmy4.getCammy(), this);
        g2d.drawImage(panel.getImage(), 2820 + jimmy4.getCamx(), 535 + jimmy4.getCammy(), this);
        
         ImageIcon blueblur = new ImageIcon(this.getClass().getResource("energy1.png"));
            ImageIcon blueblur2 = new ImageIcon(this.getClass().getResource("energy2.png"));
            if(dashflash == 1){
                dashcount++;
                if(dashcount > 10 && dashcount <= 50){
                    g2d.drawImage(blueblur.getImage(),230 + jimmy4.getCamx(), 280 + jimmy4.getCammy(), null);
                }
                 if(dashcount > 40 && dashcount <= 100){
                    g2d.drawImage(blueblur2.getImage(),230 + jimmy4.getCamx(), 160 + jimmy4.getCammy(), null);
                    
                }
               
             
            }
            if(dashflash == 2){
                dashcount++;
                if(dashcount > 10 && dashcount <= 50){
                    g2d.drawImage(blueblur.getImage(),2320 + jimmy4.getCamx(), 840 + jimmy4.getCammy(), null);
                }
                 if(dashcount > 40 && dashcount <= 100){
                    g2d.drawImage(blueblur2.getImage(),2320 + jimmy4.getCamx(), 720 + jimmy4.getCammy(), null);
                    
                }
                
            }
            if(dashflash == 3){
                dashcount++;
                if(dashcount > 10 && dashcount <= 50){
                    g2d.drawImage(blueblur.getImage(),2800 + jimmy4.getCamx(), 512 + jimmy4.getCammy(), null);
                }
                 if(dashcount > 40 && dashcount <= 100){
                    g2d.drawImage(blueblur2.getImage(),2800 + jimmy4.getCamx(), 392 + jimmy4.getCammy(), null);
                    
                }
           
             
            }
       if(laserfire){
           repeat++;
           ImageIcon zap = new ImageIcon( this.getClass().getResource("rainbowlaser.png"));
           if(repeat > 400){
               g2d.drawImage(zap.getImage(),2000 + jimmy4.getCamx(), 237 + jimmy4.getCammy(), this);
           }
               if(repeat > 405){
                    g2d.drawImage(zap.getImage(),1830 + jimmy4.getCamx(), 237 + jimmy4.getCammy(), this);
               }
                    if(repeat > 410){
                    g2d.drawImage(zap.getImage(),1660 + jimmy4.getCamx(), 237 + jimmy4.getCammy(), this);
                    }
                    if(repeat > 415){
                    g2d.drawImage(zap.getImage(),1490 + jimmy4.getCamx(), 237 + jimmy4.getCammy(), this);
                    }
                    if(repeat > 420){
                    g2d.drawImage(zap.getImage(),1320 + jimmy4.getCamx(), 237 + jimmy4.getCammy(), this);
                    }
                    if(repeat > 425){
                    g2d.drawImage(zap.getImage(), 1150 + jimmy4.getCamx(), 237 + jimmy4.getCammy(), this);
              }
                    if(repeat > 430){
                    g2d.drawImage(zap.getImage(), 980 + jimmy4.getCamx(), 237 + jimmy4.getCammy(), this);
                   
              }
                    if(repeat > 435){
                    g2d.drawImage(zap.getImage(), 810 + jimmy4.getCamx(), 237 + jimmy4.getCammy(), this);
                   
                    middle = new Rectangle(jimmy4.getX() + 8, jimmy4.getY() + 3, 9, 40);
                        Rectangle megaDead = new Rectangle(640 + jimmy4.getCamx(), 237 + jimmy4.getCammy(), 1700, 60);
                           if(middle.intersects(megaDead)){
                               Die();
                             //   System.out.println("Firing my Laser!");
                           }
                   
              }
                    
                    if(repeat > 440){
                    g2d.drawImage(zap.getImage(), 640 + jimmy4.getCamx(), 237 + jimmy4.getCammy(), this);
                    repeat = 0;
                   
              }
               
               
               
               
           }
       if(recent == 31){
           ImageIcon nimbus[] = new ImageIcon[2];
           nimbus[0] = new ImageIcon(this.getClass().getResource("nimbus.png"));
           nimbus[1] = new ImageIcon(this.getClass().getResource("nimbus2.png"));
           dark++;
           if(dark % 40 > 20){
          g2d.drawImage(nimbus[0].getImage(), 3020 + jimmy4.getCamx() + shift, 200 + jimmy4.getCammy(), this);
           }
           else{
               g2d.drawImage(nimbus[1].getImage(), 3000 + jimmy4.getCamx() + shift, 200 + jimmy4.getCammy(), this);
               
           }
             if( jimmy4.getX() > 600){
                  part = 3;
                  recent = 0;
                  edge = true;
                  shift = 0;
                  dark = 0;
                  available = true;
                  jimmy4.setCam(0, 0);
                  jimmy4.setX(130);
                  jimmy4.setY(230);
                  //jimmy4.setTop(-40);
                  jimmy4.jumpChange(230);
                  jimmy4.setpart(1);
                  legion3[0].activate(1100, 700);
                  legion3[1].activate(880, 120);
                
                 
              }
           
       }
       
        }
        if(part == 3){
            updateSpikes();
             ImageIcon buffy = new ImageIcon(this.getClass().getResource("cloudbuffer.png"));
       if(gauntlet < 15){
         g2d.drawImage(portions[3], 572 + jimmy4.getCamx() + xpos, ypos, null);  
        
         
         
         
        if(edge){
            
          
            g2d.drawImage(buffy.getImage(), 0 + jimmy4.getCamx(), 0, this);
             g2d.drawImage(buffy.getImage(), 280 + jimmy4.getCamx(), 0, this);
             ypos = -40;
             xpos = 0;
             sector = "sine";
             if(once){
             Random rand = new Random();
             choice = rand.nextInt(30) + 1;
            once = false;
             }
            if(choice % 2 == 0 && choice > 14){
                sector = "all";
           xpos = -1160;
                
            }
            if(choice % 2 != 0 && choice < 15){
                ypos = -410;
                sector = "tangent";
            }
            if(choice % 2 == 0 && choice < 15){
                ypos = -410;
                 xpos = -1160;
                 sector = "cosine";
            }
            if(jimmy4.getCamx() < -740){
                edge = false;
                once = true;
                
            }
           platforms4.setCam( jimmy4.getCamx() + xpos, ypos);
        }
       
          if(jimmy4.getCamx() < -740 && xpos > -1100){
              g2d.drawImage(buffy.getImage(), jimmy4.getCamx() + xpos + 1820, 0, null);
              g2d.drawImage(buffy.getImage(), jimmy4.getCamx() + xpos + 1900, 0, null);
             
          }
             else if(jimmy4.getCamx() < -600 && xpos < -1100){
              g2d.drawImage(buffy.getImage(), jimmy4.getCamx() + xpos + 2810, 0, null);
              g2d.drawImage(buffy.getImage(), jimmy4.getCamx() + xpos + 2960, 0, null);
              
               
          }
          
          for(int i = 0; i < 2; i ++){
                if(legion3[i].getAct()){
            Image prox = legion3[i].findImage();
            g2d.drawImage(prox, legion3[i].getX() + xpos, legion3[i].getY() + ypos, this);
            
            if(legion3[i].getHit()){
                if(legion3[i].getStagger() % 12 <= 5){
                    g2d.drawImage(halo[0], legion3[i].getX() + xpos -118  , legion3[i].getY() + ypos -59 , this);
                }
                else{
                   g2d.drawImage(halo[1], legion3[i].getX() + xpos -118 , legion3[i].getY()  + ypos -59, this); 
                }
            }
            Rectangle awesomo = new Rectangle(legion3[i].getX() + 45 + xpos, legion3[i].getY()+ 70 + ypos, 60, 60);
           // g2d.draw(awesomo);
            
            
            if(legion3[i].getToss() && !legion3[i].getPhase()){
                Image spear = legion3[i].spearThrow();
                g2d.drawImage(spear, legion3[i].getPx()  + xpos , legion3[i].getPy()  + ypos, this);
                 int sx = legion3[i].getPx() + 40 + xpos;
                int sy = legion3[i].getPy() + 60 + ypos;
                Rectangle yikes = new Rectangle(sx, sy, 10, 10);
               // g2d.draw(yikes);
            }
          
               
                }
            
             }
           if(jimmy4.getCamx() < -1600){
                  jimmy4.setCam(0, 0);
                  edge = true;
                  gauntlet+= 2;
                  if(gauntlet >= 15 && sector.matches("all") ){
                      gauntlet = 14;
                  }
                  if(gauntlet >= 15){
                      platforms4.setCam(0, -40);
                       jimmy4.setCam(0, -40);
                       jimmy4.pivot(true);
                  }
                  
              }
           ImageIcon panel = new ImageIcon(this.getClass().getResource("jumpad1.png"));
        g2d.drawImage(panel.getImage(), 1390 + jimmy4.getCamx()+ 694 + xpos, 370 + ypos, this);
           if(launch){
               dashcount++;
               ImageIcon blueblur = new ImageIcon(this.getClass().getResource("energy1.png"));
            ImageIcon blueblur2 = new ImageIcon(this.getClass().getResource("energy2.png"));
                if(dashcount > 10 && dashcount <= 20){
                    g2d.drawImage(blueblur.getImage(), 1373 + jimmy4.getCamx()+ 674 + xpos, 320 + ypos, null);
                    g2d.drawImage(blueblur2.getImage(), 1373 + jimmy4.getCamx()+ 674 + xpos, 180 + ypos , null);
                }
                 
             if(dashcount > 98){
                 launch = false;
                 dashcount = 0;
             }    
           }
             for(int i = 0; i < 12; i++){
             // g2d.draw(spikeballs[i]);
              Rectangle sample = getBounds();
              Rectangle Targ = new Rectangle(sample.x + 17, sample.y + 30, 4, 20);
              //g2d.draw(Targ);
              if(Targ.intersects(spikeballs[i])){
                  Die();
                //  System.out.println(i);
              }
          }
       }
      
        if(gauntlet >= 15){
              g2d.drawImage(buffy.getImage(), jimmy4.getCamx() + 7, 0, null);
                 g2d.drawImage(buffy.getImage(), jimmy4.getCamx() + 250, 0, null);
            g2d.drawImage(portions[3], 540 + jimmy4.getCamx(), -40, null); 
            g2d.drawImage(portions[4], jimmy4.getCamx() + 1820, -1397, null);
            ImageIcon foo = new ImageIcon(this.getClass().getResource("smallcloudbuffer.png"));
            g2d.drawImage(foo.getImage(), jimmy4.getCamx() + 1743, 0, null);
            g2d.drawImage(portions[3], 3010 + jimmy4.getCamx(), -40, null); 
               if(!miniboss && jimmy4.getCamx() < -1800){
                   miniboss = true;
                   Rav = new MiniBossi();
               }
               if(jimmy4.getCamx() < -3050 && jimmy4.getJump()){
                   jimmy4.setCam(-550, -40);
                   platforms4.setCam(-550, -40);
               }
               if(available){
               ImageIcon circle = new ImageIcon(this.getClass().getResource("shield.png"));
               g2d.drawImage(circle.getImage(), 2200 + jimmy4.getCamx(), 100 + jimmy4.getCammy(), null);
               }
                   for(int i = 0; i < 12; i++){
                       if( i != 5 && i != 6){
                           Rectangle sample = getBounds();
                     Rectangle Targ = new Rectangle(sample.x + 17, sample.y + 30, 4, 20);
             // g2d.draw(spikeballs[i]);
              if(Targ.intersects(spikeballs[i])){
                  Die();
                //  System.out.println(i);
              }
                       }
          }
            
        }    
            if(miniboss){
                Image baddy = Rav.getImage();
                g2d.drawImage(baddy, Rav.getXpos(), Rav.getYpos(), this);
                if(Rav.getMove() == 1){
                        //g2d.draw(Rav.getBite());
                    }
                if(Rav.getDead()){
                if(Rav.getSite() && Rav.getMove() == 2 && !Rav.getSpawn()){
                      ImageIcon temp = new ImageIcon(this.getClass().getResource("bloop.png"));
        Image seeker = temp.getImage();
                    if(minenum == 0){
                        swarm[0] = new mine(Rav.getXpos() + 10, Rav.getYpos() + 100);
                        minenum++;
                    }
                    if(minenum == 1 && Rav.getWait() > 70){
                        swarm[1] = new mine(Rav.getXpos() + 10, Rav.getYpos() + 100);
                        minenum++;
                    }
                    if(minenum == 2 && Rav.getWait() > 170){
                        swarm[2] = new mine(Rav.getXpos() + 10, Rav.getYpos() + 100);
                        minenum++;
                    }
                    
                     middle = new Rectangle(jimmy4.getX() + 8, jimmy4.getY() + 3, 9, 40);
                      
                       
                        
                    
                    int potency = 0;
                    for(int i = 0; i < minenum; i++){
                        g2d.drawImage(seeker, swarm[i].getX(), swarm[i].getY(), this);
                        
                         ImageIcon boom1 = new ImageIcon(this.getClass().getResource("bomb1.png"));
                                ImageIcon boom2 = new ImageIcon(this.getClass().getResource("bomb2.png"));
                                ImageIcon boom3 = new ImageIcon(this.getClass().getResource("bomb3.png"));
                                if(Rav.getWait() > 400){
                                g2d.drawImage(boom1.getImage(),swarm[i].getX() - 30, swarm[i].getY() - 40, this);
                                }
                                if(Rav.getWait() > 416){
                                     g2d.drawImage(boom2.getImage(),swarm[i].getX() - 50, swarm[i].getY() - 60, this);
                                }
                                if(Rav.getWait() > 432){
                                     g2d.drawImage(boom3.getImage(),swarm[i].getX() - 70, swarm[i].getY() - 75, this);
                                }
                                if(Rav.getMove() == 1){
                                    Rectangle tempy = Rav.getBite();
                                    //g2d.draw(tempy);
                                }
                        
                        
                        if( getBounds().intersects(swarm[i].getCollide()) && jimmy4.counter()){
                            swarm[i].setBack(true);
                        }
                        if(!swarm[i].getBack()){
                        swarm[i].shift(jimmy4.getX() + 8, jimmy4.getY() + 30);
                    }
                        else{
                            if(i == 0){
                             swarm[i].shift(Rav.getXpos() + 10, Rav.getYpos() + 100);
                            }
                            else if(i == 1){
                                swarm[i].shift(Rav.getXpos() + 15, Rav.getYpos() + 170);
                            }
                            else if(i == 2){
                                swarm[i].shift(Rav.getXpos() + 15, Rav.getYpos() + 60);
                            }
                            if(Rav.getWait() > 400){
                                if(swarm[i].getX() > Rav.getXpos() && swarm[i].getBack()){
                                    potency++;
                                }
                               
                                 
                            }
                    
                }
                    }
                    if(potency > 0){
                        Rav.damage(potency);
                        if(!Rav.getDead()){
                            dark = 0;
                        }
                    }
            }
                if(!Rav.getSite()){
                    minenum = 0;
                }
                
            
                if( Rav.getSite() && !Rav.getSpawn()&& Rav.getMove() == 3){
                    if(Rav.getWait() <= 48 && Rav.getWait() > 40){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("splosion2.png"));
                        g2d.drawImage(temp.getImage(), Rav.getXpos() + 60, Rav.getYpos() + 120, this);
                    }
                    if(Rav.getWait() >= 49 && Rav.getWait() < 57 ){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("splosion3.png"));
                        g2d.drawImage(temp.getImage(), Rav.getXpos() + 50, Rav.getYpos() + 113, this);
                    }
                    if(Rav.getWait() >= 58 && Rav.getWait() < 66 ){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("splosion4.png"));
                        g2d.drawImage(temp.getImage(), Rav.getXpos() + 27, Rav.getYpos() + 100, this);
                    }
                    if(Rav.getWait() >= 67 && Rav.getWait() < 75 ){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("splosion9.png"));
                        g2d.drawImage(temp.getImage(), Rav.getXpos(), Rav.getYpos() + 75, this);
                    }
                    if(Rav.getWait() >= 76 && Rav.getWait() < 84 ){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("splosion10.png"));
                        g2d.drawImage(temp.getImage(), Rav.getXpos() -30, Rav.getYpos() + 90, this);
                    }
                    if(Rav.getWait() >= 85 && Rav.getWait() < 93 ){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("splosion11.png"));
                        g2d.drawImage(temp.getImage(), Rav.getXpos() - 20 , Rav.getYpos() + 70, this);
                    }
                    if(Rav.getWait() >= 94 && Rav.getWait() < 99 ){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("splosion12.png"));
                        g2d.drawImage(temp.getImage(), Rav.getXpos() - 19, Rav.getYpos() + 70, this);
                    }
                    if(Rav.getWait() >= 100 && Rav.getWait() < 150 ){
                        ImageIcon temp = new ImageIcon(this.getClass().getResource("rainbowlaser.png"));
                        g2d.drawImage(temp.getImage(), Rav.getXpos() -190, Rav.getYpos() + 100, this);
                        g2d.drawImage(temp.getImage(), Rav.getXpos() -360, Rav.getYpos() + 100, this);
                        //g2d.drawImage(temp.getImage(), Rav.getXpos() -320, Rav.getYpos() + 150, this);
                    }
                }
                if(Rav.getCountDown() < 85){
                    int phi = Rav.getCountDown();
                    if(phi >= 68 && phi < 85){
                             ImageIcon collapse = new ImageIcon(this.getClass().getResource("splosion10.png"));
                             g2d.drawImage(collapse.getImage(),  220, 200, this);
                             g2d.drawImage(collapse.getImage(),  120, 270, this);
                             g2d.drawImage(collapse.getImage(),  300, 80, this);
                             
                         }
                         if(phi >= 51 && phi < 68){
                             ImageIcon collapse = new ImageIcon(this.getClass().getResource("splosion11.png"));
                             g2d.drawImage(collapse.getImage(),  231, 207, this);
                              g2d.drawImage(collapse.getImage(),  131, 277, this);
                               g2d.drawImage(collapse.getImage(),  311, 87, this);
                         }
                         if(phi >= 34 && phi < 51){
                             ImageIcon collapse = new ImageIcon(this.getClass().getResource("splosion12.png"));
                              g2d.drawImage(collapse.getImage(),  231, 207, this);
                              g2d.drawImage(collapse.getImage(),  131, 277, this);
                               g2d.drawImage(collapse.getImage(),  311, 87, this);
                         
                         }
                         if(phi >= 17 && phi < 34){
                             ImageIcon collapse = new ImageIcon(this.getClass().getResource("splosion14.png"));
                             g2d.drawImage(collapse.getImage(),   231, 197, this);
                             g2d.drawImage(collapse.getImage(),   131, 267, this);
                             g2d.drawImage(collapse.getImage(),   311, 77, this);
                         
                         }
                         if(phi >= 10 && phi < 17 ){
                             ImageIcon collapse = new ImageIcon(this.getClass().getResource("splosion15.png"));
                             g2d.drawImage(collapse.getImage(),   232, 186, this);
                                g2d.drawImage(collapse.getImage(),   132, 256, this);
                                   g2d.drawImage(collapse.getImage(),   312, 66, this);
                         }
                         if(phi >= 0 && phi < 10){
                             ImageIcon collapse = new ImageIcon(this.getClass().getResource("splosion16.png"));
                             g2d.drawImage(collapse.getImage(), 249, 214, this);
                             g2d.drawImage(collapse.getImage(),   149, 284, this);
                             g2d.drawImage(collapse.getImage(),   329, 94, this);
                         
                         }
                         if(phi == 6){
                             legion3[2].activate(200,160);
                             legion3[3].activate(100,230);
                             legion3[4].activate(280,60);
                             legion3[2].unkill();
                             legion3[3].unkill();
                             legion3[4].unkill();
                              
                         }
                    
                }
                for(int i = 2; i < 5; i ++){
                if(legion3[i].getAct()){
            Image prox = legion3[i].findImage();
            g2d.drawImage(prox, legion3[i].getX(), legion3[i].getY(), this);
            
            
            if(legion3[i].getHit()){
                if(legion3[i].getStagger() % 12 <= 5){
                    g2d.drawImage(halo[0], legion3[i].getX()  -118 , legion3[i].getY() - 59, this);
                }
                else{
                   g2d.drawImage(halo[1], legion3[i].getX()  -118, legion3[i].getY()  - 59, this); 
                }
            }
           
            
            
            if(legion3[i].getToss() && !legion3[i].getPhase()){
                Image spear = legion3[i].spearThrow();
                g2d.drawImage(spear, legion3[i].getPx(), legion3[i].getPy() , this);
                 int sx = legion3[i].getPx() + 40;
                int sy = legion3[i].getPy() + 60;
                Rectangle yikes = new Rectangle(sx, sy, 10, 10);
                //g2d.draw(yikes);
               
                
            }
            
               
                }
            
             }
                }
             if(!Rav.getDead()){   
                 transistion1 = true;
                
                 
                 
                 
             }
            }    
            if(transistion1){
                   ImageIcon boom1 = new ImageIcon(this.getClass().getResource("bomb1.png"));
                   ImageIcon boom2 = new ImageIcon(this.getClass().getResource("bomb2.png"));
                   ImageIcon boom3 = new ImageIcon(this.getClass().getResource("bomb3.png"));
                   int bx = Rav.getXpos();
                   int by = Rav.getYpos();
                dark+= 2;
                jimmy4.spin();
                if(dark % 30 > 20){
                    g2d.drawImage(boom1.getImage(), bx + 30, by + 10, this);
                    g2d.drawImage(boom3.getImage(), bx + 170, by + 60, this);
                    g2d.drawImage(boom1.getImage(), bx + 90, by + 160, this);
                    g2d.drawImage(boom2.getImage(), bx + 30, by + 140, this);
                }
                    if(dark % 30 <= 20 && dark % 30 > 10){
                    g2d.drawImage(boom2.getImage(), bx + 50, by + 20, this);
                    g2d.drawImage(boom2.getImage(), bx + 120, by + 110, this);
                    g2d.drawImage(boom3.getImage(), bx + 110, by + 130, this);
                    g2d.drawImage(boom3.getImage(), bx , by + 120, this);
                }
                    if(dark % 30 <= 10){
                    g2d.drawImage(boom3.getImage(), bx + 30, by + 60, this);
                    g2d.drawImage(boom3.getImage(), bx + 170, by + 60, this);
                    g2d.drawImage(boom1.getImage(), bx + 90, by + 160, this);
                    g2d.drawImage(boom2.getImage(), bx + 30, by + 140, this);
                }
                ImageIcon fog = new ImageIcon(this.getClass().getResource("prewhite.png"));
                g2d.setColor(Color.white);
                if(dark > 100 ){
                    g2d.drawImage(fog.getImage(), 0,  310, this);
                }
                if(dark > 250 ){
                    Rectangle blu = new Rectangle(0, 320, 510, 100);
                    g2d.draw(blu);
                    g2d.fill(blu);
                }
                if(dark > 400){
                    
                    g2d.drawImage(fog.getImage(), 0, 230, this);
                }
                if(dark > 550){
                     Rectangle blu = new Rectangle(0, 240, 510, 80);
                    g2d.draw(blu);
                    g2d.fill(blu);
                }
                 if(dark > 700){
                    
                    g2d.drawImage(fog.getImage(), 0, 150, this);
                }
                if(dark > 850){
                    Rectangle blu = new Rectangle(0, 160, 510, 80);
                    g2d.draw(blu);
                    g2d.fill(blu);
                }
                 if(dark > 1000){
                    
                    g2d.drawImage(fog.getImage(), 0, 70, this);
                }
                if(dark > 1150){
                   Rectangle blu = new Rectangle(0, 80, 510, 80);
                   g2d.draw(blu);
                    g2d.fill(blu);
                }
                if(dark > 1300){
                   Rectangle blu = new Rectangle(0, 0, 510, 80);
                   g2d.draw(blu);
                    g2d.fill(blu);
                }
                if(dark > 1900){
                    miniboss = false;
                    part = 4;
                   jimmy4.setpart(4);
                   available = true;
                    jimmy4.swoosh(false);
                    minenum = 0;
                     dark = 0;
                    recent = 0;
                    transistion1 = false;
                    jimmy4.setCam(0, -960);
                    jimmy4.setX(90);
                    jimmy4.setY(310);
                    legion4[0].activate(170, 500);
                    legion4[0].changeStagger(150);
                    legion4[1].activate(300, 350);
                     legion4[1].changeStagger(150);
        
                   // legion4[0].activate(end, dark);
                }
                
            }
            int frameNum = 0;
        int y = jimmy4.getY();
        int base = jimmy4.getBase();
        
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
            if(jimmy4.getDive()){
            divecount++;
            if(divecount <= 5){
                frameNum = 5;
            }
            else if(divecount > 5 && divecount <= 10){
                frameNum = 6;
            }
            else if(divecount > 10 && divecount <= 15){
                frameNum = 7;
            }
            else{
                divecount = 0;
            }
            }
            Image Image = Frames[frameNum].getImage();
        g2d.drawImage(Image, jimmy4.getX(), jimmy4.getY(), null);
        Image barrier2 = jimmy4.getReflect2();
        Image barrier = jimmy4.getReflect();
        g2d.drawImage(barrier, jimmy4.getX() + 3, jimmy4.getY() - 30, this);
        g2d.drawImage(barrier2, jimmy4.getX() - 12, jimmy4.getY() - 30, this);
          Image head = lives.getImage();
        for (int i = 0; i < jimmy4.getLives(); i++) {
            g2d.drawImage( head , 10 +(30 * i), 10, null);
        }
        if(shield){
            ImageIcon fresh = new ImageIcon(this.getClass().getResource("shieldIcon.png"));
            g2d.drawImage(fresh.getImage(), 130 , 10,  null);
        }
        
          //  Rectangle[] Platforms = platforms4.getPlatforms();
           
            //for(int i = begin; i < end; i++){
              //  g2d.drawRect(Platforms[i].x, Platforms[i].y, Platforms[i].width, Platforms[i].height);
           // }
        ImageIcon nimbus[] = new ImageIcon[2];
           nimbus[0] = new ImageIcon(this.getClass().getResource("nimbus.png"));
           nimbus[1] = new ImageIcon(this.getClass().getResource("nimbus2.png"));
           dark++;
           if(dark % 40 > 20){
          g2d.drawImage(nimbus[0].getImage(), 100 + shift, 240 + yshift, this);
           }
           else{
               g2d.drawImage(nimbus[1].getImage(), 80 + shift, 240 + yshift, this);
               
           }
            
            
            
            
        }
        if(jimmy4.getLives() < 0){
            ImageIcon temp = new ImageIcon(this.getClass().getResource("GameOver.png"));
            g2d.drawImage(temp.getImage(), 0, -100, this);
            jimmy4.setX(0);
            jimmy4.setY(0);
            lost = true;
             timer4.stop();
           this.removeKeyListener(keys);
        }
        if(toomuch > 24){
            ImageIcon fin = new ImageIcon(this.getClass().getResource("Finish.png"));
            g2d.drawImage(fin.getImage(), 0, -100, this);
        }
        Toolkit.getDefaultToolkit().sync();
            g.dispose();
    }
    @ Override public void actionPerformed(ActionEvent e) {
        if(!opening && !transistion1 && !smooth){
        jimmy4.move();
       
        }
        if(downgrade){
            vulnerable--;
            if(vulnerable <= 0){
             shield = false;
             downgrade = false;
                
            }
        }
        if(cloudmode && part == 2){
             jimmy4.jumpChange(220 + jimmy4.getCammy());
             jimmy4.setX(jimmy4.getX() + 1);
              shift++;
             
        }
        
        if(part == 3 && gauntlet < 15){
             for(int i = 0; i < 2; i++){
          if(legion3[i].getAct()){
         legion3[i].AI();
         legion3[i].spearpath();
         legion3[i].sinch(jimmy4.getY());
          }
          }
        }
        if(part == 3 && gauntlet >= 15){
             for(int i = 2; i < 5; i++){
          if(legion3[i].getAct()){
         legion3[i].AI();
         legion3[i].spearpath();
         legion3[i].sinch(jimmy4.getY());
          }
          }
        }
        if(cloudmode && part == 3 && !miniboss){
         
        jimmy4.setDx2(1);
    }
        if(miniboss){
            if(!transistion1){
            Rav.AI(jimmy4.getX(), jimmy4.getY());
            }
            if(Rav.getC()){
             opening = true;
             jimmy4.setX(jimmy4.getX() - 1);
            }
            if(Rav.getC() && jimmy4.getX() < 100){
                opening = false;
                Rav.setAxis(0, 0);
                Rav.setC(false);
            }
            jimmy4.setDx2(0);
            
            if(dark % 2 == 0 && Rav.getDead()){
                jimmy4.setCam(jimmy4.getCamx() - 1, jimmy4.getCammy());
            }
        }
        else if(!cloudmode && part == 3){
           if(dark % 2 == 0){
            shift++;
           }
           if(gauntlet >= 15){
               shift++;
           }
           if(!miniboss){
           jimmy4.setDx2(1);
          
           }
        }
         jimmy4.Cykle();
        
         if(part == 1){
          for(int i = 0; i < 5; i++){
          if(legion1[i].getAct()){
         legion1[i].AI();
         legion1[i].spearpath();
         legion1[i].sinch(jimmy4.getY());
          }
          }
         }
         if(part == 2){
            for (Unicorn U21 : U2) {
                U21.UniAI();
            }
             for(int i = 0; i < 2; i++){
          if(legion2[i].getAct()){
         legion2[i].AI();
         legion2[i].spearpath();
         legion2[i].sinch(jimmy4.getY());
          }
          }
            for (Robot robot : robots) {
                robot.robotAI();
                if (robot.getDie()) {
                    robot.Recarn();
                }
            }
             
         }
         if(part == 4){
             for(int i = 0; i < 6; i++){
          if(legion4[i].getAct()){
         legion4[i].AI();
         legion4[i].spearpath();
         legion4[i].sinch(jimmy4.getY());
          }
          }
             if(finalboss){
                 G.FSMai();
             }
         }
         
       
         checkCollision();
         if(timebonus > 0){
             timebonus--;
         }
         repaint();
        
    }
     @Override public Rectangle getBounds() {
        int y = jimmy4.getY();
        int x = jimmy4.getX();
        return new Rectangle(x, y, 48, 57);
    }
     public int getScore(){
         return finalscore;
     }
     
     
     public void checkCollision() {
         Rectangle player = getBounds();
         int Xmidpoint = (player.x + 24);
        int playerBottom = player.y + 54;
 Rectangle bottom = new Rectangle(player.x + 15 , playerBottom,player.width - 30, 1);
         Rectangle Lbar = new Rectangle(player.x + 20, player.y + 2, 1, 50);
          Rectangle Rbar = new Rectangle(player.x + 24, player.y + 2, 1, 50);
          if(part != 3){
         platforms4.setCam(jimmy4.getCamx(), jimmy4.getCammy());
          }
          else if(gauntlet < 15){
              platforms4.setCam( jimmy4.getCamx() + xpos, ypos);
          }
          else{
              platforms4.setCam(jimmy4.getCamx(), jimmy4.getCammy());
          }
         platforms4.setPortion(part);
         Rectangle[] platforms = platforms4.getPlatforms();
          begin = 0;
          end = 1;
         if(part  == 2){
             begin = 0;
             end = platforms.length;
         }
         if ( part == 3 && gauntlet < 15){
             end = 21;
         }
         if ( part == 3 && gauntlet >= 15){
             begin = 22;
             end = 66;
              Rectangle power = new Rectangle( 2200 + jimmy4.getCamx(), 100 + jimmy4.getCammy(), 50, 50);
              if(available && player.intersects(power)){
                  shield = true;
                  vulnerable = 200;
                  available = false;
                  reboot = 3000;
                  
              }
              if(reboot > 0){
                  reboot--;
                  if (reboot < 10){
                      reboot = 0;
                      available = true;
                  }
              }
         }
            if(part == 3 && !miniboss && sector.matches("all")){
                begin = 13;
            }
            if(part == 3 && !miniboss && sector.matches("cosine")){
                begin = 17;
            }
            if(part == 4){
                end = 26;
            }
          for(int i = begin; i < end; i++) 
            {
               Rectangle temp = platforms[i];
               if( part != 4 || (part == 4 && i != 24) || (part == 4 && i == 24 && finalboss && G.getRise())){
                if(player.intersects(platforms[i]) && landing) {
                            jimmy4.setDy(0);
                            landing = false;
                            space = false;
                            
                        }
                
                if(bottom.intersects(temp) && temp.height <= 20) 
                {
                    jimmy4.jumpChange(temp.y);
                    jimmy4.diveEnd();
                    recent = i;
                    jimmy4.setDy2(1);
                    down = false;
                    space = false;
            Enemybounce = false;
            freeFall = false;
            if(part == 3){
                cloudmode = false;
                if(!miniboss){
                jimmy4.setDx2(1);
                }
                
            }
                if(part == 4 && !finalboss){
                    dash = false;
                    dashcount = 0;
                }
                if(part == 4 && finalfall){
                            finalfall = false;
                            space = false;
                            jimmy4.setDy(0);
                            
                        }
            }
                
                else if ( temp.height > 20) {
                        if (bottom.intersects(temp.getX(), temp.getY(), temp.getWidth(), 5)) {
                             jimmy4.jumpChange(temp.y);
                             jimmy4.diveEnd();
                             recent = i;
                             space = false;
                             jimmy4.setDy2(1);
                    down = false;
                    Enemybounce = false;
                    freeFall = false;
                    if(part == 3){
                cloudmode = false;
                if(!miniboss){
                jimmy4.setDx2(1);
                }
            }
                    if(part == 4 && finalfall){
                            finalfall = false;
                            jimmy4.setDy(0);
                        }
                        }
                        if(part == 4 && recent == 20){
                            transistion1 = false;
                        }
                        
                         if(part == 2 && recent == 3) {
                             laserfire = true;
                         }
                         if(jimmy4.getCamx() < -1720 && !smooth && part == 2 && recent <= 11 && recent > 9){
                                 jimmy4.setCam(jimmy4.getCamx() + 1, jimmy4.getCammy());
                                 
                             }
                         if(part == 2 && recent == 11){
                             laserfire = false;
                             if(jimmy4.getCamx() < -1703 && !smooth){
                                 jimmy4.setCam(-1701, jimmy4.getCammy());
                             }
                             if(jimmy4.getX() > 480){
                                 smooth = true;
                                 dark = 370;
                             }
                         }
                         if(Rbar.intersects(temp)){
                            jimmy4.setX(jimmy4.getX() - 1);
                            jimmy4.setCam(jimmy4.getCamx() + 1, jimmy4.getCammy());
                            
                        }
                        else if(Lbar.intersects(temp)){
                             jimmy4.setX(jimmy4.getX() + 1);
                        }
                          if (bounced) {
                      bounced = false;
                      jimmy4.setDy(0);
                      jimmy4.setDy2(1);
                      freeFall = false;
                  }
                       
                        
                }
            }
            }
           int xcoord = platforms[recent].x;
             int range = xcoord + platforms[recent].width + 15;
              //System.out.println(recent);
             if (Xmidpoint > range || Xmidpoint < xcoord && !smooth) {
                 if(part == 3 && !miniboss && cloudmode){
                     
                 }
                 else{
                 jimmy4.jumpRevert();
                 jimmy4.jumpRevert();
                 }
                
                 if(jimmy4.getY() - platforms[recent].y > 45 && !finalfall) {
                     jimmy4.setDy2(2);
                     jimmy4.diveEnd();
                    
                 } 
                  freeFall = true;
                 down = true;
                 jimmy4.setDy(0);
               
             }
               if (jimmy4.getY() > 290 && freeFall && part != 3) {
                     jimmy4.setDy(2);
                     jimmy4.setDy2(0);
                     jimmy4.diveEnd();
                     bounced = true;
                     if(part == 2 && !smooth  && jimmy4.getCammy() < -80){
                         jimmy4.setDy(0);
                     jimmy4.setDy2(2);
                     }
                     else if(part == 2 && smooth && jimmy4.getCammy() < -820){
                       jimmy4.setDy(0);
                     jimmy4.setDy2(2);
                 }
               }
               if (jimmy4.getY() > 280 && finalfall ) {
                     jimmy4.setDy(3);
                      jimmy4.setX(180);
                    jimmy4.setCam(-680, jimmy4.getCammy());
                     jimmy4.setDy2(0);
                     jimmy4.diveEnd();
                     
                 }
     
                 if(jimmy4.getDive() && !transistion1){
                   jimmy4.setDy2(2);
                   if(finalboss){
                           jimmy4.setDy2(3);
                           }
               }
                  if (recent == 17 && part == 2 && jimmy4.getCammy() < -760  && !down ) {
                   jimmy4.setDy(-1);
                   jimmy4.setDy2(2);
               }
                  else if (recent == 17 && part == 2 && jimmy4.getCammy() >= -760  && !down ) {
                   jimmy4.setDy(0);
                   jimmy4.setDy2(1);
               }
                   if (recent == 18 && part == 2 && jimmy4.getCammy() < -680  && !down ) {
                   jimmy4.setDy(-1);
                   jimmy4.setDy2(2);
               } 
                   else if (recent == 18 && part == 2 && jimmy4.getCammy() >= -680  && !down ) {
                   jimmy4.setDy(0);
                   jimmy4.setDy2(1);
               }
                      if (recent == 19 && part == 2 && jimmy4.getCammy() < -600  && !down ) {
                   jimmy4.setDy(-1);
                   jimmy4.setDy2(2);
               } 
                   else if (recent == 19 && part == 2 && jimmy4.getCammy() >= -600  && !down ) {
                   jimmy4.setDy(0);
                   jimmy4.setDy2(1);
               }
                   if (recent == 29 && part == 2 && jimmy4.getCammy() < -360  && !down ) {
                   jimmy4.setDy(-1);
                   jimmy4.setDy2(2);
               }
                   else if (recent == 29 && part == 2 && jimmy4.getCammy() >= -360  && !down ) {
                   jimmy4.setDy(0);
                   jimmy4.setDy2(1);
               }
                   else if( part == 2 && recent == 29 && down){
                       jimmy4.setDy(2);
                   jimmy4.setDy2(0);
                   }
                     
               if(part == 1){
                   int nod = 0;
                   for(int i = 0; i < 5; i++){
                       if(legion1[i].getDead()){
                           nod++;
                       }
                       if(legion1[i].getAct() && !legion1[i].getPhase()){
               legion1[i].spotted(jimmy4.getX());
               if(legion1[i].getSpot()){
                   legion1[i].targetAquired(jimmy4.getX(), jimmy4.getY());
                   legion1[i].setLaunch(true);
              
               }
                       }
                       if(legion1[i].getAct()){
                           if(bottom.intersects(legion1[i].getBody()) && !legion1[i].getHit()){
                                if(jimmy4.getDive()){
                                   legion1[i].damage(1);
                               }
                                else{
                               legion1[i].damage(0);
                                }
                              
                               jimmy4.jumpChange(legion1[i].getBody().y + 40);
                               jimmy4.setTop(20);
                               Enemybounce = true;
                               if(legion1[i].getDead()){
                                   legion1[i].kill();
                                   onscreen--;
                               }
                           }
                           if(legion1[i].getDead()){
                                   legion1[i].kill();
                                 
                               }
                          
                           Rectangle sample = getBounds();
                     Rectangle Targ = new Rectangle(sample.x + 17, sample.y + 30, 4, 20);   
                     
                if(legion1[i].getToss() && !legion1[i].getPhase()){
                int sx = legion1[i].getPx() + 40;
                int sy = legion1[i].getPy() + 60;
                Rectangle yikes = new Rectangle(sx, sy, 10, 10);
                if(Targ.intersects(yikes)){
                    Die();
                  //  System.out.println("Darts!");
                }
                }
                           
                           if(Targ.intersects(legion1[i].getSpear()) && legion1[i].fnum() == 7){
                               
                               Die();
                              // System.out.println("You poked me wit your spear!");
                           }
                       }
               }
                   frame1kills = nod;
               }
               if( part == 3 && gauntlet < 15){
                   Rectangle boost = new Rectangle(1393 + jimmy4.getCamx() + xpos + 674, 379 + ypos , 60 , 10);
                   if(player.intersects(boost)){
                       launch = true;
                       dash = true;
                       jimmy4.jumpChange(player.y - 15);
                       jimmy4.setTop(90);
                       
                   }
               }
               if( jimmy4.getY() > 600){
               jimmy4.setLives(-1);
               lifebonus -= 400;

          if(part == 2){
               
                     jimmy4.setX(27);
                     jimmy4.setY(270);
                     jimmy4.setCam(0, -50);
                      jimmy4.setpart(2);
                      smooth = false;
                      dark = 0;
                      transistion1 = false;
          }
          if(part == 3){
              miniboss  = false;
              gauntlet = 0;
                  recent = 0;
                  edge = true;
                  shift = 0;
                  dark = 0;
                  jimmy4.setCam(0, 0);
                  jimmy4.setX(130);
                  jimmy4.setY(200);
                  //jimmy4.setTop(-40);
                  jimmy4.jumpChange(210);
                  jimmy4.setpart(1);
          }
          if(part == 4){
              miniboss = false;
                   jimmy4.setpart(4);
                    jimmy4.swoosh(false);
                    jimmy4.setDy2(2);
                     dark = 0;
                     redshift = 0;
                    recent = 0;
                    transistion1 = false;
                    jimmy4.setCam(0, -950);
                    jimmy4.setX(90);
                    jimmy4.setY(260);
                     legion4[0] = new pastaAngel(1, false);
                     legion4[1] = new pastaAngel(1, false);
                    legion4[0].activate(170, 500);
                    legion4[0].changeStagger(150);
                    legion4[1].activate(300, 350);
                     legion4[1].changeStagger(150);
        
              
          }
               }
               if(part == 3){
                    Rectangle sample = getBounds();
                     Rectangle Targ = new Rectangle(sample.x + 17, sample.y + 30, 4, 20);    
                   for(int i = 0; i < 12; i++){
                       if(gauntlet >= 15){
                           if( i != 5 && i != 6 && spikeballs[i].intersects(Targ)){
                                  Die();
                                 // System.out.println("you got spiked");
                           }
                       }
                   }
                   if(miniboss){
                    if(Rav.getMove() == 1 && Targ.intersects(Rav.getBite())){
                        
                        Die();
                      ///  System.out.println("Bitey");
                        
                        
                    }
                    if( Rav.getWait() > 400 && minenum > 0 ){
                        for(int m = 0; m < 3; m++){
                           
                            if(swarm[m].getCollide().intersects(getBounds()) && !jimmy4.counter()){
                               Die();
                             //   System.out.println("minesplosion!");
                            }
                            
                        }
  
                    }
                    if(Rav.getMove() == 3 && Rav.getSite() && Rav.getWait() > 100){
                        if(Rav.getBite().y - 5 < Targ.y && Rav.getBite().y + 7 > Targ.y){
                            Die();
                           // System.out.println("CHOMP!");
                        }
                    }
                   }
               }
               
               if(part == 2){
                   dashP2[0] = new Rectangle(260 + jimmy4.getCamx(), 290 + jimmy4.getCammy(), 10, 7);
                   dashP2[1] = new Rectangle(2342 + jimmy4.getCamx(), 850 + jimmy4.getCammy(), 30, 7);
                    dashP2[2] = new Rectangle(2880 + jimmy4.getCamx(), 517 + jimmy4.getCammy(), 5, 7);
                     for(int i = 0; i < dashP2.length; i++) {
                       if(player.intersects(dashP2[i]) && space) {
                          dash = true;
                           dashflash = 1 + i;
                           jimmy4.setDy(-2);
                           jimmy4.setDy2(0);
                           space = false;
                           jimmy4.jumpChange(player.y - 5);
                           if( i == 2){
                               recent = 12;
                               jimmy4.jumpChange(player.y - 40);
                               uber = true;
                               jimmy4.setTop(120);
                              
                              
                           }
                       }
                           
                   }
                   if(dash) {
                       dashcount++;
                       if (dashcount > 130) {
                           jimmy4.setDy(1);
                           jimmy4.setDy2(1);
                           jimmy4.setBase(500);
                           dash = false;
                           landing = true;
                           freeFall = true;
                           dashflash = 0;
                           dashcount = 0;
                           
                       }
                       
                   }
                   Rectangle powerup = new Rectangle(680 + jimmy4.getCamx(), 154 + jimmy4.getCammy(), 39, 42);
                   if(available && powerup.intersects(getBounds())){
                       shield = true;
                       vulnerable = 200;
                       available = false;
                   }
                   
                   for(int i = 0; i < 2; i++){
                       legion2[i].setCam(jimmy4.getCamx(), jimmy4.getCammy());
                     //  if(legion2[i].getAct() && !legion2[i].getLaunch()){
              // legion2[i].spotted(jimmy4.getX());
              // if(legion2[i].getToss()){
                 
                  // legion2[i].setLaunch(true);
             //  }
                     //  }
                       
                       if(legion2[i].getAct()){
                           if(bottom.intersects(legion2[i].getBody()) && !legion2[i].getHit()){
                                if(jimmy4.getDive()){
                                   legion2[i].damage(1);
                               }
                                else{
                               legion2[i].damage(0);
                                }
                              
                               jimmy4.jumpChange(legion2[i].getBody().y + 40);
                               jimmy4.setTop(20);
                               Enemybounce = true;
                               if(legion2[i].getDead()){
                                   legion2[i].kill();
                                
                               }
                           }
                           if(legion2[i].getSpot()){
                                 legion2[i].targetAquired(jimmy4.getX(), jimmy4.getY());
                           }
                           if(legion2[i].getDead()){
                                   legion2[i].kill();
                                 
                               }
                            middle = new Rectangle(jimmy4.getX() + 8, jimmy4.getY() + 3, 9, 40);
               
                            if(legion2[i].getToss() && !legion2[i].getPhase()){
                            int sx = legion2[i].getPx() + 40;
                          int sy = legion2[i].getPy() + 60;
                          Rectangle yikes = new Rectangle(sx, sy, 10, 10);
                          if(middle.intersects(yikes)){
                           Die();
                         // System.out.println("Darts!");
                            }
                            }
                            
                           if(middle.intersects(legion2[i].getSpear()) && legion2[i].fnum() == 7){
                               Die();
                              //  System.out.println("You poked me wit your spear!");
                           }
                       }
                   }
                   
                   
                   
                   
                   
            
                   for(int i = 0; i < robots.length; i++) {
             int k = i;
       boolean dedRob = robots[k].getDie();
       if(!dedRob) {
          Rectangle murder = new Rectangle(robots[k].getXy() + jimmy4.getCamx() + 5, robots[k].getY() + jimmy4.getCammy() + 5, 30, 10);
          Rectangle Yodeth = new Rectangle(robots[k].getXy() + 10 + jimmy4.getCamx(), robots[k].getY() + jimmy4.getCammy()  + 30, 20, 20);
          boolean dead = false;
          if(bottom.intersects(Yodeth) ) {
          boolean skip = false;
     
         
           Die();
           // System.out.println("Robocide");
       
          
      
          }
          if(bottom.intersects(murder) && !dead) {
             jimmy4.jumpChange(murder.y - 10);
                     jimmy4.setTop(10);
                    Enemybounce = true;
                    robots[k].die( murder.y - bottom.y);
          
          
          }
               
               
       }
        
        }
                          
                
                   
                   
                  
             for (Unicorn U21 : U2) {
                 boolean uniKill = U21.getDie();
                 if (!uniKill) {
                     Rectangle murder = new Rectangle(U21.getX() + jimmy4.getCamx(), U21.getY() + jimmy4.getCammy() + 30, 90, 5);
                     Rectangle youlose = new Rectangle(U21.getX() + 5 + jimmy4.getCamx(), U21.getY() + 7 + jimmy4.getCammy() + 30, 80, 12);
                     if (U21.getShot()) {
                         Rectangle blast = U21.getLaser();
                         middle = new Rectangle(jimmy4.getX() + 8, jimmy4.getY() + 3, 9, 40);
                         if (jimmy4.getKount() > 0) {
                             Rectangle barrier1 = new Rectangle(jimmy4.getX() - 12, jimmy4.getY() - 3, 20, 60);
                             Rectangle barrier2 = new Rectangle(jimmy4.getX() + 17, jimmy4.getY() - 3, 20, 60);
                             if (blast.intersects(barrier1) || blast.intersects(barrier2)) {
                                 deflect = true;
                                 U21.setDeflect(deflect);
                             }
                         } else if(blast.intersects(middle) && !cloudmode ) {
                             
                             
                             
                             Die();
                             //   System.out.println("Fried by a uni");
                             
                             
                             
                             
                             
                         }        }
                     if (bottom.intersects(murder)) {
                         jimmy4.jumpChange(murder.y - 10);
                         jimmy4.setTop(10);
                         Enemybounce = true;
                         if (jimmy4.getDive()) {
                             U21.die(0);
                         }
                         U21.die(murder.y - bottom.y);
                         recent = 0;
                     } else if(bottom.intersects(youlose) ) {
                         boolean skip = false;
                         
                         
                         
                         Die();
                //  System.out.println("trampled by a uni");
            
                
               
                
            }    }
             }
                   
                   
               
                  
                       if(uber){
                           jimmy4.setDy(-2);
                           jimmy4.setDy2(1);
                       }
                       if(uber && jimmy4.getCammy() >= -100){
                           jimmy4.setDy(0);
                           uber = false;
                           Enemybounce = true;
                       }
                       if(recent == 31 ){
                           Rectangle cloudy = new Rectangle(3040 + jimmy4.getCamx() + shift, 260 + jimmy4.getCammy(), 120, 3);
                           if(bottom.intersects(cloudy)){
                               cloudmode = true;
                              
                           }
                       }
                   }
               
               if(part == 3){
                   Rectangle ride = new Rectangle(100 + shift, 270 + yshift, 80, 4);
                   if(bottom.intersects(ride) && (gauntlet < 15 || recent == 0)){
                       recent = 0;
                       cloudmode = true;
                       jimmy4.swoosh(false);
                       jimmy4.notOnce();
                       jimmy4.jumpChange(270 + yshift);
                    jimmy4.diveEnd();
                    jimmy4.setDy2(1);
                    down = false;
            Enemybounce = false;
                   }
                
                      
                   
                   if(cloudmode && shift > 0){
                       shift-= 1;
                       jimmy4.setX(jimmy4.getX() - 1);
                       jimmy4.setDx2(2);
                   }
                   if(cloudmode && sector.matches("sine") &&  jimmy4.getCamx() < -530 && jimmy4.getCamx() > -1100){
                       if(yshift < 70 && jimmy4.getCamx() > -870){
                           yshift+= 2;
                       }
                       else if(jimmy4.getCamx() < -830 && yshift > -200){
                           yshift -= 1;
                       }
                       legion3[0].changeBlock(false);
                   }
                   else if(cloudmode && sector.matches("all") &&  jimmy4.getCamx() < -740 && jimmy4.getCamx() > -1100){
                       if(yshift > -65 && jimmy4.getCamx() > -950){
                           yshift-= 1;
                       }
                       legion3[0].changeBlock(true);
                   }
                   else if(cloudmode && sector.matches("tangent")  &&  jimmy4.getCamx() < -740 && jimmy4.getCamx() > -1100){
                       if(yshift < 70 && jimmy4.getCamx() > -950){
                           yshift+= 2;
                       }
                         legion3[0].changeBlock(false);
                   }
                   else if(cloudmode && sector.matches("cosinge") &&  jimmy4.getCamx() < -740 && jimmy4.getCamx() > -1100){
                       if(yshift < -130 && jimmy4.getCamx() < -950){
                           yshift += 2;
                       } 
                       legion3[0].changeBlock(true);
                   
                   }
                   else if(jimmy4.getCamx() < -1280){
                       if(yshift > 0){
                           yshift -= 1;
                       }
                       if(yshift < 0){
                           yshift += 1;
                       }
                       
                   }
                   
                   if(Xmidpoint < 60 + shift || Xmidpoint > 180 + shift ){
                       cloudmode = false;
                       if(!miniboss){
                       jimmy4.jumpRevert();
                       jimmy4.jumpRevert();
                       }
                       jimmy4.swoosh(true);
                       
                      
                   }
                  int res = 0;
                       
                       for(int i = 0; i < 5; i++){
                           if(i < 2){
                       legion3[i].setCam(jimmy4.getCamx(), jimmy4.getCammy());
                           }
                           if( i >= 2 && legion3[i].getDead() && !legion3[i].getAct()){
                               res++;
                           }
                       if(legion3[i].getAct() ){
               legion3[i].spotted(jimmy4.getX());
               if(legion3[i].getSpot()){
                   legion3[i].targetAquired(jimmy4.getX(), jimmy4.getY());
                   legion3[i].setLaunch(true);
               }
                       }
                       Rectangle awesomo = new Rectangle(legion3[i].getX() + 45 + xpos, legion3[i].getY() + 70 + ypos, 60, 60);
                       if(legion3[i].getAct()){
                           if( (i >= 2 && bottom.intersects(legion3[i].getBody()) && !legion3[i].getHit()) || (i < 2 && bottom.intersects(awesomo) && !legion3[i].getHit()) ){
                                if(jimmy4.getDive()){
                                   legion3[i].damage(1);
                               }
                                else{
                               legion3[i].damage(0);
                                }
                              
                               jimmy4.jumpChange(legion3[i].getBody().y + 40);
                               jimmy4.setTop(20);
                               Enemybounce = true;
                               if(legion3[i].getDead()){
                                   legion3[i].kill();
                                  
                               }
                           }
                           if(legion3[i].getDead()){
                                   legion3[i].kill();
                                 
                               }
                           middle = new Rectangle(jimmy4.getX() + 8, jimmy4.getY() + 3, 9, 40);
                            if(legion3[i].getToss() && !legion3[i].getPhase()){
                      int sx = legion3[i].getPx() + 40;
                  int sy = legion3[i].getPy() + 60;
                  Rectangle yikes = new Rectangle(sx, sy, 10, 10);
                     if(middle.intersects(yikes)){
                      Die();
                    //  System.out.println("Darts!");
                         }
                        }
                           
                           
                               Rectangle sub = new Rectangle(legion3[i].getX() + 20 + xpos, legion3[i].getY() + ypos + 81, 8, 8);
                           if(middle.intersects(sub) && legion3[i].fnum() == 7){
                               Die();
                              //  System.out.println("You poked me wit your spear!");
                           }
                       }
                       }
                       if(res >= 3 && miniboss){
                           Rav.noid();
                       }
                   
                   
               }
                 
               if(part == 4){
                   if(!finalboss){
               dark++;
               
               if(jimmy4.getX() < 2){
                   jimmy4.setX(jimmy4.getX() + 1);
               }
               if( jimmy4.getX() > 485){
                   jimmy4.setX(jimmy4.getX() - 1);
               }
               if(!finalfall){
               jimmy4.setDy2(2);
               }
                   if(dark > 800 && jimmy4.getCammy() < -5 && dark % 3 == 0 && recent != 20 ){
                        jimmy4.setCam(jimmy4.getCamx(), jimmy4.getCammy() + 1);
                    }
                  
                   if(jimmy4.getCammy() >=  -5){
                       if(dark % 2 == 0){
                           redshift--;
                       }
                       
                   }
               
                   
                   
                   
                   Rectangle jumpPad = new Rectangle(jimmy4.getCamx() + 420, jimmy4.getCammy() + 960, 40, 15);
                 if(bottom.intersects(jumpPad) && space){
                     jimmy4.jumpChange(jumpPad.y);
                     jimmy4.setTop(90);
                     dash = true;
                     dashflash = 1;
                     space = false;
                 }
               
                  for(int i = 0; i < 2; i++){
                       legion4[i].setCam(jimmy4.getCamx(), jimmy4.getCammy());
                       if(legion4[i].getAct()){
               legion4[i].spotted(jimmy4.getX());
               if(legion4[i].getSpot()){
                   legion4[i].targetAquired(jimmy4.getX(), jimmy4.getY());
                   legion4[i].setLaunch(true);
                   
               }
                       }
                       if(legion4[i].getAct()){
                           if(bottom.intersects(legion4[i].getBody()) && !legion4[i].getHit()){
                                if(jimmy4.getDive()){
                                   legion4[i].damage(1);
                               }
                                else{
                               legion4[i].damage(0);
                                }
                              
                               jimmy4.jumpChange(legion4[i].getBody().y + 40);
                               jimmy4.setTop(30);
                               Enemybounce = true;
                               if(legion4[i].getDead()){
                                   legion4[i].kill();
                                
                               }
                           }
                           if(legion4[i].getDead()){
                                   legion4[i].kill();
                                 
                               }
                           
                           middle = new Rectangle(jimmy4.getX() + 8, jimmy4.getY() + 3, 9, 40);
                             
                            if(legion4[i].getToss() && !legion4[i].getPhase()){
                            int sx = legion4[i].getPx() + 40;
                            int sy = legion4[i].getPy() + 60;
                            Rectangle yikes = new Rectangle(sx, sy, 10, 10);
                           if(middle.intersects(yikes)){
                             Die();
                         // System.out.println("Darts!");
                          }
                            }
                           
                           
                           if(middle.intersects(legion4[i].getSpear()) && legion4[i].fnum() == 7){
                               Die();
                               // System.out.println("You poked me wit your spear!");
                           }
                       }
                   }
                 
                  if(jimmy4.getCammy() >= -5 && jimmy4.getY() < 100 && jimmy4.getCamx() + jimmy4.getX() < 180 && recent == 19)
                  {
                   jimmy4.setX(190);
                   jimmy4.setCam(-680, jimmy4.getCammy());
                   jimmy4.Finale();
                     dashflash = 0;
                     redshift = 0;        
                   finalfall = true;
                   dark = 0;
                   
                  
                   }
                   
                   }
                // if(finalboss && jimmy4.getCammy() < -400 && recent != 20){
                  // jimmy4.setDy(4);
                 //}
                 if(finalboss){
                     if(bottom.intersects(G.getHit(jimmy4.getCamx(), jimmy4.getCammy())) && jimmy4.getDive()){
                        
                         G.Damage();
                         
                     }
                     
                      if(G.getIdle()  && !G.getHurt() && getBounds().intersects(G.getSnack(jimmy4.getCamx(), jimmy4.getCammy()))){
                         munch = true;
                     }
                    else{
                        munch = false;
                    }
                     
                      if(  G.getRise()){
                       
                        Rectangle protection = new Rectangle(900 + jimmy4.getCamx(), 1040 + jimmy4.getCammy(), 80, 150);
                        if(bottom.intersects(protection)){
                            available = false;
                            shield = true;
                            vulnerable = 200;
                            
                        }
                        
                       
                       
                   }
                    
                     Rectangle pele = new Rectangle(575 + jimmy4.getCamx(), 0 + jimmy4.getCammy(), 65, 1359);
                     if(Lbar.intersects( pele)){
                     jimmy4.setX(jimmy4.getX() + 2);
                 }
                     
                     Rectangle safe1 = new Rectangle(jimmy4.getCamx() + 710, jimmy4.getCammy() + 1290, 60, 55);
                      Rectangle safe2 = new Rectangle(jimmy4.getCamx() + 1160, jimmy4.getCammy() + 1290, 60, 55);
                     if(bottom.intersects(safe1) && space){
                         dashflash = 1;
                         jimmy4.jumpChange(safe1.y);
                         jimmy4.setTop(260);
                         jimmy4.setDy2(2);
                         space = false;
                         if(G.getK()){
                             if(finalscore == 0){
                                 finalscore = timebonus + lifebonus + 10000;
                             }
                         jimmy4.setTop(600);
                         over = true;
                         jimmy4.Omega();
                         G.Finishem();
                         jimmy4.setDy2(1);
                         jimmy4.setDy(-4);
                         L = true;
                     }
                     
                         
                     }
                     if(bottom.intersects(safe2) && space){
                         dashflash = 2;
                         jimmy4.jumpChange(safe2.y);
                         jimmy4.setTop(260);
                         jimmy4.setDy2(2);
                         if(G.getK()){
                         jimmy4.setTop(600);
                         over = true;
                         G.Finishem();
                         jimmy4.setDy(-4);
                          jimmy4.setDy2(1);
                          
                     }
                         space = false;
                         
                     }
                     
                     if(over && !G.getRei()){
                         dark++;
                         jimmy4.setDy(-4);
                         
                         jimmy4.setDy2(2);
                         
                         
                         if(jimmy4.getY() <  70){
                             jimmy4.setDy2(0);
                         }
                         
                         
                         if( jimmy4.getCammy()  > -500){
                         jimmy4.setDy(-3);
                         }
                         if( jimmy4.getCammy() >  -200){
                         jimmy4.setDy(-2);
                         }
                         Rectangle target = new Rectangle(G.getX()  + jimmy4.getCamx() + 150, 7, 40, 30);
                         if(jimmy4.getX() < target.x + 9){
                             jimmy4.setX(jimmy4.getX() + 1);
                             jimmy4.setCam(jimmy4.getCamx() - 1, jimmy4.getCammy());
                          
                         }
                         else if(jimmy4.getX() > target.x + 17){
                             jimmy4.setX(jimmy4.getX() - 1);
                               jimmy4.setCam(jimmy4.getCamx() + 1, jimmy4.getCammy());
                         }
                         
                         if(jimmy4.getCammy() > -70){
                             jimmy4.spin();
                         }
                     }
                     if(over && jimmy4.getDive() && !G.getRei()){
                         jimmy4.setDy(2);
                         if(jimmy4.getCammy() < -170 && jimmy4.getCammy() >= -280){
                         jimmy4.setDy(3);
                         }
                         if(jimmy4.getCammy() < -280 && jimmy4.getCammy() >= -340){
                         jimmy4.setDy(3);
                          finisher.alter();
                          
                         }
                        
                          jimmy4.setBase(1000);
                          jimmy4.setDy2(0);
                         if(jimmy4.getCammy()  < -340 && jimmy4.getCammy() >= -750){
                              jimmy4.setDy(2);  
                            if(jimmy4.getCammy() < -420 && dark % 6 > 2){
                                  jimmy4.setDy(1);  
                              }
                         }
                         
                        if(jimmy4.getCammy() < -750 ){
                            
                            jimmy4.setDy(0); 
                        }
                         
                     }
                     
                     
                     for(int i = 2; i < 6; i++){
                       legion4[i].setCam(jimmy4.getCamx(), jimmy4.getCammy());
                       if(legion4[i].getAct()  && !G.getK()){
               legion4[i].spotted(jimmy4.getX());
               if(legion4[i].getSpot()){
                   legion4[i].targetAquired(jimmy4.getX(), jimmy4.getY());
                   legion4[i].setLaunch(true);
                       }
                       }
                       if(legion4[i].getAct() && !G.getK()){
                           if(bottom.intersects(legion4[i].getBody()) && !legion4[i].getHit()){
                                if(jimmy4.getDive()){
                                   legion4[i].damage(1);
                               }
                                else{
                               legion4[i].damage(0);
                                }
                              
                               jimmy4.jumpChange(legion4[i].getBody().y + 40);
                               jimmy4.setTop(30);
                               Enemybounce = true;
                               if(legion4[i].getDead()){
                                    G.vanquish();
                                   legion4[i].kill();
                                    
                                
                               }
                           }
                           if(legion4[i].getDead()){
                                G.vanquish();
                                   legion4[i].kill();
                                
                               }
                            middle = new Rectangle(jimmy4.getX() + 8, jimmy4.getY() + 3, 9, 40);
                              if(legion4[i].getToss() && !legion4[i].getPhase()){
                int sx = legion4[i].getPx() + 40;
                int sy = legion4[i].getPy() + 60;
                Rectangle yikes = new Rectangle(sx, sy, 10, 10);
                    if(middle.intersects(yikes)){
                      Die();
                   //   System.out.println("Darts!");
                    }
                    }
                           if(middle.intersects(legion4[i].getSpear()) && legion4[i].fnum() == 7){
                               Die();
                               // System.out.println("You poked me wit your spear!");
                           }
                       }
                   }
                     
                     
                 }
                 
                 
               }
     
               if(Enemybounce){
                   jimmy4.jumpRevert();
               }
             
    
     }
     
    public class TAdapter extends KeyAdapter {
          @Override public void keyReleased(KeyEvent e) {
               jimmy4.keyReleased(e);
           }
           
           @Override public void keyPressed(KeyEvent e) {
               if(!endzone){
               int key = e.getKeyCode();
               if(key == KeyEvent.VK_RIGHT && part == 1 && !transistion1 && jimmy4.getX() > 260 && shift < 72){
                   shift+= 2;
               }
              
               if(key == KeyEvent.VK_LEFT && part == 1 && ! transistion1 && shift > 0){
                   shift-= 2;
               }
             if( key == KeyEvent.VK_SPACE  ){
                 space = true;
             }
             if( key == KeyEvent.VK_X){
                 message = false;
             }
              jimmy4.keyPressed(e);
               
               }
             
            
           }

    }
}
