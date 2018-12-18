/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;
import java.awt.Point; // https://docs.oracle.com/javase/8/docs/api/java/awt/Point.html

public class NamedPoint extends Point {
    String name; 
    
    NamedPoint(int x, int y, String name){
        super(x,y); 
        this.name = name; 
        
    }
    
    public static void main(String[] arguments){
        NamedPoint np = new NamedPoint(5, 5, "SmallPoint"); 
        System.out.println("x is " + np.x);
         System.out.println("y is " + np.y);
          System.out.println("name is " + np.name);
    }
    
}
