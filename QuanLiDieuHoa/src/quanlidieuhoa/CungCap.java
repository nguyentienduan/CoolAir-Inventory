/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlidieuhoa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author nguye
 */
public class CungCap extends javax.swing.JFrame {

    /**
     * Creates new form CungCap
     */
    public CungCap() {
        initComponents();
        ChonNguoidung();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NhacungcapTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Mota = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        IDnhacungcap = new javax.swing.JTextField();
        Tennhacungcap = new javax.swing.JTextField();
        Thembtn = new javax.swing.JButton();
        Suabtn = new javax.swing.JButton();
        Xoabtn = new javax.swing.JButton();
        Lammoibtn = new javax.swing.JButton();
        Sanpham = new javax.swing.JLabel();
        Dangxuat = new javax.swing.JLabel();
        Nhacungcap = new javax.swing.JLabel();
        Nguoidung = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("NHÀ CUNG CẤP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, 50));

        NhacungcapTable.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        NhacungcapTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "TÊN NHÀ CUNG CẤP", "MÔ TẢ"
            }
        ));
        NhacungcapTable.setGridColor(new java.awt.Color(0, 0, 0));
        NhacungcapTable.setRowHeight(30);
        NhacungcapTable.setSelectionBackground(new java.awt.Color(204, 204, 255));
        NhacungcapTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        NhacungcapTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhacungcapTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(NhacungcapTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 800, 200));

        jLabel9.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel9.setText("MÔ TẢ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, 70, 30));

        Mota.setBackground(new java.awt.Color(255, 232, 232));
        Mota.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(Mota, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 150, 50));

        jLabel10.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel10.setText("ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 70, 30));

        jLabel11.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel11.setText("TÊN NHÀ CUNG CẤP");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 210, 30));

        IDnhacungcap.setBackground(new java.awt.Color(255, 232, 232));
        IDnhacungcap.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(IDnhacungcap, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 150, 50));

        Tennhacungcap.setBackground(new java.awt.Color(255, 232, 232));
        Tennhacungcap.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(Tennhacungcap, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, 150, 50));

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

        Sanpham.setFont(new java.awt.Font("Sitka Heading", 3, 20)); // NOI18N
        Sanpham.setForeground(new java.awt.Color(51, 51, 51));
        Sanpham.setText("SẢN PHẨM");
        Sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SanphamMouseClicked(evt);
            }
        });
        getContentPane().add(Sanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 50));

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

        Nhacungcap.setFont(new java.awt.Font("Sitka Heading", 3, 20)); // NOI18N
        Nhacungcap.setForeground(new java.awt.Color(51, 51, 51));
        Nhacungcap.setText("NHÀ CUNG CẤP");
        getContentPane().add(Nhacungcap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 50));

        Nguoidung.setBackground(new java.awt.Color(51, 51, 51));
        Nguoidung.setFont(new java.awt.Font("Sitka Heading", 3, 20)); // NOI18N
        Nguoidung.setForeground(new java.awt.Color(51, 51, 51));
        Nguoidung.setText("NGƯỜI DÙNG");
        Nguoidung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NguoidungMouseClicked(evt);
            }
        });
        getContentPane().add(Nguoidung, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 150, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\OneDrive\\Pictures\\Java\\Cute Minimalist Grocery List.png")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 190, 250, 260));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\Thiết_kế_chưa_có_tên__1_-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -10, 310, 220));

        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 290, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\ed (6).png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     public void ChonNguoidung() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from Duan.NHACUNGCAPTBL");
            NhacungcapTable.setModel(DbUtils.resultSetToTableModel(Rs));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private void ThembtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThembtnMouseClicked
        if (IDnhacungcap.getText().isEmpty() || Tennhacungcap.getText().isEmpty() || Mota.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin");
        } else {

            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
                PreparedStatement add = Con.prepareStatement("insert into NHACUNGCAPTBL values(?,?,?)");
                add.setInt(1, Integer.valueOf(IDnhacungcap.getText()));
                add.setString(2, Tennhacungcap.getText());
                add.setString(3, Mota.getText());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                Con.close();
                ChonNguoidung();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ThembtnMouseClicked

    private void LammoibtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LammoibtnMouseClicked
        IDnhacungcap.setText("");
        Tennhacungcap.setText("");
        Mota.setText("");
    }//GEN-LAST:event_LammoibtnMouseClicked

    private void XoabtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XoabtnMouseClicked
        if (IDnhacungcap.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chọn nhà cung cấp để xóa");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
                String CId = IDnhacungcap.getText();
                String Query = "Delete from Duan.NHACUNGCAPTBL where IDNHACUNGCAP=" + CId;
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
        if (IDnhacungcap.getText().isEmpty() || Tennhacungcap.getText().isEmpty() || Mota.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin");
        }
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
            String Query = "Update Duan.NHACUNGCAPTBL set TENNHACUNGCAP='" +Tennhacungcap.getText()+"'"+ ",MOTA='" + Mota.getText() + "'" + "where IDNHACUNGCAP=" + IDnhacungcap.getText();
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            ChonNguoidung();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SuabtnMouseClicked

    private void NhacungcapTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhacungcapTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) NhacungcapTable.getModel();
        int Myindex = NhacungcapTable.getSelectedRow();
        IDnhacungcap.setText(model.getValueAt(Myindex, 0).toString());
        Tennhacungcap.setText(model.getValueAt(Myindex, 1).toString());
        Mota.setText(model.getValueAt(Myindex, 2).toString());
    }//GEN-LAST:event_NhacungcapTableMouseClicked

    private void SanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanphamMouseClicked
        new SanPham().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SanphamMouseClicked

    private void DangxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangxuatMouseClicked
        new DangNhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DangxuatMouseClicked

    private void NguoidungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NguoidungMouseClicked
        new NguoiDung().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NguoidungMouseClicked

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
            java.util.logging.Logger.getLogger(CungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CungCap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dangxuat;
    private javax.swing.JTextField IDnhacungcap;
    private javax.swing.JButton Lammoibtn;
    private javax.swing.JTextField Mota;
    private javax.swing.JLabel Nguoidung;
    private javax.swing.JLabel Nhacungcap;
    private javax.swing.JTable NhacungcapTable;
    private javax.swing.JLabel Sanpham;
    private javax.swing.JButton Suabtn;
    private javax.swing.JTextField Tennhacungcap;
    private javax.swing.JButton Thembtn;
    private javax.swing.JButton Xoabtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
