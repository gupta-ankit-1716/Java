package lecture.codes.ClassesAndObjects;

public class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;

    static {
        noOfCarsSold = 0;
        System.out.println("I am in static Block.");
    }
    {
        noOfCarsSold++;
        System.out.println("I am in Init Block.");
    }

    Car(String color){
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLitres = 2;
        noOfSeats = 5;

    }

    Car(){
        this("Black");
        currentFuelInLitres = 5;
    }

    public Car start(){
        int pop = 5;
        if(currentFuelInLitres == 0){
            System.out.println(pop);
            System.out.println("Car is out of fuel, can's start.");
        }else if(currentFuelInLitres < 5){
            System.out.println("Car is in reserved mode, please refuel.");
        }else{
            System.out.println("Car is starting...bruh..");
        }
        return this;
        }

    public void drive(){
        currentFuelInLitres--;
    }

    public void addFuel(float currentFuelInLitres){
        this.currentFuelInLitres += currentFuelInLitres;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLitres;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentFuelInLitres=" + currentFuelInLitres +
                ", noOfSeats=" + noOfSeats +
                '}';
    }
}

