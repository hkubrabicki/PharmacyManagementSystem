package labproject;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SystemManager {

    // -------------------- Login Verification from Database --------------------

    /**
     * Checks login credentials against the Users table.
     *
     * @param username the username input
     * @param password the password input
     * @return "success" if login is correct, "wrong_password", "user_not_found", or "error"
     */
    public static String checkLogin(String username, String password) {
        String sql = "SELECT * FROM Users WHERE username = ?";

        try (Connection conn = DBConnection.connect(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String dbPassword = rs.getString("password");
                if (dbPassword.equals(password)) {
                    return "success"; // credentials match
                } else {
                    return "wrong_password"; // password mismatch
                }
            } else {
                return "user_not_found"; // username not found
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return "error"; // general error
        }
    }

    // -------------------- Insert New User into Database --------------------

    /**
     * Adds a new user with given username and password to the Users table.
     *
     * @param username the new username
     * @param password the new password
     * @return true if user was successfully added, false otherwise
     */
    public static boolean addUserToDB(String username, String password) {
        String sql = "INSERT INTO Users (username, password) VALUES (?, ?)";

        try (Connection conn = DBConnection.connect(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
