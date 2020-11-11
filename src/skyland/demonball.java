
package skyland;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class demonball extends JPanel{
    Image char1,char2;
    public static int x;
    public static int y;
    public static int R,rx=60,ry=60;
    public static int speedy = -2;
    public demonball(int x, int y) {
        char1 = new ImageIcon("./image/demonball.png").getImage();
        this.x = x;
        this.y = y;

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
        if (y < -400) {
             R = ran.nextInt(4);
             rx=60;
                ry=60;
                char1 = new ImageIcon("./image/demonball.png").getImage();
            if (R == 1) {
                x = 100;
                y = 1000;
            } else if (R == 2) {
                x = 300;
                y = 1000;
            } else if (R == 3) {
                x = 600;
                y = 1000;
            } else if (R == 4) {
                x = 700;
                y = 1000;
            } else if(R == 5){
                x = 800;
                y = 1000;
            }
            
        }
    }
    
}

