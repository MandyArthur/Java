import java.util.Random; 

class pickLuckyNumbers{
    public static void main (String[]args){
        
        Random winner = new Random(); 
        int numbers; 
        
        for (int counter = 1; counter <=5; counter++){
            numbers = winner.nextInt(100); 
    System.out.println("Your suggested lucky number is " + numbers + ""); 
        }
    }
}
// Random number generator 