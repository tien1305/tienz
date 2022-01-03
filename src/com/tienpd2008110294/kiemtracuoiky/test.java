/*
* creted date: Jan 03, 2022
* author: pdt
*/
package com.tienpd2008110294.kiemtracuoiky;

import java.text.ParseException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws ParseException {
        int luaChon = 0;
        Scanner input = new Scanner(System.in);
        //TẠO DANH SÁCH L
        DanhSachQuanLi l = new DanhSachQuanLi();
        
        //THÊM 20 SẢN PHẨM VÀO DANH SÁCH L SP1->SP20
        l.themHangHoaTrucTiep(sp1);
        l.themHangHoaTrucTiep(sp2);
        l.themHangHoaTrucTiep(sp3);
        l.themHangHoaTrucTiep(sp4);
        l.themHangHoaTrucTiep(sp5);
        l.themHangHoaTrucTiep(sp6);
        l.themHangHoaTrucTiep(sp7);
        l.themHangHoaTrucTiep(sp8);
        l.themHangHoaTrucTiep(sp9);
        l.themHangHoaTrucTiep(sp10);
        l.themHangHoaTrucTiep(sp11);
        l.themHangHoaTrucTiep(sp12);
        l.themHangHoaTrucTiep(sp13);
        l.themHangHoaTrucTiep(sp14);
        l.themHangHoaTrucTiep(sp15);
        l.themHangHoaTrucTiep(sp16);
        l.themHangHoaTrucTiep(sp17);
        l.themHangHoaTrucTiep(sp18);
        l.themHangHoaTrucTiep(sp19);
        l.themHangHoaTrucTiep(sp20);
        //l.xoaHangHoa();
        //l.xuatHangThucPham();
        //l.xuatHangSanhSu();
        //l.xuatHangDienMay();
        //l.suaHangHoa();
        //l.xuatHangDienMay();
        //l.timKiemTheoNgay();
        //l.timKiemTheoGia();
        //l.sapXepHangHoaGiamDanTheoGia();
        //l.xuatTatCa();
        //l.sapXepHangHoaTangDanTheoGia();
        //l.xuatTatCa();
        //l.sapXepHangHoaTangDanTheoNgay();
        //l.xuatTatCa();
        //l.sapXepHangHoaGiamDanTheoNgay();
        //l.xuatTatCa();
        //l.SapXepTangDanTheoLoaiVaTheoNgayNhap();
        //l.SapXepTangDanTheoLoaiVaTheoGia();
        //l.SapXepGiamDanTheoLoaiVaTheoNgayNhap();
        //l.SapXepGiamDanTheoLoaiVaTheoGia();
        //l.thongKeTongHangHoa();
        //************************************************************************************/
        //MENU TỔNG
        System.out.println("_______________________________________________");
        System.out.println("||                                           ||");
        System.out.println("||   TEN SINH VIEN : TRAN QUOC KHANH         ||");
        System.out.println("||   MSSV : 2008110082                       ||");
        System.out.println("||   MON : LAP TRINH HUONG DOI TUONG         ||");
        System.out.println("||   GIAO VIEN HUONG DAN : T.LE HUYNH PHUOC  ||");
        System.out.println("||        TRUONG DAI HOC GIA DINH            ||");
        System.out.println("||___________________________________________||");
		while(luaChon != 6){
            System.out.println("===================MENU======================");
            System.out.println("|          1.Thao tac voi hang hoa :        |");
            System.out.println("|               1.1 Them                    |");
            System.out.println("|               1.2 Sua                     |");
            System.out.println("|               1.3 Xoa                     |");
            System.out.println("|          2.Tim kiem theo :                |");
            System.out.println("|               2.1 Loai                    |");
            System.out.println("|               2.2 Ngay nhap               |");
            System.out.println("|               2.3 Gia                     |");
            System.out.println("|               2.4 Gia tri cao nhat        |");
            System.out.println("|               2.5 Tong gia tri cao nhat   |");
            System.out.println("|               2.6 Gia tri thap nhat       |");
            System.out.println("|               2.7 Tong gia tri thap nhat  |");
            System.out.println("|          3.Sap xep tang dan theo :        |");
            System.out.println("|               3.1 Gia nhap                |");
            System.out.println("|               3.2 Ngay nhap               |");
            System.out.println("|               3.3 Loai va ngay nhap       |");
            System.out.println("|               3.4 Loai va gia nhap        |");
            System.out.println("|          4.Sap xep giam dan theo :        |");
            System.out.println("|               4.1 Gia nhap                |");
            System.out.println("|               4.2 Ngay nhap               |");
            System.out.println("|               4.3 Loai va ngay nhap       |");
            System.out.println("|               4.4 Loai va gia nhap        |");
            System.out.println("|          5.Thong ke :                     |");
            System.out.println("|               5.1 Thong ke theo loai      |");
            System.out.println("|               5.2 Thong ke tat ca hang    |");
            System.out.println("|          0.Thoat chuong trinh             |");
            System.out.println("===================MENU======================\n\n\n");
            System.out.print("Nhap lua chon cua ban : ");
            luaChon = input.nextInt();
            switch(luaChon){
                case 1 : {
                    //MENU THÊM SỬ XÓA HÀNG HÓA (CÁC THÔNG TIN ĐƯỢC NHẬP TỪ BÀN PHÍM)
                    System.out.println("==========MENU===========");
                    System.out.println("| 1.1 Them hang hoa     |");
                    System.out.println("| 1.2 Sua hang hoa      |");
                    System.out.println("| 1.3 Xoa hang hoa      |");
                    System.out.println("| 0.  Thoat             |");
                    System.out.println("=========================");
                    System.out.print("Nhap lua chon cua ban : ");
                    luaChon = input.nextInt();
                    input.nextLine();
                    switch(luaChon){
                        case 1 : l.themHangHoa();break;
                        case 2 : l.suaHangHoa();break;
                        case 3 : l.xoaHangHoa();break;
                        default : break;
                    }
                    break;
                }
                case 2 : {
                    //MENU TÌM KIẾM HÀNG HÓA THEO LOẠI , KHOẢNG NGÀY , KHOẢNG GIÁ
                    System.out.println("=============MENU==============");
                    System.out.println("| 2.1 Tim kiem theo loai      |");
                    System.out.println("| 2.2 Tim kiem theo ngay nhap |");
                    System.out.println("| 2.3 Tim kiem theo gia       |");
                    System.out.println("| 2.4 Gia tri cao nhat        |");
                    System.out.println("| 2.5 Tong gia tri cao nhat   |");
                    System.out.println("| 2.6 Gia tri thap nhat       |");
                    System.out.println("| 2.7 Tong gia tri thap nhat  |");
                    System.out.println("| 0.  Thoat                   |");
                    System.out.println("===============================");
                    System.out.print("Nhap lua chon cua ban : ");
                    luaChon = input.nextInt();
                    switch(luaChon){
                        case 1 : l.timKiemTheoLoai();break;
                        case 2 : l.timKiemTheoNgay();break;
                        case 3 : l.timKiemTheoGia();break;
                        case 4 : l.timKiemSanPhamGiaTriCao();break;
                        case 5 : l.timKiemSanPhamTongGiaTriCaoNhat();break;
                        case 6 : l.timKiemSanPhamGiaTriThapNhat();break;
                        case 7 : l.timKiemSanPhamTongGiaTriThapNhat();break;
                        default : break;
                    }
                    break;
                }
                case 3 : {
                    //MENU SẮP XẾP HÀNG HÓA TĂNG DẦN THEO GIÁ NHẬP , NGÀY NHẬP , THEO LOẠI VÀ NGÀY NHẬP , THEO LOẠI VÀ GIÁ NHẬP
                    System.out.println("===================MENU=======================");
                    System.out.println("| 3.Sap xep tang dan theo :                  |");
                    System.out.println("|    3.1 Gia nhap                            |");
                    System.out.println("|    3.2 Ngay nhap                           |");
                    System.out.println("|    3.3 Loai va ngay nhap                   |");
                    System.out.println("|    3.4 Loai va gia nhap                    |");
                    System.out.println("|    0.  Thoat                               |");
                    System.out.println("==============================================");
                    System.out.print("Nhap lua chon cua ban : ");
                    luaChon = input.nextInt();
                    switch(luaChon){
                        case 1 : l.sapXepHangHoaTangDanTheoGia();break;
                        case 2 : l.sapXepHangHoaTangDanTheoNgay();break;
                        case 3 : l.SapXepTangDanTheoLoaiVaTheoNgayNhap();break;
                        case 4 : l.SapXepTangDanTheoLoaiVaTheoGia();break;
                        default : break;
                    }
                    break;
                }
                case 4 : {
                    //MENU SẮP XẾP HÀNG HÓA GIẢM DẦN THEO GIÁ NHẬP , NGÀY NHẬP , THEO LOẠI VÀ NGÀY NHẬP , THEO LOẠI VÀ GIÁ NHẬP
                    System.out.println("====================MENU======================");
                    System.out.println("| 4.Sap xep giam dan theo :                  |");
                    System.out.println("|    4.1 Gia nhap                            |");
                    System.out.println("|    4.2 Ngay nhap                           |");
                    System.out.println("|    4.3 Loai va ngay nhap                   |");
                    System.out.println("|    4.4 Loai va gia nhap                    |");
                    System.out.println("|    0.  Thoat                               |");
                    System.out.println("==============================================");
                    System.out.print("Nhap lua chon cua ban : ");
                    luaChon = input.nextInt();
                    switch(luaChon){
                        case 1 : l.sapXepHangHoaGiamDanTheoGia();break;
                        case 2 : l.sapXepHangHoaGiamDanTheoNgay();break;
                        case 3 : l.SapXepGiamDanTheoLoaiVaTheoNgayNhap();break;
                        case 4 : l.SapXepGiamDanTheoLoaiVaTheoGia();break;
                        default : break;
                    }
                    break;
                }
                case 5 : {
                System.out.println("==========MENU=============");
                System.out.println("| 5.1 Thong ke theo loai  |");
                System.out.println("| 5.2 Thong ke tat ca     |");
                System.out.println("| 0.  Thoat               |");
                System.out.println("===========================");
                System.out.print("Nhap lua chon cua ban : ");
                luaChon = input.nextInt();
                switch(luaChon){
                    case 1 : l.thongKeTheoLoaiHangHoa();break;
                    case 2 : l.thongKeTongHangHoa();break;
                    default : break;
                } 
                };break;
                default : break;
                
            }
            
        }
    }
}

