/*
* created date: Nov 04, 2021
*author: tien
*/
package com.tienpd2008110294.kiemtragiuaky;

public class Nguoi {

    private String hoTen;
    private String diaChi;

    public String getDiaChi() {
        return diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String toString() {
        return hoTen + " " + diaChi;
    }

    Nguoi(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
}
