import java.util.Scanner;

class prime {

    static void main(String[] args) {
        System.out.println("Prime number checker:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        int num = input.nextInt();
        input.close();

        if(num < 2){
            System.out.printf("Is the number %d prime? False ",num );

        }else{
            System.out.printf("Is the number %d prime? %b%n",num, primecheck(num) );
        }

    }

    public static boolean primecheck(int num){
        int i = 2;
        while(i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }return true;

    }

}
