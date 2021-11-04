/*
* created date: Nov 04, 2021
*author: tien
*/
package com.tienpd2008110294.kiemtragiuaky;

public class testquanly extends Nguoi {
    public static void main(String[] args) {
        danhSachQuanLy list = new danhSachQuanLy();
        hocVien hocVien = new hocVien("phạm đức tiến", "112/4", 8, 7);
        nhanVien nhanVien = new nhanVien("phạm văn toàn", "10/8", 9, 5);
        khachHang khachHang = new khachHang("Nguyễn thức", "67/4", "VNG", 7000000);
        list.themNguoi(hocVien);
        list.themNguoi(nhanVien);
        list.themNguoi(khachHang);
        list.inList();
    }
}
