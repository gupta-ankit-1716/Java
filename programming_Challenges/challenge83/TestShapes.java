package programming_Challenges.challenge83;

public class TestShapes {
    static void main(String[] args) {
        System.out.println("Welcome to the world of Shapes");
        Shapes Circle1 = new Circles(5);
        Shapes Square1 = new Square(10);

        System.out.printf("The area of the Circle is : %.2f%n", Circle1.calculateArea());
        System.out.printf("The area of the Square is : %.2f%n", Square1.calculateArea());

    }
}
