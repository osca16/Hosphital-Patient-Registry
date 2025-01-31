/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Interface;
import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author osand
 */
public class addDiagnosisInformation extends javax.swing.JFrame {
public int flag=0;

    /**
     * Creates new form addDiagnosisInformation
     */
    public addDiagnosisInformation() {
        initComponents();
        jLabel2.setVisible(false);
        jLabel7.setVisible(false);
        jComboBox1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setMaximumSize(null);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Patient_ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 51, 131, 29));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 55, 203, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 55, 114, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient_ID", "Patient Name", "Patient Contact Number", "Age", "Gender", "Address", "Major Disease"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 768, 50));

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Patient_ID does not exist.!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 112, 156, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setText("Symptoms");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 300, 76, 30));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel4.setText("Diagnosis");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 372, 89, 36));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel5.setText("Medicines");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 450, 89, 25));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 298, 327, 34));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 369, 327, 42));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 450, 327, 45));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel6.setText("Ward Required?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 301, 140, 29));

        jCheckBox1.setText("Yes");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 305, 85, -1));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel7.setText("Type of ward");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 344, 89, 22));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genaral", "Single", "Duo" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 344, -1, -1));

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 525, 139, 50));

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 525, 112, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String patient_ID=jTextField1.getText();
        try 
        {
            Connection con=ConnectionProvider.getcon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select *from hosphital_patient where patient_ID ='"+patient_ID+"'");
            
            if(!rs.next()){
            System.out.println("if statement");
            jLabel2.setVisible(true);}
            
            else
            {
                String ID = String.valueOf(rs.getInt("patient_ID"));
                String name = rs.getString("name");
                String number= rs.getString("contactNumber");
                String age = rs.getString("age");
                String gender = rs.getString("gender");
                String bloodgroup = rs.getString("bloodgroup");
                String address = rs.getString("address");
                String anyMajorDisease=rs.getString("anyMajorDisease");
                
                String tb[] = {ID, name, number, age, gender, address, anyMajorDisease, bloodgroup};
                DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
                model.addRow(tb);
                jLabel2.setVisible(false);
                jTextField1.setEditable(false);
                flag=1;
                //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Connection Error");
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (flag==1)
        {
            String patient_ID=jTextField1.getText();
            String symptom=jTextField2.getText();
            String diagnosis=jTextField3.getText();
            String medicines=jTextField4.getText();
            String wardReq;
            String typeWard;
            if(jCheckBox1.isSelected())
            {
                wardReq="Yes";
                typeWard=(String)jComboBox1.getSelectedItem();
            }
            else
            {
                wardReq="No";
                typeWard="";
            }
            try
            {
                Connection con=ConnectionProvider.getcon();
                Statement st=con.createStatement();
                st.executeUpdate("insert into patientreport values('"+patient_ID+"','"+symptom+"','"+diagnosis+"','"+medicines+"','"+wardReq+"','"+typeWard+"')");
                JOptionPane.showMessageDialog(null,"Successfully Updated!");
                setVisible(false);
                new addDiagnosisInformation().setVisible(true);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Patient ID Field is empty!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected())
        {
            jLabel7.setVisible(true);
            jComboBox1.setVisible(true);
        }
        else
        {
            jLabel7.setVisible(false);
            jComboBox1.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDiagnosisInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
