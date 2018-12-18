package com.java21days; 

class Passer {
    
    void toUpperCase (String[] text){
        for (int i = 0; i<text.length; i++){ // for an index starting from 0 to (length of inut text) 
            text[i] = text[i].toUpperCase(); // turn each letter into CAPS
        }
    }
    public static void main (String[] arguments) {
        Passer passer = new Passer(); // creates new passer objects 
        passer.toUpperCase(arguments);  //the class invokes the function available in its class
        for (int i = 0; i < arguments.length; i++){ // for each letter in the argument
            System.out.print(arguments[i]+" "); // Print the result and a space
        }
        System.out.println();
    }
}