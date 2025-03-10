/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gontobbo_app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import DBConnection.DBConnection;
import javax.swing.table.TableModel;

/**
 *
 * @author User
 */
public class UpdateTrip extends javax.swing.JFrame {

    /**
     * Creates new form UpdateTrip
     */
    private AdminDboard adminDboard;
    public UpdateTrip(AdminDboard adminDboard) {
        initComponents();
        this.adminDboard = adminDboard;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        updateTripBTN = new com.k33ptoo.components.KButton();
        unitPrice = new javax.swing.JTextField();
        tripID = new javax.swing.JTextField();
        TRAIN = new javax.swing.JRadioButton();
        BUS = new javax.swing.JRadioButton();
        category = new javax.swing.JComboBox<>();
        fromField = new javax.swing.JComboBox<>();
        date = new com.github.lgooddatepicker.components.DateTimePicker();
        toField = new javax.swing.JComboBox<>();
        clodeBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorRemoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("UPDATE TRIP");
        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        jLabel6.setText("Price:");
        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel7.setText("TRIP ID: ");
        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel8.setText("From:");
        jLabel8.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel9.setText("To:");
        jLabel9.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel10.setText("Date:");
        jLabel10.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel11.setText("Type:");
        jLabel11.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel12.setText("Coach:");
        jLabel12.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        updateTripBTN.setText("UPDATE");
        updateTripBTN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        updateTripBTN.setkBorderRadius(50);
        updateTripBTN.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        updateTripBTN.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        updateTripBTN.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        updateTripBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTripBTNActionPerformed(evt);
            }
        });
        jPanel1.add(updateTripBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 150, 40));
        jPanel1.add(unitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 250, 30));
        jPanel1.add(tripID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 250, 30));

        buttonGroup1.add(TRAIN);
        TRAIN.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        TRAIN.setText("Train");
        jPanel1.add(TRAIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        buttonGroup1.add(BUS);
        BUS.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        BUS.setText("Bus");
        BUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSActionPerformed(evt);
            }
        });
        jPanel1.add(BUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON-AC", " " }));
        jPanel1.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 250, 30));

        fromField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DHAKA", "RAJSHAHI", "RANGPUR", "SYLHET", "KHULNA", "BARISHAL", "CHITTAGONG", "MYMENSINGH" }));
        jPanel1.add(fromField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 250, 30));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 250, 30));

        toField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DHAKA", "RAJSHAHI", "RANGPUR", "SYLHET", "KHULNA", "BARISHAL", "CHITTAGONG", "MYMENSINGH" }));
        jPanel1.add(toField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 250, 30));

        clodeBTN.setBackground(new java.awt.Color(255, 51, 102));
        clodeBTN.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        clodeBTN.setForeground(new java.awt.Color(255, 255, 255));
        clodeBTN.setText("CLOSE");
        clodeBTN.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        clodeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clodeBTNActionPerformed(evt);
            }
        });
        jPanel1.add(clodeBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 40, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BUSActionPerformed

    private void updateTripBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTripBTNActionPerformed
        // TODO add your handling code here:
        int id;
        String from;
        String to;
        String tripDate;
        String tripType;
        String tripCategory;
        double price;
        try {
            id = Integer.parseInt(tripID.getText());
            from = fromField.getSelectedItem().toString();
            to = toField.getSelectedItem().toString();
            tripDate = date.toString();
            tripType = BUS.isSelected() ? "BUS" : "TRAIN";
            tripCategory = category.getSelectedItem().toString();
            price = Double.parseDouble(unitPrice.getText());

            System.out.println(date.getDatePicker().getDate().toString());
            System.out.println(date.getTimePicker().getTime().toString());
            if(date.getDatePicker().getDate().toString().equals("")) {
                throw new Exception();
            }

            if(from.equals("") || to.equals("") || tripDate.equals("") || tripType.equals("") || tripCategory.equals("") || price == 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please fill in all the fields correctly. Check if you have entered an incorrect date or price.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Please fill all the fields");
            return;
        }

        // check if from and to are the same
        if(from.equals(to)) {
            JOptionPane.showMessageDialog(null, "From location and to location cannot be the same", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("From location and to location cannot be the same");
            return;
        }


        // check if trip date is in the past
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime tripDateTime = LocalDateTime.parse(tripDate, formatter);

        if(!tripDateTime.isAfter(now)) {
            JOptionPane.showMessageDialog(null, "Trip date cannot be in the past", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Trip date cannot be in the past");
            return;
        }
        
        // Get TableModel
        TableModel model = this.adminDboard.getTable().getModel();

        // Read rows
        int isFound = 0;
        for (int row = 0; row < model.getRowCount(); row++) {
            for (int col = 0; col < model.getColumnCount(); col++) {
                Object value = model.getValueAt(row, col);
                System.out.println("Row " + row + " Column " + col + ": " + value);
                if(col == 0) {
                    if(value.equals(tripID.getText())) {
                        isFound = 1;
                        break;
                    }
                }
            }
            if(isFound == 1) {
                break;
            }
        }
 
        
        if(isFound == 1) {
            DBConnection db = new DBConnection();
            boolean updatedSuccessfully = db.updateTrip(id, from, to, tripDate, tripType, tripCategory, price);

            if (updatedSuccessfully) {
                JOptionPane.showMessageDialog(null, "Trip updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update trip", "Error", JOptionPane.ERROR_MESSAGE);
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Trip Id not found", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_updateTripBTNActionPerformed

    private void clodeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clodeBTNActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_clodeBTNActionPerformed

    private void jPanel1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorRemoved
        // render updated data in the table
        this.adminDboard.renderTableData();
        this.adminDboard.showPieChart();
    }//GEN-LAST:event_jPanel1AncestorRemoved

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UpdateTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        // java.awt.EventQueue.invokeLater(new Runnable() {
        //     public void run() {
        //         new UpdateTrip().setVisible(true);
        //     }
        // });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BUS;
    private javax.swing.JRadioButton TRAIN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JButton clodeBTN;
    private com.github.lgooddatepicker.components.DateTimePicker date;
    private javax.swing.JComboBox<String> fromField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> toField;
    private javax.swing.JTextField tripID;
    private javax.swing.JTextField unitPrice;
    private com.k33ptoo.components.KButton updateTripBTN;
    // End of variables declaration//GEN-END:variables
}
