package labproject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    private ArrayList<Medicine> selectedMedicines = new ArrayList<>();
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private DefaultTableModel medicineModel;

    public MainFrame() {
        initComponents();
        setTitle("The Pharmacy medicine sale system");

        jList1.setModel(listModel);

        cbPrescreptionType.setVisible(false);

        medicineModel = new DefaultTableModel(
                new String[]{"Barcode", "Name", "Price", "Stock", "Prescription Type"}, 0
        );
        jTable1.setModel(medicineModel);

        MedicineDAO.loadAllMedicinesToTable(medicineModel);
    }

    public void updateSelectedMedicineListUI() {
        listModel.clear();
        for (Medicine med : selectedMedicines) {
            String displayName = med.getName() + " (x" + med.getQuantity() + ")";
            listModel.addElement(displayName);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtIdentityNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSelect = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnRemoveSelectedItem = new javax.swing.JButton();
        btnRemoveAllOfThem = new javax.swing.JButton();
        btnSwitchScreen = new javax.swing.JButton();
        lbltotalprice = new javax.swing.JLabel();
        cbPrescreptionType = new javax.swing.JComboBox<>();
        radiobtnYES = new javax.swing.JRadioButton();
        radiobtnNO = new javax.swing.JRadioButton();
        btnCompleteSale = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtBarcod = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CUSTOMER INFORMATION");

        jLabel2.setText("Name:");

        jLabel3.setText("Surname:");

        jLabel4.setText("Identity Number:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnSelect.setText("SELECT");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        jLabel6.setText("SELECTED ITEMS:");

        jScrollPane2.setViewportView(jList1);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Total price of the medicine:");

        jLabel8.setText("She/He has prescription?");

        btnRemoveSelectedItem.setText("REMOVE SELECTED ONE");
        btnRemoveSelectedItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveSelectedItemActionPerformed(evt);
            }
        });

        btnRemoveAllOfThem.setText("REMOVE ALL OF THEM");
        btnRemoveAllOfThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAllOfThemActionPerformed(evt);
            }
        });

        btnSwitchScreen.setText("THE ACCESS SETTING PART OF SYSTEM");
        btnSwitchScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwitchScreenActionPerformed(evt);
            }
        });

        cbPrescreptionType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Red", "Green" }));
        cbPrescreptionType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPrescreptionTypeActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiobtnYES);
        radiobtnYES.setText("yes");
        radiobtnYES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnYESActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiobtnNO);
        radiobtnNO.setText("no");
        radiobtnNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnNOActionPerformed(evt);
            }
        });

        btnCompleteSale.setText("COMPLETE THE SALE");
        btnCompleteSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteSaleActionPerformed(evt);
            }
        });

        jLabel5.setText("Medicine barcod:");

        jButton1.setText("ADD MEDICINE MANUAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("THE ACCESS RECORD PART OF SYSTEM");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("THE ACCESS LOGIN PART OF SYSTEM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPrescreptionType, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtBarcod, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(radiobtnYES, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(radiobtnNO, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdentityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnSelect))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbltotalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRemoveAllOfThem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRemoveSelectedItem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(btnSwitchScreen)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 752, Short.MAX_VALUE)
                .addComponent(btnCompleteSale)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnSelect)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnRemoveSelectedItem)
                                .addGap(12, 12, 12)
                                .addComponent(btnRemoveAllOfThem)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(9, 9, 9)
                                .addComponent(lbltotalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSwitchScreen)
                            .addComponent(btnCompleteSale, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIdentityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBarcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radiobtnYES)
                            .addComponent(radiobtnNO))
                        .addGap(18, 18, 18)
                        .addComponent(cbPrescreptionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // Reçete seçimi kontrolü
        if (!radiobtnYES.isSelected() && !radiobtnNO.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please select whether the customer has a prescription.");
            return;
        }

        int selectedRow = jTable1.getSelectedRow();
        int rowCount = jTable1.getRowCount();

        if (rowCount == 0) {
            JOptionPane.showMessageDialog(this, "There is no data in the table!");
            return;
        }

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a medicine!");
            return;
        }

        // Seçilen satırdan verileri al
        String barcode = (String) medicineModel.getValueAt(selectedRow, 0);
        String name = (String) medicineModel.getValueAt(selectedRow, 1);
        double price = Double.parseDouble(medicineModel.getValueAt(selectedRow, 2).toString());
        int stock = Integer.parseInt(medicineModel.getValueAt(selectedRow, 3).toString());
        String prescriptionType = (String) medicineModel.getValueAt(selectedRow, 4);

        // Reçete gerekiyorsa kontrol et
        if (!prescriptionType.equals("None")) {
            if (radiobtnNO.isSelected()) {
                JOptionPane.showMessageDialog(this, "This medicine requires a prescription!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String customerPrescription = cbPrescreptionType.getSelectedItem().toString();
            if (!prescriptionType.equals(customerPrescription)) {
                JOptionPane.showMessageDialog(this, "This medicine requires a " + prescriptionType + " prescription!", "Mismatch", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        // Zaten sepette var mı?
        boolean found = false;
        for (Medicine med : selectedMedicines) {
            if (med.getBarcode().equals(barcode)) {
                found = true;
                if (med.getQuantity() >= 3) {
                    JOptionPane.showMessageDialog(this, "Maximum 3 units can be selected.");
                } else if (med.getQuantity() >= stock) {
                    JOptionPane.showMessageDialog(this, "Not enough stock available.");
                } else {
                    med.setQuantity(med.getQuantity() + 1);
                    JOptionPane.showMessageDialog(this, "Medicine quantity increased in list.");
                }
                break;
            }
        }

        // Sepette yoksa ekle
        if (!found) {
            if (stock <= 0) {
                JOptionPane.showMessageDialog(this, "This medicine is out of stock!");
                return;
            }

            Medicine newMed = new Medicine();
            newMed.setBarcode(barcode);
            newMed.setName(name);
            newMed.setPrice(price);
            newMed.setStock(stock);
            newMed.setPrescriptionType(prescriptionType);
            newMed.setQuantity(1);
            selectedMedicines.add(newMed);
            JOptionPane.showMessageDialog(this, "Medicine added to list.");
        }

        // Arayüzü güncelle
        updateSelectedMedicineListUI();

        double total = 0;
        for (Medicine m : selectedMedicines) {
            total += m.getPrice() * m.getQuantity();
        }
        lbltotalprice.setText(String.format("₺%.2f", total));

    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnSwitchScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwitchScreenActionPerformed
        new MedicineFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSwitchScreenActionPerformed

    private void btnCompleteSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteSaleActionPerformed
        try {
            String name = txtName.getText().trim();
            String surname = txtSurname.getText().trim();
            String identity = txtIdentityNumber.getText().trim();

            // Giriş kontrolleri
            if (name.isEmpty() || surname.isEmpty() || identity.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            try {
                Long.parseLong(identity);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Identity Number must contain only digits!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!name.matches("[a-zA-ZçğıöşüÇĞİÖŞÜ\\s]+") || !surname.matches("[a-zA-ZçğıöşüÇĞİÖŞÜ\\s]+")) {
                JOptionPane.showMessageDialog(this, "Name and Surname must contain only letters!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (selectedMedicines.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No medicines selected for sale!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Müşteri kontrolü ve ekleme
            if (CustomerDAO.customerExists(identity)) {
                JOptionPane.showMessageDialog(this, "This customer has already made a purchase!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int customerId = CustomerDAO.insertCustomer(name, surname, identity);
            if (customerId == -1) {
                JOptionPane.showMessageDialog(this, "Customer could not be added.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Satış işlemleri
            double totalPrice = 0;
            for (Medicine m : selectedMedicines) {
                totalPrice += m.getPrice() * m.getQuantity();
            }

            int saleId = SaleDAO.insertSale(customerId, totalPrice);
            if (saleId == -1) {
                JOptionPane.showMessageDialog(this, "Sale could not be recorded.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            for (Medicine m : selectedMedicines) {
                int medicineId = MedicineDAO.getMedicineIdByBarcode(m.getBarcode());
                if (medicineId != -1) {
                    SaleDetailDAO.insertSaleDetail(saleId, medicineId, m.getQuantity());
                    MedicineDAO.decreaseStock(medicineId, m.getQuantity());
                }
            }

// 1. Dosyaya yazma
            try (FileWriter writer = new FileWriter("sales.txt", true)) {
                for (Medicine m : selectedMedicines) {
                    writer.write(String.format("%d,%s %s,%s,%d,%.2f\n",
                            saleId, name, surname, m.getName(), m.getQuantity(), m.getPrice() * m.getQuantity()));
                }

            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            // 2. Arayüz ve veriler temizleniyor
            selectedMedicines.clear();
            updateSelectedMedicineListUI();
            lbltotalprice.setText("₺0.00");
            txtIdentityNumber.setText("");
            txtName.setText("");
            txtSurname.setText("");
            txtBarcod.setText("");
            buttonGroup1.clearSelection();
            cbPrescreptionType.setVisible(false);

            // 3. Veritabanı tablosunu güncelle
            MedicineDAO.loadAllMedicinesToTable(medicineModel);

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Unexpected error occurred!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCompleteSaleActionPerformed

    private void radiobtnYESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnYESActionPerformed
        cbPrescreptionType.setVisible(true);
    }//GEN-LAST:event_radiobtnYESActionPerformed

    private void cbPrescreptionTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPrescreptionTypeActionPerformed
    }//GEN-LAST:event_cbPrescreptionTypeActionPerformed

    private void btnRemoveSelectedItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveSelectedItemActionPerformed
        int indexofselectedItem = jList1.getSelectedIndex();
        if (indexofselectedItem == -1) {
            JOptionPane.showMessageDialog(this, "Please select a medicine from the list to remove.");
            return;
        }

        Medicine selectedMed = selectedMedicines.get(indexofselectedItem);
        if (selectedMed.getQuantity() > 1) {
            selectedMed.setQuantity(selectedMed.getQuantity() - 1);
            JOptionPane.showMessageDialog(this, "Quantity reduced by 1.");
        } else {
            selectedMedicines.remove(indexofselectedItem);
            JOptionPane.showMessageDialog(this, "Medicine removed.");
        }

        updateSelectedMedicineListUI();

        double total = 0;
        for (Medicine m : selectedMedicines) {
            total += m.getPrice() * m.getQuantity();
        }
        lbltotalprice.setText(String.format("₺%.2f", total));
    }//GEN-LAST:event_btnRemoveSelectedItemActionPerformed

    private void btnRemoveAllOfThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAllOfThemActionPerformed
        selectedMedicines.clear();
        updateSelectedMedicineListUI();
        lbltotalprice.setText("₺0.00");
        JOptionPane.showMessageDialog(this, "All selected medicines have been removed.");

    }//GEN-LAST:event_btnRemoveAllOfThemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String barcod = txtBarcod.getText().trim();

        if (barcod.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a barcode.");
            return;
        }

        if (!radiobtnYES.isSelected() && !radiobtnNO.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please select whether the customer has a prescription.");
            return;
        }

        if (radiobtnYES.isSelected() && cbPrescreptionType.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please select a prescription type from the list.");
            return;
        }

        boolean foundInList = false;
        for (int i = 0; i < medicineModel.getRowCount(); i++) {
            if (barcod.equals(medicineModel.getValueAt(i, 0))) {
                foundInList = true;

                String name = (String) medicineModel.getValueAt(i, 1);
                double price = Double.parseDouble(medicineModel.getValueAt(i, 2).toString());
                int stock = Integer.parseInt(medicineModel.getValueAt(i, 3).toString());
                String prescriptionType = (String) medicineModel.getValueAt(i, 4);

                if (!prescriptionType.equals("None")) {
                    if (radiobtnNO.isSelected()) {
                        JOptionPane.showMessageDialog(this, "This medicine requires a prescription!", "Prescription Needed", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    String customerPrescription = cbPrescreptionType.getSelectedItem().toString();
                    if (!prescriptionType.equals(customerPrescription)) {
                        JOptionPane.showMessageDialog(this, "This medicine requires a " + prescriptionType + " prescription!", "Prescription Mismatch", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }

                boolean alreadySelected = false;
                for (Medicine selectedMed : selectedMedicines) {
                    if (selectedMed.getBarcode().equals(barcod)) {
                        alreadySelected = true;
                        if (selectedMed.getQuantity() >= 3) {
                            JOptionPane.showMessageDialog(this, "Maximum 3 units can be selected.");
                        } else if (selectedMed.getStock() <= selectedMed.getQuantity()) {
                            JOptionPane.showMessageDialog(this, "Not enough stock available.");
                        } else {
                            selectedMed.setQuantity(selectedMed.getQuantity() + 1);
                            JOptionPane.showMessageDialog(this, "Medicine quantity increased in list.");
                        }
                        break;
                    }
                }

                if (!alreadySelected) {
                    Medicine newMed = new Medicine();
                    newMed.setBarcode(barcod);
                    newMed.setName(name);
                    newMed.setPrice(price);
                    newMed.setStock(stock);
                    newMed.setPrescriptionType(prescriptionType);
                    newMed.setQuantity(1);
                    selectedMedicines.add(newMed);
                    JOptionPane.showMessageDialog(this, "Medicine added to cart.");
                }

                break;
            }
        }

        if (!foundInList) {
            JOptionPane.showMessageDialog(this, "No medicine found with this barcode.");
            return;
        }

        updateSelectedMedicineListUI();

        double total = 0;
        for (Medicine m : selectedMedicines) {
            total += m.getPrice() * m.getQuantity();
        }
        lbltotalprice.setText(String.format("₺%.2f", total));
        txtBarcod.setText("");


    }//GEN-LAST:event_jButton1ActionPerformed

    private void radiobtnNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnNOActionPerformed
        cbPrescreptionType.setVisible(false);
    }//GEN-LAST:event_radiobtnNOActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new RecordFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new LoginFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new MainFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompleteSale;
    private javax.swing.JButton btnRemoveAllOfThem;
    private javax.swing.JButton btnRemoveSelectedItem;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnSwitchScreen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbPrescreptionType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbltotalprice;
    private javax.swing.JRadioButton radiobtnNO;
    private javax.swing.JRadioButton radiobtnYES;
    private javax.swing.JTextField txtBarcod;
    private javax.swing.JTextField txtIdentityNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
