
class enhancedForLoop{
    public static void main (String[] args){
        int mandy[] = {3,4,5,6,78}; 
        int total = 0; 
       
        
        for(int x: mandy){
            total+=x;
        }
        
        System.out.println(total);
    }
}