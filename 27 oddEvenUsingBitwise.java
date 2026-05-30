import java.util.Scanner;

class oddEvenUsingBitwise {
    // Write a program to check if a given number is even or odd using
    //bitwise operators.

    static void main(String[] args) {
        System.out.println("This is a program to check for odd or even number using the bitWise operator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        int num = input.nextInt();

        if((num & 1) == 1){
            System.out.printf("The entered number %d is Odd.",num);

        } else if (num == 0) {
            System.out.println("The entered number is zero.");
        } else{
            System.out.printf("The entered number %d is Even",num);
        }

    }
}
