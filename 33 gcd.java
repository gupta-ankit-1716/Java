import java.util.Scanner;

class gcd {

    static void main(String[] args) {
        System.out.println("This is a program to find the Greatest common divisor");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = input.nextInt();
        System.out.println("Now, enter the second number:");
        int second = input.nextInt();
        System.out.printf("The GCD of the two numbers %d & %d is %d%n", first , second, gcdtwo(first, second));
        input.close();
    }

    public static int gcdtwo(int first, int second){

        int gcd = 1;
        int i =2;
        int least = least(first, second);
        while( i <= least){
            if (first % i ==0 && second % i ==0){
                gcd = i;

            }i++;

        }return gcd;

    }

    public static int least(int first, int second){
        if (first > second){
            return second;
        }else{
            return first;
        }
    }



}
