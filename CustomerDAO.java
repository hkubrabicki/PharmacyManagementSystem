package labproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerDAO {

    /**
     * Inserts a new customer record into the database and returns the generated ID.
     * 
     * @param name            Customer's first name
     * @param surname         Customer's last name
     * @param identityNumber  Customer's identity number
     * @return generated customer ID if successful, -1 otherwise
     */
    public static int insertCustomer(String name, String surname, String identityNumber) {
        String sql = "INSERT INTO customer (name, surname, identityNumber) VALUES (?, ?, ?)";

        try (
            Connection conn = DBConnection.connect(); 
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
        ) {
            ps.setString(1, name);
            ps.setString(2, surname);
            ps.setString(3, identityNumber);
            ps.executeUpdate();

            // Retrieve the auto-generated ID (primary key)
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1); // Return the generated customer ID
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // Return -1 if the operation fails
    }

    /**
     * Checks if a customer already exists in the database based on identity number.
     * 
     * @param identityNumber Customer's identity number
     * @return true if the customer exists, false otherwise
     */
    public static boolean customerExists(String identityNumber) {
        String sql = "SELECT * FROM customer WHERE identityNumber = ?";

        try (
            Connection conn = DBConnection.connect(); 
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, identityNumber);
            ResultSet rs = ps.executeQuery();

            return rs.next(); // true if a matching record is found

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}