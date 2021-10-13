/*
* created date: Oct 13, 2021
*author: tien
*/
package com.tienpd2008110294.lab5;

public class maytinh {
    String nhaSX;
    double namSX;
    String heDH;
    int ram;
    String cpu;
    double gia;
    double namBH;

    maytinh() {
        nhaSX = "MSI";
        namSX = 2020;
        heDH = "Windows 10";
        ram = 8;
        cpu = "Ryzen 5 4600h";
        gia = 16;
        namBH = 2021;
    }

    maytinh(double n) {
        nhaSX = "Dell";
        namSX = n;
        heDH = "Windows 10";
        ram = 8;
        cpu = "Intel Core i7 10400F";
        gia = 15;
        namBH = 2020;
    }

    maytinh(int a, double b) {
        nhaSX = "Asus";
        namSX = 2019;
        heDH = "Windows 10";
        ram = a;
        cpu = "Intel Core i3 8700K";
        gia = b;
        namBH = namSX;
    }

    void inThongTin() {
        System.out.println("Nhà sản xuất: " + nhaSX);
        System.out.println("Năm sản xuất: " + namSX);
        System.out.println("Hệ điều hành: " + heDH);
        System.out.print("Ram: " + ram);
        System.out.println("GB");
        System.out.println("CPU: " + cpu);
        System.out.print("Giá bán: " + gia);
        System.out.println(" triệu đồng");
        System.out.println("Năm bảo hành: " + namBH);
    }

    double tinhTien(int soLuong) {
        double tien;
        tien = soLuong * gia;
        return tien;
    }
}
