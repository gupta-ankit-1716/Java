package lecture.codes.CollectionsAndGenerics.Enums;

public class TestingEnums {
    static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;
        color = TrafficLight.GREEN;

        System.out.println("The light is " + color + " so you should " + color.getAction());

        Grade grade = Grade.valueOf("D");
        for (Grade value : Grade.values()){
            System.out.println(value);
        }
    }
}
