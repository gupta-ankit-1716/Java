package lecture.codes.AbstractionAndPolymorphism.abstraction;

public class TestAbstraction {
    static void main(String[] args) {
        //Vehicle veh = new Vehicle(2);
        Car car = new Car();
        car.commute();
        car.makeStartSound();
    }
}
