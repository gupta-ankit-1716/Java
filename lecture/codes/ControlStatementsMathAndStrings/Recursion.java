package lecture.codes.ControlStatementsMathAndStrings;

import java.util.Scanner;

public class Recursion {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial Generation.");
        System.out.println("Please enter your number:");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.printf("Factorial for the number %d is %d%n", num, fact);

    }
    public static long factorial(int num){
        
        if (num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static long factorialIterative(int num){
        long result = 1;
        for(int i = 1; i <= num ; i++){
            result *= i;
        }
        return result;
    }
}
