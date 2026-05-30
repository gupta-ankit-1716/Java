class carFinal {

    final int noOfWheels;
    int engineCapacity;
    final String carColour;
    final String model;
    final String engineInLitres;

    public carFinal(String engineInLitres, int noOfWheels, int engineCapacity, String model, String carColour) {
        this.engineInLitres = engineInLitres;
        this.noOfWheels = noOfWheels;
        this.engineCapacity = engineCapacity;
        this.model = model;
        this.carColour = carColour;
    }
}
