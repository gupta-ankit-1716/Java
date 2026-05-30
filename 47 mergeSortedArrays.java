class mergeSortedArrays {

    static void main(String[] args) {
        System.out.println("This programs merges up the two sorted arrays.");
        System.out.println("Enter the values for Array 1st:");
        int[] numArray1 = ArrayUtility.inputArray();
        System.out.println("Now, enter the values for Array 2nd:");
        int[] numArray2 = ArrayUtility.inputArray();
        System.out.println("Your entered Array1 is:");
        ArrayUtility.displayArray(numArray1);
        System.out.println("Your entered Array1 is:");
        ArrayUtility.displayArray(numArray2);
        System.out.println("Your final merged and sorted Array is:");
        int[] newArray = mergeSort(numArray1,numArray2);
        ArrayUtility.displayArray(newArray);


    }
    public static int[] mergeSort(int[] numArray1, int[] numArray2){
        int newSize = numArray1.length + numArray2.length;
        int[] newArr = new int[newSize];
        int i = 0, j = 0, k = 0 ;
        while (i < numArray1.length || j < numArray2.length){
            if(j == numArray2.length || (i <  numArray1.length && numArray1[i] < numArray2[j])){
                newArr[k] = numArray1[i];
                i++;
                k++;
            }else{
                newArr[k] = numArray2[j];
                k++;
                j++;

            }
        }return newArr;

    }

}
