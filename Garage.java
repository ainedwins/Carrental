
public class Garage {
   
    Vehicle c = new Car("Black",true);
    Vehicle t = new Truck("Silver",true);


    public String setVehicle(Vehicle parked){
       return parked.toString();       
    }
    public String toString(){ 
       return "Description of the parked vehicle "+t.toString()+c.toString();  
    }
     
}
