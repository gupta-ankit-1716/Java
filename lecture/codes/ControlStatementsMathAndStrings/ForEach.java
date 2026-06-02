package lecture.codes.ControlStatementsMathAndStrings;

public class ForEach {
    static void main(String[] args) {
        String[] array = new String[]{
                "File", "Edit", "View", "Navigate", "Code" ,"Refactor", "Build", "Run"
        };
        printArrayForEach(array);
        System.out.println();
        printArray(array);
    }

    public static void printArrayForEach(String[] array){
        for(String name : array){
            System.out.println(name);
        }
    }

    public static void printArray(String[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
