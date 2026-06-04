package lecture.codes.MultithreadingAndExecutorServices.multithreading.threadclass;

public class ExtendingThreadClass {
    static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\n Starting First thread");
        t1.start();
        System.out.println("\n Starting second thread");
        t2.start();
        System.out.println("\n Starting third thread");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken : %d", Thread.currentThread().getName(), (endTime- startTime));
    }
}
