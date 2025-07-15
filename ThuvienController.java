/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.quanlythuvien.controller;

import javax.swing.JDialog;
import javax.swing.JFrame;
import poly.quanlythuvien.ui.UC2;
import poly.quanlythuvien.ui.UC3;
import poly.quanlythuvien.ui.UC4;
import poly.quanlythuvien.ui.UC5;
import poly.quanlythuvien.ui.UC6;
import poly.quanlythuvien.ui.UC7;
import poly.quanlythuvien.ui.UC8;
import poly.quanlythuvien.ui.UC9;
import poly.quanlythuvien.ui.DangNhap;
import poly.quanlythuvien.util.XDialog;

/**
 *
 * @author ACER
 */
public interface ThuvienController {
    void init();

    default void exit() {
        if (XDialog.confirm("Bạn muốn kết thúc?")) {
            System.exit(0);
        }
    }

    default void showJDialog(JDialog dialog) {
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    default void showLoginJDialog(JFrame frame) {
        this.showJDialog(new DangNhap(frame, true));
    }

    default void showQuanLySachJDialog(JFrame frame) {
        this.showJDialog(new UC2(frame, true));
    }

    default void showTraCuuSachJDialog(JFrame frame) {
        this.showJDialog(new UC3(frame, true));
    }

    default void showMuonSachJDialog(JFrame frame) {
        this.showJDialog(new UC4(frame, true));
    }

    default void showTraSachJDialog(JFrame frame) {
        this.showJDialog(new UC5(frame, true));
    }

    default void showGiaHanSachJDialog(JFrame frame) {
        this.showJDialog(new UC6(frame, true));
    }

    default void showQuanLyDocGiaJDialog(JFrame frame) {
        this.showJDialog(new UC7(frame, true));
    }

    default void showQuanLyNhanVienJDialog(JFrame frame) {
        this.showJDialog(new UC8(frame, true));
    }

    default void showThongKeJDialog(JFrame frame) {
        this.showJDialog(new UC9(frame, true));

    }
    
}
