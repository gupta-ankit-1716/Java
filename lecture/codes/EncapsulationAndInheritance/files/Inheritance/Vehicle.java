package lecture.codes.EncapsulationAndInheritance.files.Inheritance;

public class Vehicle {
    protected int numberOfTires;

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    @Override
    public String toString() {
        return "Vehicle no of tires: " + numberOfTires;

    }
    public void commute(){
        System.out.printf("I am going from Place A to Place B using %d tires\n",numberOfTires);
    }
}
