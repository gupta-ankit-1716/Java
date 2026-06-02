package lecture.codes.WhileArraysAndMethods;

import java.util.Scanner;

public class ArraySearching {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Array searching.");
        System.out.println("Enter the size of the Array:");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0 ; i<= size-1; i++){
            System.out.printf("Enter the element at %d Position : ", (i+1));
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the number you want to search : ");
        int num = input.nextInt();

        boolean isFound = isFound(arr , num);
        if (isFound){
            System.out.println("Your number was found in the Array.");
        }else{
            System.out.println("Your number was not found in the Array.");
        }
    }

    public static boolean isFound(int[] arr, int num){
        for (int i = 0; i <= arr.length-1 ; i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
