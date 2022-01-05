/*
* creted date: Jan 03, 2022
* author: pdt
*/
package com.tienpd2008110294.cuoiky;

import java.text.ParseException;
import java.util.Scanner;

public class main {
     
    public static void main(String[] args) throws ParseException {
        int luachon =0;
        Scanner in = new Scanner(System.in);
        quanLy ql = new quanLy();
      //  (mã hàng hóa:tên hàng hóa:gia:số lượng:ngay nhập)
        HangHoa hh1 = new dienMay("110", "May Quat", 290000, 35, "13/12/2017");
        HangHoa hh2 = new dienMay("111", "Dieu Hoa", 9000000, 23, "10/11/2018");
        HangHoa hh3 = new dienMay("112", "May Hut Bui", 3500000, 18, "25/06/2020");
        HangHoa hh4 = new dienMay("113","TiVi", 10000000, 35, "13/08/2017");
        HangHoa hh5 = new dienMay("114","may Giac", 7000000, 35, "17/01/2019");
        HangHoa hh6 = new dienMay("115","Tu Lanh", 290000, 35, "13/12/2017");

        HangHoa hh7 = new sanhSu("210", "Am Tra", 150000, 50, "14/02/2015");
        HangHoa hh8 = new sanhSu("211", "Chen Tra", 30000, 250, "14/02/2015");
        HangHoa hh9 = new sanhSu("212", "Bat com",  50000, 100, "07/07/2016");
        HangHoa hh10 = new sanhSu("213", "Lo Hoa",  100000, 60, "30/03/2016");
        HangHoa hh11 = new sanhSu("214", "Ly",  50000, 100, "07/07/2016");
        HangHoa hh12 = new sanhSu("215", "Bat com",  50000, 100, "07/07/2016");

        HangHoa hh13 = new thucPham("310", "ca chua", 18000, 157, "13/12/2020");
        HangHoa hh14 = new thucPham("311", "ca rot", 35000, 143, "13/12/2020");
        HangHoa hh15 = new thucPham("312", "Thit Ga", 80000, 38, "13/12/2020");
        HangHoa hh16 = new thucPham("313", "Thit Lon", 100000, 40, "13/12/2020");
        HangHoa hh17 = new thucPham("314", "Thit Bo", 250000, 25, "13/12/2020");
        HangHoa hh18 = new thucPham("315", "Rau Muong", 15000, 90, "13/12/2020");
        HangHoa hh19 = new thucPham("316", "Ca Xay", 65000, 70, "13/12/2020");
        HangHoa hh20 = new thucPham("317", "Tao", 25000, 135, "13/12/2020");

        ql.hangHoaCoSan(hh1);
        ql.hangHoaCoSan(hh2);
        ql.hangHoaCoSan(hh3);
        ql.hangHoaCoSan(hh4);
        ql.hangHoaCoSan(hh5);
        ql.hangHoaCoSan(hh6);
        ql.hangHoaCoSan(hh7);
        ql.hangHoaCoSan(hh8);
        ql.hangHoaCoSan(hh9);
        ql.hangHoaCoSan(hh10);
        ql.hangHoaCoSan(hh11);
        ql.hangHoaCoSan(hh12);
        ql.hangHoaCoSan(hh13);
        ql.hangHoaCoSan(hh14);
        ql.hangHoaCoSan(hh15);
        ql.hangHoaCoSan(hh16);
        ql.hangHoaCoSan(hh17);
        ql.hangHoaCoSan(hh18);
        ql.hangHoaCoSan(hh19);
        ql.hangHoaCoSan(hh20);
        
        System.out.println("**************************************************");
        System.out.println("|                                                |");
        System.out.println("|            TRUONG DAI HOC GIA DINH             |");
        System.out.println("|           Ho va ten: PHAM DUC TIEN             |");
        System.out.println("|                Mssv: 2008110294                |");
        System.out.println("|        Giang vien huong dan: LE HUYNH PHUOC    |");
        System.out.println("|                                                |");
        System.out.println("**************************************************");
        do {
            System.out.println("===================MENU======================");
            System.out.println("|                                           |");
            System.out.println("|        1.Them hang hoa                    |");
            System.out.println("|        2.Sua Hang Hoa                     |");
            System.out.println("|        3.Xoa Hang Hoa                     |");
            System.out.println("|        4.Tim kiem theo loai               |");
            System.out.println("|        5.Tim kiem theo gia                |");
            System.out.println("|        6.Tim kiem theo ngay               |");
            System.out.println("|        7.Sap xep tang dan theo ngay       |");
            System.out.println("|        8.Sap xep giam dan theo ngay       |");
            System.out.println("|        9.Sap xep tang dan theo gia        |");
            System.out.println("|        10.Sap xep giam dan theo gia       |");
            System.out.println("|        11.Thong ke tung loai hang         |");
            System.out.println("|        12.Tong so luong hang hoa          |");
            System.out.println("|        13.Tong gia hang hoa               |");
            System.out.println("|        0. Thoat chuong trinh              |");
            System.out.println("|                                           |");
            System.out.println("=============================================");
            System.out.println("\nNhap lua chon: ");
            luachon = in.nextInt();
            switch(luachon){
                case 1: ql.themHangHoa();break;
                case 2: ql.suaHangHoa();break;
                case 3: ql.xoaHangHoa();break;
                case 4: ql.timTheoLoai();break;
                case 5: ql.timTheoGia();break;
                case 6: ql.timTheoNgay();break;
                case 7: ql.tangDanTheoNgay();break;
                case 8: ql.giamDanTheoNgay();;break;
                case 9: ql.tangDanTheoGia();break;
                case 10:ql.giamDanTheoGia();break;
                case 11:ql.thongKeTheoLoaiHangHoa();break;
                case 12:ql.tongSoLuong();break;
                case 13:ql.tongGiaHangHoa();break;
                default : break;
            } 
        } while (luachon !=0); 
        
    }
}
