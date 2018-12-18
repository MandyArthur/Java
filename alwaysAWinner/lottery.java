import java.util.Random; 

class lottery{
    public static void main (String[]args){
        
        Random winner = new Random(); 
        int numbers; 
        
        for (int counter = 1; counter <=5; counter++){
            numbers = winner.nextInt(100); 
    System.out.println(numbers+""); 
        }
    }
}