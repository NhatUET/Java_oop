import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

public class Week8Task2 {
    public static void nullPointerEx() throws NullPointerException {
        throw new NullPointerException();
    }

    /**
     * bắt lỗi null.
     * @return tên lỗi
     */
    public static String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    public static void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * bắt lỗi null.
     * @return tên lỗi
     */
    public static String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    public static void arithmeticEx() throws ArithmeticException {
        throw new ArithmeticException();
    }

    /**
     * bắt lỗi null.
     * @return tên lỗi
     */
    public static String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    public static void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    /**
     * bắt lỗi null.
     * @return tên lỗi
     */
    public static String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    public static void ioEx() throws IOException {
        throw new IOException();
    }

    /**
     * bắt lỗi null.
     * @return tên lỗi
     */
    public static String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}
