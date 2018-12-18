
class sumOfAges{
    public static void main (String[] args){
        int celestial[] = {3,4,5,67,3}; 
        int total = 0; 
        int product = 1; 
       
        for(int counter = 0; counter<celestial.length; counter++){
            total+=celestial[counter]; 
            product*=celestial[counter]; 
    }
    
    System.out.println("The sum of these numbers is " +total); 
            System.out.println("The product of these numbers is " +product);
}

}