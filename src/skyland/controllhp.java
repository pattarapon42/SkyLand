/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyland;

import java.awt.Graphics2D;
import java.util.LinkedList;

/**
 *
 * @author ภัทรพล
 */
public class controllhp {
     static LinkedList<itemhp> ch = new LinkedList<>();
     itemhp tempp;
    public controllhp(){  
        addhp(new itemhp(100,2000));      
        
        
}
        public void draw(Graphics2D g2d){
        for (int i = 0;i< ch.size();i++){
            tempp=ch.get(i);
            tempp.draw(g2d);
        }
    }
        public void update(){
        for (int i = 0;i< ch.size();i++){
            tempp=ch.get(i);
            tempp.update();
        }
    }
    //เพิ่ม obj บนจอ
    public void addhp (itemhp itemhp){
        ch.add(itemhp);
    }
    //ลบ obj บนจอ
    public void removehp (itemhp itemhp){
        
        ch.remove(itemhp);
    }
    
    public static LinkedList<itemhp> gethpBounds(){
        return ch;
    }
}

