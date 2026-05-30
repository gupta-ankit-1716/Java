import java.util.Scanner;

class swaptwo {

    static void main(String[] args) {
        System.out.println("This is a program to swap two numbers:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number to be swapped:");
        int a = input.nextInt();
        System.out.println("Enter the second number to be swapped with:");
        int b = input.nextInt();

        System.out.printf("Your entered numbers are: %d & %d \n", a, b );

        swap(a,b);


    }

    public static void swap(int a , int b){
        int c = a;
        a = b;
        b = c;

        System.out.printf("The swapped numbers are: %d & %d%n", a, b);

    }

}
