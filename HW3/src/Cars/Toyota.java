package Cars;

import GasStation.ICleaning;
import GasStation.IRefuel;

public class Toyota extends Car implements IRefuel, ICleaning {
    private String mark = "Toyota";

    public Toyota(String model, String color, String exter, String control, String fuel_type, int num_wheels,
            double vol_eng) {
        super.mark = this.mark;
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
        return "Toyota :" + " model " + model + " color " + color + " exter " +
                exter + "control " + control + " fuel_type " + fuel_type + " num_wheels " + num_wheels +
                " vol_eng " + vol_eng;
    }
}
