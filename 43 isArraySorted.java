class isArraySorted {

    static void main(String[] args) {
        System.out.println("Array Sort check:");
        int[] numArray = ArrayUtility.inputArray();



        if (isDecreasing(numArray) || isIncreasing(numArray)){
            System.out.println("Your entered array is:");
            ArrayUtility.displayArray(numArray);
            System.out.printf("The entered array is Sorted");
        }else{
            System.out.println("Your entered array is:");
            ArrayUtility.displayArray(numArray);
            System.out.printf("The entered array is not sorted.");
        }

    }

    public static boolean isIncreasing(int[] numArray){
        int i = 1 ;
        while(i < numArray.length){
            if (numArray[i] < numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }


    public static boolean isDecreasing(int[] numArray){
        int i = 1;
        while(i < numArray.length){
            if (numArray[i] > numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

}
