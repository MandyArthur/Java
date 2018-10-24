
public class tester{
   private String name; 
   private potpie birthday; 
   
   public tester(String theName, potpie theDate){
       name = theName; 
       birthday = theDate; 
   }
   
   public String toString(){
       return String.format("My name is %s, my birthday is %s",name, birthday );
   }
}