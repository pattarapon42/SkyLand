
package skyland;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class key extends KeyAdapter {

    player p;

    public key(player p) {
        this.p = p;
    }
//กดปุ่มค้าง

    @Override
    public void keyPressed(KeyEvent e) {
        p.keyPressed(e);
    }
//ปล่อยปุ่ม

    @Override
    public void keyReleased(KeyEvent e) {
        p.keyReleased(e);
    }

}
