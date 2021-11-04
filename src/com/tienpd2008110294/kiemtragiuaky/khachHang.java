/*
* created date: Nov 04, 2021
*author: tien
*/
package com.tienpd2008110294.kiemtragiuaky;

public class khachHang {
    private String tenCongTy;
    private double triGiaHoaDon;

    @Override
    public String toString() {
        return super.toString() + " " + tenCongTy + " " + triGiaHoaDon + " VND";
    }

    khachHang(String hoTen, String diaChi, String tenCongTy, double triGiaHoaDon) {
        super(hoTen, diaChi);
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
    }
}
