class Clock{
    public static void main(String[] args){
        RegTime RegTimeObject = new RegTime(); 
        System.out.println(RegTimeObject.toMilitary()); 
              System.out.println(RegTimeObject.normTime()); 
        RegTimeObject.setTime(13,3,67); 
               System.out.println(RegTimeObject.toMilitary());
               System.out.println(RegTimeObject.normTime());
              
        
    }
}