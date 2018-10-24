package com.java21days;

class StringChecker{
    
    public static void main(String[]arguments){
        String str = "A lannister always pays his debts"; 
        System.out.println("The string is: " + str); 
        System.out.println("The length of this string is: " + str.length());
        System.out.println("The character at position 6 : " + str.charAt(6));
        System.out.println("The substring from 12 to 18: " + str.substring(12,18));
        System.out.println("The index of the first 't': " + str.indexOf('t'));
        System.out.println("The index of the beginning of the " + "substring \"debts\": "+ str.indexOf("debts"));
        System.out.println("The string in uppercase: " + str.toUpperCase());
    } 
    
}