import java.util.Scanner;

class concatString {
    static void main(String[] args) {
        System.out.println("String concatenating Program:");
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        String lastName = input.next();
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.printf("Your Name is %s", fullName.toUpperCase());
    }
}
