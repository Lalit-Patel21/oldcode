
package in.scalive.Gui.Swingbuilder;

import java.awt.Color;


public class CheckBoxDemoFrame extends javax.swing.JFrame {

    
    private Color oldColor;
    public CheckBoxDemoFrame() {
        
        initComponents();
        setLocationRelativeTo(null);
        oldColor = MyPanel.getBackground();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        MyPanel = new javax.swing.JPanel();
        chkChangeColor = new javax.swing.JCheckBox();
        jrbMale = new javax.swing.JRadioButton();
        jrbFemale = new javax.swing.JRadioButton();
        lblResult = new javax.swing.JLabel();
        chkRedC = new javax.swing.JCheckBox();
        chkGreenC = new javax.swing.JCheckBox();
        chkBlueC = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chkChangeColor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkChangeColor.setText("Chage Color");
        chkChangeColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkChangeColorItemStateChanged(evt);
            }
        });
        chkChangeColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkChangeColorActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbMale);
        jrbMale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbMale.setText("Male");
        jrbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbFemale);
        jrbFemale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbFemale.setText("Female");
        jrbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFemaleActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        chkRedC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkRedC.setText("Red");
        chkRedC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkRedCItemStateChanged(evt);
            }
        });
        chkRedC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRedCActionPerformed(evt);
            }
        });

        chkGreenC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkGreenC.setText("Green");

        chkBlueC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkBlueC.setText("Blue");

        javax.swing.GroupLayout MyPanelLayout = new javax.swing.GroupLayout(MyPanel);
        MyPanel.setLayout(MyPanelLayout);
        MyPanelLayout.setHorizontalGroup(
            MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyPanelLayout.createSequentialGroup()
                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MyPanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkChangeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MyPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jrbMale)
                                .addGap(68, 68, 68)
                                .addComponent(jrbFemale))
                            .addGroup(MyPanelLayout.createSequentialGroup()
                                .addComponent(chkRedC, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(chkGreenC)
                                .addGap(98, 98, 98)
                                .addComponent(chkBlueC))))
                    .addGroup(MyPanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        MyPanelLayout.setVerticalGroup(
            MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(chkChangeColor)
                .addGap(56, 56, 56)
                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMale)
                    .addComponent(jrbFemale))
                .addGap(54, 54, 54)
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkRedC)
                    .addComponent(chkGreenC)
                    .addComponent(chkBlueC))
                .addContainerGap(294, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkChangeColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkChangeColorItemStateChanged
        // TODO add your handling code here:
        if(chkChangeColor.isSelected()){
            MyPanel.setBackground(Color.yellow);
//            System.out.print("checkbox clicked!");
        }
            else{
                 MyPanel.setBackground(oldColor);    
        }
    }//GEN-LAST:event_chkChangeColorItemStateChanged

    private void jrbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFemaleActionPerformed
        // TODO add your handling code here:
        lblResult.setText("You Selected FeMale");
    }//GEN-LAST:event_jrbFemaleActionPerformed

    private void jrbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMaleActionPerformed
        // TODO add your handling code here:
        lblResult.setText("You Selected Male");
    }//GEN-LAST:event_jrbMaleActionPerformed

    private void chkChangeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkChangeColorActionPerformed
        
    }//GEN-LAST:event_chkChangeColorActionPerformed

    private void chkRedCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRedCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRedCActionPerformed

    private void chkRedCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkRedCItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRedCItemStateChanged

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
            java.util.logging.Logger.getLogger(CheckBoxDemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckBoxDemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckBoxDemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckBoxDemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckBoxDemoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MyPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkBlueC;
    private javax.swing.JCheckBox chkChangeColor;
    private javax.swing.JCheckBox chkGreenC;
    private javax.swing.JCheckBox chkRedC;
    private javax.swing.JRadioButton jrbFemale;
    private javax.swing.JRadioButton jrbMale;
    private javax.swing.JLabel lblResult;
    // End of variables declaration//GEN-END:variables
}
