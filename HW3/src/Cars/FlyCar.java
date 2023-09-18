package Cars;

import GasStation.ICleaning;
import GasStation.IRefuel;

public class FlyCar extends Car implements IRefuel, ICleaning{
    public FlyCar(String mark, String model, String color, String exter, String control, String fuel_type, int num_wheels,
            double vol_eng){
                super.mark = mark;
                super.model = model;
                super.color = color;
                super.exter = exter;
                super.control = control;
                super.fuel_type = fuel_type;
                super.num_wheels = num_wheels;
                super.vol_eng = vol_eng;

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
        return "FlyCar :" + " mark " + mark + " model " + model + " color " + color + " exter " +
                exter + "control " + control + " fuel_type " + fuel_type + " num_wheels " + num_wheels +
                " vol_eng " + vol_eng;
    }
}
