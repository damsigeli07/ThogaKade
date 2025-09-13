package view;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Item;
import controller.ItemController;

public class AddItemForm extends javax.swing.JFrame {

    public AddItemForm() {
        initComponents();
        setTitle("Add New Item");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codeText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        descriptionText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        unitPriceText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        qtyText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        addItemButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font(java.awt.Font.DIALOG, java.awt.Font.BOLD, 36));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Item Form");

        jLabel2.setFont(new java.awt.Font(java.awt.Font.DIALOG, java.awt.Font.BOLD, 18));
        jLabel2.setText("Item Code");

        codeText.setFont(new java.awt.Font(java.awt.Font.DIALOG, java.awt.Font.BOLD, 18));

        jLabel3.setFont(new java.awt.Font(java.awt.Font.DIALOG, java.awt.Font.BOLD, 18));
        jLabel3.setText("Description");

        descriptionText.setFont(new java.awt.Font(java.awt.Font.DIALOG, java.awt.Font.BOLD, 18));

        jLabel4.setFont(new java.awt.Font(java.awt.Font.DIALOG, java.awt.Font.BOLD, 18));
        jLabel4.setText("Pack Size");

        unitPriceText.setFont(new java.awt.Font(java.awt.Font.DIALOG, java.awt.Font.BOLD, 18));

        qtyText.setFont(new java.awt.Font(java.awt.Font.DIALOG, java.awt.Font.BOLD, 18));

        jLabel5.setFont(new java.awt.Font(java.awt.Font.DIALOG, java.awt.Font.BOLD, 18));
        jLabel5.setText("Unit Price");

        cancelButton.setFont(new java.awt.Font(java.awt.Font.DIALOG, java.awt.Font.BOLD, 18));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addItemButton.setFont(new java.awt.Font(java.awt.Font.DIALOG, java.awt.Font.BOLD, 18));
        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(unitPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(addItemButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cancelButton)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(unitPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelButton)
                                        .addComponent(addItemButton))
                                .addContainerGap())
        );

        pack();
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }
    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String code = codeText.getText();
        String description = descriptionText.getText();
        String packSize = packSizeText.getText();
        double unitPrice = Double.parseDouble(unitPriceText.getText());
        int qty = Integer.parseInt(qtyText.getText());


        Item item = new Item(code, description, packSize, unitPrice, qty);
        try {
            boolean isAdded = ItemController.addItem(item);
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Item Added Successfully");
                clearFields();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Driver not found");
        }
    }

    private void clearFields() {
        codeText.setText("");
        descriptionText.setText("");
        packSizeText.setText("");
        unitPriceText.setText("");
        qtyText.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItemForm().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton addItemButton;
    private javax.swing.JTextField codeText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField descriptionText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField qtyText;
    private javax.swing.JTextField unitPriceText;
}
