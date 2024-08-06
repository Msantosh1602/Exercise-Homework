import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account type (1 for Savings Account and 2 for Current Account)");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Account Number: ");
        String accountNo= sc.nextLine();
        System.out.println("Enter Name: ");
        String name= sc.nextLine();
        System.out.println("Enter Amount: ");
        double amount= sc.nextDouble();

        Account acc = null;
        if(choice==1){
            acc= new SBAccount(accountNo,name,amount);
        } else if (choice==2) {
            acc=new CurrentAccount(accountNo,name,amount);
        }
        if(acc!=null){
            System.out.println("Account created successfully");
            System.out.println("Enter action (1 for deposit, 2 for withdraw  and 3 to check monthly interest): ");
            int action = sc.nextInt();

            if (action==1){
                System.out.println("Enter Amount: ");
                double transferAmount = sc.nextDouble();
                acc.deposit(transferAmount);
            } else if (action==2) {
                System.out.println("Enter Amount: ");
                double transferAmount = sc.nextDouble();
                acc.withdraw(transferAmount);
            } else if (action==3 && acc instanceof SBAccount) {
                ((SBAccount) acc).addMonthlyInterest();
            } else {
                System.out.println("Invalid action selection");
            }
        }else {
            System.out.println("Invalid account type selection");
        }

        sc.close();
    }
}