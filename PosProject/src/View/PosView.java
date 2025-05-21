package View;

import Util.DatabeseUtil;

import dao.CustomerDao;
import javax.swing.JOptionPane;

public class PosView extends javax.swing.JFrame {

    DatabeseUtil util = new DatabeseUtil();
    CustomerDao cd = new CustomerDao();

    public PosView() {
        initComponents();
        cd.showCustomerDetails(tableCustomer);
    }

    public void reset() {
        txtCustomerID.setText("");
        txtCustomerName.setText("");
        txtCustomerCell.setText("");
        txtCustomerEmail.setText("");
        txtCustomerAddress.setText("");
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
        tab = new javax.swing.JTabbedPane();
        tabHome = new javax.swing.JPanel();
        tabCustomer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCustomerID = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerCell = new javax.swing.JTextField();
        txtCustomerEmail = new javax.swing.JTextField();
        txtCustomerAddress = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tabSupplier = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        tabCategory = new javax.swing.JPanel();
        tabPurchase = new javax.swing.JPanel();
        Sales = new javax.swing.JPanel();
        Stock = new javax.swing.JPanel();
        Report = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel4.setBackground(new java.awt.Color(0, 204, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("POS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 60));

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setText("Home");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
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

        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tabHomeLayout = new javax.swing.GroupLayout(tabHome);
        tabHome.setLayout(tabHomeLayout);
        tabHomeLayout.setHorizontalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        tabHomeLayout.setVerticalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        tab.addTab("Home", tabHome);

        tabCustomer.setMinimumSize(new java.awt.Dimension(100, 1000));
        tabCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        tabCustomer.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 40, 31));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Email");
        tabCustomer.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 50, 31));

        jButton5.setBackground(new java.awt.Color(0, 153, 51));
        jButton5.setText("Save");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        tabCustomer.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setText("Delete");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        tabCustomer.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 63, -1));

        btnEdit.setBackground(new java.awt.Color(204, 204, 204));
        btnEdit.setText("Edit");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        tabCustomer.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jButton10.setBackground(new java.awt.Color(204, 204, 0));
        jButton10.setText("Reset");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        tabCustomer.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Address");
        tabCustomer.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 81, 31));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("ID");
        tabCustomer.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 31));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Cell");
        tabCustomer.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 40, 31));
        tabCustomer.add(txtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 192, 38));
        tabCustomer.add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 250, 31));
        tabCustomer.add(txtCustomerCell, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 132, 38));
        tabCustomer.add(txtCustomerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 181, 31));
        tabCustomer.add(txtCustomerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 264, 31));

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableCustomer);

        tabCustomer.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 207, 960, 330));

        jButton1.setText("Search By Address");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        tabCustomer.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, -1));

        jButton2.setText("jButton2");
        tabCustomer.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 130, -1));

        tab.addTab("Customer", tabCustomer);

        jTextField1.setBackground(new java.awt.Color(51, 0, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Supplier");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jButton3.setText("jButton3");

        jTextField2.setText("jTextField2");

        jButton4.setText("jButton3");

        jTextField3.setText("jTextField2");

        jButton7.setText("jButton3");

        jTextField4.setText("jTextField2");

        jButton8.setText("jButton3");

        jTextField5.setText("jTextField2");

        jButton9.setText("jButton3");

        jTextField6.setText("jTextField2");

        jButton11.setText("jButton3");

        jTextField7.setText("jTextField2");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        jButton12.setText("jButton12");

        jButton13.setText("jButton13");

        javax.swing.GroupLayout tabSupplierLayout = new javax.swing.GroupLayout(tabSupplier);
        tabSupplier.setLayout(tabSupplierLayout);
        tabSupplierLayout.setHorizontalGroup(
            tabSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSupplierLayout.createSequentialGroup()
                .addGroup(tabSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(tabSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(tabSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabSupplierLayout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tabSupplierLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(tabSupplierLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton12)
                .addGap(130, 130, 130)
                .addComponent(jButton13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tabSupplierLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tabSupplierLayout.setVerticalGroup(
            tabSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSupplierLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tabSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151)
                .addGroup(tabSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(tabSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton13))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tab.addTab("Supplier", tabSupplier);

        javax.swing.GroupLayout tabCategoryLayout = new javax.swing.GroupLayout(tabCategory);
        tabCategory.setLayout(tabCategoryLayout);
        tabCategoryLayout.setHorizontalGroup(
            tabCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        tabCategoryLayout.setVerticalGroup(
            tabCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        tab.addTab("Catagory", tabCategory);

        javax.swing.GroupLayout tabPurchaseLayout = new javax.swing.GroupLayout(tabPurchase);
        tabPurchase.setLayout(tabPurchaseLayout);
        tabPurchaseLayout.setHorizontalGroup(
            tabPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        tabPurchaseLayout.setVerticalGroup(
            tabPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        tab.addTab("Purchase", tabPurchase);

        javax.swing.GroupLayout SalesLayout = new javax.swing.GroupLayout(Sales);
        Sales.setLayout(SalesLayout);
        SalesLayout.setHorizontalGroup(
            SalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        SalesLayout.setVerticalGroup(
            SalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        tab.addTab("Sales", Sales);

        javax.swing.GroupLayout StockLayout = new javax.swing.GroupLayout(Stock);
        Stock.setLayout(StockLayout);
        StockLayout.setHorizontalGroup(
            StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        StockLayout.setVerticalGroup(
            StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        tab.addTab("Stock", Stock);

        javax.swing.GroupLayout ReportLayout = new javax.swing.GroupLayout(Report);
        Report.setLayout(ReportLayout);
        ReportLayout.setHorizontalGroup(
            ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        ReportLayout.setVerticalGroup(
            ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        tab.addTab("Report", Report);

        getContentPane().add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 970, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        tab.setSelectedIndex(0);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseClicked
        // TODO add your handling code here:
        tab.setSelectedIndex(2);
    }//GEN-LAST:event_btnSupplierMouseClicked

    private void btnCetagoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCetagoryMouseClicked
        // TODO add your handling code here:
        tab.setSelectedIndex(3);
    }//GEN-LAST:event_btnCetagoryMouseClicked

    private void btnPurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPurchaseMouseClicked
        // TODO add your handling code here:
        tab.setSelectedIndex(4);
    }//GEN-LAST:event_btnPurchaseMouseClicked

    private void btnSealsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSealsMouseClicked
        // TODO add your handling code here:
        tab.setSelectedIndex(5);
    }//GEN-LAST:event_btnSealsMouseClicked

    private void btnStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStockMouseClicked
        // TODO add your handling code here:
        tab.setSelectedIndex(6);
    }//GEN-LAST:event_btnStockMouseClicked

    private void btnReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseClicked
        // TODO add your handling code here:
        tab.setSelectedIndex(7);
    }//GEN-LAST:event_btnReportMouseClicked

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        String name = txtCustomerName.getText().trim();
        String cell = txtCustomerCell.getText().trim();
        String email = txtCustomerEmail.getText().trim();
        String address = txtCustomerAddress.getText().trim();
        cd.saveCustomer(name, cell, email, address);
        cd.showCustomerDetails(tableCustomer);
        reset();
    }//GEN-LAST:event_jButton5MouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(txtCustomerID.getText().trim());
        String name = txtCustomerName.getText().trim();
        String cell = txtCustomerCell.getText().trim();
        String email = txtCustomerEmail.getText().trim();
        String address = txtCustomerAddress.getText().trim();

        cd.update(id, name, cell, email, address);

        cd.showCustomerDetails(tableCustomer);

        reset();

    }//GEN-LAST:event_btnEditMouseClicked

    private void tableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseClicked
        // TODO add your handling code here:
        int rowIndex = tableCustomer.getSelectedRow();

        String id = tableCustomer.getModel().getValueAt(rowIndex, 0).toString();
        String name = tableCustomer.getModel().getValueAt(rowIndex, 1).toString();
        String email = tableCustomer.getModel().getValueAt(rowIndex, 2).toString();
        String phone = tableCustomer.getModel().getValueAt(rowIndex, 3).toString();
        String address = tableCustomer.getModel().getValueAt(rowIndex, 4).toString();

        txtCustomerID.setText(id);
        txtCustomerName.setText(name);
        txtCustomerEmail.setText(email);
        txtCustomerCell.setText(phone);
        txtCustomerAddress.setText(address);
    }//GEN-LAST:event_tableCustomerMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(txtCustomerID.getText());
        cd.delete(id);
        cd.showCustomerDetails(tableCustomer);
        reset();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String address = txtCustomerAddress.getText().trim();
        cd.showCustomerDetailsByAddress(tableCustomer, address);
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseClicked
        // TODO add your handling code here:
        tab.setSelectedIndex(1);

    }//GEN-LAST:event_btnCustomerMouseClicked

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
    private javax.swing.JPanel Report;
    private javax.swing.JPanel Sales;
    private javax.swing.JPanel Stock;
    private javax.swing.JButton btnCetagory;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSeals;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JPanel tabCategory;
    private javax.swing.JPanel tabCustomer;
    private javax.swing.JPanel tabHome;
    private javax.swing.JPanel tabPurchase;
    private javax.swing.JPanel tabSupplier;
    private javax.swing.JTable tableCustomer;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerCell;
    private javax.swing.JTextField txtCustomerEmail;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtCustomerName;
    // End of variables declaration//GEN-END:variables
}
