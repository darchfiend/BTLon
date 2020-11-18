/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhp.pojo;

/**
 *
 * @author dell
 */
public class TacGia {
    private int maTacGia;
    private String tenTacGia;

    public TacGia(int id, String name) {
        this.maTacGia = id;
        this.tenTacGia = name;
    }

    /**
     * @return the maTacGia
     */
    public int getMaTacGia() {
        return maTacGia;
    }

    /**
     * @param maTacGia the maTacGia to set
     */
    public void setMaTacGia(int maTacGia) {
        this.maTacGia = maTacGia;
    }

    /**
     * @return the tenTacGia
     */
    public String getTenTacGia() {
        return tenTacGia;
    }

    /**
     * @param tenTacGia the tenTacGia to set
     */
    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }
    
    
}
