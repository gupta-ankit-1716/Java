import java.util.Scanner;

class fibSeries {

    static void main(String[] args) {
        System.out.println("Fibonacci series");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number upto which you want the series to be:");
        int num = input.nextInt();
        fib(num);
    }

    public static void fib(int num){
        if (num < 0 ) return;
        System.out.print("0 ");
        if (num == 1) return;
        System.out.print("1 ");

        int first = 0 , second = 1;
        while(first + second <= num){
            int third = first + second;
            System.out.printf("%d ",third);
            first = second;
            second = third;

        }




    }

}
