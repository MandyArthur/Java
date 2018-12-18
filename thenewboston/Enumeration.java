
public enum Enumeration{
    Mandy("nice", "28"), 
    David("smart", "30"), 
    Rob("aussie","27"), 
    Jegan("respectful", "28"),
    Gajan("twin","28"), 
    Katie("perfect","27"), 
    Tom("Met the Queen", "30"); 
    
    private final String desc; 
    private final String year;

    Enumeration(String description, String birthday){
        desc = description; 
        year = birthday; 
        
    }
    
    public String getDesc(){
        return desc; 
        
    }
    
    public String getYear(){
        return year; 
    }
}