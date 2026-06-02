package lecture.codes.EncapsulationAndInheritance.morefiles;

import lecture.codes.EncapsulationAndInheritance.files.Car;

public class GetterTest {
    static void main(String[] args) {
        Car car = new Car("red", "Maruti", 3, 8000);
        car.setColor("Blue");
    }
}
