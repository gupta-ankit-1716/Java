class maxAndMinArray {

    static void main(String[] args) {
        System.out.println("This is a program to find the Maximum and Minimum element from an Array.");
        int[] numArray = ArrayUtility.inputArray();
        int min = minNum(numArray);
        int max = maxNum(numArray);
        System.out.printf("The Maximum number entered in the Array was : %d%n",max);
        System.out.printf("The Minimum number entered in the Array was : %d%n",min);


    }

    public static int minNum(int[] numArray){

        if(numArray.length == Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArray.length){
            if (min > numArray[i]){
                min = numArray[i];
            }
            i++;
        }
        return min;
    }

    public static int maxNum(int[] numArray){
        if (numArray.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < numArray.length){
            if (max < numArray[i]){
                max = numArray[i];
            }
            i++;
        }
        return max;
    }

}
