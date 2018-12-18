public class babynames{
    private String babyName; 
    
    //constructor allows us to pass name into baby name anytime we create an object. To initialise a variable as soon as an object is contructed. 
    
    public babynames (String name){
        babyName = name; 
    }
    public void setName(String name){
        babyName=name; 
    }
    public String getName(){
        return babyName;
    }
    public void saying(){
        System.out.printf( "Your baby's name is %s", getName()); 
    }
}
//Disney//
