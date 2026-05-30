import java.util.Scanner;

class tempconver {

    static void main(String[] args) {
        System.out.println("This is a temperature conversion program:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature you want to convert in Fahrenheit:");
        double temp = input.nextDouble();
        System.out.printf("The given temperature in Celsius is : %f%n  ", tempConvert(temp));
    }

    public static double tempConvert(double temp){

        double inCel = (temp-32)*((double) 5 /9);
        return inCel;

    }
}
