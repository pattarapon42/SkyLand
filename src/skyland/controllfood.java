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
public class controllfood {
     static LinkedList<food> cf = new LinkedList<>();
     food tempp;
    public controllfood(){  
        addfood(new food(510,1500));      
        addfood(new food(350,500));
        addfood(new food(500,900));
        /*addfood(new food(900,2000));
        addfood(new food(100,2200));
        addfood(new food(800,500));
        addfood(new food(220,3000));
        addfood(new food(220,3200));
        addfood(new food(250 , 3500));
        addfood(new food(900 , 3850));
        addfood(new food(200 , 4150));
        addfood(new food(450 , 4550));
        addfood(new food(250 , 4900));*/
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

