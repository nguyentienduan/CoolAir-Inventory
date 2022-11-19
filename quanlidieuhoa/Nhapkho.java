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
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Nhapkho extends javax.swing.JFrame {

    
    public Nhapkho() {
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
        Sanpham1 = new javax.swing.JLabel();
        Sanpham = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Soluongsanpham = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        SanphamTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        IDsanpham = new javax.swing.JTextField();
        Solohang = new javax.swing.JTextField();
        Congsuat = new javax.swing.JTextField();
        Namsanxuat = new javax.swing.JTextField();
        Tenhang = new javax.swing.JComboBox<String>();
        Thembtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Ngaynhap = new com.toedter.calendar.JDateChooser();
        Lammoibtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Xuathangtxt = new javax.swing.JTextArea();
        Thembtn1 = new javax.swing.JButton();
        Dangxuat = new javax.swing.JLabel();
        In = new javax.swing.JButton();
        Tieptucnhap = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("NHẬP KHO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, 50));

        Sanpham1.setFont(new java.awt.Font("Sitka Heading", 3, 20)); // NOI18N
        Sanpham1.setForeground(new java.awt.Color(51, 51, 51));
        Sanpham1.setText("XUẤT KHO");
        Sanpham1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sanpham1MouseClicked(evt);
            }
        });
        getContentPane().add(Sanpham1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 50));

        Sanpham.setFont(new java.awt.Font("Sitka Heading", 3, 20)); // NOI18N
        Sanpham.setForeground(new java.awt.Color(255, 51, 51));
        Sanpham.setText("NHẬP KHO");
        getContentPane().add(Sanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\Cute_Minimalist_Grocery_List__1_-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 30, 240, 370));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("DANH SÁCH SẢN PHẨM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, 50));

        Soluongsanpham.setBackground(new java.awt.Color(255, 232, 232));
        Soluongsanpham.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        getContentPane().add(Soluongsanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 150, 40));

        SanphamTable.setAutoCreateRowSorter(true);
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
        jScrollPane1.setViewportView(SanphamTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 680, 200));

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        jLabel6.setText("NGÀY NHẬP");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 140, 30));

        jLabel7.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        jLabel7.setText("TÊN SẢN PHẨM");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 170, 30));

        jLabel8.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        jLabel8.setText("SỐ THỨ TỰ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 140, 30));

        jLabel9.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        jLabel9.setText("ID LÔ HÀNG");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 140, 30));

        jLabel10.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        jLabel10.setText("CÔNG SUẤT");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 140, 30));

        jLabel11.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        jLabel11.setText("NĂM SẢN XUẤT");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 170, 30));

        IDsanpham.setBackground(new java.awt.Color(255, 232, 232));
        IDsanpham.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        getContentPane().add(IDsanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 150, 40));

        Solohang.setBackground(new java.awt.Color(255, 232, 232));
        Solohang.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        getContentPane().add(Solohang, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 150, 40));

        Congsuat.setBackground(new java.awt.Color(255, 232, 232));
        Congsuat.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        getContentPane().add(Congsuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 150, 40));

        Namsanxuat.setBackground(new java.awt.Color(255, 232, 232));
        Namsanxuat.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        getContentPane().add(Namsanxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 150, 40));

        Tenhang.setBackground(new java.awt.Color(255, 232, 232));
        Tenhang.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        getContentPane().add(Tenhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 150, 40));

        Thembtn.setBackground(new java.awt.Color(153, 153, 153));
        Thembtn.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Thembtn.setText("NHẬP");
        Thembtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThembtnMouseClicked(evt);
            }
        });
        getContentPane().add(Thembtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 690, 110, 40));

        jLabel12.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        jLabel12.setText("SỐ LƯỢNG");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 140, 30));

        Ngaynhap.setBackground(new java.awt.Color(255, 255, 255));
        Ngaynhap.setDateFormatString("dd-MM-yyyy");
        Ngaynhap.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(Ngaynhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 190, 40));

        Lammoibtn.setBackground(new java.awt.Color(153, 153, 153));
        Lammoibtn.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Lammoibtn.setText("LÀM MỚI");
        Lammoibtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LammoibtnMouseClicked(evt);
            }
        });
        getContentPane().add(Lammoibtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 120, 40));

        Xuathangtxt.setColumns(20);
        Xuathangtxt.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Xuathangtxt.setRows(5);
        jScrollPane2.setViewportView(Xuathangtxt);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 680, 230));

        Thembtn1.setBackground(new java.awt.Color(153, 153, 153));
        Thembtn1.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Thembtn1.setText("THÊM");
        Thembtn1.setActionCommand("");
        Thembtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Thembtn1MouseClicked(evt);
            }
        });
        getContentPane().add(Thembtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 640, 110, 40));

        Dangxuat.setBackground(new java.awt.Color(51, 51, 51));
        Dangxuat.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        Dangxuat.setForeground(new java.awt.Color(51, 51, 51));
        Dangxuat.setText("Đăng xuất");
        Dangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangxuatMouseClicked(evt);
            }
        });
        getContentPane().add(Dangxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, -1, 50));

        In.setBackground(new java.awt.Color(153, 153, 153));
        In.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        In.setText("IN");
        In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InMouseClicked(evt);
            }
        });
        getContentPane().add(In, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 670, 120, 40));

        Tieptucnhap.setBackground(new java.awt.Color(153, 153, 153));
        Tieptucnhap.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Tieptucnhap.setText("TIẾP TỤC NHẬP");
        Tieptucnhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TieptucnhapMouseClicked(evt);
            }
        });
        getContentPane().add(Tieptucnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 670, 170, 40));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\LOGOKHOHANG-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\ed (10).png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1110, 750));

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

    private void Sanpham1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sanpham1MouseClicked
         new Xuathang().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_Sanpham1MouseClicked

    int i =0;
    private void Thembtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Thembtn1MouseClicked
        SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy");
        String date = fm.format(Ngaynhap.getDate());

        if (IDsanpham.getText().isEmpty() || Soluongsanpham.getText().isEmpty() || Soluongsanpham.getText().isEmpty() || Namsanxuat.getText().isEmpty() || Solohang.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin");
        } else {
            i++;
            if (i == 1) {
                Xuathangtxt.setText(Xuathangtxt.getText() + "---------------------------------- HÓA ĐƠN XUẤT HÀNG ----------------------------------\n" + "SỐ THỨ TỰ   ID LÔ HÀNG   TÊN SẢN PHẨM   CÔNG SUẤT   SỐ LƯỢNG   NĂM SẢN XUẤT   NGÀY NHẬP\n    " + i + "          " + Solohang.getText() + "          " + Tenhang.getSelectedItem() + "          " + Congsuat.getText()+"         "+ Soluongsanpham.getText() + "          "+ Namsanxuat.getText()+"      "+ fm.format(Ngaynhap.getDate()) + "\n    ");
            } else {
                Xuathangtxt.setText(Xuathangtxt.getText() + i + "           " + Solohang.getText() + "           " + Tenhang.getSelectedItem() + "         " + Congsuat.getText()+"          "+ Soluongsanpham.getText() + "         "+ Namsanxuat.getText()+"         "+ fm.format(Ngaynhap.getDate()) + "\n    ");
            }
        }

    }//GEN-LAST:event_Thembtn1MouseClicked

    private void LammoibtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LammoibtnMouseClicked
        IDsanpham.setText("");
        Solohang.setText("");
        Congsuat.setText("");
        Namsanxuat.setText("");
        Soluongsanpham.setText("");
    }//GEN-LAST:event_LammoibtnMouseClicked

    private void DangxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangxuatMouseClicked
        new DangNhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DangxuatMouseClicked

    private void InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InMouseClicked
        try {
            Xuathangtxt.print();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_InMouseClicked

    private void TieptucnhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TieptucnhapMouseClicked
        new Nhapkho().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TieptucnhapMouseClicked

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
            java.util.logging.Logger.getLogger(Nhapkho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nhapkho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nhapkho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nhapkho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nhapkho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Congsuat;
    private javax.swing.JLabel Dangxuat;
    private javax.swing.JTextField IDsanpham;
    private javax.swing.JButton In;
    private javax.swing.JButton Lammoibtn;
    private javax.swing.JTextField Namsanxuat;
    private com.toedter.calendar.JDateChooser Ngaynhap;
    private javax.swing.JLabel Sanpham;
    private javax.swing.JLabel Sanpham1;
    private javax.swing.JTable SanphamTable;
    private javax.swing.JTextField Solohang;
    private javax.swing.JTextField Soluongsanpham;
    private javax.swing.JComboBox<String> Tenhang;
    private javax.swing.JButton Thembtn;
    private javax.swing.JButton Thembtn1;
    private javax.swing.JButton Tieptucnhap;
    private javax.swing.JTextArea Xuathangtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
