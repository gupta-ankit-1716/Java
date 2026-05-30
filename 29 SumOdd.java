import java.util.Scanner;

class SumOdd {

    //Create a program to sum all odd numbers from 1 to a specified number N.


    static void main(String[] args) {
        System.out.println("This is a program to sum all odd numbers from 1 to a specified number N.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range determining number:");
        int N = input.nextInt();
        SumOddTillN(N);
    }

    public static void SumOddTillN(int N){
        int sum = 0;
        int i = 1;
        while(i < N){
            sum += i;
            i += 2;

        } System.out.printf("The sum of the odd number from 1 till %d is %d%n", N, sum);

    }

}
