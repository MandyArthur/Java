/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;
import java.util.*; 
/**
 *
 * @author David&Mandy
 */
public class ReverseWordString {
    public static void main(String args[]){
             
        
        String sentence, answer = ""; //initialise Strings
        Scanner in = new Scanner (System.in); 
        System.out.println("Here");
        sentence = in.nextLine(); 
        
        String[] arr = sentence.split(""); 
         int length = arr.length; // What is length of string
       
// starting from the last length (index -1), keep decreasing as you move forward in the loop
 for (String ss : arr){
      for (int i = length - 1 ; i >= 0 ; i--){

          //  System.out.println(sentence);
        

answer = answer + arr(i);



 }

System.out.println(answer);
    } 
    }
}