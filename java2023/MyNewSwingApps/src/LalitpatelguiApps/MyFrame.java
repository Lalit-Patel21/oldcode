
package LalitpatelguiApps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class MyFrame extends javax.swing.JFrame {

    private Connection conn;
    private PreparedStatement ps;

    public MyFrame() {
        initComponents();
        connectDB();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAddRecords = new javax.swing.JButton();
        btnShowRecords = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtShowAll = new javax.swing.JTextArea();
        txtEmpNo = new javax.swing.JTextField();
        txtEmpName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmpSal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Emp Management App");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Employee No");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Employee Name ");

        btnAddRecords.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddRecords.setText("Add Record");
        btnAddRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRecordsActionPerformed(evt);
            }
        });

        btnShowRecords.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnShowRecords.setText("show Records");
        btnShowRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowRecordsActionPerformed(evt);
            }
        });

        txtShowAll.setColumns(20);
        txtShowAll.setFont(new java.awt.Font("Garamond", 1, 22)); // NOI18N
        txtShowAll.setRows(5);
        jScrollPane1.setViewportView(txtShowAll);

        txtEmpNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtEmpName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Employee Salary");

        txtEmpSal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(268, 268, 268)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(145, 145, 145)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAddRecords)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                            .addGap(104, 104, 104)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmpNo, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addComponent(txtEmpName))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnShowRecords)
                        .addComponent(txtEmpSal, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 210, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpSal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddRecords)
                    .addComponent(btnShowRecords))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRecordsActionPerformed
         
        boolean result = validateIputs();
        if (!result) {
            JOptionPane.showMessageDialog(null, "sorry! please fill all the data");
//            txtEmpNo.requestFocus();
            return;
        }

        try {
            int eno = Integer.parseInt(txtEmpNo.getText().trim());
            String name = txtEmpName.getText().trim();
            double sal = Double.parseDouble(txtEmpSal.getText().trim());
            ps.setInt(1, eno);
            ps.setString(2, name);
            ps.setDouble(3, sal);
            int ans = ps.executeUpdate();
            if (ans == 1) {
                JOptionPane.showMessageDialog(null, "Record inserted! ");
                clearAll();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "sorry! Please Input Numeric values");
            ex.printStackTrace();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "sorry! can not connect to DB");
            ex.printStackTrace();

        }
    }//GEN-LAST:event_btnAddRecordsActionPerformed

    private void btnShowRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowRecordsActionPerformed
       
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from employees ");
            
            StringBuffer result = new StringBuffer();
            
             while (rs.next()) {
               int eno = rs.getInt(1);
               String ename = rs.getString(2);
               double esal = rs.getDouble(3);
               result.append(eno+"\t");
               result.append(ename+"\t");
               result.append(esal+"\n");
//            String result = "";
//            while (rs.next()) {
//                int eno = rs.getInt(1);
//                String ename = rs.getString(2);
//                double esal = rs.getDouble(3);
//                result = result + eno + "\t" + ename + "\t" + esal + "\n";
            }
            txtShowAll.setText(result.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "sorry! can not connect to DB");
            ex.printStackTrace();

        }
    }//GEN-LAST:event_btnShowRecordsActionPerformed

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
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRecords;
    private javax.swing.JButton btnShowRecords;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpNo;
    private javax.swing.JTextField txtEmpSal;
    private javax.swing.JTextArea txtShowAll;
    // End of variables declaration//GEN-END:variables

    private void connectDB() {
        try {
//            Class.forName(oracle.jdbc.OracleDriver);
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "myproject", "mystudents");
           JOptionPane.showMessageDialog(null,"Successfully! connection done");

            ps = conn.prepareStatement("Insert into employees values(?,?,?)");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "sorry! can not connect to DB");
            ex.printStackTrace();
        }
    }

    private boolean validateIputs() {
        if (txtEmpNo.getText().trim().isEmpty() || txtEmpName.getText().trim().isEmpty() || txtEmpSal.getText().trim().isEmpty()) {
            return false;
        }
        return true;
    }

    private void clearAll() {

        txtEmpNo.setText("");
        txtEmpName.setText("");
        txtEmpSal.setText("");
        txtEmpNo.requestFocus();
    }
}
