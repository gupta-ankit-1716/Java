import java.util.Arrays;

class arrayPalindrome {

    static void main(String[] args) {
        System.out.println("Array Palindrome checker");
        int[] numArray = ArrayUtility.inputArray();
        System.out.println("Your entered Array is:");
        ArrayUtility.displayArray(numArray);

        int[] reversedArray = reverseArr(numArray);
        if(Arrays.equals(numArray, reversedArray)){
            System.out.println("The entered Array is a Palindrome.");
        }else{
            System.out.println("NO, The entered Array is not Palindrome.");
        }

    }

    public static int[] reverseArr(int[] numArray){
        int i = 0;
        int[] reversed = new int[numArray.length];
        while (i < numArray.length){
            reversed[(numArray.length - 1) - i] = numArray[i];
            i++;
        }
        return reversed;

    }



    //    public static boolean isPalindrome(int[] numArray) {
    //        int i = 0;
    //        while (i < numArray.length / 2) {
    //            if (numArray[i] != numArray[(numArray.length - 1) - i]) {
    //                return false;
    //            }
    //            i++;
    //        }
    //        return true;
    //    }


}


