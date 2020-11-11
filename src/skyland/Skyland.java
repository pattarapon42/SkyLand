package skyland;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Skyland extends JFrame implements MouseListener{
    //Create windows GUI
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 1000;
    static game game;
    static manu mainmenu = new manu();
    public Skyland() {
        add(mainmenu);
        mainmenu.playButton.addMouseListener(this);//ลงทะเบียน event ปุ่ม play
    }
    public static void main (String [] args) {
        JFrame window = new Skyland();
        window.setSize(WIDTH, HEIGHT);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setTitle("SKY LAND");
        window.setVisible(true);               
    }
    @Override
    public void mouseClicked(MouseEvent e)  {
        if (e.getSource() == mainmenu.playButton){ //กดปุ่ม play จะสลับไปหน้าเกม
            game = new game();
            remove(mainmenu); //ลบ component หน้าหลักทั้งหมด
            setSize(Skyland.WIDTH,Skyland.HEIGHT); 
            add(game); //เพิ่ม component class เกมทั้งหมด
            setLocationRelativeTo(null);
            setVisible(true);
            setResizable(false);
            game.requestFocusInWindow(); 
            this.validate();
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {      
    }
    @Override
    public void mouseReleased(MouseEvent e) {       
    }
    @Override
    public void mouseEntered(MouseEvent e) {       
    }
    @Override
    public void mouseExited(MouseEvent e) {   
    }   
}