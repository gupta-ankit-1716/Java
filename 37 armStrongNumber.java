import java.util.Scanner;

class armStrongNumber {
// An Armstrong number (also known as a Narcissistic number) is a number that is equal to the sum of its own digits, each raised to the power of the total number of digits.
    static void main(String[] args) {
        System.out.println("Armstrong Number checker:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        int num = input.nextInt();
        System.out.printf("Is the number %d Armstrong? %b%n", num, boolarm(num));

    }

    public static boolean boolarm(int num){
        int noOfDig = noOfDigits(num);
        int newNum = num;
        int finalNum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            num /= 10;
            finalNum += Math.pow(lastDigit, noOfDig);

        }
            return finalNum == newNum;

    }


    public static int noOfDigits(int num){
        int digit = 0;
        while (num > 0){
            digit ++;
            num /= 10;
        }return digit;
    }

}
