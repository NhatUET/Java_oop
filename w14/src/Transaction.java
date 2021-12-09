public class Transaction {
    public final static int TYPE_DEPOSIT_CHECKING = 1000;
    public final static int TYPE_WITHDRAW_CHECKING = 1000;
    public final static int TYPE_DEPOSIT_SAVINGS = 1000;
    public final static int TYPE_WITHDRAW_SAVINGS = 5000;

    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    private String getTransactionTypeString(int type) {
        return null;
    }

    public String getTransactionSumary() {
        return null;
    }
}
