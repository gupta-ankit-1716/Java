package programming_Challenges.challenge83;

public class Square extends Shapes{
    private final double sideInCm;

    public Square(double sideInCm) {
        this.sideInCm = sideInCm;
    }

    public double getSideInCm() {
        return sideInCm;
    }

    @Override
    public double calculateArea(){
        return  Math.pow(sideInCm,2);
    }
}
