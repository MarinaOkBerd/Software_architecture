import java.util.ArrayList;
import java.util.List;

public class GeometryFigure {
    static private List<IShape> toolbox;

    public GeometryFigure() {
        toolbox = new ArrayList<IShape>();
    }

    // Метод для добаления новой фигуры
    public void add(IShape figure) {
        toolbox.add(figure);
    }

    // Метод для удаления фигуры
    public void delete(int num) {
        if (toolbox.size() > num && num >= 0) {
            toolbox.remove(num);
        }
    }

    // Метод поиска необходимой фигуры
    public int getIndexShape(IShape figure) {
        return toolbox.indexOf(figure);
    }

    // Метод отображения подробной информации о фигурк
    public void getInfo(int num) {
        if (toolbox.size() > num && num >= 0) {
            IShape figure = toolbox.get(num);
            System.out.println(figure.toString() + " " + figure.getArea() + " " + figure.getPerimeter());
        } else {
            System.out.println("No figure.");
        }

    }

}
