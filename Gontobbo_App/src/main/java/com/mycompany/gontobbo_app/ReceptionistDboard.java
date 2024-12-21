/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gontobbo_app;
/**
 *
 * @author User
 */
public class ReceptionistDboard extends javax.swing.JFrame {

    /**
     * Creates new form ReceptionistDboard
     */
    public ReceptionistDboard() {
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

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        ticketSearchBTN = new com.k33ptoo.components.KButton();
        newSaleBTN = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ticketTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        refundBTN = new com.k33ptoo.components.KButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jProgressBar2 = new javax.swing.JProgressBar();
        goBack = new com.k33ptoo.components.KButton();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ticketSearchBTN.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(0, 0, 0)));
        ticketSearchBTN.setText("SEARCH");
        ticketSearchBTN.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        ticketSearchBTN.setkBorderRadius(0);
        ticketSearchBTN.setkEndColor(new java.awt.Color(204, 153, 255));
        ticketSearchBTN.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        ticketSearchBTN.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        ticketSearchBTN.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        ticketSearchBTN.setkPressedColor(new java.awt.Color(0, 0, 0));
        ticketSearchBTN.setkStartColor(new java.awt.Color(0, 204, 204));
        ticketSearchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketSearchBTNActionPerformed(evt);
            }
        });
        kGradientPanel1.add(ticketSearchBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 130, 30));

        newSaleBTN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        newSaleBTN.setText("NEW SALE");
        newSaleBTN.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        newSaleBTN.setkBorderRadius(50);
        newSaleBTN.setkEndColor(new java.awt.Color(0, 204, 204));
        newSaleBTN.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        newSaleBTN.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        newSaleBTN.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        newSaleBTN.setkPressedColor(new java.awt.Color(0, 0, 0));
        newSaleBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSaleBTNActionPerformed(evt);
            }
        });
        kGradientPanel1.add(newSaleBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, 110));

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("LATEST SALE");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Total Sale");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        ticketTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DATE", "TICKET NO.", "NAME", "PHONE No."
            }
        ));
        jScrollPane1.setViewportView(ticketTable);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 760, 90));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("32,500 BDT");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, 20));

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("RECEPTIONIST DASHBOARD");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("WELCOME TO ");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        refundBTN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        refundBTN.setText("REFUND");
        refundBTN.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        refundBTN.setkBorderRadius(50);
        refundBTN.setkEndColor(new java.awt.Color(0, 204, 204));
        refundBTN.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        refundBTN.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        refundBTN.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        refundBTN.setkPressedColor(new java.awt.Color(0, 0, 0));
        refundBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refundBTNActionPerformed(evt);
            }
        });
        kGradientPanel1.add(refundBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, 110));
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 380, 10));
        kGradientPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 380, 10));

        jProgressBar2.setBackground(new java.awt.Color(204, 255, 255));
        jProgressBar2.setForeground(new java.awt.Color(0, 204, 204));
        jProgressBar2.setToolTipText("");
        jProgressBar2.setValue(72);
        kGradientPanel1.add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 370, 20));

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
        kGradientPanel1.add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 670, 90, 40));
        kGradientPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 380, 10));

        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("         ENTER TICKET No.");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jTextField1.setOpaque(false);
        kGradientPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 310, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\icons\\bg-2.png"));
        jLabel6.setText("jLabel6");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ticketSearchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketSearchBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticketSearchBTNActionPerformed

    private void refundBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refundBTNActionPerformed
        // TODO add your handling code here:
        Refund refund = new Refund();
        refund.setVisible(true);
    }//GEN-LAST:event_refundBTNActionPerformed

    private void newSaleBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSaleBTNActionPerformed
        // TODO add your handling code here:
        PreSale_Check presale = new PreSale_Check();
        presale.setVisible(true);
    }//GEN-LAST:event_newSaleBTNActionPerformed

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        HomePage homepage = new HomePage();
        homepage.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackActionPerformed

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
            java.util.logging.Logger.getLogger(ReceptionistDboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionistDboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionistDboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionistDboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionistDboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KButton newSaleBTN;
    private com.k33ptoo.components.KButton refundBTN;
    private com.k33ptoo.components.KButton ticketSearchBTN;
    private javax.swing.JTable ticketTable;
    // End of variables declaration//GEN-END:variables
}
