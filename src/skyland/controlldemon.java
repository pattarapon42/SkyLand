
package skyland;

import java.awt.Graphics2D;
import java.util.LinkedList;


public class controlldemon {
     static LinkedList<demonball> cd = new LinkedList<>();
     demonball temppp;
     player player;
     public static int n=200;
    public controlldemon(){  
        adddemon(new demonball(n,1000));
        if(player.re==1){
            adddemon(new demonball(n,1000));
        }
        
}
        public void draw(Graphics2D g2d){
        for (int i = 0;i< cd.size();i++){
            temppp=cd.get(i);
            temppp.draw(g2d);
        }
    }
        public void update(){
        for (int i = 0;i< cd.size();i++){
            temppp=cd.get(i);
            temppp.update();
        }
    }
    //เพิ่ม obj บนจอ
    public void adddemon (demonball demonball){
        cd.add(demonball);
    }
    //ลบ obj บนจอ
    public void removedemon (demonball demonball){
        
        cd.remove(demonball);
    }
    
    public static LinkedList<demonball> getdemonBounds(){
        return cd;
    }
}

