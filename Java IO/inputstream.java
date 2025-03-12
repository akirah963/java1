import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputstream {
    public static void main(String[] args) {
    
        String filePath = "example.txt";  
        
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
             
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); 
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
