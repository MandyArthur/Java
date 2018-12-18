/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David&Mandy
 */
public class result {
     public static void main(String [] args){
        
        int a, b, result;
        a = Integer.parseInt(args[0]); 
        b = Integer.parseInt(args[1]); 
        char ch = ' ';
        
        switch (ch){
            case '+':
                result = a + b; 
                break; 
            case '-':
                result = a - b; 
                break; 
            case '*':
                result = a * b; 
                break;
                
        }
        
         System.out.println(result);
             
        }
}
        
    
}
}
