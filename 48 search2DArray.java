import java.util.Scanner;

class search2DArray {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program searches a given element from a given 2D Array.");
        int[][] num2dArr = ArrayUtility.input2DArray();
        System.out.println("Enter the number you want to search:");
        int target = input.nextInt();
        search(num2dArr, target);

    }

    public static void search(int[][]num2dArr, int target){
        int i = 0;
        boolean found = false;
        while (i < num2dArr.length){
            int j = 0;
            while(j < num2dArr[i].length){
                if(target == num2dArr[i][j]){
                    System.out.printf("Your number was found at row: %d and columns: %d%n", i+1 , j+1);
                    found = true;
                }
                j++;
            }
            i++;
        }
        if (!found){
            System.out.println("Your number was not found.");
        }
    }
}
