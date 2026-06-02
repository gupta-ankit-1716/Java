package lecture.codes.EncapsulationAndInheritance.files.polymorphism;

public class TestTransportation {
    static void main(String[] args) {
        Car c = new Car();
        // Vehicle v = new Vehicle();
        Plane p = new Plane();

        //c.start();
        //p.start();

        //Vehicle vCar = new Car();
        //Car cVehicle = new Vehicle();


    }
    public static void castTest(Vehicle veh){
        // Car cVehicle = (Car) veh;
        //veh.noOfDoors;
        veh.start();
        //cVehicle.noOfDoors;
//
//        if(veh instanceof Car){
//
//        }
    }
}
