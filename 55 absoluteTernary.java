import java.util.Scanner;

class absoluteTernary {

    static void main(String[] args) {
        System.out.println("Absolute number calcualtor using ternary");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        int result = num >= 0? num : -num;
        System.out.printf("The absolute of the entered number %d is %d%n", num, result);
    }

}
