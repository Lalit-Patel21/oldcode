
package empmgmt.gui;

import empmgmt.dbutil.DBConnection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class OptionFrame extends javax.swing.JFrame {

   
    public OptionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        MyPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jrbAddEmp = new javax.swing.JRadioButton();
        jrbSearchEmp = new javax.swing.JRadioButton();
        jrbShowAllEmp = new javax.swing.JRadioButton();
        jrbDeleteEmp = new javax.swing.JRadioButton();
        jrbUpdateEmp = new javax.swing.JRadioButton();
        jrbQuit = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MyPanel.setBackground(new java.awt.Color(0, 0, 0));
        MyPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select An Option");

        jrbAddEmp.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jrbAddEmp);
        jrbAddEmp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbAddEmp.setText("Add Employee");

        jrbSearchEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbSearchEmp);
        jrbSearchEmp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbSearchEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbSearchEmp.setText("Search Employee");

        jrbShowAllEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbShowAllEmp);
        jrbShowAllEmp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbShowAllEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbShowAllEmp.setText("Show All Employee");

        jrbDeleteEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbDeleteEmp);
        jrbDeleteEmp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbDeleteEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbDeleteEmp.setText("Delete Employee");

        jrbUpdateEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbUpdateEmp);
        jrbUpdateEmp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbUpdateEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbUpdateEmp.setText("Update Employee");
        jrbUpdateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbUpdateEmpActionPerformed(evt);
            }
        });

        jrbQuit.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbQuit);
        jrbQuit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbQuit.setForeground(new java.awt.Color(255, 255, 255));
        jrbQuit.setText("Quit");
        jrbQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbQuitActionPerformed(evt);
            }
        });

        btnDoTask.setBackground(new java.awt.Color(51, 51, 51));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MyPanelLayout = new javax.swing.GroupLayout(MyPanel);
        MyPanel.setLayout(MyPanelLayout);
        MyPanelLayout.setHorizontalGroup(
            MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyPanelLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbSearchEmp)
                    .addComponent(jrbShowAllEmp)
                    .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jrbUpdateEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbDeleteEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jrbQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        MyPanelLayout.setVerticalGroup(
            MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jrbAddEmp)
                .addGap(38, 38, 38)
                .addComponent(jrbSearchEmp)
                .addGap(28, 28, 28)
                .addComponent(jrbShowAllEmp)
                .addGap(29, 29, 29)
                .addComponent(jrbDeleteEmp)
                .addGap(29, 29, 29)
                .addComponent(jrbUpdateEmp)
                .addGap(28, 28, 28)
                .addComponent(jrbQuit)
                .addGap(40, 40, 40)
                .addComponent(btnDoTask)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbUpdateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbUpdateEmpActionPerformed
     
    }//GEN-LAST:event_jrbUpdateEmpActionPerformed

    private void jrbQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbQuitActionPerformed
//        System.exit(0);
    }//GEN-LAST:event_jrbQuitActionPerformed

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        boolean result = validateInputs();
        if(!result){
            JOptionPane.showMessageDialog(null,"Please select an option first");
            return;
        }
        JFrame frame = null;
        if(jrbAddEmp.isSelected()){
            frame = new AddEmployeeFrame();
        }
        else if(jrbSearchEmp.isSelected()){
            frame = new SearchEmployeeFrame();

        }
         else if(jrbShowAllEmp.isSelected()){
            frame = new ShowAllEmployeeFrame();

        }
         else if(jrbUpdateEmp.isSelected()){
            frame = new UpdateEmployeeFrame();
        }
         else if(jrbDeleteEmp.isSelected()){
            frame = new DeleteEmployeeFrame();

        }
        else{
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
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MyPanel;
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jrbAddEmp;
    private javax.swing.JRadioButton jrbDeleteEmp;
    private javax.swing.JRadioButton jrbQuit;
    private javax.swing.JRadioButton jrbSearchEmp;
    private javax.swing.JRadioButton jrbShowAllEmp;
    private javax.swing.JRadioButton jrbUpdateEmp;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs() {
        if(jrbAddEmp.isSelected()==false && jrbSearchEmp.isSelected()==false && jrbShowAllEmp.isSelected()==false && jrbQuit.isSelected()==false && jrbUpdateEmp.isSelected()==false && jrbDeleteEmp.isSelected()==false){
            return false;
    }
        return true;
    }
}
