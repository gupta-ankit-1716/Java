package programming_Challenges.challenge101;

public class PrintThread extends Thread{

    private final int threadNumber;

    public PrintThread(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        System.out.printf("%s Thread starting -%d%n", Thread.currentThread().getName(), threadNumber);

        try{
            Thread.sleep(5000);

        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.printf("%s Thread ended -%d%n", Thread.currentThread().getName(),threadNumber );
    }
}
