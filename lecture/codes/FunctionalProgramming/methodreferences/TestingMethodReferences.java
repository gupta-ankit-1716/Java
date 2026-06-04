package lecture.codes.FunctionalProgramming.methodreferences;

import java.util.List;

public class TestingMethodReferences {
    static void main(String[] args) {
        List<Integer> numbers = List.of(1,23,4,5,67,8,4,53,4);
         numbers.stream().filter(num -> num%2 == 1).forEach(System.out::println);

         numbers.stream().filter(num -> num % 2 == 1).forEach(num -> System.out.println(num));

         int newSum2 = numbers.stream().reduce(0, (a,b) -> a+b);

         newSum2 = numbers.stream().reduce(0, Integer::sum);

        System.out.printf("\n Sum using reduce is : %d", newSum2);
    }
}
