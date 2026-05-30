import java.util.Scanner;

class palRecursion {
    static void main(String[] args) {
        System.out.println("Palindrome String checker ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = input.next();
        String wordWithLowerCase = word.toLowerCase();
        System.out.printf("Is the entered String %s Palindrome? %b%n", word, isPal(wordWithLowerCase));


    }

    public static boolean isPal(String wordWithLowerCase){
        if(wordWithLowerCase.length() <= 1){
            return true;
        }
        int lastPos = wordWithLowerCase.length() - 1;
        if(wordWithLowerCase.charAt(0) != wordWithLowerCase.charAt(lastPos)){
            return false;
        }
        String newWord = wordWithLowerCase.substring(1,lastPos);
        return isPal(newWord);

    }
}
