/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pogo.master;
import javax.swing.*;
import pogo.master.Level_1.*;
import java.applet.AudioClip;
import java.applet.Applet;
import java.awt.Rectangle;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.Timer;
import sun.audio.*;
import java.net.URL;
import java.awt.Rectangle;

/**
import *
 * @author radioshack
 */
public class PogoMaster extends JFrame implements ActionListener {
        start Begin = new start();
         Board Forest ;// new Board();
         LevelTwo city;
         level3 mountain;
         Level4 heaven; // = new Level4();
         AudioClip ground;
         
          URL urlClick = this.getClass().getResource("wall.wav");
       int complete = -1;
        int progress = 0;
        private int totalscore = 0;
        private int levelscore = 0;
      //int complete = 5;
          Timer Oni;
          int shift = 0;
    public  PogoMaster(){
        addMouseListener(new MAdapter());
        // dont change
      //  setFocusable(true);
         //add(Forest);
          //add(heaven);
       add(Begin);
        ground = Applet.newAudioClip(urlClick);
        ground.play();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setTitle("Pogo Master");
        setVisible(true);
        setResizable(false);
         Oni = new Timer(180000, this);
         Oni.start();
       // setDoubleBuffered(true);
        
        
    }
    public void actionPerformed(ActionEvent e) {
        ground.play();
       // music();
    //if(shift == 0){
       // shift = Begin.getBack();
   // }
        
    
    }
    
    
    
 public class MAdapter extends MouseAdapter{
  
          public void mouseClicked(MouseEvent e) {
                 if(shift != 0){
                     if(complete == -1){
                         PogoMaster.this.setFocusable(false);
                         Begin.setEnabled(false);
                         PogoMaster.this.remove(Begin);
                         Forest = new Board();
                             Forest.setMode(shift);
                         PogoMaster.this.add(Forest);
                         Forest.revalidate();
                         Forest.requestFocus();
                         complete++;
                     }
                  if(complete == 0 && Forest.getLost() && e.getX() > 153 && e.getX() < 363){
                   if(e.getY() > 190 && e.getY() < 240){
                       shift = 0;
                       PogoMaster.this.setFocusable(false);
                   Forest.setEnabled(false);
                  PogoMaster.this.remove(Forest);
                  Begin = new start();
                  Begin.EndScreen(totalscore);
                  PogoMaster.this.add(Begin);
                  Begin.revalidate();
                  Begin.requestFocus();
                  complete = -1;
                       
                   }
                   else if(e.getY() > 280 && e.getY() < 377 && shift == 1){
                       totalscore = 0;
                    PogoMaster.this.setFocusable(false);
                   Forest.setEnabled(false);
                  PogoMaster.this.remove(Forest);
                  Forest = new Board();
                  Forest.setMode(shift);
                  PogoMaster.this.add(Forest);
                  Forest.revalidate();
                   Forest.requestFocus();  
                   }                       
                 }
                  
                  
              if(complete == 0 && Forest.getDone()){
                  totalscore += Forest.getScore();
                  int lives = Forest.survive();
                  PogoMaster.this.setFocusable(false);
                   Forest.setEnabled(false);
                  PogoMaster.this.remove(Forest);
                  city = new LevelTwo();
                  city.setMode(shift);
                  city.Carry(lives);
                  PogoMaster.this.add(city);
                    city.revalidate();
                    city.requestFocus();
                    complete++;
               }
              
              if(complete == 1 && city.getLost() && e.getX() > 153 && e.getX() < 363){
                   if(e.getY() > 200 && e.getY() < 270){
                       shift = 0;
                       PogoMaster.this.setFocusable(false);
                   city.setEnabled(false);
                  PogoMaster.this.remove(city);
                  Begin = new start();
                  Begin.EndScreen(totalscore);
                  PogoMaster.this.add(Begin);
                  Begin.revalidate();
                  Begin.requestFocus();
                  complete = -1;
                       
                   }
                   else if(e.getY() > 280 && e.getY() <  378 && shift == 1){
                       totalscore = 0;
                    PogoMaster.this.setFocusable(false);
                   city.setEnabled(false);
                  PogoMaster.this.remove(city);
                  city = new LevelTwo();
                  PogoMaster.this.add(city);
                  Forest.revalidate();
                   Forest.requestFocus();  
                   } 
                 }
              
              
              if(complete == 1) {
              if(city.getDone()) {
                  totalscore += city.getScore();
                  int lives = city.survive();
                  PogoMaster.this.setFocusable(false);
                  city.setEnabled(false);
                  PogoMaster.this.remove(city);
                  mountain = new level3();
                  mountain.setMode(shift);
                  mountain.Carry(lives);
                  PogoMaster.this.add(mountain);
                  mountain.revalidate();
                  mountain.requestFocus();
                  complete++;
              }
              }
              
              if(complete == 2 && mountain.getLost() && e.getX() > 153 && e.getX() < 363){
                   if(e.getY() > 190 && e.getY() < 240){
                       shift = 0;
                       PogoMaster.this.setFocusable(false);
                   mountain.setEnabled(false);
                  PogoMaster.this.remove(mountain);
                  Begin = new start();
                  Begin.EndScreen(totalscore);
                  PogoMaster.this.add(Begin);
                  Begin.revalidate();
                  Begin.requestFocus();
                  complete = -1;
                       
                   }
                   else if(e.getY() > 280 && e.getY() < 378 && shift == 1){
                    PogoMaster.this.setFocusable(false);
                   mountain.setEnabled(false);
                  PogoMaster.this.remove(mountain);
                  mountain = new level3();
                  PogoMaster.this.add(mountain);
                  mountain.revalidate();
                   mountain.requestFocus();  
                   }                       
                 }
              
              else if(complete > 1 && complete < 3 ) {
                  if(mountain.getDone()){
                      totalscore += mountain.getScore();
                      int lives = mountain.survive();
                  PogoMaster.this.setFocusable(false);
                  mountain.setEnabled(false);
                  PogoMaster.this.remove(mountain);
                  heaven = new Level4();
                  heaven.setMode(shift);
                  heaven.Carry(lives);
                  PogoMaster.this.add(heaven);
                  heaven.revalidate();
                  heaven.requestFocus();
                  complete++;
              }
              }
              if(complete == 3 && heaven.getLost() && e.getX() > 153 && e.getX() < 363){
                   if(e.getY() > 190 && e.getY() < 240){
                       shift = 0;
                       PogoMaster.this.setFocusable(false);
                   heaven.setEnabled(false);
                  PogoMaster.this.remove(heaven);
                  Begin = new start();
                  Begin.EndScreen(totalscore);
                  PogoMaster.this.add(Begin);
                  Begin.revalidate();
                  Begin.requestFocus();
                  complete = -1;
                       
                   }
                   else if(e.getY() > 280 && e.getY() < 387 && shift == 1){
                       totalscore = 0;
                    PogoMaster.this.setFocusable(false);
                   heaven.setEnabled(false);
                  PogoMaster.this.remove(heaven);
                  heaven = new Level4();
                  PogoMaster.this.add(heaven);
                  heaven.revalidate();
                   heaven.requestFocus();  
                   }                       
                 }
              if(complete == 3 && heaven.getDone()){
                  totalscore += heaven.getScore();
                  int lives = heaven.survive();
                  if(shift == 2){
                      PogoMaster.this.setFocusable(false);
                   heaven.setEnabled(false);
                  PogoMaster.this.remove(heaven);
                  Forest = new Board();
                  Forest.setMode(shift);
                  Forest.Carry(lives);
                  PogoMaster.this.add(Forest);
                  Forest.revalidate();
                  Forest.requestFocus();
                  complete = 0;
                  }
                  else{
                    PogoMaster.this.setFocusable(false);
                   heaven.setEnabled(false);
                  PogoMaster.this.remove(heaven);
                  Begin = new start();
                  shift = 0;
                  Begin.EndScreen(totalscore);
                  PogoMaster.this.add(Begin);
                  Begin.revalidate();
                  Begin.requestFocus();
                  complete = -1;
                  }
                  
              }
              if(complete == 5){
                  PogoMaster.this.setFocusable(false);
                         Begin.setEnabled(false);
                         PogoMaster.this.remove(Begin);
                  heaven = new Level4();
                   PogoMaster.this.add(heaven);
                  heaven.revalidate();
                   heaven.requestFocus();  
                   
              }
                 }
                 else{
                     // System.out.println("X " + e.getX() + " Y " + e.getY());
             if( e.getX() > 379 && e.getX() < 456){
                 if(e.getY() > 102 && e.getY() < 130){
                     shift = 1;
                 }
             else if(e.getY() > 150 && e.getY() < 178){
                
             }
             else if(e.getY() > 182 && e.getY() < 209){
                 shift = 2;
             }
             else if(e.getY() > 220 && e.getY() < 237 ){
                
             }
            
             }
             if(progress < 2){
                 progress++;
             }
             else{
                 progress = 0;
                 Begin.revert();
             }
                 }
               }
          public void MouseReleased(MouseEvent e) {
              
          }
            
        }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         PogoMaster game = new PogoMaster();
         
 
        // TODO code application logic here
    }
}
