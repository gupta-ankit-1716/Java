import java.util.Scanner;

class minTwo {

    static void main(String[] args) {
        System.out.println("Minimum of two number using the ternary operator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Now, enter the second number:");
        int num2 = input.nextInt();
        // WHY THIS LINE IS HERE:
// The method 'min()' below is an instance method (it lacks the 'static' keyword).
// Because the 'main' method is static, it cannot call non-static methods directly.
// Therefore, we use 'new' to instantiate an object of the class in memory,
// creating a "remote control" (the variable 'ternary') to invoke the 'min' method.
        minTwo ternary = new minTwo();
        int min = ternary.min(num1, num2);
        System.out.printf("Minimum number is : %d%n", min);

    }

    public int min(int num1, int num2){
        return num1 > num2 ? num2 : num1;
    }



}

