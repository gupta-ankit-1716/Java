package programming_Challenges.challenge100;

public class Main {
    static void main(String[] args) throws InterruptedException{
        ThreadState t1= new ThreadState();
        System.out.printf("\n Create the thread %s", t1.getState());
        t1.start();
        t1.join();
        System.out.printf("Thread finished %s", t1.getState());

    }
}
