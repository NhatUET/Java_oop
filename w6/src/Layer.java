import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Layer {
    private List<Shape> shapes = new ArrayList<Shape>();

    public void addShape(Shape obj) {
        shapes.add(obj);
    }

    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * get information.
     * @return information
     */
    public String getInfo() {
        StringBuilder res = new StringBuilder();
        res.append("Layer of crazy shapes: ").append("\n");
        for (Shape shape : shapes) {
            res.append(shape.toString()).append("\n");
        }
        return res.toString();
    }

    /**
     * remove duplicates.
     */
    public void removeDuplicates() {
        Set<Shape> set = new LinkedHashSet<Shape>(shapes);
        shapes.clear();
        shapes.addAll(set);
    }

    public static void main(String[] args) {
        Shape c1 = new Circle(new Point(10.5,5.0), 8.0, "RED", true);
        Shape c2 = new Rectangle(new Point(10.5,5.0), 8.0, 6.0, "RED", true);
        Shape c3 = new Rectangle(new Point(10.5,5.0), 8.0, 6.0, "BLUE", true);
        Shape c4 = new Square(new Point(10.5,5.0), 8.0, "RED", true);
        Layer layer = new Layer();
        layer.shapes.add(c1); layer.shapes.add(c2);
        layer.shapes.add(c1); layer.shapes.add(c3);
        layer.shapes.add(c4);
        System.out.println(layer.getInfo());
        layer.removeDuplicates();
        System.out.println(layer.getInfo());
        layer.shapes.add(c1); layer.shapes.add(c3);
        layer.shapes.add(c4);
        System.out.println(layer.getInfo());
        layer.removeDuplicates();
        System.out.println(layer.getInfo());
    }
}
