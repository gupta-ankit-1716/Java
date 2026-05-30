class sumAndAverage2D {

    static void main(String[] args) {
        System.out.println("This programs calculates the sum and average of the elements present in a 2D Array.");
        int[][] num2DArr = ArrayUtility.input2DArray();
        long sum = sum2DArr(num2DArr);
        double average = avg2DArr(num2DArr, sum);
        System.out.printf("The sum of the elements of the given 2D Array is: %d%n", sum);
        System.out.printf("The average of the elements of the given 2D Array is:%.2f%n", average);

    }

    public static long sum2DArr(int[][] num2DArr){
        int i = 0;
        long total = 0;
        while (i < num2DArr.length){
            int j = 0;
            while(j < num2DArr[i].length){
                total += num2DArr[i][j];
                j++;
            }
            i++;
        }return total;
    }

    public static double avg2DArr(int[][] num2DArr, long sum){
        if (num2DArr.length == 0){
            return 0;
        }
        int rows = num2DArr.length;
        int columns = num2DArr[0].length;
        double size = rows * columns;
        double avg = sum / size;
        return avg;
    }
}
