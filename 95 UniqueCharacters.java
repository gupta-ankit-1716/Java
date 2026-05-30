import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueCharacters {

    static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your string:");
        String userStr = input.next();

        for (char ch : userStr.toCharArray()){
            unique.add(ch);
        }
        System.out.printf("Your String has %d unique characters", unique.size());
    }

}
