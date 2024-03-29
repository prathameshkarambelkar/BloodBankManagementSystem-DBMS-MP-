/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;
import java.sql.*;
import Project.connectionProvider;
import javax.swing.JOptionPane;

/**
 *
 * @author pkara
 */
public class updateDetailsDonor extends javax.swing.JFrame {

    /**
     * Creates new form updateDetailsDonor
     */
    public updateDetailsDonor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        etDonorIdUpdateDonorDetails = new javax.swing.JTextField();
        btnSearchUpdateDetails = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        etFullNameUpdateDonorDetails = new javax.swing.JTextField();
        etFatherNameUpdateDonorDetails = new javax.swing.JTextField();
        etMotherDetailsUpdateDonorDetails = new javax.swing.JTextField();
        etDateOfBirthUpdatDonorDetails = new javax.swing.JTextField();
        etMobileNoUpdateDonorDetails = new javax.swing.JTextField();
        etGenderUpdateDonorDetails = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        etEmailUpdateDonorDetails = new javax.swing.JTextField();
        etBloodGroupUpdateDonorDetails = new javax.swing.JTextField();
        etCityUpdateDonorDetails = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        etFullAddressUpdateDonorDetails = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        btnUpdateDonorDetails = new javax.swing.JButton();
        btnResetUpdateDonorDetails = new javax.swing.JButton();
        btnCloseUpdateDetails = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(340, 130));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("UPDATE DONOR DETAILS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 680, 10));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Donor ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 79, -1, -1));
        getContentPane().add(etDonorIdUpdateDonorDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 79, 100, -1));

        btnSearchUpdateDetails.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSearchUpdateDetails.setText("Search");
        btnSearchUpdateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchUpdateDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchUpdateDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 75, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 10));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Full Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Father Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 167, 90, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Mother Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 204, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Date of Birth:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 241, 90, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Mobile No:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 278, 90, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Gender:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 315, 90, -1));
        getContentPane().add(etFullNameUpdateDonorDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 130, 200, -1));
        getContentPane().add(etFatherNameUpdateDonorDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 167, 200, -1));
        getContentPane().add(etMotherDetailsUpdateDonorDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 204, 200, -1));
        getContentPane().add(etDateOfBirthUpdatDonorDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 241, 200, -1));
        getContentPane().add(etMobileNoUpdateDonorDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 278, 200, -1));
        getContentPane().add(etGenderUpdateDonorDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 315, 200, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Email:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 130, 118, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Blood Group:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 167, 118, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("City:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 204, 118, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Complete Address:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 241, -1, -1));
        getContentPane().add(etEmailUpdateDonorDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 130, 166, -1));
        getContentPane().add(etBloodGroupUpdateDonorDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 167, 166, -1));
        getContentPane().add(etCityUpdateDonorDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 204, 166, -1));

        etFullAddressUpdateDonorDetails.setColumns(20);
        etFullAddressUpdateDonorDetails.setRows(5);
        jScrollPane1.setViewportView(etFullAddressUpdateDonorDetails);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 241, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 352, 680, 10));

        btnUpdateDonorDetails.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdateDonorDetails.setText("Update");
        btnUpdateDonorDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDonorDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateDonorDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 380, -1, -1));

        btnResetUpdateDonorDetails.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnResetUpdateDonorDetails.setText("Reset");
        btnResetUpdateDonorDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetUpdateDonorDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnResetUpdateDonorDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 380, -1, -1));

        btnCloseUpdateDetails.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCloseUpdateDetails.setText("Close");
        btnCloseUpdateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseUpdateDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnCloseUpdateDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 380, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrames/BBMS ICON/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseUpdateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseUpdateDetailsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCloseUpdateDetailsActionPerformed

    private void btnResetUpdateDonorDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetUpdateDonorDetailsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new updateDetailsDonor().setVisible(true);
    }//GEN-LAST:event_btnResetUpdateDonorDetailsActionPerformed

    private void btnSearchUpdateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchUpdateDetailsActionPerformed
        // TODO add your handling code here:
        String donorId = etDonorIdUpdateDonorDetails.getText();
        try {
                Connection con = connectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select *from donor where donorId='"+donorId+"'");
                if(rs.next())
                {
                    etFullNameUpdateDonorDetails.setText(rs.getString(2));
                    etFatherNameUpdateDonorDetails.setText(rs.getString(3));
                    etMotherDetailsUpdateDonorDetails.setText(rs.getString(4));
                    etDateOfBirthUpdatDonorDetails.setText(rs.getString(5));
                    etMobileNoUpdateDonorDetails.setText(rs.getString(6));
                    etGenderUpdateDonorDetails.setText(rs.getString(7));
                    etEmailUpdateDonorDetails.setText(rs.getString(8));
                    etBloodGroupUpdateDonorDetails.setText(rs.getString(9));
                    etCityUpdateDonorDetails.setText(rs.getString(10));
                    etFullAddressUpdateDonorDetails.setText(rs.getString(11));
                    etDonorIdUpdateDonorDetails.setEditable(false);
                }
                else
                    JOptionPane.showMessageDialog(null, "DonorID does not exist!!");
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnSearchUpdateDetailsActionPerformed

    private void btnUpdateDonorDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDonorDetailsActionPerformed
        // TODO add your handling code here:
        String donorId = etDonorIdUpdateDonorDetails.getText();
        String name=etFullNameUpdateDonorDetails.getText();
        String fatherName = etFatherNameUpdateDonorDetails.getText();
        String motherName = etMotherDetailsUpdateDonorDetails.getText();
        String DOB = etDateOfBirthUpdatDonorDetails.getText();
        String mobileNo = etMobileNoUpdateDonorDetails.getText();
        String gender = etGenderUpdateDonorDetails.getText();
        String email = etEmailUpdateDonorDetails.getText();
        String bloodGroup = etBloodGroupUpdateDonorDetails.getText();
        String city = etCityUpdateDonorDetails.getText();
        String address = etFullAddressUpdateDonorDetails.getText();
        
        
        try
        {
            Connection con = connectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("update donor set name='"+name+"',fatherName='"+fatherName+"',motherName='"+motherName+"',DOB='"+DOB+"',MobileNo='"+mobileNo+"',gender='"+gender+"',email='"+email+"',bloodGroup='"+bloodGroup+"',city='"+city+"',address='"+address+"'where donorId='"+donorId+"'");
            JOptionPane.showMessageDialog(null,"Successfully Updated Details");
            setVisible(false);
            new updateDetailsDonor().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Connection Error");
        }

    }//GEN-LAST:event_btnUpdateDonorDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(updateDetailsDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateDetailsDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateDetailsDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateDetailsDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateDetailsDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseUpdateDetails;
    private javax.swing.JButton btnResetUpdateDonorDetails;
    private javax.swing.JButton btnSearchUpdateDetails;
    private javax.swing.JButton btnUpdateDonorDetails;
    private javax.swing.JTextField etBloodGroupUpdateDonorDetails;
    private javax.swing.JTextField etCityUpdateDonorDetails;
    private javax.swing.JTextField etDateOfBirthUpdatDonorDetails;
    private javax.swing.JTextField etDonorIdUpdateDonorDetails;
    private javax.swing.JTextField etEmailUpdateDonorDetails;
    private javax.swing.JTextField etFatherNameUpdateDonorDetails;
    private javax.swing.JTextArea etFullAddressUpdateDonorDetails;
    private javax.swing.JTextField etFullNameUpdateDonorDetails;
    private javax.swing.JTextField etGenderUpdateDonorDetails;
    private javax.swing.JTextField etMobileNoUpdateDonorDetails;
    private javax.swing.JTextField etMotherDetailsUpdateDonorDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
