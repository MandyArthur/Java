package com.java21days;
        
class Averager {
    public static void main(String[] arguments) {
        int sum = 0;
 
        if (arguments.length > 0) { // make sure there is atleast 1 input by checking argument length
            for (int i = 0; i < arguments.length; i++) {
                sum += Integer.parseInt(arguments[i]); // parseInt takes a String object as input and returns int 
            }
            System.out.println("Sum is: " + sum);
            System.out.println("Average is: " +
                (float) sum / arguments.length);
        }
    }
}