import java.util.Scanner;

class MultiplicationUsingFor {

    static void main(String[] args) {
        System.out.println("Printing Tables");
        System.out.println("Enter the number whose table you want to print:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i = 1 ; i <= 10 ; i++){
            System.out.printf(" %d x %d = %d%n", num, i , num*i);

        }

    }

}
