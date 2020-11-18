/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhp.services;

import com.nhp.pojo.TacGia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class TacGiaServices {
    public List<TacGia> getTacGias() throws SQLException
    {
        Connection conn = Utils.getConn();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM tacgia");
        
        List<TacGia> kq = new ArrayList<>();
        while(rs.next())
        {
            int id = rs.getInt("MaTacGia");
            String name = rs.getString("TenTacGia");
            TacGia c = new TacGia(id,name);
            
            kq.add(c);
        }
        return kq;
    }
}
