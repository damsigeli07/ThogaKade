package view;

import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.Customer;
import controller.CustomerController;

public class AddcustomerForm extends javax.swing.JFrame {

    public AddcustomerForm() {
        initComponents();
        setLocationRelativeTo(null);
        loadTitles();
    }

    private void loadTitles() {
        titleCombo.addItem("Mr");
        titleCombo.addItem("Mrs");
        titleCombo.addItem("Miss");
        titleCombo.addItem("Ms");
        titleCombo.addItem("Dr");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        custIdText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        titleCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        custNameText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dobText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        salaryText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        provinceText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        postalCodeText = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        addCustomerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Customer - Thoga Kade");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Customer Form");

        jLabel2.setText("Customer ID:");
        jLabel3.setText("Title:");
        jLabel4.setText("Customer Name:");
        jLabel5.setText("Date of Birth (YYYY-MM-DD):");
        jLabel6.setText("Salary:");
        jLabel7.setText("Address:");
        jLabel8.setText("City:");
        jLabel9.setText("Province:");
        jLabel10.setText("Postal Code:");

        dobText.setToolTipText("Enter date in YYYY-MM-DD format");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(evt -> dispose());

        addCustomerButton.setText("Add Customer");
        addCustomerButton.addActionListener(this::addCustomerButtonActionPerformed);

        // Simple layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel10))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(custIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(titleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(custNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dobText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(salaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(provinceText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(postalCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addCustomerButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(custIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(titleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(custNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(dobText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(salaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(provinceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(postalCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelButton)
                                        .addComponent(addCustomerButton))
                                .addContainerGap())
        );

        pack();
    }

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            // Validation
            if (custIdText.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Customer ID is required");
                return;
            }
            if (custNameText.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Customer Name is required");
                return;
            }

            String custID = custIdText.getText().trim();
            String title = titleCombo.getSelectedItem().toString();
            String name = custNameText.getText().trim();

            LocalDate dob;
            try {
                dob = LocalDate.parse(dobText.getText().trim());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please enter date in YYYY-MM-DD format");
                return;
            }

            double salary;
            try {
                salary = Double.parseDouble(salaryText.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter a valid salary amount");
                return;
            }

            String address = addressText.getText().trim();
            String city = cityText.getText().trim();
            String province = provinceText.getText().trim();
            String postalCode = postalCodeText.getText().trim();

            Customer customer = new Customer(custID, title, name, dob, salary, address, city, province, postalCode);

            boolean isAdded = CustomerController.addCustomer(customer);
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Customer Added Successfully");
                clearFields();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void clearFields() {
        custIdText.setText("");
        titleCombo.setSelectedIndex(0);
        custNameText.setText("");
        dobText.setText("");
        salaryText.setText("");
        addressText.setText("");
        cityText.setText("");
        provinceText.setText("");
        postalCodeText.setText("");
    }

    // Variables declaration
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField custIdText;
    private javax.swing.JTextField custNameText;
    private javax.swing.JTextField dobText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField postalCodeText;
    private javax.swing.JTextField provinceText;
    private javax.swing.JTextField salaryText;
    private javax.swing.JComboBox<String> titleCombo;
}