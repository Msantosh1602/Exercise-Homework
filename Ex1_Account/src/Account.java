abstract class Account {
    protected String accountNo;
    protected String name;
    protected double amount;

    public Account(String accountNo, String name, double amount) {
        this.accountNo = accountNo;
        this.name = name;
        this.amount = amount;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
