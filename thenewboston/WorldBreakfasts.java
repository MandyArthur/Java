import java.util.Scanner; 

class breafast{
    public static void main(String args[]){
        Scanner food = new Scanner(System.in); 
        String country, foodItems, cals, result; 
        System.out.println("Country : "); 
        country = food.nextLine(); 
        System.out.println("What do they have for breakfast : "); 
        foodItems = food.nextLine();
        System.out.println("Total amount of calories : "); 
        cals = food.nextLine(); 
         
        System.out.println("In "+ country +", we eat " + foodItems + " and it has "+ cals+" calories"); 
        
    }
}