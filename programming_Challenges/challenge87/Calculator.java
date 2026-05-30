package programming_Challenges.challenge87;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        System.out.println("Arithmetic Exception handling.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int first = input.nextInt();
        System.out.println("Enter the denominator:");
        int second = input.nextInt();

        try{
            int result = first / second;
            System.out.printf("Result is %d%n", result);
        }catch (ArithmeticException exception){
            if(exception.getMessage().equals("/ by zero")){
                System.out.println("Division by zero occured.");
            }else{
                throw exception;
            }
        }

    }
}
