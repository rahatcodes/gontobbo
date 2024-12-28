/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gontobbo_app;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class SaleForm extends javax.swing.JFrame {

    /**
     * Creates new form SaleForm
     */
    public SaleForm() {
        initComponents();
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
        passangerName = new javax.swing.JTextField();
        phoneNo = new javax.swing.JTextField();
        nidNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        goBack = new com.k33ptoo.components.KButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        MediumRadioBTN = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        confirmTicketBTN = new com.k33ptoo.components.KButton();
        seatAmount = new javax.swing.JComboBox<>();
        category = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passangerName.setText(" ");
        getContentPane().add(passangerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 230, 30));

        phoneNo.setText(" ");
        getContentPane().add(phoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 230, 30));

        nidNo.setText(" ");
        getContentPane().add(nidNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 230, 30));

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("||");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("AVAILABLE TICKETS: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("NAME");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Phone No.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("NID No.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Category");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        goBack.setBorder(null);
        goBack.setForeground(new java.awt.Color(51, 51, 51));
        goBack.setText("Go HOME");
        goBack.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        goBack.setkAllowGradient(false);
        goBack.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        goBack.setkBorderRadius(40);
        goBack.setkEndColor(new java.awt.Color(153, 255, 204));
        goBack.setkForeGround(new java.awt.Color(51, 51, 51));
        goBack.setkHoverColor(new java.awt.Color(51, 51, 51));
        goBack.setkHoverEndColor(new java.awt.Color(51, 102, 255));
        goBack.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        goBack.setkHoverStartColor(new java.awt.Color(102, 153, 255));
        goBack.setkStartColor(new java.awt.Color(0, 204, 204));
        goBack.setOpaque(false);
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });
        getContentPane().add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 670, 90, 40));

        jLabel11.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Medium");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, 20));

        jLabel10.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Seat");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, 20));

        buttonGroup1.add(MediumRadioBTN);
        MediumRadioBTN.setText("BUS");
        MediumRadioBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediumRadioBTNActionPerformed(evt);
            }
        });
        getContentPane().add(MediumRadioBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("TRAIN");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        confirmTicketBTN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        confirmTicketBTN.setText("CONFIRM");
        confirmTicketBTN.setkBorderRadius(50);
        confirmTicketBTN.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        confirmTicketBTN.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        confirmTicketBTN.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        confirmTicketBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmTicketBTNActionPerformed(evt);
            }
        });
        getContentPane().add(confirmTicketBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 150, 40));

        seatAmount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04" }));
        seatAmount.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(seatAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 230, 30));

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON-AC" }));
        category.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 230, 30));

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("40");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("(TRAIN)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("40");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel13.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("(BUS)");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\icons\\bg-3.png"));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        ReceptionistDboard rdboard = new ReceptionistDboard();
        rdboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackActionPerformed

    private void MediumRadioBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediumRadioBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MediumRadioBTNActionPerformed

    private void confirmTicketBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmTicketBTNActionPerformed
        // TODO add your handling code here:
//        JOptionPane.showConfirmDialog(null, "ticket No.: 2561. Total Price: 552 BDT,"
//                + "Trip Confirmed.");
       int check_status = JOptionPane.showConfirmDialog(null, 
                "ticket No.: 2561. Total Price: 552 BDT. Confirm Ticket?", "Ticket Confirmation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
       
       System.out.println(check_status);
       if(check_status ==0){
           TicketDetails tdetails = new TicketDetails();
           tdetails.setVisible(true);
       }
    }//GEN-LAST:event_confirmTicketBTNActionPerformed

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
            java.util.logging.Logger.getLogger(SaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton MediumRadioBTN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> category;
    private com.k33ptoo.components.KButton confirmTicketBTN;
    private com.k33ptoo.components.KButton goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField nidNo;
    private javax.swing.JTextField passangerName;
    private javax.swing.JTextField phoneNo;
    private javax.swing.JComboBox<String> seatAmount;
    // End of variables declaration//GEN-END:variables
}
