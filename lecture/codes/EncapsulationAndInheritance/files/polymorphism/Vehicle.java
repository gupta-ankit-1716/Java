package lecture.codes.EncapsulationAndInheritance.files.polymorphism;

public abstract class Vehicle {
    private int noOfTires;

    Vehicle(){
        this.noOfTires = 0;
    }

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void start(){
        System.out.println("Vehicle is starting...");
    }
}
