
package View;

import Util.DatabeseUtil;

import dao.CustomerDao;
import javax.swing.JOptionPane;



public class PosView extends javax.swing.JFrame {

    DatabeseUtil util=new DatabeseUtil();
    CustomerDao cd = new CustomerDao();
    
  
    
    
    public PosView() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        btnCetagory = new javax.swing.JButton();
        btnPurchase = new javax.swing.JButton();
        btnSeals = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        tabCustomers = new javax.swing.JTabbedPane();
        tabSeals = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tabHome = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tabSupplier = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tabPurchase = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tabCetagory = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tabStock = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tabReport = new javax.swing.JPanel();
        tabCustomer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCustomerID = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerCell = new javax.swing.JTextField();
        txtCustomerEmail = new javax.swing.JTextField();
        txtCustomerAddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));

        jLabel4.setBackground(new java.awt.Color(153, 204, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("POS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 60));

        jPanel3.setBackground(new java.awt.Color(102, 204, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setText("Home");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        jPanel3.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        btnCustomer.setText("Customer");
        btnCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerMouseClicked(evt);
            }
        });
        jPanel3.add(btnCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 110, 40));

        btnStock.setText("Stock");
        btnStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStockMouseClicked(evt);
            }
        });
        jPanel3.add(btnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 110, 40));

        btnSupplier.setText("Supplier");
        btnSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierMouseClicked(evt);
            }
        });
        jPanel3.add(btnSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 110, 40));

        btnCetagory.setText("Cetagory");
        btnCetagory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCetagoryMouseClicked(evt);
            }
        });
        jPanel3.add(btnCetagory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 110, 40));

        btnPurchase.setText("Purchase");
        btnPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPurchaseMouseClicked(evt);
            }
        });
        jPanel3.add(btnPurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 110, 40));

        btnSeals.setText("Seals");
        btnSeals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSealsMouseClicked(evt);
            }
        });
        jPanel3.add(btnSeals, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 110, 40));

        btnReport.setText("Report");
        btnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportMouseClicked(evt);
            }
        });
        jPanel3.add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 110, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 110, 540));

        tabCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCustomersMouseClicked(evt);
            }
        });

        jLabel2.setText("2");

        javax.swing.GroupLayout tabSealsLayout = new javax.swing.GroupLayout(tabSeals);
        tabSeals.setLayout(tabSealsLayout);
        tabSealsLayout.setHorizontalGroup(
            tabSealsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSealsLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jLabel2)
                .addContainerGap(708, Short.MAX_VALUE))
        );
        tabSealsLayout.setVerticalGroup(
            tabSealsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSealsLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addContainerGap(424, Short.MAX_VALUE))
        );

        tabCustomers.addTab("tab2", tabSeals);

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

        tabCustomers.addTab("tab9", jScrollPane1);

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jLabel5.setText("3");

        javax.swing.GroupLayout tabHomeLayout = new javax.swing.GroupLayout(tabHome);
        tabHome.setLayout(tabHomeLayout);
        tabHomeLayout.setHorizontalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tabHomeLayout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabHomeLayout.setVerticalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHomeLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel5)
                .addGap(0, 375, Short.MAX_VALUE))
        );

        tabCustomers.addTab("tab3", tabHome);

        jLabel9.setText("4");

        javax.swing.GroupLayout tabSupplierLayout = new javax.swing.GroupLayout(tabSupplier);
        tabSupplier.setLayout(tabSupplierLayout);
        tabSupplierLayout.setHorizontalGroup(
            tabSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSupplierLayout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel9)
                .addContainerGap(705, Short.MAX_VALUE))
        );
        tabSupplierLayout.setVerticalGroup(
            tabSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSupplierLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel9)
                .addContainerGap(399, Short.MAX_VALUE))
        );

        tabCustomers.addTab("tab4", tabSupplier);

        jLabel10.setText("5");

        javax.swing.GroupLayout tabPurchaseLayout = new javax.swing.GroupLayout(tabPurchase);
        tabPurchase.setLayout(tabPurchaseLayout);
        tabPurchaseLayout.setHorizontalGroup(
            tabPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPurchaseLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel10)
                .addContainerGap(734, Short.MAX_VALUE))
        );
        tabPurchaseLayout.setVerticalGroup(
            tabPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPurchaseLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel10)
                .addContainerGap(385, Short.MAX_VALUE))
        );

        tabCustomers.addTab("tab5", tabPurchase);

        jLabel11.setText("6");

        javax.swing.GroupLayout tabCetagoryLayout = new javax.swing.GroupLayout(tabCetagory);
        tabCetagory.setLayout(tabCetagoryLayout);
        tabCetagoryLayout.setHorizontalGroup(
            tabCetagoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCetagoryLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel11)
                .addContainerGap(759, Short.MAX_VALUE))
        );
        tabCetagoryLayout.setVerticalGroup(
            tabCetagoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCetagoryLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel11)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        tabCustomers.addTab("tab6", tabCetagory);

        jLabel12.setText("7");

        javax.swing.GroupLayout tabStockLayout = new javax.swing.GroupLayout(tabStock);
        tabStock.setLayout(tabStockLayout);
        tabStockLayout.setHorizontalGroup(
            tabStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStockLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel12)
                .addContainerGap(754, Short.MAX_VALUE))
        );
        tabStockLayout.setVerticalGroup(
            tabStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStockLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel12)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        tabCustomers.addTab("tab7", tabStock);

        javax.swing.GroupLayout tabReportLayout = new javax.swing.GroupLayout(tabReport);
        tabReport.setLayout(tabReportLayout);
        tabReportLayout.setHorizontalGroup(
            tabReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        tabReportLayout.setVerticalGroup(
            tabReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        tabCustomers.addTab("tab8", tabReport);

        tabCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        tabCustomer.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 21, 81, 31));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Email");
        tabCustomer.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 109, 81, 31));

        jButton5.setText("Save");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        tabCustomer.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 187, -1, -1));

        jButton6.setText("Delete");
        tabCustomer.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 187, 63, -1));

        jButton9.setText("Edit");
        tabCustomer.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 187, -1, -1));

        jButton10.setText("Reset");
        tabCustomer.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 187, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Address");
        tabCustomer.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 109, 81, 31));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("ID");
        tabCustomer.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 32, 81, 31));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Cell");
        tabCustomer.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 21, 81, 31));
        tabCustomer.add(txtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 21, 192, 38));
        tabCustomer.add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 22, 250, 31));
        tabCustomer.add(txtCustomerCell, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 21, 132, 38));
        tabCustomer.add(txtCustomerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 110, 181, 31));
        tabCustomer.add(txtCustomerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 110, 264, 31));

        tabCustomers.addTab("tab1", tabCustomer);

        getContentPane().add(tabCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 1040, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseClicked
        // TODO add your handling code here:
        tabCustomers.setSelectedIndex(8);
    }//GEN-LAST:event_btnCustomerMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        tabCustomers.setSelectedIndex(0);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseClicked
        // TODO add your handling code here:
        tabCustomers.setSelectedIndex(1);
    }//GEN-LAST:event_btnSupplierMouseClicked

    private void btnCetagoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCetagoryMouseClicked
        // TODO add your handling code here:
        tabCustomers.setSelectedIndex(2);
    }//GEN-LAST:event_btnCetagoryMouseClicked

    private void btnPurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPurchaseMouseClicked
        // TODO add your handling code here:
         tabCustomers.setSelectedIndex(3);
    }//GEN-LAST:event_btnPurchaseMouseClicked

    private void btnSealsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSealsMouseClicked
        // TODO add your handling code here:
         tabCustomers.setSelectedIndex(4);
    }//GEN-LAST:event_btnSealsMouseClicked

    private void btnStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStockMouseClicked
        // TODO add your handling code here:
         tabCustomers.setSelectedIndex(5);
    }//GEN-LAST:event_btnStockMouseClicked

    private void btnReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseClicked
        // TODO add your handling code here:
         tabCustomers.setSelectedIndex(6);
    }//GEN-LAST:event_btnReportMouseClicked

    private void tabCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCustomersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabCustomersMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        String name = txtCustomerName.getText().trim();
        String cell = txtCustomerCell.getText().trim();
        String email = txtCustomerEmail.getText().trim();
        String address = txtCustomerAddress.getText().trim();
        cd.saveCustomer(name, cell, email, address);
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(PosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetagory;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSeals;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel tabCetagory;
    private javax.swing.JPanel tabCustomer;
    private javax.swing.JTabbedPane tabCustomers;
    private javax.swing.JPanel tabHome;
    private javax.swing.JPanel tabPurchase;
    private javax.swing.JPanel tabReport;
    private javax.swing.JPanel tabSeals;
    private javax.swing.JPanel tabStock;
    private javax.swing.JPanel tabSupplier;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerCell;
    private javax.swing.JTextField txtCustomerEmail;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtCustomerName;
    // End of variables declaration//GEN-END:variables
}
