package programming_Challenges.challenge100;

public class ThreadState extends Thread{

    @Override
    public void run(){
        try{
            Thread.sleep(4000);
            System.out.println();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
