import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {

    public static void main(String[] args) {
        try {
            
            File file = new File("nonexistentfile.txt");
            
            
            FileReader fileReader = new FileReader(file);
        } catch (IOException e) {
            
            System.out.println("Error: An I/O error occurred - " + e.getMessage());
        }
    }
}
