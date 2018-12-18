
class compute {
    public static void main (String args[]){
        int age; 
        age = 66; 
        
        switch (age){
            case 1: 
                System.out.println("Early Years - Foundation Course"); 
                        break; 
            case 2: 
                System.out.println("Early Years - Intermediate Course");
                        break;         
            case 3:
            case 4:
                System.out.println("Early Years Course");
                        break; 
            case 5: 
                System.out.println("Early Years Graduation Course");
                        break; 
            default: 
                System.out.println("All children in England between the ages of 5 and 16 are entitled to a free place at a state school. Please visit gov.uk for more details");
                        break; 
                
        }
    }
}