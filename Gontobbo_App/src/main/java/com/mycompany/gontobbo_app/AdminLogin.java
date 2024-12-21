/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gontobbo_app;



/**
 *
 * @author User
 */
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public AdminLogin() {
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
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        adminPassword = new javax.swing.JTextField();
        adminUname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adminLoginBTN = new com.k33ptoo.components.KButton();
        goBack = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setForeground(new java.awt.Color(51, 51, 51));
        kGradientPanel2.setkBorderRadius(40);
        kGradientPanel2.setkEndColor(new java.awt.Color(204, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setOpaque(false);
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField1.setOpaque(false);
        kGradientPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 80, -1, -1));

        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField2.setOpaque(false);
        kGradientPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 80, -1, -1));

        adminPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        adminPassword.setOpaque(false);
        kGradientPanel2.add(adminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 310, 40));

        adminUname.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        adminUname.setForeground(new java.awt.Color(51, 51, 51));
        adminUname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        adminUname.setCaretColor(new java.awt.Color(0, 153, 153));
        adminUname.setOpaque(false);
        kGradientPanel2.add(adminUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 310, 40));

        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("PASSWORD");
        jLabel1.setToolTipText("");
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 100, 20));

        jLabel3.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("USERNAME");
        jLabel3.setToolTipText("");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, 20));

        jLabel4.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("ADMIN LOGIN");
        jLabel4.setToolTipText("");
        kGradientPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 140, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\icons\\logo.png"));
        kGradientPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 140, 100));

        adminLoginBTN.setBorder(null);
        adminLoginBTN.setText("LOGIN");
        adminLoginBTN.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        adminLoginBTN.setkBorderRadius(40);
        adminLoginBTN.setkEndColor(new java.awt.Color(153, 255, 204));
        adminLoginBTN.setkHoverColor(new java.awt.Color(51, 51, 51));
        adminLoginBTN.setkHoverEndColor(new java.awt.Color(51, 102, 255));
        adminLoginBTN.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        adminLoginBTN.setkHoverStartColor(new java.awt.Color(102, 153, 255));
        adminLoginBTN.setkStartColor(new java.awt.Color(0, 204, 204));
        adminLoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginBTNActionPerformed(evt);
            }
        });
        kGradientPanel2.add(adminLoginBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 370, 460));

        goBack.setBorder(null);
        goBack.setForeground(new java.awt.Color(51, 51, 51));
        goBack.setText("Go Back");
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

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        HomePage homepage = new HomePage();
        homepage.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackActionPerformed

    private void adminLoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginBTNActionPerformed
        // TODO add your handling code here:
        AdminDboard adminDboard = new AdminDboard();
        adminDboard.setVisible(true);
    }//GEN-LAST:event_adminLoginBTNActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton adminLoginBTN;
    private javax.swing.JTextField adminPassword;
    private javax.swing.JTextField adminUname;
    private com.k33ptoo.components.KButton goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables

    //jLabel1 = password
    //jLabel3 = username
    //jTextField3 = password
    //jTextFIeld4 = username
    //kButton2 = LOGIN
}
