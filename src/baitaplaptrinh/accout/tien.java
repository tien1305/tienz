/*
* created date: Oct 20, 2021
*author: tien
*/
package baitaplaptrinh.accout;

import java.util.Scanner;

public class tien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        tien thongtintien = new tien();
        thongtintien.ten = "toan ";
        thongtintien.tuoi = "20";
        thongtintien.mssv = "3456789";
        System.out.println("ten: " + thongtintien.tien);
        System.out.println("tuổi: " + thongtintien.tuoi);
        System.out.println("mssv: " + thongtintien.mssv);
    }
}
