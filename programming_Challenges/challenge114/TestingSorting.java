package programming_Challenges.challenge114;
import java.util.Comparator;
import java.util.List;

public class TestingSorting {
    static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("Jack", 100),new Employee("Oggy", 600),new Employee("Bob", 500),new Employee("Olivia", 500),new Employee("Ben", 300),new Employee("Dee", 180));

        employees.stream().sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary()).forEach(System.out::println);



    }
}
