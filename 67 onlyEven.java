import java.util.Scanner;

class onlyEven {
    static void main() {
        System.out.println("Even number Printing.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ending range:");
        int end = input.nextInt();


        if(end == 0){
            System.out.println("Invalid input");
        }else if(end < 0){
            System.out.println("Invalid input");

        }else{
            for(int i = 2 ; i <= end ;  i++){
                if(i % 2 != 0){
                    continue;
                }
                System.out.printf("%d ",i);
            }
        }


    }
}
