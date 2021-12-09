import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    /**
     * test rock.
     */
    public static void main(String[] args) throws IOException {
        String str = "", line;
        File file = new File("D:\\Code Assignment\\OOP\\w11\\src\\VolumeInfo.java");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (reader.readLine() != null) {
            str += reader.readLine() + "\n";
        }
        List<String> functions = new Week10().getAllFunctions(str);
        System.out.println(str);
    }
}
