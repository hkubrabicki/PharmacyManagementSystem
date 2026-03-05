package labproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaleDetailDAO {

    /**
     * Inserts a sale detail record into the database for each medicine in the cart.
     *
     * @param saleId the ID of the related sale (from the sale table)
     * @param medicineId the ID of the related medicine (from the medicine table)
     * @param quantity the number of units purchased
     * @return true if insertion is successful, false otherwise
     */
    public static boolean insertSaleDetail(int saleId, int medicineId, int quantity) {
        String sql = "INSERT INTO sale_detail (sale_id, medicine_id, quantity) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            // Set parameters for the sale detail
            ps.setInt(1, saleId);
            ps.setInt(2, medicineId);
            ps.setInt(3, quantity);

            // Execute insertion
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Insertion failed
        }
    }
}

