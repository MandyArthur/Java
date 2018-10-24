import java.util.Scanner; 
import java.lang.Math; 
// Using Math & casting int/double/long to make sqrt & pow work
class FindX{
    public static void main (String[]args){
        Scanner Equation = new Scanner(System.in); 
        long a, b,h,c,f,g,ans1, ans2, den, num1, num2;
       
      
        System.out.println("Insert 'a' of quadratic equation: "); 
        a = Equation.nextLong(); 
        System.out.println("Insert 'b' of quadratic equation: "); 
        b = Equation.nextLong(); 
        System.out.println("Insert 'c' of quadratic equation: "); 
        c = Equation.nextLong(); 
      
        double e = (double)Math.pow(b,2); //        e = Math.multiplyExact(b, b);
        
        System.out.println("b squared is  " + e);
        
        f = Math.multiplyExact(4, a);
                System.out.println("f is  " + f);
        g = Math.multiplyExact(f, c);
                System.out.println("g is  " + g);
        long u = (long)e; 
        h = Math.subtractExact(u, g); 
                System.out.println("h is  " + h);
        
 int d = (int) Math.sqrt(h); // You can just cast the result to int:
              
        System.out.println("The discriminant is:  " + d);
        
        den= Math.multiplyExact(2, a); 
        num1 = Math.addExact(-b, d); 
        num2 = Math.subtractExact(-b, d); 
        ans1 = Math.floorDiv(num1, den); 
        ans2 = Math.floorDiv(num2, den); 
        
        System.out.println("Values of x =  " + ans1+"," +ans2);
        
        System.out.println("Your quadratic equation was (x + "+ -ans1+")(x + "+ -ans2+")");
        
    }
}
