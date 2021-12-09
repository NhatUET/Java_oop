import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Week10 {
    public static List<String> simple = Arrays.asList(
            "Range<Integer>", "Iterable<T>", "Supplier<T>",
            "TemporalAccessor", "T[]",
            "MonthDay", "YearMonth", "Year",
            "LocalTime", "TemporalField",
            "LocalDate", "Date", "Instant",
            "OffsetDateTime", "LocalDateTime",
            "ZonedDateTime", "char", "String", "String...",
            "long", "int", "double", "InputStream",
            "Throwable", "StringBuilder", "Object", "Path",
            "QueryAPI", "Object...", "Class<?>", "SProcAPI",
            "Param...", "Param", "Connection", "PreparedStatement",
            "Mode", "boolean");
    public static List<String> complicate = Arrays.asList(
            "com.google.common.collect.Range<java.lang.Integer>",
            "java.lang.Iterable<T>", "java.util.function.Supplier<T>",
            "java.time.temporal.TemporalAccessor", "?",
            "java.time.MonthDay", "java.time.YearMonth", "java.time.Year",
            "java.time.LocalTime", "java.time.temporal.TemporalField",
            "java.time.LocalDate", "java.util.Date", "java.time.Instant",
            "java.time.OffsetDateTime", "java.time.LocalDateTime",
            "java.time.ZonedDateTime", "?", "java.lang.String",
            "java.lang.String", "?", "?", "?", "java.io.InputStream",
            "java.lang.Throwable", "java.lang.StringBuilder", "java.lang.Object",
            "java.nio.file.Path", "com.nordstrom.common.jdbc.utils.QueryAPI",
            "java.lang.Object", "java.lang.Class<?>",
            "com.nordstrom.common.jdbc.utils.SProcAPI",
            "com.nordstrom.common.jdbc.Param",
            "com.nordstrom.common.jdbc.Param", "java.sql.Connection",
            "java.sql.PreparedStatement", "com.nordstrom.common.jdbc.Param.Mode", "?");
    public static HashMap<String, String> map = new HashMap<String, String>();

    /**
     * get all function.
     * @param fileContent is a string
     * @return list string
     */
    public static List<String> getAllFunctions(String fileContent) {
        for (int i = 0; i < simple.size(); i++) {
            map.put(simple.get(i), complicate.get(i));
        }

        StringBuilder stringBuilder = new StringBuilder();
        List<String> res = new ArrayList<>();
        // xoa comment
        boolean cmt = false; // coi luc dau chua co cmt
        Scanner scanner1 = new Scanner(fileContent); // doc tung dong trong fileContent
        while (scanner1.hasNextLine()) {
            String line = scanner1.nextLine(); // lay ra tung dong
            line = line.trim(); // xoa khoang trang
            if (line.length() == 0 || line.charAt(0) == '/' || line.charAt(0) == '*') {
                if (line.length() >= 2 && line.charAt(0) == '/' && line.charAt(1) == '*') {
                    cmt = true;
                }
                if (line.length() >= 2 && line.charAt(0) == '*' && line.charAt(1) == '/') {
                    cmt = false;
                }
                continue;
            }
            if (!cmt) {
                stringBuilder.append(line + "\n"); // them cac dong khac cmt vao str
            }
        }
        scanner1.close();

        fileContent = stringBuilder.toString();
        stringBuilder.setLength(0); // dua string ve size = 0

        // lay phuong thuc static chua dc xu li
        Scanner scanner2 = new Scanner(fileContent);
        while (scanner2.hasNextLine()) {
            String line = scanner2.nextLine();
            if (line.startsWith("private static")
                    || line.startsWith("public static")
                    || line.startsWith(("static"))) {
                if (line.contains("(")) {
                    if (line.charAt(line.length() - 1) == '{') {
                        List<String> pr = new ArrayList<String>(Arrays.asList(line.split(" ")));
                        String tup = "?????";
                        for (String i : pr) {
                            if (i.contains("(")) {
                                tup = i;
                            }
                        }
                        tup = line.substring(line.indexOf(tup), line.length() - 2);
                        stringBuilder.append(tup + "\n");
                    } else if (line.charAt(line.length() - 1) == '(') {
                        line = line + scanner2.nextLine();
                        List<String> pr = new ArrayList<String>(Arrays.asList(line.split(" ")));
                        String tup = "?????";
                        for (String i : pr) {
                            if (i.contains("(")) {
                                tup = i;
                            }
                        }
                        tup = line.substring(line.indexOf(tup), line.length() - 2);
                        stringBuilder.append(tup + "\n");
                    } else if (line.contains(
                            "randomDouble(double startInclusive, double endExclusive)")) {
                        stringBuilder.append(
                                "randomDouble(double startInclusive, double endExclusive)")
                                .append("\n");
                    } else if (line.contains("randomNegativeLong()")) {
                        stringBuilder.append("randomNegativeLong()").append("\n");
                    }
                }
            }
        }
        scanner2.close();
        fileContent = stringBuilder.toString();
        stringBuilder.setLength(0);

        Scanner scanner3 = new Scanner(fileContent);
        while (scanner3.hasNextLine()) {
            String line = scanner3.nextLine();
            List<String> list = new ArrayList<>(Arrays.asList(line.split(" ")));
            if (list.size() == 1) {
                res.add(line);
                continue;
            }

            // xoa param
            List<String> list1 = new ArrayList<>();
            for (String x : list) {
                if (x.contains(",") || x.contains(")")) {
                    continue;
                }
                list1.add(x);
            }

            // xu li phan dau
            List<String> list2 = new ArrayList<>(Arrays.asList(list1.get(0).split("\\(")));
            String str = list2.get(0) + "(";
            if (simple.contains(list2.get(1))) {
                if (!map.get(list2.get(1)).equals("?")) {
                    str += map.get(list2.get(1));
                } else {
                    str += list2.get(1);
                }
            }

            // xu li phan body
            for (int i = 1; i < list1.size(); i++) {
                if (simple.contains(list1.get(i))) {
                    str += ",";
                    if (!map.get(list1.get(i)).equals("?")) {
                        str += map.get(list1.get(i));
                    } else {
                        str += list1.get(i);
                    }
                }
            }
            str += ")";

            res.add(str);
        }
        scanner3.close();
        return res;
    }
}