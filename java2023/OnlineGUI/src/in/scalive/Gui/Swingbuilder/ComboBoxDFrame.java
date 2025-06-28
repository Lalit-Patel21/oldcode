
package in.scalive.Gui.Swingbuilder;

import javax.swing.JOptionPane;


public class ComboBoxDFrame extends javax.swing.JFrame {

    private String []sportNames =  null;
    
    public ComboBoxDFrame() {
        initComponents();
        sportNames =  new String[]{"Cricket","Football","Hockey","Badmonton","Rugby","snooker","Carrom","vollyBall"};
        jcSports.setMaximumRowCount(5);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jc1Sports = new javax.swing.JComboBox<>();
        jcSports = new javax.swing.JComboBox<>();
        btnAddSports = new javax.swing.JButton();
        btnShowSelection = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        btnRemoveSelection = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Select A Sport");

        jc1Sports.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jc1Sports.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cricket", "Football", "Hockey", "Rubby", "Table tenis", "VollyBall", "Kabbadi", "BedMinton" }));

        jcSports.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcSports.setMaximumRowCount(4);

        btnAddSports.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddSports.setText("Add Sports");
        btnAddSports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSportsActionPerformed(evt);
            }
        });

        btnShowSelection.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnShowSelection.setText("Show Selection");
        btnShowSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowSelectionActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnRemoveSelection.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRemoveSelection.setText("Remove Selection");
        btnRemoveSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveSelectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcSports, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAddSports, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnShowSelection)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jc1Sports, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnRemoveSelection)
                                .addContainerGap(80, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcSports, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc1Sports, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddSports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoveSelection))
                .addContainerGap(209, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSportsActionPerformed
//        jcSports.addItem("Cricket");
//        jcSports.addItem("Football");
//        jcSports.addItem("Hockey");

          jcSports.removeAllItems();
          jcSports.addItem("Select a sport");
          for(String sp:sportNames){
              
              jcSports.addItem(sp);
             
         }  
//          btnShowSelection.setEnabled(true);

    }//GEN-LAST:event_btnAddSportsActionPerformed

    private void btnShowSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowSelectionActionPerformed
//      try{
//          String itemName = jcSports.getSelectedItem().toString();
//        if(itemName.equalsIgnoreCase("Select a sport"))
//        {
//           JOptionPane.showMessageDialog(null,"Please Select a sport name!","Error!",JOptionPane.ERROR_MESSAGE);
//           return; 
//        }
//        
//        
//       lblResult.setText("you Selected:"+itemName);
//    }catch(NullPointerException ex){
//    
//     JOptionPane.showMessageDialog(null,"Please Add a sports name!","Error!",JOptionPane.ERROR_MESSAGE);
//         }


//         if(jcSports.getSelectedIndex()== -1){
//             JOptionPane.showMessageDialog(null,"Please Add a sports name!","Error!",JOptionPane.ERROR_MESSAGE);
//              return; 
//         }


          Object obj = jcSports.getSelectedItem();
          
          if(obj==null){
              JOptionPane.showMessageDialog(null,"Please Add a sports name!","Error!",JOptionPane.ERROR_MESSAGE);
              return;
          }
          
          String itemName = obj.toString();
          
//         String itemName = jcSports.getSelectedItem().toString();
        if(itemName.equalsIgnoreCase("Select a sport"))
        {
           JOptionPane.showMessageDialog(null,"Please Select a sport name!","Error!",JOptionPane.ERROR_MESSAGE);
           return; 
        }
       lblResult.setText("you Selected:"+itemName);
          
    }//GEN-LAST:event_btnShowSelectionActionPerformed

    private void btnRemoveSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveSelectionActionPerformed
        try{
            int index = jcSports.getSelectedIndex();
            if(index == 0){
                JOptionPane.showMessageDialog(null,"Please Select a sport name!","Error!",JOptionPane.ERROR_MESSAGE);
                return; 
            }
        jcSports.removeItemAt(index);
        JOptionPane.showMessageDialog(null,"Item removed !");
        }catch(IndexOutOfBoundsException ex)
        {
            JOptionPane.showMessageDialog(null,"Please Select a sport name");
            
        }
    }//GEN-LAST:event_btnRemoveSelectionActionPerformed

    
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
            java.util.logging.Logger.getLogger(ComboBoxDFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComboBoxDFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComboBoxDFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComboBoxDFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboBoxDFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSports;
    private javax.swing.JButton btnRemoveSelection;
    private javax.swing.JButton btnShowSelection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jc1Sports;
    private javax.swing.JComboBox<String> jcSports;
    private javax.swing.JLabel lblResult;
    // End of variables declaration//GEN-END:variables
}
