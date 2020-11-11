package skyland;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
public class game extends JPanel implements ActionListener {
    Timer loop;
    player player;
    enemy enemy;
    itemhp itemhp;
    controllhp ch;
    controllenemy ce;
    controllfood cf;
    controlldemon cd;
    ImageIcon background,background2,backgroundover;
    int T,SS, E,ans=0,t=1;
    int Time,Timee;
    public ImageIcon image;
    enemy en;
    food food;
    boolean end=false;
    demonball demonball;
    hp hp;
    public game() {
        loop = new Timer(10, this);
        loop.start();
        hp = new hp(670,30);
        player = new player(280, 200);
        demonball = new demonball(200,1000);
        food = new food(100,500);
        food = new food(100,500);
        addKeyListener(new key(player));
        ce = new controllenemy();
        cf = new controllfood();
        cd = new controlldemon();
        ch = new controllhp();
        setFocusable(true);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(getbackground(), 0, 0, 1000, 1000,this);
        player.draw(g2d);
        hp.draw(g2d);
        food.speedy=-1;
        itemhp.speedy=-2;
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Algerian", Font.CENTER_BASELINE, 40));
        g2d.drawString("TIME: " + Time, 740, 900);
        g2d.drawString("SCORE: " + player.Score, 715, 850);
        ch.draw(g2d);
        ce.draw(g2d);
        cf.draw(g2d);
        cd.draw(g2d);
        if(player.y<=0 || player.y>=900 || player.HP==0){
             //player.y=0;
             end=true;
        }
        if(end==true){
            g2d.drawImage(getbackgroundover(), 0, 0, 1000, 1000,this);
            loop.stop();
        }
        if(player.Score>=40){
            enemy.speedy=-1.5;
            demonball.speedy=-3;
            food.speedy=-1.5;
            itemhp.speedy=-3;
            super.paint(g);
            g2d.drawImage(getbackground2(), 0, 0, 1000, 1000,this);
            g.setColor(Color.YELLOW);
             player.draw(g2d);
             en.size=200;
            g.setFont(new Font("Algerian", Font.CENTER_BASELINE, 40));
            hp.draw(g2d);
            g2d.drawString("TIME: " + Timee, 750, 900);
            g2d.drawString("SCORE: " + player.Score, 725, 850);
            ce.draw(g2d);
            cf.draw(g2d);
            ch.draw(g2d);
            cd.draw(g2d);
            if(player.y<=0 || player.y>=900 || player.HP==0){
             end=true;
        }
        if(end==true){
            g2d.drawImage(getbackgroundover(), 0, 0, 1000, 1000,this);
            loop.stop();
        }
        }
        if(player.Score>=80){
            super.paint(g);
            g2d.drawImage(getbackgroundwin(), 0, 0, 1000, 1000,this);
            g.setFont(new Font("Algerian", Font.CENTER_BASELINE, 70));
            g.setColor(Color.WHITE);
            g2d.drawString("TIME: " + Timee, 400, 800);
            t=0;
            loop.stop();
        }
    }
    public Image getbackground() {
        ImageIcon background = new ImageIcon("./image/star44.jpg");
        return background.getImage();
    }
    public Image getbackground2() {
        ImageIcon background2 = new ImageIcon("./image/11.jpg");
        return background2.getImage();
    }
    public Image getbackgroundover() {
        ImageIcon background3 = new ImageIcon("./image/over.jpg");
        return background3.getImage();
    }
    public Image getbackgroundwin() {
        ImageIcon background4 = new ImageIcon("./image/winner.jpg");
        return background4.getImage();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        ch.update();
        ce.update();
        cf.update();
        cd.update();
        hp.update();
        repaint();
        T = T + t;
        if (T == 100 ) {
            T = 0;
        }
        if (T == 99 ) {
            Time = Time + 1;
            Timee = Timee + 1;
        }
    }   
}