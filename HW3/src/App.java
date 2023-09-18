import Cars.Car;
import Cars.FlyCar;
import Cars.ThreeWheelsCar;
import Cars.Toyota;

public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Toyota("camry", "blue", "седан", "механическая КП", "ДТ", 4, 2.5);
        System.out.println(car1);
        Car car2 = new ThreeWheelsCar("555", "black", "седан","механическая КП" ,"ДТ", 4.5);
        System.out.println(car2);
        Car car3 = new FlyCar("Fly", "One", "green","седан" ,"механическая КП", "ДТ", 4, 5.0);
        System.out.println(car3);
    }
}
