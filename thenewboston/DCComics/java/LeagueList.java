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
public class LeagueList {
    
    private theLeague[] thelist = new theLeague[7]; 
    private int i = 0; 
    
    public void add(theLeague a){
        if (i<thelist.length){
            thelist[i]=a; 
            System.out.println("Hero added at index "+i); 
            i++; 
        }
    }
    
}
