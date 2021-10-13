/*
* created date: Oct 13, 2021
*author: tien
*/
package com.tienpd2008110294.lab5;

import java.sql.Date;
import java.util.Scanner;

public class nhanvien {
    String tennhanvien;
    double luong;
    String diachi;
    String bophanlamviec;
    int ngay;
    int thang;
    int nam;
    String msnv;

    nhanvien(String t) {
        tennhanvien = t;
    }

    nhanvien(double l, String dc) {
        luong = l;
        diachi = dc;
    }

    nhanvien(String ms, String bp, int ns) {
        msnv = ms;
        bophanlamviec = bp;
        ngay = ns;
    }

    nhanvien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy Tên của nhân viên: ");
        tennhanvien = sc.next();
        System.out.print("Hãy nhập ngày sinh của nhân viên: ");
        ngay = sc.nextInt();
        System.out.print("Hãy nhập tháng sinh của nhân viên: ");
        thang = sc.nextInt();
        System.out.print("Hãy nhập năm sinh của nhân viên: ");
        nam = sc.nextInt();
        System.out.print("Hãy nhập mã số nhân viên: ");
        msnv = sc.next();
        System.out.print("Hãy nhập số lương của nhân viên: ");
        luong = sc.nextDouble();
        System.out.print("Hãy nhập địa chỉ của nv: ");
        diachi = sc.next();
        System.out.print("Hãy nhập bộ phận làm việc của nhân viên: ");
        bophanlamviec = sc.next();

        System.out.println("---------------------");
        System.out.println("Tên của nhân viên là: " + tennhanvien);
        System.out.println("Ngày tháng năm sinh của nv là: " + ngay + "/" + thang + "/" + nam);
        System.out.println("Số lương của nv là: " + luong);
        System.out.println("Địa chỉ của nv là: " + diachi);
        System.out.println("Bộ phận làm việc của nv là: " + bophanlamviec);

    }
}
