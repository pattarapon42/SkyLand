
package skyland;

import java.awt.Graphics2D;
import java.util.LinkedList;

/**
 *
 * @author ภัทรพล
 */
public class controllfood {
     static LinkedList<food> cf = new LinkedList<>();
     food tempp;
    public controllfood(){  
        addfood(new food(510,1500));      
        addfood(new food(350,500));
        addfood(new food(500,900));
     }
        public void draw(Graphics2D g2d){
        for (int i = 0;i< cf.size();i++){
            tempp=cf.get(i);
            tempp.draw(g2d);
        }
    }
        public void update(){
        for (int i = 0;i< cf.size();i++){
            tempp=cf.get(i);
            tempp.update();
        }
    }
    //เพิ่ม obj บนจอ
    public void addfood (food food){
        cf.add(food);
    }
    //ลบ obj บนจอ
    public void removefood (food food){
        
        cf.remove(food);
    }
    
    public static LinkedList<food> getfoodBounds(){
        return cf;
    }
}

