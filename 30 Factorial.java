import java.util.Scanner;

class Factorial {

    static void main(String[] args) {

        System.out.println("This is a program to calculate the factorial of a number:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to find:");
        int num = input.nextInt();
        System.out.printf("The factorial of the entered number %d is %d%n", num, fact(num));

    }

    public static long fact(int num){
        if (num<2){
            return 1;
        }else {
            long factorial = 1;
            int i = 2;

            while (i <= num){
                factorial *= i;
                i++;
            }return factorial;

        }


    }

}
