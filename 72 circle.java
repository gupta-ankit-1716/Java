import java.util.Scanner;

class circle {

    double radiusInMm;

    public circle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }

    double getCircumference(){
        return Math.round(2* Math.PI * radiusInMm);
    }

    double getArea(){
        return Math.round((Math.PI * Math.pow(radiusInMm, 2)));
    }

    @Override
    public String toString() {
        return "circle{ " +
                "radiusInMm = " + radiusInMm +
                " & Circumference = " + getCircumference() +
                " & Area=" + getArea() +
                '}';
    }

    static void main(String[] args) {
        System.out.println("Circle Calculator.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = input.nextDouble();
        circle Circle = new circle(radius);
        System.out.println(Circle);
    }

}
