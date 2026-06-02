package lecture.codes.WhileArraysAndMethods;

import java.util.Scanner;

public class TwoDimensionalArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int row = input.nextInt();
        System.out.println("Enter the no. of columns:");
        int columns = input.nextInt();
        int[][] arr =  new int[row][columns];

        for(int i = 0 ; i <= row-1 ; i++){
            for(int j = 0 ; j<= columns-1; j++){
                System.out.printf("Enter the element for row : %d & column : %d :: ", i+1 ,j+1);
                arr[i][j] = input.nextInt();
            }
        }

        //Printing the 2D array

        for(int i = 0; i <=row-1 ; i++){
            for (int j = 0 ; j<= columns-1 ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
