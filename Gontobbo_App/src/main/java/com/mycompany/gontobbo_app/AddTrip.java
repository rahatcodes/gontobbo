/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gontobbo_app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import DBConnection.DBConnection;

/**
 *
 * @author User
 */
public class AddTrip extends javax.swing.JFrame {

    private boolean tripIdFound;
    private AdminDboard adminDboard;
    /**
     * Creates new form AddTrip
     */

    public AddTrip(AdminDboard adminDboard) {
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

        kButton1 = new com.k33ptoo.components.KButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        clodeBTN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tripID = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        addTripBTN = new com.k33ptoo.components.KButton();
        unitPrice = new javax.swing.JTextField();
        TRAIN = new javax.swing.JRadioButton();
        BUS = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        category = new javax.swing.JComboBox<>();
        fromField = new javax.swing.JComboBox<>();
        toField = new javax.swing.JComboBox<>();
        date = new com.github.lgooddatepicker.components.DateTimePicker();

        kButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        kButton1.setText("CONFIRM");
        kButton1.setkBorderRadius(50);
        kButton1.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(102, 102, 102));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(clodeBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 40, -1));

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
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tripID.setText(".........");
        tripID.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        tripID.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(tripID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel5.setText("ADD TRIP");
        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jLabel6.setText("Price:");
        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel7.setText("TRIP ID: ");
        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel8.setText("From:");
        jLabel8.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel9.setText("To:");
        jLabel9.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel11.setText("Type:");
        jLabel11.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel12.setText("Coach:");
        jLabel12.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        addTripBTN.setText("ADD TRIP");
        addTripBTN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        addTripBTN.setkBorderRadius(50);
        addTripBTN.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        addTripBTN.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        addTripBTN.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        addTripBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTripBTNActionPerformed(evt);
            }
        });
        jPanel1.add(addTripBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 150, 40));
        jPanel1.add(unitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 250, 30));

        buttonGroup1.add(TRAIN);
        TRAIN.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        TRAIN.setText("Train");
        jPanel1.add(TRAIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        buttonGroup1.add(BUS);
        BUS.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        BUS.setText("Bus");
        BUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSActionPerformed(evt);
            }
        });
        jPanel1.add(BUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jLabel13.setText("Time:");
        jLabel13.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON-AC", " " }));
        jPanel1.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 250, 30));

        fromField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DHAKA", "RAJSHAHI", "RANGPUR", "SYLHET", "KHULNA", "BARISHAL", "CHITTAGONG", "MYMENSINGH" }));
        jPanel1.add(fromField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 250, 30));

        toField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DHAKA", "RAJSHAHI", "RANGPUR", "SYLHET", "KHULNA", "BARISHAL", "CHITTAGONG", "MYMENSINGH" }));
        jPanel1.add(toField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 250, 30));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 250, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addTripBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTripBTNActionPerformed
        // TODO add your handling code here:
        String from;
        String to;
        String tripDate;
        String tripType;
        String tripCategory;
        double price;
        try {
            from = fromField.getSelectedItem().toString();
            to = toField.getSelectedItem().toString();
            price = Double.parseDouble(unitPrice.getText());
            tripDate = date.toString();
            tripCategory = category.getSelectedItem().toString();
            tripType = "";
            if (BUS.isSelected()) {
                tripType = "BUS";
            } else if (TRAIN.isSelected()) {
                tripType = "TRAIN";
            }

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



        System.out.println(fromField.getSelectedItem());
        System.out.println(toField.getSelectedItem());
        System.out.println(unitPrice.getText());
        System.out.println(date.toString() + "date");
        System.out.println(category.getSelectedItem());
        System.out.println(BUS.isSelected());
        System.out.println(TRAIN.isSelected());
        System.out.println(jDateChooser1 + " date chooser 1");

        DBConnection db = new DBConnection();
        boolean addedSuccessfully = db.createTrip(from, to, tripDate, tripType, tripCategory, price);

        if (addedSuccessfully) {
            JOptionPane.showMessageDialog(null, "Trip added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to add trip", "Error", JOptionPane.ERROR_MESSAGE);
            dispose();
        }

    }//GEN-LAST:event_addTripBTNActionPerformed

    private void BUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BUSActionPerformed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        if (!this.tripIdFound) {
            DBConnection db = new DBConnection();
            int newTripId = db.getNewTripId();
            tripID.setText(Integer.toString(newTripId));
        }
    }//GEN-LAST:event_jPanel1MouseEntered

    private void clodeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clodeBTNActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_clodeBTNActionPerformed

    private void jPanel1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorRemoved
        // re-render the table data
        System.out.println("Hello closed addtrip");
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
            java.util.logging.Logger.getLogger(AddTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddTrip().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BUS;
    private javax.swing.JRadioButton TRAIN;
    private com.k33ptoo.components.KButton addTripBTN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JButton clodeBTN;
    private com.github.lgooddatepicker.components.DateTimePicker date;
    private javax.swing.JComboBox<String> fromField;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton1;
    private javax.swing.JComboBox<String> toField;
    private javax.swing.JLabel tripID;
    private javax.swing.JTextField unitPrice;
    // End of variables declaration//GEN-END:variables
}
