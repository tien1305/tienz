/*
* created date: Nov 04, 2021
*author: tien
*/
package com.tienpd2008110294.kiemtragiuaky;

import java.util.Scanner;

public abstract class nhanVien extends Nguoi {

    private float heSoLuong;

    protected float tinhLuong() {
        return heSoLuong * 1500000;
    }

    @Override
    public String toString() {
        return super.toString() + " " + tinhLuong() + " VND";
    }

    NhanVien( String hoTen,String diaChi,float heSoLuong){
        super(hoTen,diaChi);
        this.heSoLuong = heSoLuong;
    }
}
