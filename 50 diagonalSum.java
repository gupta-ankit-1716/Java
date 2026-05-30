class diagonalSu {

    static void main(String[] args) {
        System.out.println("Diagonal Sum program.");
        int[][] num2DArr = ArrayUtility.input2DArray();
        long diagSum = diagonalSum(num2DArr);
        System.out.printf("The diagonal sum of the given 2D Array is: %d%n", diagSum);
    }

    public static long diagonalSum(int[][] num2DArr){
        long sumLeftDia = leftDiagonalSum(num2DArr);
        long sumRightDia = rightDiagonalSum(num2DArr);
        long sum = sumLeftDia + sumRightDia;
        if (num2DArr.length % 2 !=0){
            int ind = num2DArr.length/2;
            sum -= num2DArr[ind][ind];
        }
        return sum;

    }

    public static long leftDiagonalSum(int[][] num2DArr){
        int i = 0;
        long sum = 0;
        while (i < num2DArr.length){
            sum += num2DArr[i][i];
            i++;
        }return sum;
    }

    public static long rightDiagonalSum(int [][] num2DArr){
        int i = 0;
        long sum = 0;
        while (i < num2DArr.length){
            int col = num2DArr.length - 1 - i;
            sum += num2DArr[i][col];
            i++;
        }
        return sum;
    }

}
