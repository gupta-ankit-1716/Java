package programming_Challenges.challenge88;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    static void main(String[] args) {
        System.out.println("File Handling program.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name whose contents you want to read:");
        String fileName = input.next();

        try(FileReader reader = new FileReader(fileName)){
            int read;
            while((read = reader.read()) != -1){
                System.out.println((char)read);
            }
        }catch (FileNotFoundException exception){
            System.out.printf("%s file was not found", fileName);
        }catch (IOException exception){
            System.out.printf("An error occured. :", exception.getMessage());
        }

    }
}
