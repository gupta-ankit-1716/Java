package programming_Challenges.challenge108;

import java.util.List;

public class StringFilterAndConcatenate {
    static void main(String[] args) {
        List<String> strs = List.of("IntelliJ" , "FileEditVIew" , "Navigate" , "CodeRefactor", "Build", "Run" ,"Tools", "GitWIndowHelp");

        String result = strs.stream().filter(str -> str.length() > 10).reduce(" ", (a,b) -> a + " " + b);
        System.out.println(result);
    }
}
