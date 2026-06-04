package lecture.codes.FunctionalProgramming.lambda;

public class TestingLamba {
    static void main(String[] args) {
        TestingLamba test  = new TestingLamba();
        int sum = test.sum(6,7);
        System.out.println(sum);
        test.printString("Practicing java");

        //    toPrint -> System.out.println(toPrint);
//        (a,b) -> a+b;
//        (a,b) -> {
//        int sum = a + b;
//        System.out.println(sum);
//    }

    }
    private void printString(String toPrint){
        System.out.println(toPrint);
    }

    private int sum(int a , int b){
        int sum = a + b;
        return sum;
    }



}
