/*
/*
* created date: 24 thg 9, 2021
*author: tien
*/
package com.tienpd2008110294.lab1;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào hệ số a: ");
        int a = in.nextInt();
        System.out.print("Nhập vào hệ số b: ");
        int b = in.nextInt();
        System.out.print("Nhập vào hệ số c: ");
        int c = in.nextInt();
        double  delta = Math.pow(b,2)-4*a*c;
        System.out.print("Căn delta là: "+Math.sqrt(delta));
    }
}
