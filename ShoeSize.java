 import java.lang.Math; 
 import java.util.*; 

class ShoeSize{
    public static void main(String args[]){
             int sizes[]={1,2,4,5,6,7,8}; 
      
           
    Arrays.sort(sizes);
      System.out.print("Sorted Sizes: ");
      for (int x : sizes) {
        System.out.print(x + " ");
      }
      System.out.println("");
           
   
       
      double median = 0;
      double pos1 = Math.floor((sizes.length - 1.0) / 2.0);
      double pos2 = Math.ceil((sizes.length - 1.0) / 2.0);
      if (pos1 == pos2 ) {
         median = sizes[(int)pos1];
      } else {
         median = (sizes[(int)pos1] + sizes[(int)pos2]) / 2.0 ;
      }
 
      System.out.print("Median: "+ median); 
 
   }
}
   
