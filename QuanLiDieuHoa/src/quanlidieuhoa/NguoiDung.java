/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlidieuhoa;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author nguye
 */
public class NguoiDung extends javax.swing.JFrame {

    /**
     * Creates new form NguoiDung
     */
    public NguoiDung() {
        initComponents();
        ChonNguoidung();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        NguoidungTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        Matkhauuser = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Tenuser = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        IDuser = new javax.swing.JTextField();
        Gioitinhuser = new javax.swing.JComboBox<String>();
        Lammoibtn = new javax.swing.JButton();
        Thembtn = new javax.swing.JButton();
        Suabtn = new javax.swing.JButton();
        Xoabtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Sanpham = new javax.swing.JLabel();
        Nhacungcap = new javax.swing.JLabel();
        Nguoidung = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Dangxuat = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NguoidungTable.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        NguoidungTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "TÊN ĐĂNG NHẬP", "MẬT KHẨU", "GIỚI TÍNH"
            }
        ));
        NguoidungTable.setGridColor(new java.awt.Color(0, 0, 0));
        NguoidungTable.setRowHeight(30);
        NguoidungTable.setSelectionBackground(new java.awt.Color(204, 204, 255));
        NguoidungTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        NguoidungTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NguoidungTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(NguoidungTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 800, 190));

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel6.setText("MẬT KHẨU");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 150, 30));

        Matkhauuser.setBackground(new java.awt.Color(255, 232, 232));
        Matkhauuser.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(Matkhauuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 150, 50));

        jLabel7.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel7.setText("GIỚI TÍNH");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 110, 30));

        jLabel8.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel8.setText("TÊN ĐĂNG NHẬP");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 190, 30));

        Tenuser.setBackground(new java.awt.Color(255, 232, 232));
        Tenuser.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(Tenuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, 150, 50));

        jLabel9.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel9.setText("ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 70, 30));

        IDuser.setBackground(new java.awt.Color(255, 232, 232));
        IDuser.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(IDuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 150, 50));

        Gioitinhuser.setBackground(new java.awt.Color(255, 232, 232));
        Gioitinhuser.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        Gioitinhuser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NAM", "NỮ" }));
        getContentPane().add(Gioitinhuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 150, 50));

        Lammoibtn.setBackground(new java.awt.Color(153, 153, 153));
        Lammoibtn.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Lammoibtn.setText("LÀM MỚI");
        Lammoibtn.setToolTipText("");
        Lammoibtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LammoibtnMouseClicked(evt);
            }
        });
        getContentPane().add(Lammoibtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 560, 120, 40));

        Thembtn.setBackground(new java.awt.Color(153, 153, 153));
        Thembtn.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Thembtn.setText("THÊM");
        Thembtn.setToolTipText("");
        Thembtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThembtnMouseClicked(evt);
            }
        });
        getContentPane().add(Thembtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 110, 40));

        Suabtn.setBackground(new java.awt.Color(153, 153, 153));
        Suabtn.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Suabtn.setText("CẬP NHẬT");
        Suabtn.setToolTipText("");
        Suabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SuabtnMouseClicked(evt);
            }
        });
        getContentPane().add(Suabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 120, 40));

        Xoabtn.setBackground(new java.awt.Color(153, 153, 153));
        Xoabtn.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Xoabtn.setText("XÓA");
        Xoabtn.setToolTipText("");
        Xoabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XoabtnMouseClicked(evt);
            }
        });
        getContentPane().add(Xoabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 110, 40));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("NGƯỜI  DÙNG");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, 50));

        Sanpham.setFont(new java.awt.Font("Sitka Heading", 3, 20)); // NOI18N
        Sanpham.setForeground(new java.awt.Color(51, 51, 51));
        Sanpham.setText("SẢN PHẨM");
        Sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SanphamMouseClicked(evt);
            }
        });
        getContentPane().add(Sanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 50));

        Nhacungcap.setFont(new java.awt.Font("Sitka Heading", 3, 20)); // NOI18N
        Nhacungcap.setForeground(new java.awt.Color(51, 51, 51));
        Nhacungcap.setText("NHÀ CUNG CẤP");
        Nhacungcap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhacungcapMouseClicked(evt);
            }
        });
        getContentPane().add(Nhacungcap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 50));

        Nguoidung.setBackground(new java.awt.Color(51, 51, 51));
        Nguoidung.setFont(new java.awt.Font("Sitka Heading", 3, 20)); // NOI18N
        Nguoidung.setForeground(new java.awt.Color(51, 51, 51));
        Nguoidung.setText("NGƯỜI DÙNG");
        getContentPane().add(Nguoidung, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 150, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\OneDrive\\Pictures\\Java\\Cute Minimalist Grocery List.png")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 190, 250, 260));

        Dangxuat.setBackground(new java.awt.Color(51, 51, 51));
        Dangxuat.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        Dangxuat.setForeground(new java.awt.Color(51, 51, 51));
        Dangxuat.setText("Đăng xuất");
        Dangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangxuatMouseClicked(evt);
            }
        });
        getContentPane().add(Dangxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\Thiết_kế_chưa_có_tên__1_-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -10, 310, 220));

        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 260, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\ed (3).png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

    public void ChonNguoidung() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from Duan.NGUOIDUNGTBLS");
            NguoidungTable.setModel(DbUtils.resultSetToTableModel(Rs));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void ThembtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThembtnMouseClicked
        if (IDuser.getText().isEmpty() || Tenuser.getText().isEmpty() || Matkhauuser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin");
        } else {

            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
                PreparedStatement add = Con.prepareStatement("insert into NGUOIDUNGTBLS values(?,?,?,?)");
                add.setInt(1, Integer.valueOf(IDuser.getText()));
                add.setString(2, Tenuser.getText());
                add.setString(3, Matkhauuser.getText());
                add.setString(4, Gioitinhuser.getSelectedItem().toString());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                Con.close();
                ChonNguoidung();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ThembtnMouseClicked

    private void NguoidungTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NguoidungTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) NguoidungTable.getModel();
        int Myindex = NguoidungTable.getSelectedRow();
        IDuser.setText(model.getValueAt(Myindex, 0).toString());
        Tenuser.setText(model.getValueAt(Myindex, 1).toString());
        Matkhauuser.setText(model.getValueAt(Myindex, 2).toString());
        Gioitinhuser.setSelectedItem(model.getValueAt(Myindex, 3).toString());


    }//GEN-LAST:event_NguoidungTableMouseClicked

    private void LammoibtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LammoibtnMouseClicked
        IDuser.setText("");
        Tenuser.setText("");
        Matkhauuser.setText("");

    }//GEN-LAST:event_LammoibtnMouseClicked

    private void XoabtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XoabtnMouseClicked
        if (IDuser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chọn người dùng để xóa");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
                String SId = IDuser.getText();
                String Query = "Delete from Duan.NGUOIDUNGTBLS where IDUSER=" + SId;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                ChonNguoidung();
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

     }//GEN-LAST:event_XoabtnMouseClicked

    private void SuabtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuabtnMouseClicked
        if (IDuser.getText().isEmpty() || Tenuser.getText().isEmpty() || Matkhauuser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin");
        }
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
            String Query = "Update Duan.NGUOIDUNGTBLS set TAIKHOANUSER='" + Tenuser.getText() + "'" + ",GIOITINHUSER='" + Gioitinhuser.getSelectedItem().toString()+ "'" + ",MATKHAUUSER='" + Matkhauuser.getText()  + "'" + "where IDUSER=" + IDuser.getText();
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            ChonNguoidung();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SuabtnMouseClicked

    private void SanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanphamMouseClicked
        new SanPham().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SanphamMouseClicked

    private void DangxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangxuatMouseClicked
        new DangNhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DangxuatMouseClicked

    private void NhacungcapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhacungcapMouseClicked
         new CungCap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NhacungcapMouseClicked

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
                new NguoiDung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dangxuat;
    private javax.swing.JComboBox<String> Gioitinhuser;
    private javax.swing.JTextField IDuser;
    private javax.swing.JButton Lammoibtn;
    private javax.swing.JTextField Matkhauuser;
    private javax.swing.JLabel Nguoidung;
    private javax.swing.JTable NguoidungTable;
    private javax.swing.JLabel Nhacungcap;
    private javax.swing.JLabel Sanpham;
    private javax.swing.JButton Suabtn;
    private javax.swing.JTextField Tenuser;
    private javax.swing.JButton Thembtn;
    private javax.swing.JButton Xoabtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
