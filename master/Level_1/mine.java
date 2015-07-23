/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pogo.master.Level_1;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import java.awt.Image;

/**
 *
 * @author Kai
 */
public class mine {
    private int x;
    private int y;
    //private Image seeker;
    private boolean back = false;
     mine(int a, int b){
        x = a;
        y = b;
      
        
        
    }
     //public Image getImage(){
       // return seeker;
     //}
     public boolean getBack(){
         return back;
     }
     public void setBack(boolean l){
         back = l;
     }
     public Rectangle getCollide(){
         return new Rectangle(x + 9, y + 5, 20, 20 );
     }
     public int getX(){
         return x;
     }
     public int getY(){
         return y;
     }
     public void shift(int m, int n){
         if(!back){
         if(m > x + 9){
             x += 1;
         }
         if(m < x + 9){
             x-= 1;
         }
         if(n > y + 5){
             y+= 1;
         }
         if(n < y + 5){
             y -= 1;
         }
         }
         else{
            if(m > x + 9){
             x += 3;
         }
         if(m < x + 9){
             x-= 3;
         }
         if(n > y + 5){
             y+= 3;
         }
         if(n < y + 5){
             y -= 3;
         } 
             
             
         }
     }
    
}
