
package skyland;

import java.awt.Graphics2D;
import java.util.LinkedList;


public class controllenemy {
     static LinkedList<enemy> ce = new LinkedList<>();
     enemy temp;
    public controllenemy(){
        addenemy(new enemy(100 , 350));
        addenemy(new enemy(450 , 550));
        addenemy(new enemy(250 , 750));
        addenemy(new enemy(600 , 950));
        addenemy(new enemy(450 , 1150));
        addenemy(new enemy(700 , 1350));
        addenemy(new enemy(450 , 1550));
        
        
}
        public void draw(Graphics2D g2d){
        for (int i = 0;i< ce.size();i++){
            temp=ce.get(i);
            temp.draw(g2d);
        }
    }
        public void update(){
        for (int i = 0;i< ce.size();i++){
            temp=ce.get(i);
            temp.update();
        }
    }
    //เพิ่ม obj บนจอ
    public void addenemy (enemy enemy){
        ce.add(enemy);
    }
    //ลบ obj บนจอ
    public void removeenemy (enemy enemy){
        ce.remove(enemy);
    }
    
    public static LinkedList<enemy> getenemyBounds(){
        return ce;
    }
}
