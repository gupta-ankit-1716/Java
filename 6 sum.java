import java.util.Scanner;

class sum {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a program to add two numbers:");
        System.out.println("Please enter first number:");
        int a = input.nextInt();
        System.out.println("Please enter another number: ");
        int b = input.nextInt();

        int sum = a + b;

        System.out.printf("The sum of the two numbers is: %d", sum);

    }

}
