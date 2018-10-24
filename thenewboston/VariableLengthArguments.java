

class VariableLengthArguments{
    public static void main (String[] args){
        System.out.println(average(1,3,4,5,6,76,43,23,3)); 
}
    
public static double average(double...numbers){
    int total = 0; 
    for(double x:numbers)
        total+=x; 
    
    return total/numbers.length; 
}}