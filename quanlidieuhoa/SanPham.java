/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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
public class SanPham extends javax.swing.JFrame {

    /**
     * Creates new form SanPham
     */
    public SanPham() {
        initComponents();
        ChonNguoidung();
        Themnhacungcap ();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

    public void ChonNguoidung() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from Duan.SANPHAM");
            SanphamTable.setModel(DbUtils.resultSetToTableModel(Rs));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private void Themnhacungcap () {
         try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
            St = Con.createStatement();
            String query = "Select * from Duan.NHACUNGCAPTBL";
            Rs = St.executeQuery(query);
             while (Rs.next()) {
                String Sanphamcuatoi = Rs.getString("TENNHACUNGCAP");
                Tenhang.addItem(Sanphamcuatoi);
                         
             }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Namsanxuat = new javax.swing.JTextField();
        IDsanpham = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Soluongsanpham = new javax.swing.JTextField();
        Tenhang = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Thembtn = new javax.swing.JButton();
        Lammoibtn = new javax.swing.JButton();
        Xoabtn = new javax.swing.JButton();
        Capnhatbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SanphamTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Solohang = new javax.swing.JTextField();
        Congsuat = new javax.swing.JTextField();
        Nguoidung = new javax.swing.JLabel();
        Dangxuat = new javax.swing.JLabel();
        Nhacungcap = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Nhacungcap1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Nhacungcap2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel3.setText("SỐ LƯỢNG");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 150, 30));

        jLabel4.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel4.setText("TÊN SẢN PHẨM");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 160, 30));

        Namsanxuat.setBackground(new java.awt.Color(255, 232, 232));
        Namsanxuat.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(Namsanxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, 150, 50));

        IDsanpham.setBackground(new java.awt.Color(255, 232, 232));
        IDsanpham.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(IDsanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 150, 50));

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel5.setText("NĂM SẢN XUẤT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 180, 30));

        Soluongsanpham.setBackground(new java.awt.Color(255, 232, 232));
        Soluongsanpham.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(Soluongsanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 150, 50));

        Tenhang.setBackground(new java.awt.Color(255, 232, 232));
        Tenhang.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(Tenhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 150, 50));

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel6.setText("ID LÔ HÀNG");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 140, 30));

        jLabel7.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel7.setText("CÔNG SUẤT");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 120, 30));

        Thembtn.setBackground(new java.awt.Color(153, 153, 153));
        Thembtn.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Thembtn.setText("THÊM");
        Thembtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThembtnMouseClicked(evt);
            }
        });
        getContentPane().add(Thembtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 110, 40));

        Lammoibtn.setBackground(new java.awt.Color(153, 153, 153));
        Lammoibtn.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Lammoibtn.setText("LÀM MỚI");
        Lammoibtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LammoibtnMouseClicked(evt);
            }
        });
        getContentPane().add(Lammoibtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 560, 120, 40));

        Xoabtn.setBackground(new java.awt.Color(153, 153, 153));
        Xoabtn.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Xoabtn.setText("XÓA");
        Xoabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XoabtnMouseClicked(evt);
            }
        });
        getContentPane().add(Xoabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 110, 40));

        Capnhatbtn.setBackground(new java.awt.Color(153, 153, 153));
        Capnhatbtn.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Capnhatbtn.setText("CẬP NHẬT");
        Capnhatbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CapnhatbtnMouseClicked(evt);
            }
        });
        getContentPane().add(Capnhatbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, -1, 40));

        SanphamTable.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        SanphamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "SỐ LÔ HÀNG", "TÊN HÃNG", "CÔNG SUẤT", "SỐ LƯỢNG", "NĂM SẢN XUẤT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SanphamTable.setGridColor(new java.awt.Color(0, 0, 0));
        SanphamTable.setRowHeight(30);
        SanphamTable.setSelectionBackground(new java.awt.Color(204, 204, 255));
        SanphamTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        SanphamTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SanphamTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SanphamTable);
        if (SanphamTable.getColumnModel().getColumnCount() > 0) {
            SanphamTable.getColumnModel().getColumn(1).setResizable(false);
            SanphamTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 800, 200));

        jLabel9.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel9.setText("SỐ THỨ TỰ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 160, 30));

        Solohang.setBackground(new java.awt.Color(255, 232, 232));
        Solohang.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(Solohang, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, 150, 50));

        Congsuat.setBackground(new java.awt.Color(255, 232, 232));
        Congsuat.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(Congsuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 150, 50));

        Nguoidung.setBackground(new java.awt.Color(51, 51, 51));
        Nguoidung.setFont(new java.awt.Font("Sitka Heading", 3, 19)); // NOI18N
        Nguoidung.setForeground(new java.awt.Color(51, 51, 51));
        Nguoidung.setText("NGƯỜI DÙNG");
        Nguoidung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NguoidungMouseClicked(evt);
            }
        });
        getContentPane().add(Nguoidung, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 150, 50));

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

        Nhacungcap.setFont(new java.awt.Font("Sitka Heading", 3, 19)); // NOI18N
        Nhacungcap.setForeground(new java.awt.Color(51, 51, 51));
        Nhacungcap.setText("NHÀ CUNG CẤP");
        Nhacungcap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhacungcapMouseClicked(evt);
            }
        });
        getContentPane().add(Nhacungcap, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, 50));

        jLabel14.setFont(new java.awt.Font("Sitka Heading", 3, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("DANH SÁCH SẢN PHẨM");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, 50));

        Nhacungcap1.setFont(new java.awt.Font("Sitka Heading", 3, 19)); // NOI18N
        Nhacungcap1.setForeground(new java.awt.Color(255, 51, 51));
        Nhacungcap1.setText("SẢN PHẨM");
        getContentPane().add(Nhacungcap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 50));

        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 420, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\Thiết_kế_chưa_có_tên__3_-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 200, 480, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\ed (5).png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 650));

        Nhacungcap2.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        Nhacungcap2.setForeground(new java.awt.Color(51, 51, 51));
        Nhacungcap2.setText("NHÀ CUNG CẤP");
        getContentPane().add(Nhacungcap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ThembtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThembtnMouseClicked
        if (IDsanpham.getText().isEmpty() || Soluongsanpham.getText().isEmpty() || Soluongsanpham.getText().isEmpty() || Namsanxuat.getText().isEmpty() || Solohang.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin");
        } else {

            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
                PreparedStatement add = Con.prepareStatement("insert into SANPHAM values(?,?,?,?,?,?)");
                add.setInt(1, Integer.valueOf(IDsanpham.getText()));
                add.setString(2, Solohang.getText());
                add.setString(3, Tenhang.getSelectedItem().toString());
                add.setDouble(4, Double.valueOf(Congsuat.getText()));
                add.setString(5, Soluongsanpham.getText());
                add.setInt(6, Integer.valueOf(Namsanxuat.getText()));

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
        IDsanpham.setText("");
        Solohang.setText("");
        Congsuat.setText("");
        Namsanxuat.setText("");
        Soluongsanpham.setText("");

    }//GEN-LAST:event_LammoibtnMouseClicked

    private void XoabtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XoabtnMouseClicked
        if (IDsanpham.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chọn sản phẩm để xóa");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
                String PrId = IDsanpham.getText();
                String Query = "Delete from Duan.SANPHAM where ID=" + PrId;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                ChonNguoidung();
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_XoabtnMouseClicked

    private void SanphamTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanphamTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) SanphamTable.getModel();
        int Myindex = SanphamTable.getSelectedRow();
        IDsanpham.setText(model.getValueAt(Myindex, 0).toString());
        Solohang.setText(model.getValueAt(Myindex, 1).toString());
        Tenhang.setSelectedItem(model.getValueAt(Myindex, 2).toString());
        Congsuat.setText(model.getValueAt(Myindex, 3).toString());
        Soluongsanpham.setText(model.getValueAt(Myindex, 4).toString());
        Namsanxuat.setText(model.getValueAt(Myindex, 5).toString());

    }//GEN-LAST:event_SanphamTableMouseClicked

    private void CapnhatbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CapnhatbtnMouseClicked
        if (IDsanpham.getText().isEmpty() || Solohang.getText().isEmpty() || Congsuat.getText().isEmpty()|| Namsanxuat.getText().isEmpty()|| Soluongsanpham.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin");
        }
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
            String Query = "Update Duan.SANPHAM set SOLOHANG='" + Solohang.getText() + "'" + ",TENHANG='" + Tenhang.getSelectedItem().toString()+ "'" + ",CONGSUAT=" + Congsuat.getText()  + ""+ ",SOLUONG=" + Soluongsanpham.getText() + "" + ",NAMSANXUAT=" + Namsanxuat.getText()  + ""+ "where ID=" + IDsanpham.getText();
            //phần nào là Integer hoặc Double nhớ bỏ dấu '
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            ChonNguoidung();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_CapnhatbtnMouseClicked

    private void NhacungcapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhacungcapMouseClicked
         new CungCap().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_NhacungcapMouseClicked

    private void NguoidungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NguoidungMouseClicked
         new NguoiDung().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_NguoidungMouseClicked

    private void DangxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangxuatMouseClicked
         new DangNhap().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_DangxuatMouseClicked

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
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Capnhatbtn;
    private javax.swing.JTextField Congsuat;
    private javax.swing.JLabel Dangxuat;
    private javax.swing.JTextField IDsanpham;
    private javax.swing.JButton Lammoibtn;
    private javax.swing.JTextField Namsanxuat;
    private javax.swing.JLabel Nguoidung;
    private javax.swing.JLabel Nhacungcap;
    private javax.swing.JLabel Nhacungcap1;
    private javax.swing.JLabel Nhacungcap2;
    private javax.swing.JTable SanphamTable;
    private javax.swing.JTextField Solohang;
    private javax.swing.JTextField Soluongsanpham;
    private javax.swing.JComboBox<String> Tenhang;
    private javax.swing.JButton Thembtn;
    private javax.swing.JButton Xoabtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
