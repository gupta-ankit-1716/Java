package lecture.codes.ExceptionAndFileHandling.file;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    static void main(String[] args) {
        String fileName = "java.txt";

        try(FileWriter writer =  new FileWriter(fileName)){
            writer.write("This is the set of practice problems.");
            for(int i = 0; i < 10000; i++) {
                writer.write('*');
            }

            writer.flush();
            System.out.println("File written successfully.");
        }catch (IOException e){
            System.out.printf("Exception occurred %s%n", e.getMessage());
        }
    }
}
