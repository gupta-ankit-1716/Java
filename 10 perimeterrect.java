import java.util.Scanner;

class perimeterrect {

    static void main() {
        System.out.println("This is a program to calculate the perimeter of a rectangle:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size length in cms:");
        double length = input.nextDouble();
        System.out.println("Entet the size of breadth in cms:");
        double breadth = input.nextDouble();
        input.close();
        System.out.printf("The Perimeter of the rectangle is %.2f%n", perimeter(length, breadth));


    }

    public static double perimeter(double length, double breadth){

        double peri = (2*(length + breadth));


        return peri;
    }

}

