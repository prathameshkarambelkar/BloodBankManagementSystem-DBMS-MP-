/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;
import javax.swing.JTable;
import java.sql.*;
import Project.connectionProvider;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author pkara
 */
public class stockDecrease extends javax.swing.JFrame {

    /**
     * Creates new form stockDecrease
     */
    public stockDecrease() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        etUnitsStockDecrease = new javax.swing.JTextField();
        btnUpdateStockDecrease = new javax.swing.JButton();
        btnCloseStockDecrease = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStockDecrease = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 170));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Stock (Decrease) ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 680, 10));

        jLabel2.setText("Blood Group");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 83, 66, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "O+", "O-", "B+", "B-", "AB+", "AB-", " " }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 80, 53, -1));

        jLabel3.setText("Units");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 83, 31, -1));

        etUnitsStockDecrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etUnitsStockDecreaseActionPerformed(evt);
            }
        });
        getContentPane().add(etUnitsStockDecrease, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 80, 92, -1));

        btnUpdateStockDecrease.setText("Update");
        btnUpdateStockDecrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStockDecreaseActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateStockDecrease, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 79, -1, -1));

        btnCloseStockDecrease.setText("Close");
        btnCloseStockDecrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseStockDecreaseActionPerformed(evt);
            }
        });
        getContentPane().add(btnCloseStockDecrease, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 10, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, 680, 10));

        tableStockDecrease.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableStockDecrease);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, 680, 300));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 452, 680, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrames/BBMS ICON/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etUnitsStockDecreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etUnitsStockDecreaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etUnitsStockDecreaseActionPerformed

    private void btnCloseStockDecreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseStockDecreaseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCloseStockDecreaseActionPerformed

    private void btnUpdateStockDecreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStockDecreaseActionPerformed
        // TODO add your handling code here:
        String bloodGroup = (String)jComboBox1.getSelectedItem();
        String unit=etUnitsStockDecrease.getText();
        int unit1=Integer.parseInt(unit);
        try {
            Connection con = connectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("update stock set units=units-'"+unit1+"' where bloodGroup='"+bloodGroup+"'");
            JOptionPane.showMessageDialog(null, "Successfully Updated!");
            setVisible(false);
            new stockDecrease().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btnUpdateStockDecreaseActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try {
            Connection con = connectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from stock");
            tableStockDecrease.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(stockDecrease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stockDecrease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stockDecrease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stockDecrease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stockDecrease().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseStockDecrease;
    private javax.swing.JButton btnUpdateStockDecrease;
    private javax.swing.JTextField etUnitsStockDecrease;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tableStockDecrease;
    // End of variables declaration//GEN-END:variables
}
