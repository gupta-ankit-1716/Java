import java.util.Scanner;

class areatraingle {

    static void main(String[] args) {
        System.out.println("This is a program to calculate the area of a triangle:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the base in cms:");
        double base = input.nextDouble();
        System.out.println("Now, enter the size of the height in cms:");
        double height = input.nextDouble();

        System.out.printf("The area of the triangle is : %.2f%n", area(base,height));

    }

    public static double area(double base, double height){

        double area = (base*height)/2;
        return area;


    }

}
