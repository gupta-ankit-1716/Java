import java.util.Scanner;

class greatestOfThree {

    static void main(String[] args) {
        System.out.println("This is a program to check the greates of the three:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = input.nextInt();
        System.out.println("Enter the second number:");
        int b = input.nextInt();
        System.out.println("Enter the third number:");
        int c = input.nextInt();

        System.out.println("The greatest number among the given three number is:");
        System.out.print(isgreatest(a,b,c));

    }

    public static int isgreatest(int a,int b , int c ){
        if (a >= b && a >= c){
            return a;
        }else if(b >=a && b>= c){
            return b;

        }else{
            return c;
        }

    }

}
