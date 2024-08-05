final class CurrentAccount extends Account{
    private static final double MINIMUM_BALANCE =1000;

    public CurrentAccount(String accountNo, String name, double amount) {
        super(accountNo, name, amount);
    }

    @Override
    public void deposit(double amount){
        this.amount+=amount;
        System.out.println("Deposited "+amount+", New Balance is: "+this.amount);
    }
    @Override
    public void withdraw(double amount){
        if(this.amount-amount>=MINIMUM_BALANCE){
            this.amount-=amount;
            System.out.println("Withdrawn "+amount+", New Balance is: "+this.amount);
        }else{
            System.out.println("Cannot withdraw below minimum balance");
        }
    }
}
