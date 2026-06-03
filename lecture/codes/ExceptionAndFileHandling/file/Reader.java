package lecture.codes.ExceptionAndFileHandling.file;

import java.io.FileReader;
import java.io.IOException;

public class Reader {
    static void main(String[] args) {
        String filename = "java-practice.txt";

        try(FileReader reader = new FileReader(filename)){
            int read = 0;
            do{
                read = reader.read();
                System.out.println((char)read);

            }while(read != -1);

        } catch (IOException e) {
            System.out.printf("Exception occurred : %s", e.getMessage());
        }
    }
}
