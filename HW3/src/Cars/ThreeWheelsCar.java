package Cars;

import GasStation.ICleaning;
import GasStation.IRefuel;

public class ThreeWheelsCar extends Car implements IRefuel, ICleaning{
    private String mark = "Three Wheels Car";
    private int num_wheels = 3;

    public ThreeWheelsCar(String model, String color, String exter, String control, String fuel_type,
            double vol_eng){
                super.mark = this.mark;
                super.model = model;
                super.color = color;
                super.exter = exter;
                super.control = control;
                super.fuel_type = fuel_type;
                super.num_wheels = this.num_wheels;
                super.vol_eng = vol_eng;

    }
    public void fly(){
        System.out.print("Fly");
    }


    @Override
    public void cleaningWindshield() {
        
    }

    @Override
    public void cleaningMirrors() {
        
    }

    @Override
    public void cleaningHeadlights() {
     
    }

    @Override
    public void refuelCar(String fuel_type) {
      
    }

    @Override
    public String toString() {
        return "ThreeWheelsCar :" + " mark " + mark + " model " + model + " color " + color + " exter " +
                exter + "control " + control + " fuel_type " + fuel_type + " num_wheels " + num_wheels +
                " vol_eng " + vol_eng;
    }
    
}
