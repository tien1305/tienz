/*
* created date: Oct 30, 2021
*author: tien
*/
package com.tienpd2008110294.lab8;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void nhapThongTinh(SinhVien tt) {
        System.out.println("Nhập mã số sinh viên: ");
        tt.setMssv(sc.nextInt());
        ;
        sc.nextLine();
        System.out.println("Nhập họ và tên sinh viên: ");
        tt.setTen(sc.nextLine());
        System.out.println("Nhập địa chỉ sinh viên: ");
        tt.setDiem(sc.nextLine());
        do {
            System.out.println("Nhập số điện thoại bao gồm 7 số: ");
            tt.setHocluc(sc.nextLine());
        } while (tt.getHocluc().length() != 7);
    }

    public static void main(String[] args) {

        SinhVien sinhVienOne = new SinhVien();
        sinhVienOne.setDiem(9);
        sinhVienOne.setHocluc("giỏi");
        sinhVienOne.setMssv(2245);
        sinhVienOne.setTen("tien");
        sinhVienOne.hienThiTT();
        SinhVien sinhVienTwo = new SinhVien();
        sinhVienTwo.setDiem(7);
        sinhVienTwo.setHocluc("khá");
        sinhVienTwo.setMssv(76543);
        sinhVienTwo.setTen("tèo");

        sinhVienTwo.hienThiTT();

    }
}
