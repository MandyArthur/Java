
public class potpie{
    private int month; 
    private int day; 
    private int year; 
    //build constructor 
    public potpie(int m, int d, int y){
        month = m; 
        day = d; 
        year = y; 
        
        System.out.printf("The constructor for this is %s\n", this);
    }
    
    public String toString(){ //toString method built into Java
        return String.format("%02d/%02d/%02d",month, day, year); 
    }
}

