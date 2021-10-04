import java.text.DecimalFormat;
import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    /**
     * add amount to balance.
     * @param amount is the amount want to add
     */
    private void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /**
     * devide amount from balance.
     * @param amount is the amount want to devide
     */
    private void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else {
            this.balance -= amount;
        }
    }

    /**
     * add transaction to history.
     * @param amount is the amount want to change
     * @param operation is the status
     */
    public void addTransaction(double amount, String operation) {
        Transaction obj = new Transaction();
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
            obj.setAmount(amount);
            obj.setBalance(this.balance);
            obj.setOperation(Transaction.DEPOSIT);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
            obj.setAmount(amount);
            obj.setBalance(this.balance);
            obj.setOperation(Transaction.WITHDRAW);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
        transitionList.add(obj);
    }

    /**
     * prin the history.
     */
    public void  printTransaction() {
        DecimalFormat df = new DecimalFormat("#.00");
        for (int i = 0; i < transitionList.size(); i++) {
            double am = (double) Math.round(transitionList.get(i).getAmount() * 100) / 100;
            double bl = (double) Math.round(transitionList.get(i).getBalance() * 100) / 100;
            if (transitionList.get(i).getOperation().equals("deposit")) {
                System.out.println("Giao dich " + (i + 1) + ": Nap tien $"
                        + df.format(am) + ". So du luc nay: $" + df.format(bl) + ".");
            } else {
                System.out.println("Giao dich " + (i + 1) + ": Rut tien $"
                        + df.format(am) + ". So du luc nay: $" + df.format(bl) + ".");
            }
        }
    }

    /**
     * main function.
     * @param args null
     */
    public static void main(String[] args) {
        Account acc = new Account();
        acc.addTransaction(2000.255, "deposit");
        acc.addTransaction(1000, "withdraw");
        acc.printTransaction();
    }
}
