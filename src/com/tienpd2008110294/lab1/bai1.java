/*
/*
* created date: 23 thg 9, 2021
*author: tien
*/
package com.tienpd2008110294.lab1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào họ và tên: ");
        String hoten = in.nextLine();
        System.out.print("Nhập vào điểm: ");
        float diem = in.nextFloat();
        System.out.print(hoten + " " + diem + " điểm.");
    }
}
