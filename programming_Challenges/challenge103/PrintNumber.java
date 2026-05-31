package programming_Challenges.challenge103;

public class PrintNumber implements Runnable{
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            System.out.printf("Numbers is %d%n", i+1);
        }
    }
}
