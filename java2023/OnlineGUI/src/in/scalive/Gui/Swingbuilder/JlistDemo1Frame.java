
package in.scalive.Gui.Swingbuilder;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class JlistDemo1Frame extends javax.swing.JFrame {

    DefaultListModel dlm;
    String []colors;
    public JlistDemo1Frame() {
        initComponents();
        dlm = new  DefaultListModel();
        jlColors.setModel(dlm);
        colors = new String []{"Red","Green","Blue","Yellow","pink","White","Black","Orange"};
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        MyPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlColors = new javax.swing.JList<>();
        btnShowSelection = new javax.swing.JButton();
        btnAddColors = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlColors.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jlColors.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jlColors);

        btnShowSelection.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnShowSelection.setText("Show Selection");
        btnShowSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowSelectionActionPerformed(evt);
            }
        });

        btnAddColors.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAddColors.setText("Add Color");
        btnAddColors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddColorsActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRemove.setText("Remove Color");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Apply Colors");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MyPanelLayout = new javax.swing.GroupLayout(MyPanel);
        MyPanel.setLayout(MyPanelLayout);
        MyPanelLayout.setHorizontalGroup(
            MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnAddColors, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MyPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MyPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnShowSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        MyPanelLayout.setVerticalGroup(
            MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddColors)
                    .addComponent(btnShowSelection)
                    .addComponent(btnRemove)
                    .addComponent(jButton2))
                .addGap(104, 104, 104))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddColorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddColorsActionPerformed
//         jlColors.removeAllItems();
        for(String color:colors)
       {
           dlm.addElement(color);
       }
        
    }//GEN-LAST:event_btnAddColorsActionPerformed

    private void btnShowSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowSelectionActionPerformed
        
        try{
            String str = jlColors.getSelectedValue().toString();
            lblResult.setText("You Selected:"+str);
        }catch(Exception ex){
              JOptionPane.showMessageDialog(null,"Please Select a Color First!","Error!",JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_btnShowSelectionActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try{
            int index = jlColors.getSelectedIndex();
           dlm.removeElementAt(index);
           JOptionPane.showMessageDialog(null,"Item Removed!","Error!",JOptionPane.ERROR_MESSAGE);
        }catch(Exception ex){
              JOptionPane.showMessageDialog(null,"Please Select a Color First!","Error!",JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
//        String color = (String)jlColors.getSelectedValue();
//        switch(color)
//        {
//            case "Red" : MyPanel.setBackground(Color.RED);
//            break;
//        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(JlistDemo1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JlistDemo1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JlistDemo1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JlistDemo1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JlistDemo1Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MyPanel;
    private javax.swing.JButton btnAddColors;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnShowSelection;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlColors;
    private javax.swing.JLabel lblResult;
    // End of variables declaration//GEN-END:variables
}
