import java.util.Scanner;

class fibRecursion {
    static void main(String[] args) {
        System.out.println("Fibonacci Series:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of elements to be printed:");
        int count = input.nextInt();

        for(int i = 0 ; i <= count ; i++){
            System.out.printf("%d ",fib(i));
        }
    }

    public static int fib(int position){
        if(position == 0){
            return 0;
        }
        if(position == 1){
            return 1;
        }

        return fib(position-2)+fib(position-1);

    }

}
