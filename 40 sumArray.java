import java.util.Scanner;

class sumArray {

    static void main(String[] args) {
        System.out.println("Summing & Taking Average up all the elements of an Array.");
        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.printf("Sum of the numbers is : %d%n",sum);
        System.out.printf("Average of the numbers is : %.2f%n", avg);

    }

    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while (i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;

    }

    public static double average(int[] numArray){
        double sum = sum(numArray);
        return (sum/numArray.length);
    }


}
