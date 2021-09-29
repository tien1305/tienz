/*
/*
* created date: 24 thg 9, 2021
*author: tien
*/
package com.tienpd2008110294.lab2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào hệ số a: ");
        int a = in.nextInt();
        System.out.print("Nhập vào hệ số b: ");
        int b = in.nextInt();
        System.out.print("Nhập vào hệ số c: ");
        int c = in.nextInt();
        System.out.printf("PT có dạng %dx^2 + %dx + %d = 0\n", a, b, c);
        if (a == 0)
            bac1(b, c);
        else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0)
                System.out.println("PT vô nghiệm! ");
            else if (delta == 0)
                System.out.println("\nPT có nghiệm kép x1 = x2 = " + (-b / 2 * a));
            else {
                System.out.println("PT có 2 nghiệm phân biệt: ");
                System.out.printf("x1 = %.2f\n", ((-b + Math.sqrt(delta)) / (2 * a)));
                System.out.printf("x2 = %.2f.", ((-b - Math.sqrt(delta)) / (2 * a)));
            }
        }
    }

    public static void bac1(int b, int c) {
        if (b == 0)
            if (c == 0)
                System.out.print("PT có vô số nghiệm! ");
            else
                System.out.print("PT vô nghiệm! ");
        else
            System.out.println("PT có nghiệm duy nhất x = " + (-c / b));
    }

}
