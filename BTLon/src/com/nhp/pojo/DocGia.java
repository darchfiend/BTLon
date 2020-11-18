/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhp.pojo;

import java.text.ParseException;
import java.sql.Date;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.util.Callback;
import java.text.SimpleDateFormat;

/**
 *
 * @author dell
 */
public class DocGia {
    private int maDocGia;
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;
    private String doiTuong;
    private String boPhan;
    private Date hanThe;
    private Date hanThe2;
    private String email;
    private String diaChi;
    private int sdt;
    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
    /**
     * @return the maDocGia
     * @throws java.text.ParseException
     */
    public DocGia(String mdg, String ht, String gt, String ns, String dt, String bp, String hthe, String hthe2, String email,String dc, String sdt) throws ParseException
    {
        this.maDocGia = Integer.parseInt(mdg);
        this.hoTen = ht;
        this.gioiTinh = gt;
        this.ngaySinh = Date.valueOf(ns);
        this.doiTuong = dt;
        this.boPhan = bp;
        this.hanThe = Date.valueOf(hthe);
        this.hanThe2 = Date.valueOf(hthe2);
        this.email = email;
        this.diaChi = dc;
        this.sdt = Integer.parseInt(sdt);
        
    }


   
    public int getMaDocGia() {
        return maDocGia;
    }

    /**
     * @param maDocGia the maDocGia to set
     */
    public void setMaDocGia(int maDocGia) {
        this.maDocGia = maDocGia;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the doiTuong
     */
    public String getDoiTuong() {
        return doiTuong;
    }

    /**
     * @param doiTuong the doiTuong to set
     */
    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    /**
     * @return the boPhan
     */
    public String getBoPhan() {
        return boPhan;
    }

    /**
     * @param boPhan the boPhan to set
     */
    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

    /**
     * @return the hanThe
     */
    public Date getHanThe() {
        return hanThe;
    }

    /**
     * @param hanThe the hanThe to set
     */
    public void setHanThe(Date hanThe) {
        this.hanThe = hanThe;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the diaChi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * @param diaChi the diaChi to set
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    /**
     * @return the sdt
     */
    public int getSdt() {
        return sdt;
    }

    /**
     * @param sdt the sdt to set
     */
    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    /**
     * @return the hanThe2
     */
    public Date getHanThe2() {
        return hanThe2;
    }

    /**
     * @param hanThe2 the hanThe2 to set
     */
    public void setHanThe2(Date hanThe2) {
        this.hanThe2 = hanThe2;
    }
    
}
