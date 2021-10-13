/*
* created date: Oct 13, 2021
*author: tien
*/
package com.tienpd2008110294.lab5;

public class maytinhtestdrive {
    public static void main(String[] args) {
        maytinh mayTinh;
        mayTinh = new maytinh();
        mayTinh.inThongTin();
        System.out.print("Tổng tiền 2 chiếc máy tính là: " + mayTinh.tinhTien(2));
        System.out.println(" triệu đồng");
        mayTinh = new maytinh(2018);
        mayTinh.inThongTin();
        System.out.print("Tổng tiền 3 chiếc máy tính là: " + mayTinh.tinhTien(3));
        System.out.println(" triệu đồng");
        mayTinh = new maytinh(16, 20);
        mayTinh.inThongTin();
        System.out.print("Tổng tiền 4 chiếc máy tính là: " + mayTinh.tinhTien(4));
        System.out.println(" triệu đồng");
    }
}
