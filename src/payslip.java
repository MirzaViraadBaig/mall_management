
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Viraad
 */
public class payslip extends javax.swing.JFrame {
String name2;
double salary3;
String id2;
double bonus2;
double loan2;
double totalSalary;
String salary2;
String bonus5;
String loan5;
String salaryString;
database db = new database();
int id3;
    /**
     * Creates new form payslip
     */
   
    public payslip() {
        initComponents();
        combo2.addItem("Choose");
        this.getContentPane().setBackground(new Color(204,204,255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combo2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameField = new javax.swing.JLabel();
        cnicField = new javax.swing.JLabel();
        idField = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bonus = new javax.swing.JTextField();
        loan = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        salaryField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        combo2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo2ItemStateChanged(evt);
            }
        });

        jLabel1.setText("Employees:");

        jLabel2.setText("Generate Payslip");

        jLabel3.setText("Name:");

        jLabel4.setText("CNIC#: ");

        jLabel5.setText("ID:");

        nameField.setText("jLabel6");

        cnicField.setText("jLabel7");

        idField.setText("jLabel8");

        jLabel9.setText("Bonus:");

        jLabel10.setText("Loan/Dues:");

        jToggleButton1.setBackground(new java.awt.Color(160, 90, 199));
        jToggleButton1.setText("Generate");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Salary:");

        salaryField.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(combo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idField)
                                    .addComponent(cnicField)
                                    .addComponent(nameField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jToggleButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salaryField)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bonus, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                        .addComponent(loan)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nameField))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cnicField))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(idField))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salaryField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(loan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo2ItemStateChanged
       
            try {                                        
                
                // TODO add your handling code here:
                
                // TODO add your handling code here:
                String name = combo2.getSelectedItem().toString();
                String[] split = name.split(",");
                String n = split[0];
                db.st = db.con.createStatement();
                try {
                    db.rs = db.st.executeQuery("select * from employee where name ='"+n+"'");
                } catch (SQLException ex) {
                    Logger.getLogger(payslip.class.getName()).log(Level.SEVERE, null, ex);
                }
                    //"select * from Student where USN='"+skw.getText()+"'
                    while(db.rs.next()){
                        nameField.setText(db.rs.getString("name"));
                        cnicField.setText(db.rs.getString("cnic"));
                        salaryField.setText(db.rs.getString("salary"));
                        salary2 = db.rs.getString("salary");
                        salary3 = Double.parseDouble(salary2);
                        idField.setText(db.rs.getString("id"));
                       id2 = db.rs.getString("id");
                       id3 = Integer.parseInt(id2);
                       name2 = db.rs.getString("name");
                       
                       
                    } 
            } catch (SQLException ex) {
                Logger.getLogger(payslip.class.getName()).log(Level.SEVERE, null, ex);
            }         
    }//GEN-LAST:event_combo2ItemStateChanged

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    try {
        // TODO add your handling code here:
        bonus5 = bonus.getText();
        loan5 = loan.getText();
        loan2 = Double.parseDouble(loan.getText());
        bonus2 = Double.parseDouble(bonus.getText());
        totalSalary = (bonus2 + salary3) - loan2;
        salaryString = Double.toString(totalSalary);
        new generateSlip().setVisible(true);
        this.setVisible(false);
        
        generateSlip.salary.setText(salary2);
        generateSlip.bonus.setText(bonus5);
        generateSlip.loan.setText(loan5);
        generateSlip.name.setText(name2);
        generateSlip.total.setText(salaryString);
        generateSlip.ud.setText(id2);
        String query = "insert into payslip(name,id,salary,loan,bonus,totalsalary) values (?,?,?,?,?,?)";
        db.ps = (PreparedStatement) db.con.prepareStatement(query);
        db.ps.setString(1,name2);
        db.ps.setInt(2,id3);
        db.ps.setDouble(3,salary3);
        db.ps.setDouble(4,loan2);
        db.ps.setDouble(5,bonus2);
        db.ps.setDouble(6,totalSalary);
        //db.ps.setInt(7,salary3);
        db.ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(payslip.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(payslip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payslip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payslip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payslip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payslip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bonus;
    private javax.swing.JLabel cnicField;
    public javax.swing.JComboBox<String> combo2;
    private javax.swing.JLabel idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField loan;
    private javax.swing.JLabel nameField;
    private javax.swing.JLabel salaryField;
    // End of variables declaration//GEN-END:variables
}
