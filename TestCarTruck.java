
public class TestCarTruck {

    public static void main(String[] args) {
        
        Vehicle Eddiescar = new Car("Yellow",true);
        Vehicle Samstruck = new Truck("Orange",true);
        
        
        System.out.println(Eddiescar.toString());
        System.out.println(Samstruck.toString());
        
        
        GarageTester gt = new GarageTester();
        System.out.println("Garage Tester: "+gt.getExample());
        
        Customer nc1 = new Customer("Edwins","Kampala");
        Customer nc2 = new Customer("Sarah","Toronto");
        
        Vehicle audiCar = new Car("Purple",true);
        
        CarRentalContract cc3 = new CarRentalContract(nc2,audiCar);
        
        CarRental cr = new CarRental();
        cr.addContract(cc3);
      
        System.out.println("My Contracts:");
        System.out.println(cr.displayContracts());
        
    
    }
    
}
