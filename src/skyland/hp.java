package skyland;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class hp extends JPanel{
    Image char1;
    player player;
    private int x;
    private int y;
    
    
    public hp(int x, int y) {
        char1 = new ImageIcon("./image/hp3.png").getImage();
        this.x = x;
        this.y = y;
        
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(char1, x, y, 300, 60, this);
        
        
    }

    public void update(){
        if(player.HP==3){
            char1 = new ImageIcon("./image/hp3.png").getImage();
        }
        if(player.HP==2){
            char1 = new ImageIcon("./image/hp2.png").getImage();
        }
        if(player.HP==1){
            char1 = new ImageIcon("./image/hp1.png").getImage();
        }

    }
    
}


