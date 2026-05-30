import java.util.Scanner;

class reverseDigits {

    static void main(String[] args) {
        System.out.println("Reversing Digits Program:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse:");
        long num = input.nextInt();
        System.out.printf("Your entered number is %d and its reverse is %d%n", num, reverse(num));

    }

    public static long reverse(long num){
        long reversenum = 0;
        while(num >0){
            long digit = num % 10;
            reversenum = reversenum*10 + digit;
            num /= 10;

        }
            return reversenum;
    }


}
