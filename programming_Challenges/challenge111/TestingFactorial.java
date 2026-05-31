package programming_Challenges.challenge111;

import java.util.Scanner;
import java.util.stream.IntStream;

public class TestingFactorial {
    static void main(String[] args) {
        System.out.println("Factorial using two ways");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to calculate : ");
        int number = input.nextInt();
        System.out.println(factorial(number));

        IntStream.rangeClosed(2,number).reduce((a,b)->a*b).ifPresent(System.out::println);
    }

    public static int factorial(int num){
        if (num == 0 || num == 1){
            return 1;
        }

        int fact = 1;
        for (int i = 2 ; i <= num ; i++ ){
            fact *= i;
        }
        return fact;
    }
}
