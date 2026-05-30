import java.util.Scanner;

class delElementFromArray {

    static void main(String[] args) {
        System.out.println("This programs deletes the given element from the Array and returns the Array.");
        Scanner input = new Scanner(System.in);
        int[] numArray= ArrayUtility.inputArray();
        System.out.println("Enter the element you want to delete:");
        int target = input.nextInt();
        System.out.print("Your entered Array was: ");
        ArrayUtility.displayArray(numArray);
        System.out.print("The Array after deletion is: ");
        int[] finalArr = deleteNum(numArray, target);
        ArrayUtility.displayArray(finalArr);


    }

    public static int[] deleteNum(int[] numArray, int target){

        int occ = ArrayOccur.occur(numArray, target);
        if(occ == 0){
            System.out.println("Your entered element was not found.");
            return numArray;

        }
        int newSize = numArray.length - occ;
        int[] newArray = new int[newSize];

        int i=0,  j = 0;
        while(i < numArray.length){
            if (numArray[i] != target){
                newArray[j] = numArray[i];
                j++;
            }i++;

        }

        return newArray;

    }

}
