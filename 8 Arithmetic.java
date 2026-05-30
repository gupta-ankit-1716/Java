import java.util.Scanner;

class Arithmetic {

    static void main(String[] args) {
        System.out.println("This is a program to demonstrate the Arithmetic operations:");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = input.nextInt();
        System.out.println("Enter the second number:");
        int b = input.nextInt();

        int add = a + b ;
        int sub = a - b ;
        int mul = a * b ;
        int div = a / b ;
        int mod = a % b ;



        System.out.printf("Addition operation: %d + %d = %d%n", a ,b, add);
        System.out.printf("Subtraction operation: %d - %d = %d%n", a ,b, sub);
        System.out.printf("Multiplication operation: %d x %d = %d%n", a ,b, mul);
        System.out.printf("Division operation: %d / %d = %d%n", a ,b, div);
        System.out.printf("Modulus operation: %d modulus %d = %d%n", a ,b, mod);

    }

}
