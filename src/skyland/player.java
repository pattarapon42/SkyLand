package skyland;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import static skyland.controlldemon.cd;

public class player extends JPanel implements ActionListener {
    public static int m, j, sizex, HP = 3;
    public static int y;
    public static int x, re = 0;
    int tit = 0;
    private int i;
    public static int Score = 0;
    //กำหนดความเร็วในการเคลื่อที่ของเกนx,y
    private int speedx = 0;
    private int speedy = 5;
    static LinkedList<itemhp> ch = controllhp.gethpBounds();
    static LinkedList<enemy> cn = controllenemy.getenemyBounds();
    static LinkedList<food> cf = controllfood.getfoodBounds();
    static LinkedList<demonball> cd = controlldemon.getdemonBounds();
    player player;
    demonball demonball;
    food food;
    itemhp itemhp;
    Image char1;
    public player(int x, int y) {
        char1 = new ImageIcon("./image/aiR.png").getImage();

        this.x = x;
        this.y = y;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(char1, x, y, 100, 100, this);

    }
//เมธฮดจัดการการเคลื่อนที่ของผู้เล่นจะทำงานตลอด
    public void update() {
        x += speedx;
        y += speedy;
        //การชนขอบ

        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
            speedy = 5;
        }
        if (x > 910) {
            x = 910;
        }
        if (y > 900) {
            y = 900;
        }
        if (m <= 0 && m < -80) {
            speedy = 8;
            m += speedy;
        } else {
            m += speedy;
        }
        colision();
    }

//วาดตัวละครผู้เล่น
    public void draw(Graphics2D g2d) {
        g2d.drawImage(char1, x, y, 100, 100, this);
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_D) {
            tit = 2;
            speedx = 8;
            char1 = new ImageIcon("./image/aiR.png").getImage();
        }
        if (key == KeyEvent.VK_A) {
            speedx = -8;
            tit = 1;
            char1 = new ImageIcon("./image/aiL.png").getImage();

        }
        if (key == KeyEvent.VK_W) {
            speedy = 2;
            char1 = new ImageIcon("./image/aiW.png").getImage();
        }

        if (key == KeyEvent.VK_S) {
            speedy = 10;
            if (key == KeyEvent.VK_A) {
                tit = 1;
                char1 = new ImageIcon("./image/aiL.png").getImage();
            }
            if (key == KeyEvent.VK_D) {
                tit = 2;
                char1 = new ImageIcon("./image/aiR.png").getImage();
            }
        }
        if (key == KeyEvent.VK_W && key == KeyEvent.VK_A) {
            speedy = 2;
            char1 = new ImageIcon("./image/aiW.png").getImage();
        }
        if (key == KeyEvent.VK_W && key == KeyEvent.VK_D) {
            speedy = 2;
            char1 = new ImageIcon("./image/aiW.png").getImage();
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_A) {
            tit = 1;
            speedx = 0;

        }
        if (key == KeyEvent.VK_D) {
            tit = 2;
            speedx = 0;

        }
        if (key == KeyEvent.VK_W) {
            speedy = 5;
            if (key == KeyEvent.VK_A) {
                tit = 1;
                char1 = new ImageIcon("./image/aiL.png").getImage();
            }
            if (key == KeyEvent.VK_D) {
                tit = 2;
                char1 = new ImageIcon("./image/aiR.png").getImage();
            }
        }
        if (key == KeyEvent.VK_S) {
            speedy = 5;
        }
    }
    public Rectangle getBounds() {

        return new Rectangle(x, y, 100, 100);
    }

    public void colision() {
        int number;

        for (int i = 0; i < cn.size(); i++) {
            if (getBounds().intersects(cn.get(i).getBounds())) {
                m = 0;
                if (tit == 1) {
                    char1 = new ImageIcon("./image/aiL.png").getImage();
                }
                if (tit == 2) {
                    char1 = new ImageIcon("./image/aiR.png").getImage();
                }
                speedy = -4;

            }
        }
        for (int i = 0; i < ch.size(); i++) {
            if (getBounds().intersects(ch.get(i).getBounds())) {
                itemhp.rx = 0;
                itemhp.ry = 0;
                if (HP < 3) {
                    HP = HP + 1;
                }
            }
        }
        for (int i = 0; i < cf.size(); i++) {
            if (getBounds().intersects(cf.get(i).getBounds())) {
                food.rx = 0;
                food.ry = 0;
                Score = Score + 10;
            }
        }
        for (int i = 0; i < cd.size(); i++) {
            if (getBounds().intersects(cd.get(i).getBounds())) {
                demonball.rx = 0;
                demonball.ry = 0;
                HP = HP - 1;

            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

