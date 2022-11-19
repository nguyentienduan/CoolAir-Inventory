/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlidieuhoa;

import java.awt.Event;
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
public class DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
        initComponents();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Tendangnhap = new javax.swing.JTextField();
        VaitroCb = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Dangnhap = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        Matkhau = new javax.swing.JPasswordField();
        cb = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\Colorful_Cute_Icons_Icon_Set-removebg-preview-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 90, 260, 236));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        jLabel2.setText("VAI TRÒ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 110, 30));

        Tendangnhap.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        getContentPane().add(Tendangnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 180, 50));

        VaitroCb.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        VaitroCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMIN", "USER" }));
        getContentPane().add(VaitroCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 180, 50));

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        jLabel5.setText("MẬT KHẨU");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 120, 30));

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        jLabel6.setText("TÊN ĐĂNG NHẬP");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 190, 30));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jButton3.setText("LÀM MỚI");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 140, 50));

        Dangnhap.setBackground(new java.awt.Color(153, 153, 153));
        Dangnhap.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Dangnhap.setText("ĐĂNG NHẬP");
        Dangnhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangnhapMouseClicked(evt);
            }
        });
        getContentPane().add(Dangnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 140, 50));

        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 240, 60));

        jLabel4.setFont(new java.awt.Font("Sitka Heading", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("ĐĂNG NHẬP");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, 50));

        Matkhau.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        getContentPane().add(Matkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 180, 50));

        cb.setFont(new java.awt.Font("Sitka Heading", 1, 17)); // NOI18N
        cb.setText("Hiện mật khẩu");
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });
        getContentPane().add(cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 150, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\ed.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DangnhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangnhapMouseClicked
        if (VaitroCb.getSelectedItem().toString().equals("USER")) {
            String Query = "Select * from Duan.NGUOIDUNGTBLS where TAIKHOANUSER='" + Tendangnhap.getText() + "' and MATKHAUUSER='" + Matkhau.getText() + "'";
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
                St = Con.createStatement();
                Rs = St.executeQuery(Query);
                if (Rs.next()) {
                    new Xuathang().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Sai tên đăng nhập hoặc mật khẩu");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
         } else {
            String Query = "Select * from Duan.ADMINTBL where TENADMIN='" + Tendangnhap.getText() + "' and MATKHAUADMIN='" + Matkhau.getText() + "'";
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
                St = Con.createStatement();
                Rs = St.executeQuery(Query);
                if (Rs.next()) {
                    new SanPham().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Sai tên đăng nhập hoặc mật khẩu!!");
                }
            } catch (SQLException ex) {
               ex.printStackTrace();
            } 
        } 
    }//GEN-LAST:event_DangnhapMouseClicked

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        if(cb.isSelected()) {
            Matkhau.setEchoChar((char)0);
        } else {
            Matkhau.setEchoChar('*');
        }
    }//GEN-LAST:event_cbActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dangnhap;
    private javax.swing.JPasswordField Matkhau;
    private javax.swing.JTextField Tendangnhap;
    private javax.swing.JComboBox<String> VaitroCb;
    private javax.swing.JCheckBox cb;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
