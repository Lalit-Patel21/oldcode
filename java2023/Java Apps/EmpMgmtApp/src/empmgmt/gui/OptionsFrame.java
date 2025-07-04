
package empmgmt.gui;

import empmgmt.dbutil.DBConnection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class OptionsFrame extends javax.swing.JFrame {

   
    public OptionsFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jrbAddEmp = new javax.swing.JRadioButton();
        jrbSearchEmp = new javax.swing.JRadioButton();
        jrbShowAllEmp = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        jrbQuit = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Options");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select An Option");

        jrbAddEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbAddEmp);
        jrbAddEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbAddEmp.setText("Add Employee");

        jrbSearchEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbSearchEmp);
        jrbSearchEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbSearchEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbSearchEmp.setText("Search Employee");

        jrbShowAllEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbShowAllEmp);
        jrbShowAllEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbShowAllEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbShowAllEmp.setText("Show All Employee");

        btnDoTask.setBackground(new java.awt.Color(0, 0, 0));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        jrbQuit.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbQuit);
        jrbQuit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbQuit.setForeground(new java.awt.Color(255, 255, 255));
        jrbQuit.setText("Quit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbQuit)
                    .addComponent(jrbSearchEmp)
                    .addComponent(jrbAddEmp)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnDoTask, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbShowAllEmp, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(204, 204, 204))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(jrbAddEmp)
                .addGap(36, 36, 36)
                .addComponent(jrbSearchEmp)
                .addGap(37, 37, 37)
                .addComponent(jrbShowAllEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jrbQuit)
                .addGap(29, 29, 29)
                .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        boolean result=validateInputs();
        if(!result){
            JOptionPane.showMessageDialog(null, "Please select an option first");
            return;
        }
        JFrame frame=null;
        if(jrbAddEmp.isSelected()){
            frame=new AddEmployeeFrame();
           
        }
        else if(jrbShowAllEmp.isSelected()){
           frame=new ViewAllEmployeeFrame();
           
        }
        else if(jrbSearchEmp.isSelected()){
          frame=new SearchEmployeeFrame();
           
        }
        else {
           DBConnection.closeConnection(); 
           System.exit(0);
        }
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDoTaskActionPerformed

   
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
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbAddEmp;
    private javax.swing.JRadioButton jrbQuit;
    private javax.swing.JRadioButton jrbSearchEmp;
    private javax.swing.JRadioButton jrbShowAllEmp;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs() {
        if(jrbAddEmp.isSelected()==false && jrbSearchEmp.isSelected()==false && jrbShowAllEmp.isSelected()==false && jrbQuit.isSelected()==false)
            return false;
        return true;
    }
    
}
