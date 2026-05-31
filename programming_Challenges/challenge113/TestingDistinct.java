package programming_Challenges.challenge113;

import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,2,5,4,3,6,5,2,3);
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(distinctNumbers);
    }
}
