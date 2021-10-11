import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape obj) {
        shapes.add(obj);
    }

    public void removeCircles() {
        String key = "Circle";
        shapes.removeIf(shape -> shape.toString().contains(key));
    }

    public String getInfor() {
        StringBuilder res = new StringBuilder();
        res.append("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            res.append(shape.toString() + "\n");
        }
        return res.toString();
    }

    public void  removeDuplicates() {
        Set<Shape> res = new HashSet<>();
        for (Shape shape : shapes) {
            res.add(shape);
        }
        shapes.clear();
        for (int i = 0; i < res.size(); i++) {
            
        }
    }
}
