package programming_Challenges.challenge78;

public class Customer {

    static void main(String[] args) {
        System.out.println("Welcome to Banking Servies");
        BankAccount customer1 = new BankAccount("2334445","Jack", 13400 );
        customer1.depositMoney(1000);
        System.out.println(customer1.WithdrawMoney(200));
        customer1.depositMoney(2100);
        customer1.WithdrawMoney(120000);

    }

}
