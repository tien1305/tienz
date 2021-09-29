/*
/*
* created date: 24 thg 9, 2021
*author: tien
*/
package com.tienpd2008110294.lab2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int chose;
        do {
            System.out.println("===========MENU===========");
            System.out.println("|1.Giải PT bậc 1         |");
            System.out.println("|2.Giải PT bậc 2         |");
            System.out.println("|3.Tính tiền điện        |");
            System.out.println("|4.Kết thúc              |");
            System.out.println("==========================");
            System.out.print("Mời bạn chọn chương trình: ");
            chose = in.nextInt();
            switch (chose) {
                case 1:
                    bac1();
                    break;
                case 2:
                    bac2();
                    break;
                case 3:
                    tinhtien();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Mời bạn chọn lại! ");
            }
        } while (chose != 4);
    }

    public static void bac1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào hệ số a: ");
        int a = input.nextInt();
        System.out.print("Nhập vào hệ số b: ");
        int b = input.nextInt();
        System.out.printf("PT có dạng (%d)x + (%d) = 0\n", a, b);
        if (a == 0)
            if (b == 0)
                System.out.print("PT có vô số nghiệm! ");
            else
                System.out.print("PT vô nghiệm! ");
        else
            System.out.println("PT có nghiệm duy nhất x = " + (-b / a));
        System.out.println("\rNhập số bất kì để quay lại MENU.");
        int x = input.nextInt();
    }

    static void bac2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào hệ số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập vào hệ số b: ");
        int b = sc.nextInt();
        System.out.print("Nhập vào hệ số c: ");
        int c = sc.nextInt();
        System.out.printf("PT có dạng (%d)x^2 + (%d)x + (%d) = 0\n", a, b, c);
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0)
            System.out.println("PT vô nghiệm! ");
        else if (delta == 0)
            System.out.println("PT có nghiệm kép x1 = x2 = " + (-b / 2 * a));
        else {
            System.out.println("PT có 2 nghiệm phân biệt: ");
            System.out.printf("x1 = %.2f\n", ((-b + Math.sqrt(delta)) / (2 * a)));
            System.out.printf("x2 = %.2f.", ((-b - Math.sqrt(delta)) / (2 * a)));
        }
        System.out.println("\nNhập số bất kì để quay lại MENU.");
        int x = sc.nextInt();
    }

    static void tinhtien() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào số điện: ");
        float x = in.nextFloat();
        if (x < 50)
            System.out.println("Số tiền phải trả là: " + x * 1000);
        else
            System.out.println("Số tiền phải trả là: " + (50 * 1000 + (x - 50) * 1200));
        System.out.println("Nhập số bất kì để quay lại MENU.");
        int y = in.nextInt();
    }
}
