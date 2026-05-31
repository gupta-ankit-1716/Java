package programming_Challenges.challenge107;

import java.util.List;

public class StreamTest {
    static void main(String[] args) {
        List<String> names  = List.of("Oggy", "Jack", "Olivia");
        names.stream().forEach(name -> System.out.println(name));
    }
}
