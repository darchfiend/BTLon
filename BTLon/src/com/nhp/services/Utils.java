/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhp.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class Utils {
    private static Connection conn;
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/qlthuvien?verifyServerCertificate=false&useSSL=true", "root", "123456");
            System.out.println("Connect thanh cong");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Connection getConn(){
        return conn;
    }
}
