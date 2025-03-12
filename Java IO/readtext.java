import java.io.FileReader;
import java.io.IOException;

public class readtext {
    public static void main(String[] args) {
        
        String filePath = "file.txt"; 
        try (FileReader fileReader = new FileReader(filePath)) {
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character); 
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
