/*
/*
* created date: 24 thg 9, 2021
*author: tien
*/
package com.tienpd2008110294.lab1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào độ dài cạnh khối lập phương: ");
        int a = in.nextInt();
        System.out.println("Thể tích khối lập phương là: "+Math.pow(a,3));
    }
}
5