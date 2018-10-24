
public class Final{
    private int sum; 
    private final int NUMBER; /**constants are in caps*/
    
    public Final(int x){
        NUMBER = x; 
        
    }
    public void add(){
        sum+=NUMBER; 
        
    }
    public String toString(){
        return String.format("sum =%d\n", sum); 
    }
    
}