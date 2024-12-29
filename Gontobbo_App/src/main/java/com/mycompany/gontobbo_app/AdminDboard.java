/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gontobbo_app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.sqlite.core.DB;

import DBConnection.DBConnection;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public final class AdminDboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDboard
     */
    public AdminDboard() {
        initComponents();
        showPieChart();
        showLineChart();
    }
public void showPieChart(){
        
        //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset( );
      barDataset.setValue("BUS" , Double.valueOf(45));  
      barDataset.setValue("TRAIN" , Double.valueOf(30));   
      barDataset.setValue("REFUND" , Double.valueOf(25));    
//      barDataset.setValue("Nokia Lumia" , Double.valueOf(10));  
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("Monthly sales",barDataset, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
       //changing pie chart blocks colors
       piePlot.setSectionPaint("BUS", new Color(255,255,102));
        piePlot.setSectionPaint("TRAIN", new Color(102,255,102));
        piePlot.setSectionPaint("REFFUND", new Color(255,102,153));
//        piePlot.setSectionPaint("Nokia Lumia", new Color(0,204,204));
      
       
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelBarChart.removeAll();
        panelBarChart.add(barChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
    }

// ------------ PIE CHART END AND LINE CHART START -----------//
public void showLineChart(){
        //create dataset for the graph
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "january");
        dataset.setValue(150, "Amount", "february");
        dataset.setValue(18, "Amount", "march");
        dataset.setValue(100, "Amount", "april");
        dataset.setValue(80, "Amount", "may");
        dataset.setValue(250, "Amount", "june");
        
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("Yearly Sale","monthly","amount", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        panelLineChart.removeAll();
        panelLineChart.add(lineChartPanel, BorderLayout.CENTER);
        panelLineChart.validate();
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
        panelBarChart = new javax.swing.JPanel();
        addTripBTN = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        updateTripBTN = new com.k33ptoo.components.KButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        rmvTripBTN = new com.k33ptoo.components.KButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        goBack = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        panelLineChart = new javax.swing.JPanel();
        bgg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                onAddAdminDboard(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBarChart.setBackground(new java.awt.Color(204, 255, 255));
        panelBarChart.setLayout(new java.awt.BorderLayout());
        kGradientPanel1.add(panelBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 260, 180));

        addTripBTN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        addTripBTN.setText("ADD TRIP");
        addTripBTN.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        addTripBTN.setkBorderRadius(50);
        addTripBTN.setkEndColor(new java.awt.Color(0, 204, 204));
        addTripBTN.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        addTripBTN.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        addTripBTN.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        addTripBTN.setkPressedColor(new java.awt.Color(0, 0, 0));
        addTripBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTripBTNActionPerformed(evt);
            }
        });
        kGradientPanel1.add(addTripBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 170));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "TRIP ID.", "DATE", "FROM", "TO", "TYPE", "SEAT"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 790, 120));

        updateTripBTN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        updateTripBTN.setText("UPDATE TRIP");
        updateTripBTN.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        updateTripBTN.setkBorderRadius(50);
        updateTripBTN.setkEndColor(new java.awt.Color(0, 204, 204));
        updateTripBTN.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        updateTripBTN.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        updateTripBTN.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        updateTripBTN.setkPressedColor(new java.awt.Color(0, 0, 0));
        updateTripBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTripBTNActionPerformed(evt);
            }
        });
        kGradientPanel1.add(updateTripBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, 70));
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 380, 10));
        kGradientPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 380, 10));

        rmvTripBTN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        rmvTripBTN.setText("REMOVE TRIP");
        rmvTripBTN.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        rmvTripBTN.setkBorderRadius(50);
        rmvTripBTN.setkEndColor(new java.awt.Color(0, 204, 204));
        rmvTripBTN.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        rmvTripBTN.setkHoverForeGround(new java.awt.Color(102, 255, 255));
        rmvTripBTN.setkHoverStartColor(new java.awt.Color(51, 51, 51));
        rmvTripBTN.setkPressedColor(new java.awt.Color(0, 0, 0));
        rmvTripBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmvTripBTNActionPerformed(evt);
            }
        });
        kGradientPanel1.add(rmvTripBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, 70));

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("WELCOME TO ");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("ADMIN  DASHBOARD");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

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
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });
        kGradientPanel1.add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 670, 90, 40));

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Running Trip");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        panelLineChart.setLayout(new java.awt.BorderLayout());
        kGradientPanel1.add(panelLineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 250, 180));

        bgg.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\icons\\bg-2.png"));
        kGradientPanel1.add(bgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addTripBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTripBTNActionPerformed
        // TODO add your handling code here:
        AddTrip addTrip = new AddTrip(AdminDboard.this);
        addTrip.setVisible(true);
    }//GEN-LAST:event_addTripBTNActionPerformed

    private void updateTripBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTripBTNActionPerformed
        // TODO add your handling code here:
        UpdateTrip update = new UpdateTrip(AdminDboard.this);
        update.setVisible(true);
    }//GEN-LAST:event_updateTripBTNActionPerformed

    private void rmvTripBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmvTripBTNActionPerformed
        // TODO add your handling code here:
        String tripID = JOptionPane.showInputDialog("Enter Trip ID To Remove:");

        if(tripID == null || tripID.length() == 0) {
            return;
        }
        int id;
        try {
            id = Integer.parseInt(tripID);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Trip Id", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DBConnection db = new DBConnection();
        boolean removedSuccessfully = db.removeTrip(id);

        if(removedSuccessfully) {
            JOptionPane.showMessageDialog(null, "Trip Removed Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            this.renderTableData();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to remove trip", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        System.out.println(tripID);//use this to delete from database
    }//GEN-LAST:event_rmvTripBTNActionPerformed

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        HomePage homepage = new HomePage();
        homepage.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackActionPerformed
  
    private void onAddAdminDboard(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_onAddAdminDboard
        // TODO add your handling code here:
        this.renderTableData();
        
    }//GEN-LAST:event_onAddAdminDboard

    public void renderTableData() {
        System.out.println("AdminDboard");
        DBConnection db = new DBConnection();
        db.connect();

        List<Map<String, String>> trips = new ArrayList<>();
        try {
            trips = db.getAllTrips(db.getConnection(), "trip");
        } catch(SQLException e) {
            e.printStackTrace();
        }

        // clear previous data
        ((javax.swing.table.DefaultTableModel) jTable1.getModel()).setRowCount(0);

        for(Map<String, String> trip : trips) {
            String dateTime = DBConnection.timeStampConverter(trip.get("start_time"));
            trip.put("start_time", dateTime);
            String[] row = {
                trip.get("id"),
                trip.get("start_time"),
                trip.get("from"),
                trip.get("to"),
                trip.get("type"),
                trip.get("seat")
            };
            ((javax.swing.table.DefaultTableModel) jTable1.getModel()).addRow(row);
        }
        db.disconnect();
    }

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
            java.util.logging.Logger.getLogger(AdminDboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminDboard adminDboard = new AdminDboard();
                adminDboard.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton addTripBTN;
    private javax.swing.JLabel bgg;
    private com.k33ptoo.components.KButton goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel panelLineChart;
    private com.k33ptoo.components.KButton rmvTripBTN;
    private com.k33ptoo.components.KButton updateTripBTN;
    // End of variables declaration//GEN-END:variables
}
