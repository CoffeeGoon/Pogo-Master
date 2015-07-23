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
 * @author Kai Christenson
 */
public class GigaPos {
    private Image Drill[];
    private int xshift;
    private int yshift;
    private int clicker;
    private int drillnum;
    GigaPos(){
        ImageIcon D1 = new ImageIcon(this.getClass().getResource("gigadrill1.png"));
        ImageIcon D2 = new ImageIcon(this.getClass().getResource("gigadrill2.png"));
        ImageIcon D3 = new ImageIcon(this.getClass().getResource("gigadrill3.png"));
        ImageIcon D4 = new ImageIcon(this.getClass().getResource("gigadrill5.png"));
        ImageIcon D5 = new ImageIcon(this.getClass().getResource("gigadrill6.png"));
        ImageIcon D6 = new ImageIcon(this.getClass().getResource("gigadrill7.png"));
        ImageIcon D7 = new ImageIcon(this.getClass().getResource("gigadrill8.png"));
        Drill = new Image[9];
        Drill[0] = D1.getImage();
        Drill[1] = D2.getImage();
        Drill[2] = D3.getImage();
        Drill[3] = D4.getImage();
        Drill[4] = D5.getImage();
        Drill[5] = D6.getImage();
        Drill[6] = D7.getImage();
         ImageIcon D8 = new ImageIcon(this.getClass().getResource("gigadrill4z.png"));
          ImageIcon D9 = new ImageIcon(this.getClass().getResource("gigadrillmid.png"));
          Drill[7] = D8.getImage();
        Drill[8] = D9.getImage();
        xshift = 0;
        yshift = 0;
        clicker  = 0;
        drillnum = 0;
        
        
        
        
    }
    public void alter(){
        clicker+= 2;
        
        if(clicker >= 50 && clicker <= 260){
            if(clicker % 20 < 10){
                xshift = -34;
                yshift = -10;
                drillnum = 1;
                
            }
            if(clicker % 20 >= 10){
                xshift= -20;
                yshift = 0;
                drillnum = 2;
                
            }
            
        }
        if(clicker > 260 && clicker <= 340){
            if(clicker % 30 < 10){
                drillnum = 3;
                xshift = -70;
                yshift = 0; 
                
            }
            if(clicker % 30 >= 10 && clicker  % 30 <  20){
                drillnum = 7;
                xshift = -35;
                yshift = -6;
            }
            if(clicker % 30 >= 20){
                drillnum = 8;
                xshift = -75;
                yshift = -12;
                
            }
        }
        if(clicker > 340){
            if(clicker % 15 < 5){
                drillnum = 5;
                xshift = -110;
                yshift = -20;
                
            }
            if( clicker % 15 >= 5 && clicker % 15 < 10){
                drillnum = 4;
                xshift = -75;
                yshift = 0;
                
            }
            if(clicker % 15 >= 10){
                drillnum = 6;
                xshift = -128;
                yshift = -20;
                
                
            }
            
            
        }
        
      
    }
    
    public int getSX(){
        return xshift;
        
    }
    public int getSY(){
        return yshift;
    }
    public Image getDrill(){
        return Drill[drillnum];
    }
    
    
}
