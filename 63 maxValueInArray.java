import java.util.Scanner;

class maxValueInArray {

    static void main(String[] args) {
        System.out.println("This programs fetches out the maximum value present in an array.");
        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();
        System.out.println("Your entered Array is:");
        ArrayUtility.displayArray(numArray);
        System.out.printf("The maximum value among the entered values is : %d%n", maxVal(numArray));
    }

    public static int maxVal(int[] numArray){
        int max = Integer.MIN_VALUE;
        for (int i = 0 ;  i < numArray.length ; i++){
            if(numArray[i] > max){
                max = numArray[i];
            }
        }
        return max;
    }

}
