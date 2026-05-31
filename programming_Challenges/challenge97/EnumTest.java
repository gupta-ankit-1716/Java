package programming_Challenges.challenge97;

public class EnumTest {
    static void main(String[] args) {
        System.out.println("Printing all the days of the week:");
        for (Day day : Day.values()){
            System.out.printf("%-10s :  %-5s%n", day, day.getType() );
        }
    }
}
