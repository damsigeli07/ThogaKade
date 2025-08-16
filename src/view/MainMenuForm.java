package view;

public class MainMenuForm extends javax.swing.JFrame {

    public MainMenuForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addCustomerButton = new javax.swing.JButton();
        searchCustomerButton = new javax.swing.JButton();
        updateCustomerButton = new javax.swing.JButton();
        deleteCustomerButton = new javax.swing.JButton();
        viewCustomersButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        addItemButton = new javax.swing.JButton();
        viewItemsButton = new javax.swing.JButton();
        placeOrderButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thoga Kade - Shop Management System");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thoga Kade Shop Management");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Management", 
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, 
            new java.awt.Font("Tahoma", 1, 18)));

        addCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 16));
        addCustomerButton.setText("Add Customer");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        searchCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 16));
        searchCustomerButton.setText("Search Customer");
        searchCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerButtonActionPerformed(evt);
            }
        });

        updateCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 16));
        updateCustomerButton.setText("Update Customer");
        updateCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerButtonActionPerformed(evt);
            }
        });

        deleteCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 16));
        deleteCustomerButton.setText("Delete Customer");
        deleteCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerButtonActionPerformed(evt);
            }
        });

        viewCustomersButton.setFont(new java.awt.Font("Tahoma", 1, 16));
        viewCustomersButton.setText("View All Customers");
        viewCustomersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewCustomersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addCustomerButton)
                .addGap(18, 18, 18)
                .addComponent(searchCustomerButton)
                .addGap(18, 18, 18)
                .addComponent(updateCustomerButton)
                .addGap(18, 18, 18)
                .addComponent(deleteCustomerButton)
                .addGap(18, 18, 18)
                .addComponent(viewCustomersButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item Management", 
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, 
            new java.awt.Font("Tahoma", 1, 18)));

        addItemButton.setFont(new java.awt.Font("Tahoma", 1, 16));
        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        viewItemsButton.setFont(new java.awt.Font("Tahoma", 1, 16));
        viewItemsButton.setText("View All Items");
        viewItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemsButtonActionPerformed(evt);
            }
        });

        placeOrderButton.setFont(new java.awt.Font("Tahoma", 1, 16));
        placeOrderButton.setText("Place Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewItemsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(placeOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addItemButton)
                .addGap(18, 18, 18)
                .addComponent(viewItemsButton)
                .addGap(18, 18, 18)
                .addComponent(placeOrderButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exitButton.setFont(new java.awt.Font("Tahoma", 1, 18));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new AddcustomerForm().setVisible(true);
    }

    private void searchCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new SearchCustomerForm().setVisible(true);
    }

    private void updateCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new UpdateCustomerForm().setVisible(true);
    }

    private void deleteCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new DeleteCustomerForm().setVisible(true);
    }

    private void viewCustomersButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new ViewCustomerForm().setVisible(true);
    }

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new AddItemForm().setVisible(true);
    }

    private void viewItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new ViewItemsForm().setVisible(true);
    }

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new OrderForm().setVisible(true);
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JButton addItemButton;
    private javax.swing.JButton deleteCustomerButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JButton searchCustomerButton;
    private javax.swing.JButton updateCustomerButton;
    private javax.swing.JButton viewCustomersButton;
    private javax.swing.JButton viewItemsButton;
}