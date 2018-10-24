package thenewboston; 
import java.util.Scanner; 

class customerFeedback{
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in); 
        Wambulance opinion = new Wambulance();
        
        System.out.println("Enter your opnion here: "); 
        String moan = input.nextLine(); 
        
        opinion.simpleMessage(moan); 
        
       
        problemSolution smartaxe = new problemSolution();
        
        System.out.println("How would it be better? "); 
        String fix = input.nextLine(); 
        
        smartaxe.helpUs(fix); 
    }
}