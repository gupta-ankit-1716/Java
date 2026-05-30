import java.util.Scanner;

class oddEvenTernary {

    static void main(String[] args) {
        System.out.println("This program demonstrates odd or even number using ternary operator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num = input.nextInt();
        oddEvenTernary oddEven = new oddEvenTernary();
        //String result = num % 2 == 0 ? "Even" : "Odd";
        String result = oddEven.oddOrEven(num);
        System.out.printf("The entered number %d is %s%n", num, result);

    }

    public String oddOrEven(int num){
        return num % 2 == 0 ? "Even" : "Odd" ;
    }

}
