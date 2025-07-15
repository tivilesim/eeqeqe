/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.quanlythuvien.dao;

import java.util.Date;
import java.util.List;
import poly.quanlythuvien.ui.DangNhap;

/**
 *
 * @author ACER
 */
public interface DangNhapDao {
    List<DangNhap> findByMaPhieuMuon(String maPhieuMuon);
    void updateTrangThaiAndNgayTra(String maPhieuMuon, String maSach, String trangThai, Date ngayTra, double tienPhat);
}
