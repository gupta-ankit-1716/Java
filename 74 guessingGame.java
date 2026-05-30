import java.util.Scanner;

class guessingGame {

    int random;
    guessingGame(){
        random = (int)Math.ceil(Math.random()*100);
    }

    int guess(int guessNumber){
        return guessNumber - random;
    }

    /**
     *
     * - Negative if the guessed number is smaller
     * - 0 if the guessed number is correct.
     * - Positive if the guessed number is higher.
     */


    static void main(String[] args) {
        System.out.println("Number Guessing game.");
        guessingGame game = new guessingGame();
        Scanner input = new Scanner(System.in);
        int guess;
        int result;

        do{
            System.out.println("Enter the number:");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result == 0){
                System.out.println("Congrats, you've won.");
            }else if(result > 0){
                System.out.println("Guess lower");
            }else{
                System.out.println("Guess Higher");
            }

        }while (result != 0);


    }

}
