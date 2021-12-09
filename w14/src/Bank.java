import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Bank {
    private List<Customer> customerList;

    public void readCustomerList(InputStream inputStream) throws IOException {
        byte[] arr = new byte[1000];
        while (inputStream.read(arr) != -1) {
            String data = new String(arr);
            String[] s = data.split(" ");
            if (s[0].matches("[a-zA-Z]")) {

            }
        }

    }

    public String getCustomersInfoByNameOrder() {
        return null;
    }

    public String getCustomersInfoByIdOrder() {
        return null;
    }

    public List<Customer> getCustomerList() {
        return null;
    }


}
