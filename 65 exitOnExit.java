import java.util.Scanner;

class exitOnExit {

    static void main(String[] args) {
        System.out.println("Exit on Exit program");
        Scanner input = new Scanner(System.in);
        String command;

        while (true){
            System.out.println("Enter your command:");
            command = input.next();
            if(command.equalsIgnoreCase("exit")){
                System.out.println("You have chosen to exit this program.");
                break;
            }
        }
    }
}
