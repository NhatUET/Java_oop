import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {
    /**
     * print information.
     * @param shape list
     * @return information
     */
    public static String printInfo(List<GeometricObject> shape) {
        StringBuilder res = new StringBuilder();
        res.append("Circle:\n");
        for (GeometricObject x : shape) {
            if (x instanceof Circle) {
                res.append(x.getInfo()).append("\n");
            }
        }
        res.append("Triangle:\n");
        for (GeometricObject x : shape) {
            if (x instanceof Triangle) {
                res.append(x.getInfo()).append("\n");
            }
        }
        return res.toString();
    }
}
