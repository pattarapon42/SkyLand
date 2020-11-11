package skyland;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class manu extends JPanel{
    JLabel mainmenuBackground  = new JLabel (new ImageIcon("./image/home.jpg"));
    JLabel playButton = new JLabel (new ImageIcon("./image/start.jpg"));
   public manu(){
        setLayout(null);
        playButton.setBounds(Skyland.WIDTH/2-500,Skyland.HEIGHT/2,970,100); //ปรับขนาดและตำแหน่งปุ่ม play
        mainmenuBackground.setBounds(0,0,Skyland.WIDTH,Skyland.HEIGHT); //ปรับขนาดและตำแหน่งพื้นหลัง
        add(playButton);
        add(mainmenuBackground);     
   }
}