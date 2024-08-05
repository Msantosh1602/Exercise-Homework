final class SBAccount extends Account{

    private static final double INTEREST_RATE= 0.04;

    public SBAccount(String accountNo, String name, double amount) {
        super(accountNo, name, amount);
    }
    @Override
    public void deposit(double amount){
        this.amount+=amount;
        System.out.println("Deposited "+amount+", New Balance is: "+this.amount);
    }
    @Override
    public void withdraw(double amount){
        if(amount<=this.amount){
            this.amount-=amount;
            System.out.println("Withdrawn "+amount+", New Balance is: "+this.amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    public void addMonthlyInterest(){
        this.amount=this.amount * INTEREST_RATE;
    }
}
