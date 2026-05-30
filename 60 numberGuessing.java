import java.util.Scanner;

class numberGuessing {

    static void main(String[] args) {
        System.out.println("Number Guessing game");
        Scanner input = new Scanner(System.in);
        int computerGuess = (int) Math.ceil(Math.random() * 100);
        int userGuess;
        do {
            System.out.println("Enter your Guess:");
            userGuess = input.nextInt();
            if (computerGuess > userGuess) {
                System.out.println("Guess Higher");
            } else {
                System.out.println("Guess lower");
            }
        } while (computerGuess != userGuess);
        System.out.println("You have successfully guessed the number.");
        input.close();
    }
}
