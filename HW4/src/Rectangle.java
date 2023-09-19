public class Rectangle implements IShape {
    private double sideX;
    private double sideY;

    public Rectangle(double sideX, double sideY) {
        this.sideX = sideX;
        this.sideY = sideY;
    }

    public Rectangle(double sideX) {
        this.sideX = sideX;
        this.sideY = sideX;
    }

    public double getSideX() {
        return sideX;
    }

    public void setSideX(double sideX) {
        this.sideX = sideX;
    }

    public double getSideY() {
        return sideY;
    }

    public void setSideY(double sideY) {
        this.sideY = sideY;
    }

    @Override
    public double getArea() {
        return sideX * sideY;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideX + sideY);
    }

    @Override
    public String toString() {
        return "Rectangle: side X = " + sideX + ", side Y = " + sideY;
    }

}
