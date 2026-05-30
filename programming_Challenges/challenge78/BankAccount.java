package programming_Challenges.challenge78;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private long accountBalance;


    public BankAccount(String accountNumber, String accountHolderName, long accountBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName =accountHolderName;
        this.accountBalance = accountBalance;
    }

    public void depositMoney(double money){
        if(money <= 0){
            System.out.println("Invalid deposit.");
        }else {
            accountBalance += money;
        }
    }

    public double WithdrawMoney(double money){
        if (money <= 0){
            System.out.println("Invalid Withdrawl");
        }else if(accountBalance > money){
            System.out.println("Withdrawl Successful");
            accountBalance -= money;
        }else{
            money = accountBalance;
            accountBalance = 0;
            System.out.println("Insufficient Money");
        }
        return money;
    }

}
