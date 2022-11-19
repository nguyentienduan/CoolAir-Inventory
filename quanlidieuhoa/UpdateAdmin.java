/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlidieuhoa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class UpdateAdmin extends javax.swing.JFrame {

    /**
     * Creates new form UpdateAdmin
     */
    public UpdateAdmin() {
        initComponents();
    }

     Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Matkhauadmin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Tenadmin = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Sitka Heading", 3, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("CẬP NHẬT TÀI KHOẢN ADMIN");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 420, 44));

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        jLabel6.setText("MẬT KHẨU");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 150, 30));

        Matkhauadmin.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        getContentPane().add(Matkhauadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 190, 50));

        jLabel8.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        jLabel8.setText("TÊN ĐĂNG NHẬP");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 160, 30));

        Tenadmin.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        getContentPane().add(Tenadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 190, 50));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jButton4.setText("LÀM MỚI");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 140, 50));

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jButton5.setText("CẬP NHẬP");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 140, 50));

        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 490, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\ed.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Tenadmin.setText("");
        Matkhauadmin.setText("");

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        if (Tenadmin.getText().isEmpty() || Matkhauadmin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin");
        }
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
            String Query = "Update Duan.ADMINTBL set TENADMIN='" +Tenadmin.getText()+"'"+ ",MATKHAUADMIN='" + Matkhauadmin.getText() + "'" + "where ID=" +1;
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            //ChonNguoidung();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Matkhauadmin;
    private javax.swing.JTextField Tenadmin;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
