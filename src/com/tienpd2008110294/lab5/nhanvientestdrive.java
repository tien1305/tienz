/*
* created date: Oct 13, 2021
*author: tien
*/
package com.tienpd2008110294.lab5;

public class nhanvientestdrive {
    public static void main(String[] args) {
        nhanvien nhanvien;
        nhanvien = new nhanvien("Huy");
        System.out.println("Tên nhân viên: " + nhanvien.tennhanvien);
        nhanvien = new nhanvien(5000000, "128 Hoàng Văn Thụ, Quận 12, TPHCM");
        System.out.println("Lương: " + nhanvien.luong + " Địa chỉ: " + nhanvien.diachi);
        nhanvien = new nhanvien("NV01", "Phòng Kho", 20);
        System.out.println("Mã số nv: " + nhanvien.msnv + " Bộ phận là việc: " + nhanvien.bophanlamviec
                + " Ngày sinh: " + nhanvien.ngay);
        nhanvien = new nhanvien();
        System.out.println(nhanvien);
    }
}
