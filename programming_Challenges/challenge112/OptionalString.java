package programming_Challenges.challenge112;

import java.util.Optional;

public class OptionalString {
    static void main(String[] args) {
        System.out.println(toOptional(null));
        System.out.println(toOptional("pop"));
        System.out.println(toOptional(" "));
        System.out.println(toOptional("null"));


    }

    public static Optional <String> toOptional(String str){
        if (str == null || str.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }

}
