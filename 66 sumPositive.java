import java.util.Scanner;

class sumPositive {
    static void main(String[] args) {
        System.out.println("Summing only positive numbers:");
        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();

        int sum = 0;

        for(int num : numArray){
            if(num < 0){
                continue;
            }
            sum += num;
        }
        System.out.printf("The sum of the entered numbers is %d%n", sum);
    }
}
