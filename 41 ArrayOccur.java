import java.util.Scanner;

class ArrayOccur {

    static void main(String[] args) {
        System.out.println("This program finds the no. of occurrences of an element in an Array.");
        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();
        System.out.println("Now, enter the number you want to find:");
        int num = input.nextInt();
        int occur = occur(numArray,num);
        System.out.printf("Your entered number %d was found %d times.", num, occur);
    }

    public static int occur(int[] numArray, int num){
        int occur = 0;
        int i = 0;
        while(i < numArray.length){
            if(numArray[i] == num){
                occur++;
            }
            i++;
        }return occur;
    }

}
