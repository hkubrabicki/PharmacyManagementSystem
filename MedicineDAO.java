package labproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

public class MedicineDAO {

    public static boolean addMedicine(Medicine m) {
        String sql = "INSERT INTO Medicine (barcode, name, price, stock, prescriptionType) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.connect(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, m.getBarcode());
            ps.setString(2, m.getName());
            ps.setDouble(3, m.getPrice());
            ps.setInt(4, m.getStock());
            ps.setString(5, m.getPrescriptionType());

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void loadAllMedicinesToTable(DefaultTableModel model) {
        model.setRowCount(0);
        String sql = "SELECT * FROM medicine";

        try (Connection conn = DBConnection.connect(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("barcode"),
                    rs.getString("name"),
                    rs.getDouble("price"),
                    rs.getInt("stock"),
                    rs.getString("prescriptionType")
                });
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean deleteMedicineByBarcode(String barcode) {
        int medicineId = getMedicineIdByBarcode(barcode);
        if (medicineId == -1) {
            return false; //If barcode is not found, no deletion is performed

        }

        // First, delete the data from the sale_detail table
        deleteSaleDetailsByMedicineId(medicineId);

       // Then, delete from the main medicine table
        String sql = "DELETE FROM Medicine WHERE barcode = ?";
        try (Connection conn = DBConnection.connect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, barcode);
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updateMedicine(Medicine m) {
        String sql = "UPDATE Medicine SET name = ?, price = ?, stock = ?, prescriptionType = ? WHERE barcode = ?";

        try (Connection conn = DBConnection.connect(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, m.getName());
            ps.setDouble(2, m.getPrice());
            ps.setInt(3, m.getStock());
            ps.setString(4, m.getPrescriptionType());
            ps.setString(5, m.getBarcode());

            int rows = ps.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int getMedicineIdByBarcode(String barcode) {
        String sql = "SELECT id FROM medicine WHERE barcode = ?";
        try (Connection conn = DBConnection.connect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, barcode);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static void decreaseStock(int medicineId, int quantity) {
        String sql = "UPDATE medicine SET stock = stock - ? WHERE id = ?";
        try (Connection conn = DBConnection.connect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, quantity);
            ps.setInt(2, medicineId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void deleteSaleDetailsByMedicineId(int medicineId) {
        String sql = "DELETE FROM sale_detail WHERE medicine_id = ?";
        try (Connection conn = DBConnection.connect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, medicineId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
