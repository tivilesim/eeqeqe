/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poly.quanlythuvien.quanlythuvien;
import poly.quanlythuvien.util.XJdbc;
import javax.swing.JDialog;
import javax.swing.JFrame;
import poly.quanlythuvien.controller.ThuvienController;
import poly.quanlythuvien.util.XAuth;
import poly.quanlythuvien.util.XDialog;
import poly.quanlythuvien.util.XIcon;


public final class ThuVien extends javax.swing.JFrame implements ThuvienController {

   
    public ThuVien() {
        initComponents();
        init();
    }

    public ThuVien(String username) {
        initComponents();
        name.setText("Họ và tên: " + username); // Hiển thị tên đăng nhập
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        anh = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quanlysach = new javax.swing.JButton();
        quanlydocgia = new javax.swing.JButton();
        quanlynhanvien = new javax.swing.JButton();
        thongke = new javax.swing.JButton();
        muonsach = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        tracuusach = new javax.swing.JButton();
        giahansach = new javax.swing.JButton();
        trasach = new javax.swing.JButton();
        dangxuat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        anh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/quanlythuvien/icons/images-removebg-preview1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(anh, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(anh, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/quanlythuvien/icons/coffee-shop.jpg"))); // NOI18N

        quanlysach.setText("QUẢN LÝ SÁCH");
        quanlysach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanlysachActionPerformed(evt);
            }
        });

        quanlydocgia.setText("QUẢN LÝ ĐỘC GIẢ");
        quanlydocgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanlydocgiaActionPerformed(evt);
            }
        });

        quanlynhanvien.setText("QUẢN LÝ NHÂN VIÊN");
        quanlynhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanlynhanvienActionPerformed(evt);
            }
        });

        thongke.setText("THỐNG KÊ");
        thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongkeActionPerformed(evt);
            }
        });

        muonsach.setText("MƯỢN SÁCH");
        muonsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muonsachActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.setText("Nguyễn Anh Khôi ");

        tracuusach.setText("TRA CỨU SÁCH");
        tracuusach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tracuusachActionPerformed(evt);
            }
        });

        giahansach.setText("GIA HẠN SÁCH");
        giahansach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giahansachActionPerformed(evt);
            }
        });

        trasach.setText("TRẢ SÁCH");
        trasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trasachActionPerformed(evt);
            }
        });

        dangxuat.setText("Đăng xuất");
        dangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangxuatActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("THƯ VIỆN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(quanlynhanvien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(quanlydocgia, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(quanlysach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(giahansach, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(muonsach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trasach, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tracuusach, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(dangxuat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(muonsach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quanlysach, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tracuusach, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quanlynhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quanlydocgia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(giahansach, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trasach, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tracuusachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tracuusachActionPerformed
        // TODO add your handling code here:
        this.showTraCuuSachJDialog(this);
       
    }//GEN-LAST:event_tracuusachActionPerformed

    private void quanlysachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanlysachActionPerformed
        // TODO add your handling code here:
        this.showQuanLySachJDialog(this);
        
    }//GEN-LAST:event_quanlysachActionPerformed

    private void quanlynhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanlynhanvienActionPerformed
        // TODO add your handling code here:
        this.showQuanLyNhanVienJDialog(this);
       
    }//GEN-LAST:event_quanlynhanvienActionPerformed

    private void thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongkeActionPerformed
        // TODO add your handling code here:
        this.showThongKeJDialog(this);
      
    }//GEN-LAST:event_thongkeActionPerformed

    private void muonsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muonsachActionPerformed
        // TODO add your handling code here:
        this.showMuonSachJDialog(this);
       
    }//GEN-LAST:event_muonsachActionPerformed

    private void giahansachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giahansachActionPerformed
        // TODO add your handling code here:
        this.showGiaHanSachJDialog(this);
       
    }//GEN-LAST:event_giahansachActionPerformed

    private void trasachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trasachActionPerformed
        // TODO add your handling code here:
        this.showTraSachJDialog(this);
       
    }//GEN-LAST:event_trasachActionPerformed

    private void dangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangxuatActionPerformed
        // TODO add your handling code here:
                                                
         if (XDialog.confirm("Bạn muốn đăng xuất?")) {
        XAuth.clear(); // Xóa thông tin người dùng

        

       this.dispose();
    }      
      
    }//GEN-LAST:event_dangxuatActionPerformed

    private void quanlydocgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanlydocgiaActionPerformed
        // TODO add your handling code here:
        this.showQuanLyDocGiaJDialog(this);
    }//GEN-LAST:event_quanlydocgiaActionPerformed

   
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
            java.util.logging.Logger.getLogger(ThuVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThuVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThuVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThuVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThuVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anh;
    private javax.swing.JButton dangxuat;
    private javax.swing.JButton giahansach;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton muonsach;
    private javax.swing.JLabel name;
    private javax.swing.JButton quanlydocgia;
    private javax.swing.JButton quanlynhanvien;
    private javax.swing.JButton quanlysach;
    private javax.swing.JButton thongke;
    private javax.swing.JButton tracuusach;
    private javax.swing.JButton trasach;
    // End of variables declaration//GEN-END:variables

    @Override
    public void init() {
       
    }

    @Override
    public void exit() {
        ThuvienController.super.exit(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void showJDialog(JDialog dialog) {
        ThuvienController.super.showJDialog(dialog); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void showLoginJDialog(JFrame frame) {
        ThuvienController.super.showLoginJDialog(frame); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void showQuanLySachJDialog(JFrame frame) {
        ThuvienController.super.showQuanLySachJDialog(frame); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void showTraCuuSachJDialog(JFrame frame) {
        ThuvienController.super.showTraCuuSachJDialog(frame); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void showMuonSachJDialog(JFrame frame) {
        ThuvienController.super.showMuonSachJDialog(frame); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void showTraSachJDialog(JFrame frame) {
        ThuvienController.super.showTraSachJDialog(frame); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void showGiaHanSachJDialog(JFrame frame) {
        ThuvienController.super.showGiaHanSachJDialog(frame); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void showQuanLyDocGiaJDialog(JFrame frame) {
        ThuvienController.super.showQuanLyDocGiaJDialog(frame); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void showQuanLyNhanVienJDialog(JFrame frame) {
        ThuvienController.super.showQuanLyNhanVienJDialog(frame); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void showThongKeJDialog(JFrame frame) {
        ThuvienController.super.showThongKeJDialog(frame); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
