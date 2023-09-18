package Cars;

public abstract class Car {
    protected String mark, model, color, exter, fuel_type, control;
    protected int num_wheels;
    protected double vol_eng;
    protected boolean light_on;
    protected boolean wipers_on;

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getExter() {
        return exter;

    }

    public String getFuel_type() {
        return fuel_type;
    }

    public String getControl() {
        return control;
    }

    public int getNumWheels() {
        return num_wheels;
    }

    public double getVolEng() {
        return vol_eng;
    }

    public boolean isWipersOn() {
        return wipers_on;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setExter(String exter) {
        this.exter = exter;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public void setNum_wheels(int num_wheels) {
        this.num_wheels = num_wheels;
    }

    public void setVol_eng(double vol_eng) {
        this.vol_eng = vol_eng;
    }

    public void setLight_on(boolean light_on) {
        this.light_on = light_on;
    }

    public void setWipers_on(boolean wipers_on) {
        this.wipers_on = wipers_on;
    }

    protected String movement() {
        return "Move";
    }

    protected String service() {
        return "Service";

    }
}
