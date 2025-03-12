import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExample {

    public static void main(String[] args) {
        try {
            
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "root", "password");
        } catch (SQLException e) {
            
            System.out.println("Error: SQLException occurred - " + e.getMessage());
        }
    }
}
