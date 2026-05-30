package programming_Challenges.challenge82;

public class TestArray {
    static void main(String[] args) {
        System.out.println("Welcome to the world to Arrays.");
        ArrayOperations opr = new ArrayOperations(new int[]{1,2,3,4,5,6,7,});
        ArrayOperations.Statistics statistics = opr.new Statistics();
        System.out.println(statistics.mean());
        System.out.println(statistics.median());

    }
}
