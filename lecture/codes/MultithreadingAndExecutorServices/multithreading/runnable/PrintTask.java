package lecture.codes.MultithreadingAndExecutorServices.multithreading.runnable;

public class PrintTask implements Runnable {

    public void run(){
        //print task
        for(int i = 1; i<=1000; i++){
            System.out.printf("%d%c", i, targetchar);
        }
        System.out.printf("\n %s %c task completed", Thread.currentThread().getName(), targetchar);
    }

    private final char targetchar;

    public PrintTask(char targetchar) {
        this.targetchar = targetchar;
    }
}
