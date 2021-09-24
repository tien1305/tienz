/*
/*
* created date: 23 thg 9, 2021
*author: tien
*/
package com.tienpd2008110294.lab1;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào độ dài cạnh thứ 1: ");
        int a = in.nextInt();
        System.out.print("Nhập vào độ dài cạnh thứ 2: ");
        int b = in.nextInt();
        System.out.println("Chu  vi của hình chữ nhật là: "+(a+b)*2);
        System.out.println("Diện tích của hình chữ nhật là: "+a*b);
        System.out.println("Độ dài cạnh nhỏ nhất là: "+Math.min(a,b));
    }
}
