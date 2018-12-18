/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.awt.Point; 

/**
 *
 * @author David&Mandy
 */
public class Box2 { // initialise the corners
    int x1 = 0; 
    int y1 = 0; 
    int x2 = 0; 
    int y2 = 0;
    
    Box2(int x1, int y1, int x2, int y2){ // User input for values 
        this.x1 = x1; 
        this.y1 = y1; //} Assigning the input values instead of the initialised ones
        this.x2 = x2; 
        this.y2 = y2;
    }
    
    Box2(Point topLeft, Point bottomRight){
        this(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
    }
    
    Box2(Point topLeft, int w, int h){ // get one point and desired the width & height of box
        this(topLeft.x, topLeft.y, topLeft.x + w, topLeft.y+ h); // calculate points from user input
    }
    void printBox(){
        System.out.print("Box: <" + x1 + "," + y1); 
        System.out.println(", " + x2 + "," + y2 + ">");
    }
    
    public static void main(String[] arguments){
        Box2 rect; 
        
        System.out.println("Calling Box2 with coordinates " + "(25, 25) and (50,50): ");
        rect = new Box2 (25, 25, 50, 50); 
        rect.printBox();
        
        System.out.println("\nCalling Box2 with points " + "(10, 10), with 50  and height 50: ");
        rect = new Box2 (new Point (10,10), 50, 50); 
                rect.printBox(); 
    }
    
    }
