
public class StaticMemberList{
private String first; 
private String last; 
private static int members = 0; 

     

public StaticMemberList(String fn, String ln){
first = fn; 
last = ln; 
members++; 
System.out.printf("Member ID for %s %s, Reference ID: %d\n", first, last, members); 

}
public String getFirst(){
    return first; 
}
public String getSecond(){
    return last; 
}
public static int getMembers(){
    return members; 
}
}
// Members is static which is shared among all objects, so we dont need to make a seperate variable that is going to unique