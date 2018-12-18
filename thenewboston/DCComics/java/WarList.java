/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thenewboston.DCComics.java;

/**
 *
 * @author David&Mandy
 */
public class WarList {
    private dianaPrince[] thelist = new dianaPrince[5]; 
    private int x=0;
    
    public void add(dianaPrince d){
        if(x<thelist.length){
            thelist[x]=d; 
            System.out.println("Diana fought alongside "+x);
            x++; 
        }
    }
    
}
