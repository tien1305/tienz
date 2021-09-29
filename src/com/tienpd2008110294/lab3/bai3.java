/*
/*
* created date: 24 thg 9, 2021
*author: tien
*/
package com.tienpd2008110294.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a;
        int sum = 0, count = 0;
        float tbsum;
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        int n = in.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử a[%d] ", i);
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Mảng được sắp xếp là: " + Arrays.toString(a));
        System.out.println("Phần tử có giá trị nhỏ nhất là: " + a[0]);
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                sum = sum + a[i];
                count++;
            }
        }
        tbsum = sum / count;
        System.out.println("Trung bình cộng của các số chia hết cho 3 có trong mảng là: " + tbsum);
    }
}
