/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.quanlythuvien.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import poly.quanlythuvien.ui.DangNhap;
import poly.quanlythuvien.dao.DangNhapDao;
import poly.quanlythuvien.entity.TaiKhoan;
import poly.quanlythuvien.util.XJdbc;

/**
 *
 * @author ACER
 */
public class DangNhapDaoimpl implements DangNhapDao {

    @Override
    public List<DangNhap> findByMaPhieuMuon(String maPhieuMuon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateTrangThaiAndNgayTra(String maPhieuMuon, String maSach, String trangThai, Date ngayTra, double tienPhat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
