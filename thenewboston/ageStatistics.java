//nested if-else statement
//nested if else 
class ageStatistics{
    
    public static void main (String[] args){
        int age = 61; 
        
        if (age < 13){
            System.out.println(" You're at school now. You have so little to worry about. Relish this!");
        }else {
                    System.out.println("Your options are to save up for a mortgage deposit, for a home you'll own by the age of 115. ");
                    if (age<16){
                    System.out.println("You'll grow out of your acne once you stop eating candy!");
                    }else{
                        System.out.println("Maybe go travelling instead? Hashtag LifeExperience"); 
                    }  
        if (age>65){
                    System.out.println("Retirement! When you have so much time and so little energy");
                    }else{
                        System.out.println("Work aint so bad! Soon you'll be retired!"); 
                    }  
        }
    }
}