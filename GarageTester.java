
public class GarageTester {
    public String getExample(){
        Truck tr = new Truck("Black",false);

        Garage g = new Garage();
        return g.setVehicle(tr);
    }
}
