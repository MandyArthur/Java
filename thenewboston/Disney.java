
import java.util.Scanner; 

class Disney{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in); 
        babynames babynameObject = new babynames(); 
        System.out.println("Enter baby name here: "); 
        String rofl = input.nextLine(); 
        babynameObject.setName(rofl);
        babynameObject.saying(); 
    }
}
