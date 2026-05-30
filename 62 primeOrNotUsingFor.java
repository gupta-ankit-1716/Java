import java.util.Scanner;

class primeOrNotUsingFor {

    static void main(String[] args) {
        System.out.println("Prime number checker");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        int num = input.nextInt();
        System.out.printf("Is the entered number %d Prime ? : %b ",num, isPrime(num));

    }

    public static boolean isPrime(int num){
        for(int i = 2 ; i < num ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
