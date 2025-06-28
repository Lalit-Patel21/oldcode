
package empmgmt.gui;

import empmgmt.dao.EmpDAO;
import empmgmt.pojo.EmpPojo;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;


public class ShowAllEmployeeFrame extends javax.swing.JFrame {

    
    public ShowAllEmployeeFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnShowAllRecords = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtShowAllRecords = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View All Employee Details");

        btnShowAllRecords.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnShowAllRecords.setText("Show All Records");
        btnShowAllRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllRecordsActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtShowAllRecords.setEditable(false);
        txtShowAllRecords.setBackground(new java.awt.Color(0, 0, 0));
        txtShowAllRecords.setColumns(20);
        txtShowAllRecords.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        txtShowAllRecords.setForeground(new java.awt.Color(255, 255, 255));
        txtShowAllRecords.setRows(5);
        jScrollPane1.setViewportView(txtShowAllRecords);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnShowAllRecords)
                        .addGap(155, 155, 155)
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnShowAllRecords))
                .addGap(111, 111, 111))
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

    private void btnShowAllRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllRecordsActionPerformed
      try{
          List<EmpPojo> empList = EmpDAO.getAllEmployees();
          if(empList.isEmpty())
          {
              JOptionPane.showMessageDialog(null, "sorry! No Record Present in the DB");
               return; 
          }
          StringBuffer sb = new StringBuffer();
          sb.append("EmpNo\t\tEmpName\t\tEmpSal\n");
          for(EmpPojo emp : empList)
          {
              sb.append(emp.getEmpNo()+"\t\t"+emp.getEmpName()+"\t\t"+emp.getEmpSal()+"\n");
          }
          txtShowAllRecords.setText(sb.toString());
      }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "sorry! DB ERROR In SearchEmpFrame");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnShowAllRecordsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        OptionFrame optionframe = new  OptionFrame();
        optionframe.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnBackActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowAllEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnShowAllRecords;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtShowAllRecords;
    // End of variables declaration//GEN-END:variables
}
