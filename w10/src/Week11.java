import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Week11<T> {

    /**
     * sort.
     * @param arr array
     * @return array
     */
    public static <T> List<T> sortGeneric(List<T> arr) {
        if (arr.get(0) instanceof String) {
            List<String> s1 = (List<String>) arr;
            s1.sort((x1, x2) -> {
                return x1.compareTo(x2);
            });
            arr = (List<T>) s1;
        } else if (arr.get(0) instanceof Integer) {
            List<Integer> s2 = (List<Integer>) arr;
            s2.sort((x1, x2) -> {
                return x1 - x2;
            });
            arr = (List<T>) s2;
        } else {
            arr.sort(
                    (Comparator<T>) Comparator.comparing(Person::getName)
                            .thenComparing(Person::getAge)
            );
        }
        return arr;
    }
}
