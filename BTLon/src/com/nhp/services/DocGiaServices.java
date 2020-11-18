/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhp.services;

import com.nhp.pojo.DocGia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author dell
 */
public class DocGiaServices {
    public static List<DocGia> getDocGias()
    {
        return null;
    }
    public static boolean addDocGia(DocGia d) throws SQLException{
        Connection conn = Utils.getConn();
        
        try{
            conn.setAutoCommit(false);
            String sql = "INSERT INTO docgia(MaDocGia, HoTen, GioiTinh, NgaySinh, DoiTuong, BoPhan, HanThe, Email, DiaChi, DienThoai, HanThe2) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, d.getMaDocGia());
            stm.setString(2, d.getHoTen());
            stm.setString(3, d.getGioiTinh());
            stm.setDate(4, d.getNgaySinh());
            stm.setString(5, d.getDoiTuong());
            stm.setString(6, d.getBoPhan());
            stm.setDate(7, d.getHanThe());
            stm.setString(8, d.getEmail());
            stm.setString(9, d.getDiaChi());
            stm.setInt(10, d.getSdt());
            stm.setDate(11, d.getHanThe2());
            stm.executeUpdate();
            conn.commit();
            int r = stm.executeUpdate();
        if(r > 0 )
            return true;
        }catch(SQLException ex){
            ex.getStackTrace();
            try{
                conn.rollback();
            }catch(SQLException ex1){
                
            }
            
        }
        return false;
    }
}
