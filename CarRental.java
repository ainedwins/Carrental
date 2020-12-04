
import java.util.Arrays;


public class CarRental {
    String carArray[] = new String[CarRentalContract.carObjects];
    
    void addContract(CarRentalContract c1){

        for(int x=0; x<carArray.length; x++){
            carArray[x] = c1.toString(); 
        }
    }

    String displayContracts(){
          
        if(carArray.length > 0){
           for (String contract : carArray){
               System.out.println(contract);
            } 
        }
        else{            
            return "No Car Rental Contracts";
        }
        return "";
    }
    
    
}
