/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogo.master.Level_1;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.Rectangle;
import java.util.*;
import java.awt.Toolkit; 
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Kai Christenson
 */
public class start extends JPanel implements ActionListener {
     private Timer time;
    private Image main;
    private Image finish;
    private Image code;
    private int startoption = 0;
    private int score = 0;
    private int currentlayout = 1;
    private boolean tally = false;
    private boolean codes = false;
    private boolean credits = false;
    private Font Default;
    private int back = 0;
    private Rectangle buttons[] = new Rectangle[4];
    TAdapter keys = new TAdapter();
  
   // MAdapter mims = new MAdapter();
    public start(){
       //  addKeyListener(keys);
        // addMouseListener(mims);
         setFocusable(true);
           Default = new Font("Monospaced", Font.BOLD, 40);
         ImageIcon foo = new ImageIcon(this.getClass().getResource("title.png"));
         ImageIcon loo = new ImageIcon(this.getClass().getResource("Finish.png"));
         main = foo.getImage();
         finish = loo.getImage();
         buttons[0] = new Rectangle(381, 87, 75, 17);
         buttons[1] = new Rectangle(381, 126, 75, 17);
         buttons[2] = new Rectangle(378, 164, 75, 17);
         buttons[3] = new Rectangle(378, 203, 75, 17);
         
        time = new Timer(15, this);
        time.start();
        setDoubleBuffered(true);
        // ImageIcon roo = new ImageIcon(this.getClass().getResource())
        // addMouseListener(new MAdapter());
    }
    public int getBack(){
        return back;
    }
    public void EndScreen(int n){
         tally = true;
         score = n;
        
        
    }
    public void codeInput(){
        codes = true;
    }
    public void revert(){
        tally = false;
        codes = false;
    }
    
    public void paint(Graphics g){
        super.paint(g);
         Graphics2D g2d = (Graphics2D) g;
          if(!tally){
          g2d.drawImage(main, -5, -4, this);
          }
          else{
              g2d.drawImage(finish, 0, -100, this);
              g2d.setFont(Default);
              String temp = Integer.toString(score);
              g2d.drawString(temp, 180, 250);
          }
          for(int i = 0; i < 4; ++i){
          // g2d.draw(buttons[i]);
          }
         Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    
 
    
    public class TAdapter extends KeyAdapter{
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(startoption != 0){
            back = startoption;
           //  this.removeKeyListener(keys);
//             this.removeMouseListener(mims);
        }
        else{
        repaint();
        }
    }
    
    
}
