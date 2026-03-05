package labproject;

import java.sql.*;

public class SaleDAO {

    /**
     * Inserts a new sale into the database and returns the generated sale_id.
     *
     * @param customerId the ID of the customer making the purchase
     * @param totalPrice the total amount of the sale
     * @return the generated ID of the new sale
     */
    public static int insertSale(int customerId, double totalPrice) {
        String sql = "INSERT INTO sale (customer_id, totalPrice) VALUES (?, ?)";
        try (Connection conn = DBConnection.connect(); PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, customerId);
            ps.setDouble(2, totalPrice);
            ps.executeUpdate();

            // Retrieve the generated sale ID
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1); // return generated sale_id
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // return -1 if insertion fails
    }

    /**
     * Calculates and returns the total sum of all sales.
     *
     * @return total sales amount from the database
     */
    public static double getTotalSalesAmount() {
        String sql = "SELECT SUM(totalPrice) AS total FROM sale";

        try (Connection conn = DBConnection.connect(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                return rs.getDouble("total");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0.0; // return 0.0 if query fails
    }

}
