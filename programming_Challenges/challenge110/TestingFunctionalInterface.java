package programming_Challenges.challenge110;

import java.util.Scanner;

public class TestingFunctionalInterface {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check : ");
        int number = input.nextInt();
        Candidate candidate = num -> {
            for (int i = 2 ; i < num ; i++){
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        };
        System.out.print("Is the number prime ? ");
        System.out.print (candidate.isCandidate(number));
    }
}
