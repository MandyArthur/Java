import java.util.Scanner; 

class Casio{
    public static void main(String args[]){
        Scanner fx83ES = new Scanner(System.in);  
        double fnum, snum, result; 
        System.out.println("Enter first number: "); 
        fnum = fx83ES.nextDouble(); 
        System.out.println("Enter second number: "); 
        snum = fx83ES.nextDouble(); 
        result = fnum + snum;
        System.out.println("Your answer is " + result);
    }
}