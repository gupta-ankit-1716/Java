import java.util.Scanner;

class floatproduct {

    static void main(String[] args) {
        System.out.println("This is a programe to find the product of two floating point numbers:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first floating point number: ");
        float a = input.nextFloat();
        System.out.println("Enter the second floating point number: ");
        float b = input.nextFloat();

        float product = a * b;

        System.out.printf("Product %.3f x %.3f is: %.3f%n ", a ,b ,product);

    }

}
