import java.util.Scanner;

class sumOfDigits {

    static void main(String[] args) {
        System.out.println("This program computes the sum of the digits of the integer.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer:");
        long num = input.nextLong();
        System.out.printf("The sum of the digits of the entered number %d is %d%n",num, sumDigit(num) );
    }

    public static long sumDigit(long num){

       long sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;

        }
        return sum;
    }

}
