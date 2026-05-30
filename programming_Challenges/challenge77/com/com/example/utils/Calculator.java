package programming_Challenges.challenge77.com.com.example.utils;

import programming_Challenges.challenge77.com.example.geometry.Circle;
import programming_Challenges.challenge77.com.example.geometry.rectangle;

public class Calculator {

    static void main(String[] args) {
        Circle cir = new Circle(5.5);
        rectangle rec = new rectangle(6,8);
        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double areaOfRectangle = rec.length * rec.breadth;

        System.out.printf("Area of the circle is %.2f and the are of the rectangle is %.2f", cirArea, areaOfRectangle);
    }

}
