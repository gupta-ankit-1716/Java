package programming_Challenges.challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreaService {
    static void main(String[] args) {
        try(ExecutorService service = Executors.newSingleThreadExecutor()){
            PrintNumber task = new PrintNumber();
            service.submit(task);
        }
    }
}
