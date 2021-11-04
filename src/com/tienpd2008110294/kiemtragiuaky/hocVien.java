/*
* created date: Nov 04, 2021
*author: tien
*/
package com.tienpd2008110294.kiemtragiuaky;

import java.util.Scanner;

import javax.crypto.interfaces.DHKey;

public class hocVien extends Nguoi {
    private float diemMonhoc1;
    private float diemMonhoc2;
    private static int soLuongHV;

    protected float diemTB() {
        return (diemMonhoc1 + diemMonhoc2) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " " + diemMonhoc1 + " " + diemMonhoc2 + " " + " Diem trung binh " + diemTB();
    }

    hocVien(String hoTen, String diaChi, float diemMonhoc1, float diemMonhoc2) {
        super(hoTen, diaChi);
        this.diemMonhoc1 = diemMonhoc1;
        this.diemMonhoc2 = diemMonhoc2;
    }

}
