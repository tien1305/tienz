/*
* created date: Oct 13, 2021
*author: tien
*/
package baitaplaptrinh.tuan5;

public class testt {

import java.util.Scanner;

public class Book {

public class book{
    double giaBan;
    String nhaXuatBan;
    String tenSach;
    int namXuatban;
    int soLuong;
    String loaiSach;
    Scanner input = new Scanner(System.in);
    book(){
        
    }
    void nhapThongTinSach(){
        System.out.print("Nhập tên sách : ");
        tenSach = input.nextLine();
        System.out.print("Nhập loại sách : ");
        loaiSach = input.nextLine();
        System.out.print("Nhập tên nhà xuất bản của sách : ");
        nhaXuatBan = input.nextLine();
        System.out.print("Nhập năm xuất bản của sách : ");
        namXuatban = input.nextInt();
        System.out.print("Nhập số lượng sách : ");
        soLuong = input.nextInt();
        System.out.print("Nhập giá sách :");
        giaBan = input.nextFloat();
    }
    void xuatThongTinSach(){
        System.out.println("Tên sách : " + tenSach);
        System.out.println("Loại sách : " + loaiSach);
        System.out.println("Tên nhà xuất bản của sách : " + nhaXuatBan);
        System.out.println("Năm xuất bản của sách : " + namXuatban);
        System.out.println("Số lượng sách : " + soLuong);
        System.out.println("Giá sách :" + giaBan);
    }
}
