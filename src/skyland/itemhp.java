
package skyland;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class itemhp extends JPanel{
    Image char1;
    
    public static int x;
    public static int y;
    public static int R,rx=60,ry=60;
    //กำหนดความเร็วในการเคลื่อที่ของเกนx,y
    public static int speedy = 0;
  
    public itemhp(int x, int y) {
        char1 = new ImageIcon("./image/hp.png").getImage();
        this.x = x;
        this.y = y;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
         g.drawImage(char1, x, y, 60, 60, this);

    }
    public void draw(Graphics2D g2d){
        g2d.drawImage(char1, x, y, 60, 60, this);
    }
    public Rectangle getBounds() { 
        return new Rectangle(x, y, rx, ry);
    }
    public void update(){
        y+=speedy;
        Random ran = new Random();
        if(rx==0&&ry==0){
            char1 = new ImageIcon("./image/wab.png").getImage();
        }
        if (y < -2000) {
             R = ran.nextInt(5);
             rx=60;
                ry=60;
                char1 = new ImageIcon("./image/hp.png").getImage();
            if (R == 1) {
                x = 100;
                y = 2000;
            } else if (R == 2) {
                x = 400;
                y = 2000;
            } else if (R == 3) {
                x = 700;
                y = 2000;
            } else if (R == 4) {
                x = 500;
                y = 1500;
            } else {
                x = 900;
                y = 2000;
            }
            
        }
        
    }
    
}


