import java.util.Scanner;

class passwordChecker {

    static void main(String[] args) {
        System.out.println("Password Checker Program");
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.println("Enter the password:");
            password = input.next();

        }while(! isValidPass(password));
        System.out.println("Thanks for entering a valid Password.");


    }

    public static boolean isValidPass(String password){
        return password.length()>6;
    }

}
