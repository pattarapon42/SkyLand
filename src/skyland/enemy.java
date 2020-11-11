/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyland;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import static skyland.player.x;
import static skyland.player.y;

/**
 *
 * @author ภัทรพล
 */
public class enemy extends JPanel {

    game game;
    private int R;
    public int y;
    public int x;
    public static int size=300;
    public static double speedy = -1;
    Image char1;
    

    public enemy(int x, int y) {
        char1 = new ImageIcon("./image/sky.png").getImage();
        this.x = x;
        this.y = y;
        
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
         g.drawImage(char1, x, y, size, 30, this);
         
    }
    //วาดเส้นพื้น
    public void draw(Graphics2D g2d) {
        g2d.drawImage(char1, x, y, size, 30, this);
        //g2d.setColor(Color.darkGray);
        //g2d.fillRect(x, y, size, 10);
    }

    public void update() {
        y += speedy;
        Random ran = new Random();
        if (y < -400) {
            R = ran.nextInt(5);

            if (R == 1) {
                x = 150;
                y = 1000;
            } else if (R == 2) {
                x = 450;
                y = 1000;
            } else if (R == 3) {
                x = 700;
                y = 1000;
            } else if (R == 4) {
                x = 300;
                y = 1000;
            } else {
                x = 200;
                y = 1000;
            }
            
        }
        
      
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, size, 10);

    }
}
