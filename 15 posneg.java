import java.util.Scanner;

class posneg {

    static void main(String[] args) {
        System.out.println("This is a program to check for Postive, negative or zero:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        long num = input.nextLong();

        System.out.printf("The entered number %d is %s%n.", num, numcheck(num));

    }

    public static String numcheck(long num){

        if (num<0){
            return "negative";

        }else if(num>0){
            return "positive";

        }else {
            return "zero";
        }

    }

}
