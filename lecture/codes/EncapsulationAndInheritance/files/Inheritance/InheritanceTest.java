package lecture.codes.EncapsulationAndInheritance.files.Inheritance;

import lecture.codes.EncapsulationAndInheritance.files.TwoWheeler;

public class InheritanceTest {
    static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());

        TwoWheeler two = new TwoWheeler();
        two.commute();
        two.balance();

        MotorCycle motor = new MotorCycle();
        motor.commute();
        motor.balance();
        motor.start();
        
    }
}
