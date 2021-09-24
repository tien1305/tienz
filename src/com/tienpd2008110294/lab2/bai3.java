/*
/*
* created date: 24 thg 9, 2021
*author: tien
*/
package com.tienpd2008110294.lab2;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào số điện: ");
        float x = in.nextFloat();
        if(x<50)
            System.out.println("Số tiền phải trả là: "+x*1000);
        else
            System.out.println("Số tiền phải trả là: "+(50*1000+(x-50)*1200));
    }
}
