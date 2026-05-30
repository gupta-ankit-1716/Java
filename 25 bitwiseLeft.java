import java.util.Scanner;

class bitwiseLeft {
// Create a program that shows bitwise AND of two numbers.
    static void main(String[] args) {

        System.out.println("This is a program that shows the bitwise Compliment(bitwise NOR) of two numbers.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the first no.:");
        int first = input.nextInt();

        int result = first << 2; //Shifts the number by two spaces
        System.out.printf("The bitwise Compliment operation on the number %d  results in %d%n",first, result);

    }

}
