package programming_Challenges.challenge79;

public class Employee {

    private String name;
    private long salary;
    private int age;

    public Employee(String name, long salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }


    String getEmployeeDetails() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getSalary(){
        return salary;
    }

    public void setSalary(long salary){
        this.salary = salary;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }




}
