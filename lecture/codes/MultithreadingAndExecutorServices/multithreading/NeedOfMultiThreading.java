package lecture.codes.MultithreadingAndExecutorServices.multithreading;

public class NeedOfMultiThreading {
    static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        //first task
        for(int i = 1 ; i<=1000; i++){
            System.out.printf("%d*", i);
        }
        System.out.println("\n * task completed.");

        //second task
        for(int i = 1 ; i<=1000; i++){
            System.out.printf("%d$", i);
        }
        System.out.println("\n $ task completed.");

        //first task
        for(int i = 1 ; i<=1000; i++){
            System.out.printf("%d&", i);
        }
        System.out.println("\n & task completed.");

        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken is : %d " , (endTime - startTime));
    }
}
