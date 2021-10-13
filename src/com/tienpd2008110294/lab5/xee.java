/*
* created date: Oct 13, 2021
*author: tien
*/
package com.tienpd2008110294.lab5;

public class xee {
    String ten;
    String hsx;
    String dong;
    String giayphep;
    String dungtichxang;

    xee(String tcx) {
        ten = tcx;
    }

    xee(String hang, String dg) {
        hsx = hang;
        dong = dg;
    }

    xee(String tcx, String gp, String dtx) {
        ten = tcx;
        giayphep = gp;
        dungtichxang = dtx;
    }

    xee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy Tên của chủ xe: ");
        ten = sc.next();
        System.out.print("Hãy nhập hãng sản xuất: ");
        hsx = sc.next();
        System.out.print("Hãy nhập dòng xe: ");
        dong = sc.next();
        System.out.print("Hãy nhập số hiệu giấy phép: ");
        giayphep = sc.next();
        System.out.print("Hãy nhập dung tích xăng của xe: ");
        dungtichxang = sc.next();

        System.out.println("---------------------");
        System.out.println("Tên chủ xe là: " + ten);
        System.out.println("Hãng sản xuất: " + hsx);
        System.out.println("Dòng xe là: " + dong);
        System.out.println("Số hiệu giấy phép là: " + giayphep);
        System.out.println("Dung tích xăng là: " + dungtichxang);
    }
}
