
public class Car extends Vehicle {
    
    boolean hasWinterTires = false;
    
    Car(String carcolor,boolean tires){
        
        this.color = carcolor;
        hasWinterTires = tires;
    }
    
    public String toString(){
        
        return "The Vehicle is:"+getColor(color)+" has winter tires "+hasWinterTires;
    }
}
