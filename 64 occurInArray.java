import java.util.Scanner;

class occurInArray {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("No. of occurrences finder.");
        int [] numArray = ArrayUtility.inputArray();
        System.out.print("Your entered array is :");
        ArrayUtility.displayArray(numArray);
        System.out.println("Enter the number whose occurrence you want to find:");
        int num = input.nextInt();
        System.out.printf("The occurrences of the number %d is %d times in the given Array", num, occurArr(numArray, num));
    }

    public static int occurArr(int[] numArray, int num){
        int occurrences = 0;
        for(int i = 0 ; i < numArray.length ; i ++){
            if(numArray[i] == num){
                occurrences++;
            }
        }
        return occurrences;
    }

}
