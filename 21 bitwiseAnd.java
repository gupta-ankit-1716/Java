import java.util.Scanner;

class bitwiseAnd {
// Create a program that shows bitwise AND of two numbers.
    static void main(String[] args) {

        System.out.println("This is a program that shows the bitwise AND of two numbers.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the first no.:");
        int first = input.nextInt();
        System.out.println("Now, enter the second no.:");
        int second = input.nextInt();

        int result = first & second;
        System.out.printf("The bitwise AND operation between the two numbers %d & %d results in %d%n",first, second, result);

    }

}
