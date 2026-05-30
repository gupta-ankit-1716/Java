import java.util.Scanner;

class caculatorUsingSwitch {

    static void main(String[] args) {
        System.out.println("Demonstrating Calculator:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Now, enter the second number:");
        int num2 = input.nextInt();
        System.out.println("Enter your required operation");
        String opr = input.next();
        System.out.printf("The result of the entered operation is : %d%n", calc(num1,num2,opr));
    }

    public static int calc(int num1, int num2, String opr){
        int output = switch(opr){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            default -> -1;
        };
        return output;
    }

}
