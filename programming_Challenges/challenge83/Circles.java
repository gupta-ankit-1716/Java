package programming_Challenges.challenge83;

public class Circles extends Shapes{
    private final double radiusInCm;

    public Circles(double radiusInCm) {
        this.radiusInCm = radiusInCm;
    }

    public double getRadiusInCm(){
        return radiusInCm;
    }
    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(radiusInCm,2);
    }




}
