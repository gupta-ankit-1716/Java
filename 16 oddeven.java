import java.util.Scanner;

class oddeven {

    static void main(String[] args) {
        System.out.println("This is a program to check for odd or even:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        int num = input.nextInt();

        System.out.printf("The entered number %d is %s%n", num, numcheck(num));
    }

    public static String numcheck(int num){

        if(num % 2 == 0){
            return "even";
        }else if(num % 2 == 1){
            return "odd";
        }else {
            return "zero";
        }

    }

}
