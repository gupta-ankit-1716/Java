package programming_Challenges.challenge79;

public class TestEmployee {

    static void main(String[] args) {
        System.out.println("Welcome to the corporate.");
        Employee emp1 = new Employee("Oggy", 32801, 20);
        Employee emp2 = new Employee("Jack", 38801, 22);
        System.out.println(emp1.getEmployeeDetails());
        System.out.println(emp2.getEmployeeDetails());
        emp1.setAge(28);
        emp1.setName("Olivia");
        System.out.println(emp1.getEmployeeDetails());


    }

}
