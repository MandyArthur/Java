class MarsRobot {
    String status; 
    int speed; 
    float temperature; 
    
    void checkTemperature () {
        if (temperature < -80){
            status = "returning home"; 
            speed = 5; 
        }
    }
    
    void showAttributes (){
        System.out.println("Status:"+ status); 
        System.out.println("Speed:" + speed); 
        System.out.println("Temperature:" + temperature); 
    }
}
class MarsRobot2 { 
    String status; 
    int speed; 
    float temperature; 
    void checkTemperature(){
        if (temperature < -70){
            status = "return home"; 
            speed=5; 
            
        }
    }
    
    void showAttributes(){
        System.out.println ("Status:" + status); 
        System.out.println ("Speed:" + speed); 
        System.out.println("Temperature:" + temperature);
    }
}