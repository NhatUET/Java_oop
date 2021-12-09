import java.util.List;
import java.util.regex.Pattern;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";

    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList;

    public Account() {

    }

    /**
     * constructor.
     * @param accountNumber acc
     * @param balance st
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // getter
    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void doWithdrawing(double amount) {

    }

    public void doDepositing(double amount) {

    }

    public abstract void withdraw(double x);
    public abstract void deposit(double x);

    public String getTransactionHistory() {
        return transactionList.toString();
    }

    public void addTransaction(Transaction obj) {
        transactionList.add(obj);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            return ((Account) obj).accountNumber == getAccountNumber();
        }
        return false;
    }
}
