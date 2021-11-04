/*
* created date: Oct 26, 2021
*author: tien
*/
package hoclaptrinh.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {

        List listApple = new ArrayList<Apple>();
        Scanner sc = new Scanner(System.in);
        kho_tao kt = new kho_tao();
        int luachon = 0;
        do {
            System.out.println("menu....");

            System.out.println("1. thêm táo vào kho \n2. tìm táo theo màu \n3. in ra danh sách táo\n0. thoát ct");
            luachon = sc.nextInt();

            if (luachon == 1) {
                System.out.println("nhập mã táo: ");
                int id = sc.nextInt();
                System.out.println("nhập trọng lượng táo ");
                int mass = sc.nextInt();
                System.out.println("nhập màu sắc táo ");
                String colour = sc.next();
                Apple a = new Apple(id, mass, colour);
                kt.themTao(a);
            } else if (luachon == 2) {
                System.out.println("nhập màu muốn tìm:");
                String mass = sc.next();
                System.out.println("kết quả tìm kiếm");
                kt.timTao(mass);
            } else if (luachon == 3) {
                kt.inDanhSachTao();
            } else {

            }
        } while (luachon != 0);
    }
}
