package lecture.codes.EncapsulationAndInheritance.files;

public class AccessTest {
    static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.model = "swift";
        car.costOfPurchase = 7654;
        System.out.println(car);

        Car newCar = new Car("Black", "BMW", 1, 5000);
        System.out.println(newCar);
        Default def = new Default();
    }
}
