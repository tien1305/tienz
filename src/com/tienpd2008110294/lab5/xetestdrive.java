/*
* created date: Oct 13, 2021
*author: tien
*/
package com.tienpd2008110294.lab5;

public class xetestdrive {
    public static void main(String[] args) {
        xee xe;
        xe = new xee("Long");
        System.out.println("Tên chủ xe: " + xe.ten);
        xe = new xee("ToYoTa", "2021 New");
        System.out.println("Hãng xe: " + xe.hsx + ". Dòng xe: " + xe.dong);
        xe = new xee("Long", "20/21 GTVT", "1000ml");
        System.out.println("Tên chủ xe: " + xe.ten + ". Mã số giấy phép: " + xe.giayphep + ". Dung tích xăng: "
                + xe.dungtichxang);
        xe = new xee();
        System.out.println(xe);
    }
}
