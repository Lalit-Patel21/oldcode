
package yumxpress.gui;

import javax.swing.JOptionPane;


public class UserVerifyFrame extends javax.swing.JFrame {

   
    public UserVerifyFrame() {
        initComponents();
        this.setTitle("User Verify Frame");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Customer = new javax.swing.JPanel();
        jrbSeller = new javax.swing.JRadioButton();
        jrbDeliveryStaff = new javax.swing.JRadioButton();
        jrbCustomer = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Customer.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 3, true), "Select An Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 48), new java.awt.Color(0, 0, 204))); // NOI18N

        buttonGroup1.add(jrbSeller);
        jrbSeller.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrbSeller.setForeground(new java.awt.Color(0, 0, 153));
        jrbSeller.setText("Seller");

        buttonGroup1.add(jrbDeliveryStaff);
        jrbDeliveryStaff.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrbDeliveryStaff.setForeground(new java.awt.Color(0, 0, 153));
        jrbDeliveryStaff.setText("Delivery Staff");

        buttonGroup1.add(jrbCustomer);
        jrbCustomer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrbCustomer.setForeground(new java.awt.Color(0, 0, 153));
        jrbCustomer.setText("Customer");

        btnNext.setBackground(new java.awt.Color(0, 102, 204));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CustomerLayout = new javax.swing.GroupLayout(Customer);
        Customer.setLayout(CustomerLayout);
        CustomerLayout.setHorizontalGroup(
            CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerLayout.createSequentialGroup()
                .addGroup(CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomerLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbCustomer)
                            .addComponent(jrbDeliveryStaff)
                            .addComponent(jrbSeller)))
                    .addGroup(CustomerLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        CustomerLayout.setVerticalGroup(
            CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jrbSeller)
                .addGap(34, 34, 34)
                .addComponent(jrbDeliveryStaff)
                .addGap(32, 32, 32)
                .addComponent(jrbCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        btnQuit.setBackground(new java.awt.Color(255, 0, 0));
        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\java2023\\YumXpress\\src\\yumxpress\\icons\\user selection.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQuit)
                .addGap(39, 39, 39))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if(jrbSeller.isSelected()){
            SellerLoginFrame sellerLoginFrame=new SellerLoginFrame();
            sellerLoginFrame.setVisible(true);
            this.dispose();
        }else if(jrbCustomer.isSelected()){
            CustomerLoginFrame customerLoginFrame=new CustomerLoginFrame();
            customerLoginFrame.setVisible(true);
            this.dispose();
        }else if(jrbDeliveryStaff.isSelected()){
             DeliveryStaffLoginFrame deliveryStaffLogin=new DeliveryStaffLoginFrame();
             deliveryStaffLogin.setVisible(true);
             this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Select An Option First!");
            return;
        }
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    
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
            java.util.logging.Logger.getLogger(UserVerifyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserVerifyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserVerifyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserVerifyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserVerifyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Customer;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jrbCustomer;
    private javax.swing.JRadioButton jrbDeliveryStaff;
    private javax.swing.JRadioButton jrbSeller;
    // End of variables declaration//GEN-END:variables
}
