package yumxpress.gui;

import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import yumxpress.dao.CompanyDAO;
import yumxpress.dao.ProductDAO;
import yumxpress.pojo.ProductPojo;
import yumxpress.utility.UserProfile;

public class OrderFoodFrame extends javax.swing.JFrame {

    private Map<String, String> companyMap;
    private List<ProductPojo> productList;
    private int listIndex;
    private JFrame showFrame;
     
    public OrderFoodFrame() {
        initComponents();
        this.setLocationRelativeTo(null);

        this.setTitle("Order Food Frame");
        this.lblUserProfile.setText("Hello " + UserProfile.getUserName().trim());
        loadCompanyNames();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        btnMyAccount = new javax.swing.JButton();
        btnMyCart = new javax.swing.JButton();
        btnOrderFood = new javax.swing.JButton();
        btnOrderHistory = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblUserProfile = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblBack = new javax.swing.JButton();
        lblNext = new javax.swing.JButton();
        jcCompanyNames = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblProductImage1 = new javax.swing.JLabel();
        lblProductImage2 = new javax.swing.JLabel();
        lblProductImage3 = new javax.swing.JLabel();
        lblProductImage4 = new javax.swing.JLabel();
        lblProductImage6 = new javax.swing.JLabel();
        lblProductImage5 = new javax.swing.JLabel();
        lblProductName2 = new javax.swing.JLabel();
        lblProductName3 = new javax.swing.JLabel();
        lblProductName1 = new javax.swing.JLabel();
        lblProductName4 = new javax.swing.JLabel();
        lblProductName5 = new javax.swing.JLabel();
        lblProductName6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 0, 153));

        btnMyAccount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMyAccount.setText("My Account");
        btnMyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyAccountActionPerformed(evt);
            }
        });

        btnMyCart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMyCart.setText("My Cart");

        btnOrderFood.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOrderFood.setText(" Cancal Order ");

        btnOrderHistory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOrderHistory.setText("Order History");

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\java2023\\YumXpress\\src\\yumxpress\\icons\\user.png")); // NOI18N

        lblUserProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUserProfile.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Order Food");

        lblBack.setIcon(new javax.swing.ImageIcon("D:\\java2023\\YumXpress\\src\\yumxpress\\icons\\icons8-left-arrow-64.png")); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        lblNext.setIcon(new javax.swing.ImageIcon("D:\\java2023\\YumXpress\\src\\yumxpress\\icons\\icons8-right-arrow-64.png")); // NOI18N
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
        });

        jcCompanyNames.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcCompanyNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCompanyNamesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("FILTER");

        lblProductImage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });

        lblProductImage2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });

        lblProductImage3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });

        lblProductImage4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });

        lblProductImage6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });

        lblProductImage5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });

        lblProductName2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });

        lblProductName3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });

        lblProductName1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });

        lblProductName4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });

        lblProductName5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });

        lblProductName6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblBack)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblProductImage4, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(lblProductName4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblProductImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProductImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProductName2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProductName5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProductImage5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcCompanyNames, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblProductName3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(lblProductImage3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(33, 33, 33)
                        .addComponent(lblNext))
                    .addComponent(lblProductImage6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductName6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jcCompanyNames, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblProductImage2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                        .addComponent(lblProductImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblProductImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProductName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblProductName3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(lblProductName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBack))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblNext)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblProductImage4, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(lblProductImage5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProductImage6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblProductName5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProductName6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblProductName4, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        btnBack.setBackground(new java.awt.Color(153, 255, 102));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("Back");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnOrderHistory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnOrderFood, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMyCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMyAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(591, 591, 591))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnMyAccount)
                .addGap(37, 37, 37)
                .addComponent(btnMyCart)
                .addGap(32, 32, 32)
                .addComponent(btnOrderFood)
                .addGap(36, 36, 36)
                .addComponent(btnOrderHistory)
                .addGap(27, 27, 27)
                .addComponent(btnBack))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1155, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
//        foodIndex--;
//        if(foodIndex<0){
//            foodIndex = foodList.size()-1;
//        }
//        showFoodDetailsByIndex(foodIndex);
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
//        foodIndex++;
//        if(foodIndex>=foodList.size()){
//            foodIndex = 0;
//        }
//        showFoodDetailsByIndex(foodIndex);

    }//GEN-LAST:event_lblNextMouseClicked

    private void jcCompanyNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCompanyNamesActionPerformed
        String compName = jcCompanyNames.getSelectedItem().toString();
        String compId = companyMap.get(compName);
        if (compId == null) {
            compId = "All";
        }
        try {
            productList = ProductDAO.getAllProductsByCompanyId(compId);
            showDetails();
        } catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, "DB ERROR IN OrderFoodFrame");
            sq.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Image ERROR IN OrderFoodFrame");
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jcCompanyNamesActionPerformed

    private void lblOrderProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrderProductMouseClicked
        JLabel lbl = (JLabel)evt.getSource();
        int index = Integer.parseInt(lbl.getName());
        System.out.println("You clicked on :"+index);
        if(index>=productList.size()){
            JOptionPane.showMessageDialog(null, "Invalid item clicked");
            return;
        }
        
//        JOptionPane.showMessageDialog(null, "Item can be booked");
        String [] str = {"Add To Cart","Buy Now"};
        int choice = JOptionPane.showOptionDialog(null, "What do you want to do ?","Select",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,str,str[1]);
        if(choice == 0){
            //code to add cart
        }
        else{
        ProductPojo p = productList.get(index);
        showFrame = new OrderProductFrame(p);
        showFrame.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_lblOrderProductMouseClicked

    private void btnMyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMyAccountActionPerformed

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
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFoodFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMyAccount;
    private javax.swing.JButton btnMyCart;
    private javax.swing.JButton btnOrderFood;
    private javax.swing.JButton btnOrderHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> jcCompanyNames;
    private javax.swing.JButton lblBack;
    private javax.swing.JButton lblNext;
    private javax.swing.JLabel lblProductImage1;
    private javax.swing.JLabel lblProductImage2;
    private javax.swing.JLabel lblProductImage3;
    private javax.swing.JLabel lblProductImage4;
    private javax.swing.JLabel lblProductImage5;
    private javax.swing.JLabel lblProductImage6;
    private javax.swing.JLabel lblProductName1;
    private javax.swing.JLabel lblProductName2;
    private javax.swing.JLabel lblProductName3;
    private javax.swing.JLabel lblProductName4;
    private javax.swing.JLabel lblProductName5;
    private javax.swing.JLabel lblProductName6;
    private javax.swing.JLabel lblUserProfile;
    // End of variables declaration//GEN-END:variables

    private void loadCompanyNames() {
        try {
            companyMap = CompanyDAO.getAllCompanyIdAndName();
            Set<String> companyNames = companyMap.keySet();
            jcCompanyNames.addItem("ALL");
            for (String cname : companyNames) {
                jcCompanyNames.addItem(cname);
            }
        } catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, "DB ERROR IN OrderFoodFrame");
            sq.printStackTrace();
        }
    }

    private void showDetails(){
       
        if (listIndex < productList.size()){
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage1.getWidth(), lblProductImage1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage1.setIcon(icon);
            lblProductName1.setText(p.getProductName());
            lblProductImage1.setName(listIndex+"");
            lblProductName1.setName(listIndex+"");
            listIndex++;
        } else {
            lblProductImage1.setIcon(null);
            lblProductImage1.setText("N/A");
            lblProductName1.setText("N/A");
            lblProductImage1.setName(listIndex+"");
            lblProductName1.setName(listIndex+"");
            listIndex++;
        }
        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage2.getWidth(), lblProductImage2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage2.setIcon(icon);
            lblProductName2.setText(p.getProductName());
            lblProductImage2.setName(listIndex+"");
            lblProductName2.setName(listIndex+"");
            listIndex++;
        } else {
            lblProductImage2.setIcon(null);
            lblProductName2.setText("N/A");
            lblProductImage2.setText("N/A");
            lblProductImage2.setName(listIndex+"");
            lblProductName2.setName(listIndex+"");
            listIndex++;
        }
        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage3.getWidth(), lblProductImage3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage3.setIcon(icon);
            lblProductName3.setText(p.getProductName());
            lblProductImage3.setName(listIndex+"");
            lblProductName3.setName(listIndex+"");
            listIndex++;
        } else {
            lblProductImage3.setIcon(null);
            lblProductName3.setText("N/A");
            lblProductImage3.setText("N/A");
            lblProductImage3.setName(listIndex+"");
            lblProductName3.setName(listIndex+"");
            listIndex++;
        }
         if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage4.getWidth(), lblProductImage4.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage4.setIcon(icon);
            lblProductName4.setText(p.getProductName());
            lblProductImage4.setName(listIndex+"");
            lblProductName4.setName(listIndex+"");
            listIndex++;
        } else {
            lblProductImage4.setIcon(null);
            lblProductName4.setText("N/A");
            lblProductImage4.setText("N/A");
            lblProductImage4.setName(listIndex+"");
            lblProductName4.setName(listIndex+"");
            listIndex++;
        }
          if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage5.getWidth(), lblProductImage5.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage5.setIcon(icon);
            lblProductName5.setText(p.getProductName());
            lblProductImage5.setName(listIndex+"");
            lblProductName5.setName(listIndex+"");
            listIndex++;
        } else {
            lblProductImage5.setIcon(null);
            lblProductName5.setText("N/A");
            lblProductImage5.setText("N/A");
            lblProductImage5.setName(listIndex+"");
            lblProductName5.setName(listIndex+"");
            listIndex++;
        }
           if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage6.getWidth(), lblProductImage6.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage6.setIcon(icon);
            lblProductName6.setText(p.getProductName());
            lblProductImage6.setName(listIndex+"");
            lblProductName6.setName(listIndex+"");
            listIndex++;
        } else {
            lblProductImage6.setIcon(null);
            lblProductName6.setText("N/A");
            lblProductImage6.setText("N/A");
            lblProductImage6.setName(listIndex+"");
            lblProductName6.setName(listIndex+"");
            listIndex++;
        }
    }
}
