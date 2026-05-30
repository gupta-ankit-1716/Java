import java.util.Scanner;

class leapyear {

    static void main(String[] args) {
        System.out.println("This is a program to check for leap year;");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year you want to check:");
        long year = input.nextLong();

        System.out.println("Is the entered year leap ? :");
        System.out.print(yearcheck(year));


    }

    public static boolean yearcheck(long year){
        if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
            return true;
        }else{
            return false;
        }
    }
}
