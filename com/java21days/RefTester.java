package com.java21days; 

import java.awt.Point; 

class RefTester {
    public static void main (String[]arguments){
        Point pt1, pt2; 
        pt1= new Point(100, 700); 
        pt2 = pt1; 
        
        pt1.x = 600; 
        pt1.y = 100; 
        
        System.out.println("Point1:" + pt1.x + ","+pt1.y);
        System.out.println("Point2:" + pt2.x + "," +pt2.y); 
        
    }
}
