package lecture.codes.CollectionsAndGenerics.Enums;

public enum TrafficLight {
    RED("Stop"), GREEN("Go"), YELLOW("Slow Down");

    private final String action;

    TrafficLight(String action){
        this.action = action;
    }
    public String getAction() {
        return action;
    }
}
