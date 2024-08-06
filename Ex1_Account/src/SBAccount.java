final class SBAccount extends Account{

    private static final double INTEREST_RATE= 0.04;
    private static final double MINIMUM_BALANCE =1000;

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
        if(this.amount-amount>=MINIMUM_BALANCE){
            this.amount-=amount;
            System.out.println("Withdrawn "+amount+", New Balance is: "+this.amount);
        }else{
            System.out.println("Cannot withdraw below minimum balance");
        }
    }

    public void addMonthlyInterest(){
        this.amount+=this.amount * INTEREST_RATE;
        System.out.println("Monthly interest added. New Balance is: "+this.amount);
    }
}
