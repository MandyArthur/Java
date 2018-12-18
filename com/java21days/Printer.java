/*
 * Creating methods that Override existing methods page 148 
 */
package com.java21days;

public class Printer {
    int x = 0; 
    int y = 1; 
    
void PrintMe(){
    System.out.println("x is "+ x + ", y is " + y );
    System.out.println("I am the instance of the class " + this.getClass().getName());
}    
}

class SubPrinter extends Printer {
    int z = 3; // Superclass does not define this variable and so it is not displayed. 
    public static void main (String[] arguments) {
        SubPrinter obj = new SubPrinter(); 
        obj.PrintMe();
    }
        void PrintMe(){ //override the first printMe() method in SubPrinter to display z variable 
    System.out.println("x is "+ x + ", y is " + y + ", z is " + z);
    System.out.println("I am the instance of the class " + this.getClass().getName());
}  
    }
    

/**
 * When the file is compiled, there are 2 files because the source defines the Printer and SubPrinter classes, the computer produces both. 
 * 
 */