import java.util.Scanner;

class helloname {


    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your name:");

        String name = scanner.next();

        System.out.printf("Hello, %s",name);


    }

}
