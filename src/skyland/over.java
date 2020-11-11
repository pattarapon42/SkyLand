package skyland;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class over extends JPanel {

    JLabel mainmenuBackground = new JLabel(new ImageIcon("C:\\Users\\ภัทรพล\\Desktop\\โฟลเดอร์ใหม่ (6)\\game\\src\\FallBall\\over.jpg"));
    JLabel replayButton = new JLabel(new ImageIcon("C:\\Users\\ภัทรพล\\Desktop\\โฟลเดอร์ใหม่ (6)\\game\\src\\FallBall\\replay.jpg"));

    game game;

    public over() {

        setLayout(null);
        replayButton.setBounds(Skyland.WIDTH / 2 - 500, Skyland.HEIGHT / 2, 970, 100); //ปรับขนาดและตำแหน่งปุ่ม play
        mainmenuBackground.setBounds(0, 0, Skyland.WIDTH, Skyland.HEIGHT); //ปรับขนาดและตำแหน่งพื้นหลัง
        add(mainmenuBackground);

    }

}
