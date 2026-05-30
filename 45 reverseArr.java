class reverseArr {

    static void main(String[] args) {
        System.out.println("Array Reversing Program:");
        int[] numArray = ArrayUtility.inputArray();
        System.out.println("Your entered Array is:");
        ArrayUtility.displayArray(numArray);
        System.out.println("The reversed Array is:");
        ArrayUtility.displayArray(reverseArray(numArray));


    }

    public static int[] reverseArray(int[] numArray){
        int[] reversed = new int[numArray.length];
        int i = 0;
        while(i < numArray.length){
            reversed[reversed.length - 1 - i] = numArray[i];
            i++;
        }
        return reversed;
    }

}
