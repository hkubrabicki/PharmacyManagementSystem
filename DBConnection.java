
package labproject; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/pharmacydb";
    private static final String USER = "root"; 
    private static final String PASSWORD = "125678"; 

    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Veritabanı bağlantı hatası: " + e.getMessage());
            return null;
        }
    }
}
