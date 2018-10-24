/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.awt.*; 
import java.awt.geom.*; 
import javax.swing.*; 

/**
 *
 * @author David&Mandy
 */
public class Map extends JFrame {
    public Map(){
        super("Map"); 
        setSize (360,350); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        MapPane map = new MapPane(); 
        add(map); 
        setVisible(true); 
        
    }
    
    public static void main (String[] arguments){
        Map frame = new Map(); 
    }
}

class MapPane extends JPanel {
    public void paintComponent(Graphics comp){
        Graphics2D comp2D = (Graphics2D) comp; 
        comp2D.setColor(Color.blue); 
        comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON); 
        Rectangle2D.Float background = new Rectangle2D.Float(
        0F, 0F, getSize().width, getSize().height); 
       comp2D.fill(background); 
       
       //Draw waves
       
       comp2D.setColor(Color.white); 
       BasicStroke pen = new BasicStroke(2F, 
       BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND); 
       comp2D.setStroke(pen);
       for(int ax = 0; ax<340; ax += 10){
           for (int ay = 0; ay < 340; ay +=10){
               Arc2D.Float wave = new Arc2D.Float(ax,ay,10,10,0,-180, Arc2D.OPEN); 
               comp2D.draw(wave); 
           }
           }
       // Draw Florida
       
       GradientPaint gp = new GradientPaint (0F, 0F, Color.green, 350F, 350F, Color.orange, true); 
       comp2D.setPaint(gp); 
       GeneralPath f1 = new GeneralPath(); 
       f1.moveTo(10F, 12F);
       f1.lineTo(234F, 15F);
       f1.lineTo(253F, 25F);
       f1.lineTo(261F, 71F);
       f1.lineTo(344F, 209F);
       f1.lineTo(336F, 278F);
       f1.lineTo(295F, 310F);
       f1.lineTo(259F, 274F);
       f1.lineTo(205F, 188F);
       f1.lineTo(211F, 171F);
       f1.lineTo(195F, 174F);
       f1.lineTo(120F, 56F);
       f1.lineTo(94F, 68F);
       f1.lineTo(81F, 49F);
       f1.lineTo(12F, 37F);
       f1.closePath(); 
       comp2D.fill(f1);
       
       // Draw ovals
       comp2D.setColor(Color.PINK); 
       BasicStroke pen2 = new BasicStroke(); 
       comp2D.setStroke(pen2); 
       Ellipse2D.Float e1 = new Ellipse2D.Float(235, 140, 15, 15); 
       comp2D.fill(e1); 
    }
    
       
       }
       
  