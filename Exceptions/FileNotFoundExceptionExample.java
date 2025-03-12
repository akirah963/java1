import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionExample {

    public static void main(String[] args) {
        try {
            
            File file = new File("nonexistentfile.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            
            System.out.println("Error: File not found - " + e.getMessage());
        }
    }
}
