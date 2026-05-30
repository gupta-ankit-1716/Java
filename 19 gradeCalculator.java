import java.util.Scanner;

class gradeCalculator {

    static void main(String[] args) {
        System.out.println("This is a program to calculate grades based on the percentage entered:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the obtained percentage:");
        double per = input.nextDouble();
        System.out.printf("Your entered percentage is %.2f%% and your Grade is : %c%n", per, grade(per));

    }

    public static char grade(double per) {
        if (per >= 90 && per < 100) {
            return 'A';
        } else if (per >= 75 && per < 90) {
            return 'B';
        } else if (per >= 60 && per < 75) {
            return 'C';
        } else if (per >= 30 && per < 60) {
            return 'D';
        } else if (per >= 0 && per < 30) {
            return 'E';
        } else {
            return 'F';
        }

    }
}