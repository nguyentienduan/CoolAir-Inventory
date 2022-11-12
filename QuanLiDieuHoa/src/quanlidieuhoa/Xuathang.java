/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlidieuhoa;

import com.sun.org.apache.bcel.internal.classfile.Utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author nguye
 */
public class Xuathang extends javax.swing.JFrame {

    public Xuathang() {
        initComponents();
        ChonNguoidung();
        Themnhacungcap();
    }

    private void Themnhacungcap() {
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

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SanphamTable = new javax.swing.JTable();
        Tenhang = new javax.swing.JComboBox<String>();
        Boloc = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Solohang = new javax.swing.JTextField();
        Soluongxuat = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Xuathangtxt = new javax.swing.JTextArea();
        Thembtn1 = new javax.swing.JButton();
        Lammoibtn = new javax.swing.JButton();
        In = new javax.swing.JButton();
        Dangxuat = new javax.swing.JLabel();
        Xuat = new javax.swing.JButton();
        LỌC = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Ngayxuat = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("DANH SÁCH SẢN PHẨM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, 50));

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("XUẤT HÀNG");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, 50));

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
        SanphamTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SanphamTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SanphamTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 680, 200));

        Tenhang.setBackground(new java.awt.Color(255, 232, 232));
        Tenhang.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        Tenhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TenhangMouseClicked(evt);
            }
        });
        getContentPane().add(Tenhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 150, 40));

        Boloc.setBackground(new java.awt.Color(153, 153, 153));
        Boloc.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Boloc.setText("BỎ LỌC");
        Boloc.setToolTipText("");
        Boloc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BolocMouseClicked(evt);
            }
        });
        getContentPane().add(Boloc, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 110, 40));

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel6.setText("ID LÔ HÀNG");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 140, 30));

        jLabel10.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel10.setText("NGÀY XUẤT");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 150, 30));

        Solohang.setBackground(new java.awt.Color(255, 232, 232));
        Solohang.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(Solohang, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 150, 50));

        Soluongxuat.setBackground(new java.awt.Color(255, 232, 232));
        Soluongxuat.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(Soluongxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 150, 50));

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
        getContentPane().add(Thembtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 110, 40));

        Lammoibtn.setBackground(new java.awt.Color(153, 153, 153));
        Lammoibtn.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Lammoibtn.setText("LÀM MỚI");
        Lammoibtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LammoibtnMouseClicked(evt);
            }
        });
        getContentPane().add(Lammoibtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 120, 40));

        In.setBackground(new java.awt.Color(153, 153, 153));
        In.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        In.setText("IN");
        In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InMouseClicked(evt);
            }
        });
        getContentPane().add(In, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 120, 40));

        Dangxuat.setBackground(new java.awt.Color(51, 51, 51));
        Dangxuat.setFont(new java.awt.Font("Sitka Heading", 1, 20)); // NOI18N
        Dangxuat.setForeground(new java.awt.Color(51, 51, 51));
        Dangxuat.setText("Đăng xuất");
        Dangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangxuatMouseClicked(evt);
            }
        });
        getContentPane().add(Dangxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, -1, 50));

        Xuat.setBackground(new java.awt.Color(153, 153, 153));
        Xuat.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        Xuat.setText("XUẤT");
        Xuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XuatMouseClicked(evt);
            }
        });
        getContentPane().add(Xuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 120, 40));

        LỌC.setBackground(new java.awt.Color(153, 153, 153));
        LỌC.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        LỌC.setText("LỌC");
        LỌC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LỌCMouseClicked(evt);
            }
        });
        getContentPane().add(LỌC, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 110, 40));

        jLabel11.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        jLabel11.setText("SỐ LƯỢNG");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, 30));

        Ngayxuat.setBackground(new java.awt.Color(255, 255, 255));
        Ngayxuat.setDateFormatString("dd-MM-yyyy");
        Ngayxuat.setFont(new java.awt.Font("Sitka Heading", 1, 22)); // NOI18N
        getContentPane().add(Ngayxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 190, 50));

        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 240, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\Thiết_kế_chưa_có_tên__1_-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -10, 310, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\ed (8).png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int Prid, Soluongmoi;

    public void Update() {
        Soluongmoi = Sanphamdaco - Integer.valueOf(Soluongxuat.getText());
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
            String Query = "Update Duan.SANPHAM set SOLUONG=" + Soluongmoi + "" + "where ID=" + Prid;
            //phần nào là Integer hoặc Double nhớ bỏ dấu '
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            //JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            ChonNguoidung();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    int Sanphamdaco;
    private void SanphamTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanphamTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) SanphamTable.getModel();
        int Myindex = SanphamTable.getSelectedRow();
        Prid = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        Solohang.setText(model.getValueAt(Myindex, 1).toString());
        // Tenhang.setSelectedItem(model.getValueAt(Myindex, 2).toString());
        // Congsuat.setText(model.getValueAt(Myindex, 3).toString());
        //Soluongsanpham.setText(model.getValueAt(Myindex, 4).toString());
        Sanphamdaco = Integer.valueOf(model.getValueAt(Myindex, 4).toString());

        //Namsanxuat.setText(model.getValueAt(Myindex, 5).toString());
    }//GEN-LAST:event_SanphamTableMouseClicked

    int i = 0;
    private void Thembtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Thembtn1MouseClicked
        SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy");
        String date = fm.format(Ngayxuat.getDate());

        if (Soluongxuat.getText().isEmpty() || Solohang.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin");
        } else if (Sanphamdaco <= Integer.valueOf(Soluongxuat.getText())) {
            JOptionPane.showMessageDialog(this, "Số lượng sản phẩm không đủ để xuất");
        } else {
            i++;
            if (i == 1) {
                Xuathangtxt.setText(Xuathangtxt.getText() + "-------------------- HÓA ĐƠN XUẤT HÀNG --------------------\n" + "SỐ THỨ TỰ   SỐ LÔ HÀNG   TÊN SẢN PHẨM   SỐ LƯỢNG   NGÀY XUẤT\n    " + i + "          " + Solohang.getText() + "        " + Tenhang.getSelectedItem() + "          " + Soluongxuat.getText() + "      " + fm.format(Ngayxuat.getDate()) + "\n    ");
            } else {
                Xuathangtxt.setText(Xuathangtxt.getText() + i + "          " + Solohang.getText() + "        " + Tenhang.getSelectedItem() + "         " + Soluongxuat.getText() + "      " + fm.format(Ngayxuat.getDate()) + "\n    ");
            }
        }
           
    }//GEN-LAST:event_Thembtn1MouseClicked

    private void LammoibtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LammoibtnMouseClicked

        Solohang.setText("");
        // Congsuat.setText("");
        // Namsanxuat.setText("");
        Soluongxuat.setText("");

    }//GEN-LAST:event_LammoibtnMouseClicked

    private void InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InMouseClicked
        try {
            Xuathangtxt.print();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_InMouseClicked

    private void DangxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangxuatMouseClicked
        new DangNhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DangxuatMouseClicked

    private void XuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XuatMouseClicked
        Update();
        JOptionPane.showMessageDialog(this, "Xuất thành công");
    }//GEN-LAST:event_XuatMouseClicked

    private void TenhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TenhangMouseClicked
//        try {
//            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
//            St = Con.createStatement();
//            Rs = St.executeQuery("Select * from Duan.NHACUNGCAPTBL where TENNHACUNGCAP='" + Tenhang.getSelectedItem().toString() + "'");
//            SanphamTable.setModel(DbUtils.resultSetToTableModel(Rs));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_TenhangMouseClicked

    private void BolocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BolocMouseClicked
        ChonNguoidung();
    }//GEN-LAST:event_BolocMouseClicked

    private void LỌCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LỌCMouseClicked
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/DieuHoa", "Duan", "123");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from Duan.SANPHAM where TENHANG='" + Tenhang.getSelectedItem().toString() + "'");
            //Rs = St.executeQuery("Select * from Duan.NHACUNGCAPTBL where TENNHACUNGCAP='" + Tenhang.getSelectedItem().toString() + "'");
            SanphamTable.setModel(DbUtils.resultSetToTableModel(Rs));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_LỌCMouseClicked
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

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Xuathang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boloc;
    private javax.swing.JLabel Dangxuat;
    private javax.swing.JButton In;
    private javax.swing.JButton Lammoibtn;
    private javax.swing.JButton LỌC;
    private com.toedter.calendar.JDateChooser Ngayxuat;
    private javax.swing.JTable SanphamTable;
    private javax.swing.JTextField Solohang;
    private javax.swing.JTextField Soluongxuat;
    private javax.swing.JComboBox<String> Tenhang;
    private javax.swing.JButton Thembtn1;
    private javax.swing.JButton Xuat;
    private javax.swing.JTextArea Xuathangtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
