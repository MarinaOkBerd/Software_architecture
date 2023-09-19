public class App {
    public static void main(String[] args) throws Exception {
        GeometryFigure figureBox = new GeometryFigure();
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(15);
        figureBox.add(circle1);
        figureBox.add(circle2);
        Triangle triangle1 = new Triangle(1, 2, 3);
        Triangle triangle2 = new Triangle(1.5, 2.7, 3.8);
        Triangle triangle3 = new Triangle(11.2, 18.2, 13);
        figureBox.add(triangle1);
        figureBox.add(triangle2);
        figureBox.add(triangle3);
        Rectangle rectangle1 = new Rectangle(20, 10);
        Rectangle rectangle2 = new Rectangle(10, 15);
        Rectangle rectangle3 = new Rectangle(17);
        figureBox.add(rectangle1);
        figureBox.add(rectangle2);
        figureBox.add(rectangle3);

        figureBox.getInfo(figureBox.getIndexShape(circle1));
        figureBox.getInfo(figureBox.getIndexShape(triangle2));
        figureBox.getInfo(figureBox.getIndexShape(rectangle3));
        figureBox.delete(figureBox.getIndexShape(rectangle3));
    }
}
