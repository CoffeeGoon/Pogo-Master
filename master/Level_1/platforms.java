/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pogo.master.Level_1;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Rectangle;

/**
 *
 * @author radioshack
 */
public class platforms {
    private Rectangle platforms[];
     private int camX = 0;
     private int camY = 0;
     private int portion = 1;
     private boolean bouncy = false;
     private boolean faulty = false;
     private boolean part2 = false;
     private boolean limit = false; 
     private boolean limit2 = false;
     private boolean limit3 = false;
     private boolean part3_2 = false;
     private int level = 1;
     private int z = 302;
     private int n = 15;
     private int dx = 2;
      private int dy = 0;
     private boolean shift = false;
     int count = 1;
public void setLevel(int z) {
    level = z;
    if (z == 3) {
        n = 10;
        z = 50;
       
    }
}
public int getDx() {
    return dx;
}
public int getDy() {
    return dy;
}
public void secondHalf(boolean x) { 
    part3_2 = x;

}
public void setPortion(int k){
    
    portion = k;
}

public void setCam(int x, int y) {
    camX = x;
    camY = y;
}
public Rectangle[] getPlatforms() {
    if(!part2 && level == 1) {
    platforms = new Rectangle[15];
    platforms[0] = new Rectangle(230, 318, 69, 2);
    platforms[1] = new Rectangle(306, 304, 65, 2);
    platforms[2] = new Rectangle(180, 285, 114, 2);
    platforms[3] = new Rectangle(83, 263, 69, 2);
    platforms[4] = new Rectangle(162, 250, 338, 2);
    platforms[5] = new Rectangle(412, 204, 75, 2 );
    platforms[6] = new Rectangle(378, 193, 31, 3);
    platforms[7] = new Rectangle(342, 170, 24, 3);
    platforms[8] = new Rectangle(306, 151, 24, 3);
    platforms[9] = new Rectangle(274, 133, 24, 3);
    platforms[10] = new Rectangle(274, 107, 24, 2); 
    platforms[11] = new Rectangle(274, 77, 24, 2);
    platforms[12] = new Rectangle(293, 53 ,24, 2);
    platforms[13] = new Rectangle(293, 26, 77, 2);
    platforms[14] = new Rectangle(0, 360 ,500, 2);
    }
   
    if (part2 && level == 1){
    platforms = new Rectangle[5];
    platforms[0] = new Rectangle(302, 297, 63, 10);
    platforms[1] = new Rectangle(66, 248, 57, 1);
    platforms[2] = new Rectangle(66, 214, 486, 1);
    platforms[3] = new Rectangle(435, 193, 50, 1);
    platforms[4] = new Rectangle(66, 240, 57, 1);
   
}
    if (level == 2) {
        platforms = new Rectangle[23];
        platforms[0] = new Rectangle(0 +camX, 1440 +camY , 1400, 2 );
        platforms[1] = new Rectangle(36 +camX, 1404 +camY,  25, 2 );
        platforms[2] = new Rectangle(66 +camX,1374 +camY, 25, 2 );
        platforms[3] = new Rectangle(59 +camX,1326 +camY ,65, 2 );
        platforms[4] = new Rectangle(80 +camX,1282 +camY , 20, 2 );
        platforms[5] = new Rectangle(112 +camX,1236 +camY ,40, 2);
        platforms[6] = new Rectangle(427 +camX, 1350 +camY ,160, 2 );
        platforms[7] = new Rectangle(612 +camX, 1271 +camY, 25, 2);
        platforms[8] = new Rectangle(686 +camX, 1271 +camY, 25, 2);
        platforms[9] = new Rectangle(686 +camX, 1271 +camY, 25, 2);
        platforms[10] = new Rectangle(755 +camX, 1271 +camY, 60, 2);
        platforms[11] = new Rectangle(866 +camX, 1190 +camY, 182, 2);
        platforms[12] = new Rectangle(876 +camX, 1085 +camY, 112, 2);
        platforms[13] = new Rectangle(605 +camX, 1025 +camY, 228, 2);
        platforms[14] = new Rectangle(518 +camX, 969 +camY, 115, 2);
        platforms[15] = new Rectangle(518 +camX, 969 +camY, 115, 2);
        platforms[16] = new Rectangle(317 +camX, 909 +camY, 205, 2);
        platforms[17] = new Rectangle(0 +camX, 476 +camY, 619, 2);
        platforms[18] = new Rectangle(33 +camX, 836 +camY, 282, 2);
        platforms[19] = new Rectangle(58 +camX, 784 +camY -z, 36, 16);
        platforms[20] = new Rectangle(673 +camX, 405 +camY +n, 58, 16);
        platforms[21] = new Rectangle(775 +camX + dx, 215 +camY +z, 58, 16);
        platforms[22] = new Rectangle(455 +camX, 100 +camY, 508, 2);
        
    }
    if (level == 3 && !part3_2) {
        platforms = new Rectangle[31];
        platforms[0] = new Rectangle(0 +camX, 1430 +camY , 1400, 2 );
        platforms[1] = new Rectangle(0 +camX, 1256 +camY , 68, 2 );
        platforms[2] = new Rectangle(172 +camX, 1398 +camY , 78, 31 );
        platforms[3] = new Rectangle(300 +camX, 1368 +camY , 128, 61 );
        platforms[4] = new Rectangle(618 +camX, 1302 +camY , 156, 127 );
        platforms[5] = new Rectangle(776 +camX, 1258 +camY , 212, 171 );
        platforms[6] = new Rectangle(974 +camX, 1226 +camY , 66, 203 );
        platforms[7] = new Rectangle(998 +camX, 854 +camY , 42, 576 );
        platforms[8] = new Rectangle(998 +camX, 514 +camY , 42, 248 );
        platforms[9] = new Rectangle(508 +camX, 1384 +camY , 30, 2);
        platforms[10] = new Rectangle(934 +camX, 1206 +camY , 30, 2);
        platforms[11] = new Rectangle(890 +camX, 1188 +camY , 30, 2);
        platforms[12] = new Rectangle(846 +camX, 1170 +camY , 30, 2);
        platforms[13] = new Rectangle(786 +camX, 1166 +camY , 35, 2);
        platforms[14] = new Rectangle(442 +camX, 1150 +camY , 222, 2);
        platforms[15] = new Rectangle(223 + camX, 950 +camY, 215, 2);
        platforms[16] = new Rectangle(520 + camX, 879 + camY, 220, 2);
        platforms[17] = new Rectangle(819 + camX, 876 + camY, 82, 2);
        platforms[18] = new Rectangle(692 + camX, 790 + camY, 297, 2);
        platforms[19] = new Rectangle(503 + camX, 520 + camY, 300, 2);
        platforms[20] = new Rectangle(814 + camX, 520 + camY, 30, 20);
        platforms[21] = new Rectangle(854 + camX, 520 + camY, 30, 20);
        platforms[22] = new Rectangle(894 + camX, 520 + camY, 30, 20);
        platforms[23] = new Rectangle(934 + camX, 520 + camY, 30, 20);
        platforms[24] = new Rectangle(974 + camX, 520 + camY, 30, 20);
        platforms[25] = new Rectangle(633 + camX - dx, 790 + camY - dy, 40, 2); 
        platforms[26] = new Rectangle(470 + camX, 523 + camY, 40, 2);
        platforms[27] = new Rectangle(477 + camX, 1064 + camY - n, 40, 2);// 880
         platforms[28] = new Rectangle(677 + camX + z , 1145 + camY, 40, 2); 
          platforms[29] = new Rectangle(437 + camX, 1103 + camY, 27, 2);
        platforms[30] = new Rectangle(994 + camX, 815 + camY, 27, 2);
    }
    if(level == 3 && part3_2) {
        platforms = new Rectangle[20];
        platforms[0] = new Rectangle(0 + camX, 1440 + camY, 1009, 2);
        platforms[1] = new Rectangle(80 + camX, 1397 + camY, 160, 40);
        platforms[2] = new Rectangle(236 + camX, 1339 + camY, 74, 95);
        platforms[3] = new Rectangle(331 + camX, 1274 + camY, 182, 2);
        platforms[4] = new Rectangle(540 + camX, 1166 + camY, 300, 27);
        platforms[5] = new Rectangle(575 + camX, 1136 + camY, 280, 30);
        platforms[6] = new Rectangle(620 + camX, 1115 + camY, 131, 20);
        platforms[7] = new Rectangle(934 + camX, 1016 + camY, 90, 2);
        platforms[8] = new Rectangle(1024 + camX, 336 + camY, 16, 1130);
        platforms[9] = new Rectangle(514 + camX, 914 + camY, 290, 2);
        platforms[10] = new Rectangle(241 + camX, 818 + camY, 267, 2);
        platforms[11] = new Rectangle(8 + camX, 702 + camY, 172, 2);
        platforms[12] = new Rectangle(442 + camX, 715 + camY, 190, 2);
        platforms[13] = new Rectangle(627 + camX, 619 +  camY, 397, 2);
        platforms[14] = new Rectangle(691 + camX, 545 + camY, 172, 2);
        platforms[15] = new Rectangle(646 + camX, 479 + camY, 53, 2);
        platforms[16] = new Rectangle(715 + camX, 321 + camY, 325, 15);
        platforms[17] = new Rectangle(516 + camX, 1227 + camY, 30, 20);
        platforms[18] = new Rectangle(830 + camX, 1048 + camY, 30, 20);
        platforms[19] = new Rectangle(850 + camX, 960 + camY, 50, 20);
        
    }
    if(level == 4 && portion == 1){
        platforms = new Rectangle[2];
        platforms[0] = new Rectangle(0, 360 ,500, 2);
    }
    if(level == 4 && portion == 2){
        platforms = new Rectangle[32];
        platforms[0] = new Rectangle(0 + camX, 375 + camY, 177, 2);
        platforms[1] = new Rectangle(178 + camX, 325 + camY, 222, 80);
        platforms[2] = new Rectangle(237 + camX, 204 + camY, 474, 4);
        platforms[3] = new Rectangle(852 + camX, 337 + camY, 152, 60);
        platforms[4] = new Rectangle(1003 + camX, 396 + camY, 152, 15);
        platforms[5] = new Rectangle(1155 + camX, 337 + camY, 162, 60);
        platforms[6] = new Rectangle(1317 + camX, 396 + camY, 147, 15);
        platforms[7] = new Rectangle(1464 + camX, 337 + camY, 152, 60);
        platforms[8] = new Rectangle(1615 + camX, 396 + camY, 157, 15);
        platforms[9] = new Rectangle(1767 + camX, 337 + camY, 157, 60);
        platforms[10] = new Rectangle(1919 + camX, 396 + camY, 167, 15);
        platforms[11] = new Rectangle(2086 + camX, 337 + camY, 157, 60);
        platforms[12] = new Rectangle(2223 + camX, 1118 + camY, 410, 2);
        platforms[13] = new Rectangle(2625 + camX, 1090 + camY, 20, 2);
        platforms[14] = new Rectangle(2625 + camX, 1075 + camY, 151, 2);
        platforms[15] = new Rectangle(2776 + camX, 1055 + camY, 20, 2);
        platforms[16] = new Rectangle(2776 + camX, 1025 + camY, 190, 2);
        platforms[17] = new Rectangle(2598 + camX, 953 + camY, 250, 2);
         platforms[18] = new Rectangle(2336 + camX, 872 + camY, 280, 2);
          platforms[19] = new Rectangle(2349 + camX, 768 + camY, 280, 2);
           platforms[20] = new Rectangle(2457 + camX, 743 + camY, 40, 2);
            platforms[21] = new Rectangle(2466 + camX, 733 + camY, 37, 2);
             platforms[22] = new Rectangle(2486 + camX, 723 + camY, 34, 2);
             platforms[23] = new Rectangle(2489 + camX, 713 + camY, 34, 2);
             platforms[24] = new Rectangle(2504 + camX, 703 + camY, 34, 2);
             platforms[25] = new Rectangle(2513 + camX, 693 + camY, 34, 2);
             platforms[26] = new Rectangle(2523 + camX, 683 + camY, 34, 2);
             platforms[27] = new Rectangle(2536 + camX, 668 + camY, 38, 2);
             platforms[28] = new Rectangle(2546 + camX, 656 + camY, 34, 2);
             platforms[29] = new Rectangle(2546 + camX, 644 + camY, 280, 2);
             platforms[30] = new Rectangle(2733 + camX, 552 + camY, 424, 2);
             platforms[31] = new Rectangle(2333 + camX, 260 + camY, 700, 2);
             
    }
    if(level == 4 && portion == 3){
        platforms = new Rectangle[66];
        platforms[0] = new Rectangle(28 + camX + 574,  371 + camY , 190 , 2);
        platforms[1] = new Rectangle(168 + camX + 574,  286 + camY , 190 , 2);
         platforms[2] = new Rectangle(303 + camX + 574,  395 + camY , 190 , 2);
          platforms[3] = new Rectangle(427 + camX + 574,  429 + camY , 170 , 2);
           platforms[4] = new Rectangle(356 + camX + 574,  189 + camY, 190 , 2);
            platforms[5] = new Rectangle(162 + camX + 574,  330 + camY , 50 , 2);
             platforms[6] = new Rectangle(692 + camX + 574, 259 + camY , 190 , 2);
              platforms[7] = new Rectangle(341 + camX + 574, 236 + camY , 50 , 2);
               platforms[8] = new Rectangle(430 + camX + 574, 330 + camY , 190 , 2);
                platforms[9] = new Rectangle(857 + camX + 574, 198 + camY , 190 , 2);
                 platforms[10] = new Rectangle(853 + camX + 574, 230 + camY , 50 , 2);
                  platforms[11] = new Rectangle(968 + camX + 574, 283 + camY , 190 , 2);
                   platforms[12] = new Rectangle(879 + camX + 574, 349 + camY , 190 , 2);
                    platforms[13] = new Rectangle(1333 + camX + 574, 382 + camY , 380 , 2);
                     platforms[14] = new Rectangle(2072 + camX + 574, 229 + camY , 197 , 3);
                      platforms[15] = new Rectangle( camX + 574, 756 + camY , 460 , 2);
                       platforms[16] = new Rectangle(715 + camX + 574, 756 + camY , 460 , 2);
                        platforms[17] = new Rectangle(1250 + camX + 574, 669 + camY , 207 , 2);
                         platforms[18] = new Rectangle(1776 + camX + 574, 659 + camY , 195 , 2);
                          platforms[19] = new Rectangle(1890 + camX + 574, 630 + camY , 195 , 2);
                             platforms[20] = new Rectangle(1890 + camX + 574, 580 + camY , 195 , 2);
                             platforms[21] = new Rectangle(434 + camX + 574, 300 + camY , 190 , 2);
                             
                             
                             
        platforms[22] = new Rectangle(23 + camX + 560,  369 + camY , 190 , 3);
        platforms[23] = new Rectangle(163 + camX + 560,  286 + camY , 190 , 3);
         platforms[24] = new Rectangle(297 + camX + 560,  385 + camY , 190 , 3);
          platforms[25] = new Rectangle(422 + camX + 560,  419 + camY , 170 , 3);
           platforms[26] = new Rectangle(351 + camX + 560,  189 + camY , 190 , 3);
            platforms[27] = new Rectangle(157 + camX + 560,  320 + camY , 50 , 3);
             platforms[28] = new Rectangle(687 + camX + 560, 269 + camY , 190 , 3);
              platforms[29] = new Rectangle(336 + camX + 560, 226 + camY , 50 , 3);
               platforms[30] = new Rectangle(437 + camX + 560, 315 + camY , 190 , 3);
                platforms[31] = new Rectangle(832 + camX + 560, 170 + camY , 180 , 3);
                 platforms[32] = new Rectangle(843 + camX + 560, 210 + camY , 50 , 3);
                  platforms[33] = new Rectangle(958 + camX + 560, 263 + camY , 190 , 3);
                   platforms[34] = new Rectangle(860 + camX + 560, 340 + camY , 190 , 3);
                    platforms[35] = new Rectangle(1857 + camX, 373 + camY , 160 , 3);
                     platforms[36] = new Rectangle(1900 + camX, 360 + camY , 26 , 3);
                      platforms[37] = new Rectangle(1925 + camX, 340 + camY , 26 , 3);
                       platforms[38] = new Rectangle(1950 + camX, 317 + camY , 30 , 3);
                        platforms[39] = new Rectangle(1910 + camX, 300 + camY , 190 , 3);
                        platforms[40] = new Rectangle(1983 + camX, 287 + camY , 26 , 3);
                          platforms[41] = new Rectangle(2008 + camX, 267 + camY , 26 , 3);
                           platforms[42] = new Rectangle(2033 + camX, 244 + camY , 26 , 3);
                            platforms[43] = new Rectangle(2010 + camX, 220 + camY , 190 , 3);
                            platforms[44] = new Rectangle(2083 + camX, 207 + camY , 26 , 3);
                             platforms[45] = new Rectangle(2108 + camX, 187 + camY , 26 , 3);
                               platforms[46] = new Rectangle(2133 + camX, 164 + camY , 26 , 3);
                                 platforms[47] = new Rectangle(2107 + camX, 140 + camY , 160 , 3);
                                  platforms[48] = new Rectangle(2290 + camX, 173 + camY , 160 , 3);
                                  platforms[49] = new Rectangle(2285 + camX, 305 + camY , 160 , 3);
                                   platforms[50] = new Rectangle(2420 + camX, 235 + camY , 160 , 3);
                                    platforms[51] = new Rectangle(2620 + camX, 173 + camY , 160 , 3);
                                     platforms[52] = new Rectangle(2573 + camX, 320 + camY , 160 , 3);
                                      platforms[53] = new Rectangle(2730 + camX, 280 + camY , 160 , 3);
                                       platforms[54] = new Rectangle(2777 + camX, 225 + camY , 160 , 3);
                                        platforms[55] = new Rectangle(2730 + camX, 360 + camY , 283 , 3);
                                        
        platforms[56] = new Rectangle(3038 + camX ,  371 + camY , 190 , 3);
        platforms[57] = new Rectangle(3178 + camX ,  286 + camY , 190 , 3);
         platforms[58] = new Rectangle(3313 + camX ,  390 + camY , 190 , 3);
          platforms[59] = new Rectangle(3437 + camX ,  429 + camY , 170 , 3);
           platforms[60] = new Rectangle(3366 + camX ,  199 + camY , 190 , 3);
            platforms[61] = new Rectangle(3172 + camX ,  330 + camY , 50 , 3);
             platforms[62] = new Rectangle(3702 + camX , 279 + camY , 190 , 3);
              platforms[63] = new Rectangle(3351 + camX , 236 + camY , 50 , 3);
               platforms[64] = new Rectangle(3464 + camX , 360 + camY , 60 , 3);
                platforms[65] = new Rectangle(3867 + camX , 210 + camY , 190 , 3);
    }
    if(level == 4 && portion == 4){
        platforms = new Rectangle[26];
        platforms[0] = new Rectangle(0 + camX, 1284 + camY, 590, 2);
         platforms[1] = new Rectangle(58 + camX, 1216 + camY, 164, 2);
          platforms[2] = new Rectangle(190 + camX, 1166 + camY, 162, 2);
           platforms[3] = new Rectangle(62 + camX, 1050 + camY, 165, 2);
            platforms[4] = new Rectangle(152 + camX, 980 + camY, 366, 2);
             platforms[5] = new Rectangle(399 + camX, 818 + camY, 151, 2);
              platforms[6] = new Rectangle(422 + camX, 737 + camY, 115, 2);
               platforms[7] = new Rectangle(266 + camX, 737 + camY, 115, 2);
                platforms[8] = new Rectangle(94 + camX, 737 + camY, 115, 2);
                 platforms[9] = new Rectangle(94 + camX, 667 + camY, 115, 2);
                  platforms[10] = new Rectangle(192 + camX, 615 + camY, 250, 2);
                   platforms[11] = new Rectangle(254 + camX, 528 + camY, 133, 2);
                    platforms[12] = new Rectangle(393 + camX, 465 + camY, 92, 2); //93
                     platforms[13] = new Rectangle(220 + camX, 368 + camY, 100, 2);
                      platforms[14] = new Rectangle(92 + camX, 358 + camY, 100, 2);
                       platforms[15] = new Rectangle(34 + camX, 291 + camY, 95, 2);
                        platforms[16] = new Rectangle(105 + camX, 242 + camY, 130, 2);
                         platforms[17] = new Rectangle(276 + camX, 228 + camY, 130, 2);
                          platforms[18] = new Rectangle(274 + camX, 170 + camY, 118, 2);
                           platforms[19] = new Rectangle(104 + camX, 110 + camY, 200, 2);
                           platforms[20] = new Rectangle(627 + camX, 1330 + camY, 612, 10);
                            platforms[21] = new Rectangle(580 + camX, 0 + camY, 65, 1359);
                            platforms[22] = new Rectangle(198 + camX, 1100 + camY + dy, 40, 10);
                             platforms[23] = new Rectangle(430 + camX + dx, 370 + camY + dy, 40, 10);
                              platforms[24] = new Rectangle(776 + camX, 1118 + camY + dy, 280, 5);
                            platforms[25] = new Rectangle(1234 + camX, 0 + camY, 65, 1359);
                            
                    
        
        
        
        
    }
  
  return platforms;   
}


public Rectangle getOne(int place) {
      return platforms[place];
  }

public void movePlat() {
        if(level == 2) {
     
       if( z <= 0) {
       limit = false;
       shift = true;
       if(!(dx <= 0)) {
       dx--;
       }
    }
   else if ( z == 317) {
        limit = true;
        shift = true;
       if(!(dx >= 40)) {
        dx++;
       }
        
    }
        if(dx <= 0) {
           shift = false;
       }
       if(dx >= 80) {
           shift = false;
       }
    if(limit) {
       z -=  1;
       if(shift) {
           count++;
           if(count % 2 == 0) {
           dx++;
           }
       }
    }
    else {
         z += 1;
         if(shift) {
             count++;
             if (count % 2 == 0) {
             dx--;
             }
         }
    }
        if( n <= 0) {
       limit2 = false;
    }
   else if ( n == 317) {
        limit2 = true;
    }
    if(limit2) {
       n -=  1;
    }
    else {
         n += 1;
    }
        
  
        }
        else if(level == 3) {
            if(z <  1) {
                limit = true;
            }
            if(z > 73) {
                limit = false;
            } 
            if(limit) {
               z++;
            }
            if(!limit) {
                z--;
            }
              if(n <  - 10) {
                limit2 = true;
            }
            if(n >  202) {
                limit2 = false;
            }
            if(limit2) {
                count++;
                if(count % 2 == 0) {
                n++;
                }
            }
            if(!limit2) {
                count++;
                if(count % 2 == 0) {
                n--;
                }
            }
            if(dx < 300 && !limit3) {
                dx++;
            }
             if(dx >= 300 && !limit3){
               
                dy++;
            }
            if(dy >= 350 && !limit3) {
                limit3 = true;
            }
            if(limit3 && dy >= 1) {
                dy--;
            }
             if( limit3 && dy <= 1 && dx >= 1) {
                dx--;
            }
             if(dx < 1) {
                 limit3 = false;
             }
            
        }
        else{
       if(count%2 == 0) { 
       if( z <= 30) {
       limit = false;
    }
   else if ( z == 450) {
        limit = true;
    }
    if(limit) {
       z -=  1;
    }
    else {
         z += 1;
    }
       }
   count++;
}

}
public  int getZ() {
    return z;
}
public boolean getLimit(int command) {
    if (command == 1) {
        return limit;
    }
    if (command == 2) {
        return limit2;
    }
     if (command == 3) {
        return limit3;
    }
    return false;
}    
public boolean getBouncy() { return bouncy; } 
public void setBouncy(int command) {
    if (command == 1) {
        bouncy = true;
    }
    else { bouncy = false;}
}
public void setPart(){
if(!part2)    {
    part2 = true;
}
else {
    part2 = false;
}
}
} 
