import java.util.Scanner;

class Multiplication {

    static void main(String[] args) {

        System.out.println("This is a program to generate the Multiplication table of any given number.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number whose Multiplication Table you want to be generated.");
        int num = input.nextInt();
        MultiplicationTable(num);


    }

    public static void MultiplicationTable(int num){
       int i = 1;
       while(i <= 10){
           System.out.printf("%d x %d = %d%n",num , i, num*i);
           i++;

       }

    }

}
