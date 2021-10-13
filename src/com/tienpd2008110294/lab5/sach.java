/*
* created date: Oct 11, 2021
*author: tien
*/
package com.tienpd2008110294.lab5;

import java.util.Scanner;

public class sach {
    int gia;
    String nxb;
    int namxb;
    int giaban;
    int soluong;
    String loai;
    String tacgia;

    sach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập giá của sách: ");
        gia = sc.nextInt();
        System.out.print("Hãy nhập nhà xuất bản của sách: ");
        nxb = sc.next();
        System.out.print("Hãy nhập năm xuất bản của sách: ");
        namxb = sc.nextInt();
        System.out.print("Hãy nhập số lượng sách: ");
        soluong = sc.nextInt();
        System.out.print("Hãy nhập loại sách: ");
        loai = sc.next();
        System.out.print("Hãy nhập tên tác giả của sách: ");
        tacgia = sc.next();
        System.out.println("---------------------");
        System.out.println("Giá của sách là: " + gia);
        System.out.println("Nhà xuất bản của sách là: " + nxb);
        System.out.println("Năm xuất bản của sách là: " + namxb);
        System.out.println("Số lượng sách là: " + soluong);
        System.out.println("Loại sách là: " + loai);
        System.out.println("Tên tác giả của sách là: " + tacgia);
    }

    sach(int g) {
        gia = g;
    }

    sach(String xb, int nmxb) {
        nxb = xb;
        namxb = nmxb;
    }

    sach(int gb, int sl, String tg) {
        giaban = gb;
        soluong = sl;
        tacgia = tg;
    }
}
