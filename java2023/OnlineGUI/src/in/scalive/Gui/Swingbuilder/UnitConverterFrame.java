
package in.scalive.Gui.Swingbuilder;

import javax.swing.JOptionPane;


public class UnitConverterFrame extends javax.swing.JFrame {

    public UnitConverterFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtKm = new javax.swing.JTextField();
        txtResult = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jrMeter = new javax.swing.JRadioButton();
        jrMiliMeter = new javax.swing.JRadioButton();
        jrCentiMeter = new javax.swing.JRadioButton();
        btnConvert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Unit Converter App");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter KiloMeter");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("After Converting");

        txtKm.setBackground(new java.awt.Color(0, 0, 0));
        txtKm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtKm.setForeground(new java.awt.Color(255, 255, 255));

        txtResult.setEditable(false);
        txtResult.setBackground(new java.awt.Color(0, 0, 0));
        txtResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtResult.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "Select A Unit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jrMeter.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrMeter);
        jrMeter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrMeter.setForeground(new java.awt.Color(255, 255, 255));
        jrMeter.setText("Meter");
        jrMeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMeterActionPerformed(evt);
            }
        });

        jrMiliMeter.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrMiliMeter);
        jrMiliMeter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrMiliMeter.setForeground(new java.awt.Color(255, 255, 255));
        jrMiliMeter.setText("MiliMeter");
        jrMiliMeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMiliMeterActionPerformed(evt);
            }
        });

        jrCentiMeter.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrCentiMeter);
        jrCentiMeter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrCentiMeter.setForeground(new java.awt.Color(255, 255, 255));
        jrCentiMeter.setText("CentiMeter");
        jrCentiMeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCentiMeterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jrMeter, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jrCentiMeter, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrMiliMeter, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrCentiMeter)
                    .addComponent(jrMeter)
                    .addComponent(jrMiliMeter))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        btnConvert.setBackground(new java.awt.Color(0, 0, 0));
        btnConvert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConvert.setForeground(new java.awt.Color(255, 255, 255));
        btnConvert.setText("Convert");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(69, 69, 69)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtResult)
                                .addComponent(txtKm)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnConvert)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnConvert)
                .addContainerGap(71, Short.MAX_VALUE))
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

    private void jrCentiMeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCentiMeterActionPerformed
       try{
           String KmStr = txtKm.getText();
           int Km = Integer.parseInt(KmStr);
           long Cm = Km*100000l;
           txtResult.setText(String.valueOf(Cm)+" CentiMeters");
       }catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null,"Please Input digits only!","Error!",JOptionPane.ERROR_MESSAGE);
           
       }
       
    }//GEN-LAST:event_jrCentiMeterActionPerformed

    private void jrMeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMeterActionPerformed
        try{
           String KmStr = txtKm.getText();
           int Km = Integer.parseInt(KmStr);
           int Meter = Km*1000;
           txtResult.setText(String.valueOf(Meter)+" Meters");
       }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Please Input digits only!","Error!",JOptionPane.ERROR_MESSAGE);
           
       }
    }//GEN-LAST:event_jrMeterActionPerformed

    private void jrMiliMeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMiliMeterActionPerformed
        try{
           String KmStr = txtKm.getText();
           int Km = Integer.parseInt(KmStr);
           long Mm = Km*1000000l;
           txtResult.setText(String.valueOf(Mm)+" MiliMeters");
       }catch(NumberFormatException ex){  
           JOptionPane.showMessageDialog(null,"Please Input digits only!","Error!",JOptionPane.ERROR_MESSAGE);
           
       }
    }//GEN-LAST:event_jrMiliMeterActionPerformed

   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(UnitConverterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnitConverterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnitConverterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnitConverterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnitConverterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jrCentiMeter;
    private javax.swing.JRadioButton jrMeter;
    private javax.swing.JRadioButton jrMiliMeter;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
