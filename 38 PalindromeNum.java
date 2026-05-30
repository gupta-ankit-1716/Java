import java.util.Scanner;

class PalindromeNum {

    static void main(String[] args) {
        System.out.println("Palindrome Number checker:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = input.nextInt();
        int reversedValue = reverse(num);
        System.out.printf("Is the number %d Palindrome? %b%n", num, pal(num, reversedValue));

    }

    public static boolean pal(int num, int reverseNum){
        return num == reverseNum;

    }

    public static int reverse(int num){
        int reverseNum = 0;
        while(num > 0){
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }return reverseNum;
    }

}
