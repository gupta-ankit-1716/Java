package lecture.codes.MultithreadingAndExecutorServices.multithreading.Sleep;

public class TestingSleep {
    static void main(String[] args) throws InterruptedException {
        System.out.println("Before sleeping");
        Thread.sleep(5000);
        System.out.println("Woke up");
    }
}
