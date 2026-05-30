import java.util.Scanner;

class lcm {

    static void main(String[] args) {
        System.out.println("This is a program to compute LCM of two given numbers:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        long first = input.nextLong();
        System.out.println("Now, enter the second number:");
        long second = input.nextLong();
        System.out.printf("The LCM of the entered two numbers %d & %d is %d%n", first, second, lcmtwo(first, second));


    }

    public static long lcmtwo(long first, long second){
        long i = 1;
        while(true){
            long factor = first * i;
            if (factor % second == 0){
                return factor;
            }i++;
        }

    }

}
