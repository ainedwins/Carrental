
public class Truck extends Vehicle {
    boolean hasTrailer = false;
    
    Truck(String TruckColor,boolean trail){
        this.color = TruckColor;
        hasTrailer = trail;
    }
    
    public String toString(){
        
        return "The Vehicle is:"+getColor(color)+" has a trailer: "+trailer;
    }
}
