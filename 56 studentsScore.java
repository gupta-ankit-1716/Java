import java.util.Scanner;

class studentsScore {

    static void main(String[] args) {
        System.out.println("This program categorizes student scores based on their marks obatained.");
        System.out.println("Enter the marks obtained: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String result = num >= 80 ? "High" : (num >= 50 ? "Moderate" : "Low" );
        System.out.printf("Your entered score is %d and the obtained grade is %s%n", num, result);
    }

}
