/*
* creted date: Dec 31, 2021
* author: pdt
*/
package com.tienpd2008110294.kiemtracuoiky;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class quanLi {
    private static final int Comparator = 0;
    private ArrayList<HangHoa> danhSach ;
    private Scanner in = new Scanner(System.in);

    quanLi(){
        danhSach = new ArrayList<HangHoa>(30);
    }
    public ArrayList<HangHoa> getList() {
        return danhSach;
    }

    //CHỨC NĂNG THÊM HÀNG HÓA TRỰC TIẾP
    public void hangHoaCoSan(HangHoa x) throws ParseException{
        int count = 0 ;
        for(int i = 0 ; i < danhSach.size() ; i++){
            HangHoa sp = danhSach.get(i);
            if(sp.getMaHang().equalsIgnoreCase(x.getMaHang()) || sp.getMaHang().equalsIgnoreCase("HTP-") ||sp.getMaHang().equalsIgnoreCase("HSS-") || sp.getMaHang().equalsIgnoreCase("HDM-") ){
                System.out.println("HANG HOA BI TRUNG !!!!  VUI LONG NHAP LAI !!!!");
                count++ ;
                themHangHoa();
                break;
            }
        }
        if(count == 0){
            danhSach.add(x);
        }
    }
    //CHỨC NĂNG THÊM HÀNG HÓA BẰNG DỮ LIỆU NHẬP TỪ BÀN PHÍM
    public void themHangHoa() throws ParseException {
        System.out.println("=============MENU=============");
        System.out.println("| 1.Hang thuc pham           |");
        System.out.println("| 2.Hang sanh su             |");
        System.out.println("| 3.Hang dien may            |");
		System.out.println("| 0.Quay lai                 |");
        System.out.println("=============MENU=============");
        System.out.print("Nhap lua chon loai hang hoa : ");
    	int luaChon = in.nextInt();
        HangHoa x;
        switch(luaChon){
            case 1 : {
				//HÀNG THỰC PHẨM
				System.out.println("\n\n\tNHAP THONG TIN HANG THUC PHAM NHAP KHO");
                System.out.print("Nhap ma hang hoa : ");
				in.nextLine();
				String maHH = in.nextLine();
				System.out.print("Nhap ten hang hoa (khong dau) : ");
				String tenHH = in.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soLuongTonKho = in.nextInt();
				System.out.print("Nhap don gia (vnd) : ");
				int donGia = in.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                in.nextLine();
				String ngayNK = in.nextLine();
				x = new thucPham( maHH, tenHH , donGia , soLuongTonKho , ngayNK );
				hangHoaCoSan(x);
                break;
            }
			case 2 : {
				//HÀNG SÀNH SỨ
				System.out.println("\n\n\tNHAP THONG TIN HANG SANH SU NHAP KHO"); 
                System.out.print("Nhap ma hang hoa : ");
				in.nextLine();
				String maHH = in.nextLine();
				System.out.print("Nhap ten hang hoa (khong dau) : ");
				String tenHH = in.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soLuongTonKho = in.nextInt();
				System.out.print("Nhap don gia (vnd) : ");
				int donGia = in.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                in.nextLine();
				String ngayNK = in.nextLine();
				x = new sanhSu(maHH, tenHH, donGia , soLuongTonKho , ngayNK );
                hangHoaCoSan(x);
                break;
			}
			case 3 : {
				//HÀNG ĐIỆN TỬ
				System.out.println("\n\n\tNHAP THONG TIN HANG DIEN TU NHAP KHO");
                System.out.print("Nhap ma hang hoa : ");
				in.nextLine();
				String maHH = in.nextLine();
				System.out.print("Nhap ten hang hoa (khong dau) : ");
				String tenHH = in.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soLuongTonKho = in.nextInt();
				System.out.print("Nhap don gia (vnd) : ");
				int donGia = in.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                in.nextLine();
				String ngayNK = in.nextLine();            
				x = new dienMay(maHH, tenHH, donGia, soLuongTonKho,ngayNK) ;
				hangHoaCoSan(x);
                break;
			}
			default : break;
        } 
	}
    //CHỨC NĂNG SỬA HÀNG HÓA THÔNG QUA MÃ HÀ HÓA 
    public void suaHangHoa() throws ParseException{
        String maHang ;
        int count = 0;
        in.nextLine();//bắt dấu cách thừa nếu có
        System.out.print("Nhap ma hang hoa cua hang can sua (vd DM-123) : ");
        maHang = in.nextLine();
        for(int i = 0 ; i< danhSach.size();i++){
            HangHoa x = danhSach.get(i);
            if(x.getMaHang().equals(maHang)){
                if(x instanceof thucPham){
                    String[] maHH = maHang.split("-",2);
                    System.out.println("\n\n\tNHAP THONG TIN HANG THUC PHAM CAN SUA");
                    System.out.print("Nhap ten hang hoa (khong dau) : ");
                    String tenHH = in.nextLine();
                    System.out.print("Nhap so luong ton kho : ");
                    int soLuongTonKho = in.nextInt();
                    System.out.print("Nhap don gia (vnd) : ");
                    int donGia = in.nextInt();				
                    System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                    in.nextLine();
                    String ngayNK = in.nextLine();
                    HangHoa a = new thucPham( maHH[1], tenHH , donGia , soLuongTonKho , ngayNK );
                    danhSach.add(danhSach.indexOf(x),a);
                    danhSach.remove(x);
                }
                else if(x instanceof sanhSu){
                    String[] maHH = maHang.split("-",2);
                    System.out.println("\n\n\tNHAP THONG TIN HANG SANH SU CAN SUA"); 
                    System.out.print("Nhap ten hang hoa(khong dau) : ");
                    String tenHH = in.nextLine();
                    System.out.print("Nhap so luong ton kho : ");
                    int soLuongTonKho = in.nextInt();
                    System.out.print("Nhap don gia (vnd) : ");
                    int donGia = in.nextInt();				
                    System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                    in.nextLine();
                    String ngayNK = in.nextLine();
                    HangHoa a = new sanhSu(maHH[1], tenHH, donGia , soLuongTonKho , ngayNK );
                    danhSach.add(danhSach.indexOf(x),a);
                    danhSach.remove(x);
                }
                else if(x instanceof dienMay){
                    //HÀNG ĐIỆN TỬ
                    String[] maHH = maHang.split("-",2);
                    System.out.println("\n\n\tNHAP THONG TIN HANG DIEN TU CAN SUA");
                    System.out.print("Nhap ten hang hoa(khong dau) : ");
                    String tenHH = in.nextLine();
                    System.out.print("Nhap so luong ton kho : ");
                    int soLuongTonKho = in.nextInt();
                    System.out.print("Nhap don gia (vnd) : ");
                    int donGia = in.nextInt();				
                    System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                    in.nextLine();
                    String ngayNK = in.nextLine();
                    HangHoa a = new dienMay(maHH[1], tenHH , donGia , soLuongTonKho,ngayNK) ;
                    danhSach.add(danhSach.indexOf(x),a);
                    danhSach.remove(x);
                }
            }
            else count++;
        }
        if(count == danhSach.size()){
            System.out.println("Khong co ma hang " + maHang + " trong danh sach !!! Enter de nhap lai !!!");
            suaHangHoa();
        }
    }
    //CHỨC NĂNG XÓA HÀNG HÓA THEO MÃ HÀNG
    public void xoaHangHoa(){
        int count = 0;
        in.nextLine();
        System.out.print("Nhap ma hang hoa can xoa (vd DM-123) : ");
		String maHH = in.nextLine();
		for(int i = 0 ; i <danhSach.size() ; i++){
            HangHoa x = danhSach.get(i);
            if(x.getMaHang().equals(maHH)){
                danhSach.remove(x);
                System.out.println("Da xoa hang hoa co ma " + maHH + " khoi danh sach !!!");
            }
            else count++;
        }
        if(count == danhSach.size()){
            System.out.println("Khong co ma hang " + maHH + " trong danh sach !!! Enter de nhap lai !!!");
            xoaHangHoa();
        }
    }
    //CÁC KIỂU XUẤT HÀNG HÓA
    public void xuatHangThucPham(){
        System.out.println();
        for (HangHoa hangHoa : danhSach) {
            if(hangHoa instanceof thucPham){
                System.out.println(hangHoa);
            }
        }
        for (int i =0; i< 85; i++) {
			System.out.print("-");
		}
    }
    public void xuatHangSanhSu(){
        System.out.println();
        for (HangHoa hangHoa : danhSach) {
            if(hangHoa instanceof sanhSu){
                System.out.println(hangHoa);
            }
        }
        for (int i =0; i< 85; i++) {
			System.out.print("-");
		}
    }
    public void xuatHangDienMay(){
        System.out.println();
        for (HangHoa hangHoa : danhSach) {
            if(hangHoa instanceof dienMay){
                System.out.println(hangHoa);
            }
        }
        for (int i =0; i< 85; i++) {
			System.out.print("-");
		}
    }
    public void xuatHangThucPhamTrucTiep(HangHoa x){
		
        System.out.println();
        System.out.println(x);
        for (int i =0; i< 85; i++) {
			System.out.print("-");
		}
    }
    public void xuatHangSanhSuTrucTiep(HangHoa x){
		
        System.out.println();
        System.out.println(x);
        for (int i =0; i< 85; i++) {
			System.out.print("-");
		}
    }
    public void xuatHangDienMayTrucTiep(HangHoa x){
		
        System.out.println();
        System.out.println(x);
        for (int i =0; i< 85; i++) {
			System.out.print("-");
		}
    }

    public void xuatTatCa(){
        for (int i =0; i< 85; i++) {
			System.out.print("-");
		}
        System.out.println();
        System.out.printf("|%-8s|%-15s|%-10s|%-15s|%-15s|%-15s|\n","Ma Hang","Ten Hang Hoa","So Luong ","Gia ","Ngay Nhap Kho","Tong gia tri");
       
        for (int i =0; i< 85; i++) {
			System.out.print("-");
		} for(int i = 0 ; i < danhSach.size() ; i++){
           HangHoa x = danhSach.get(i);
            if(x instanceof thucPham){
                xuatHangThucPhamTrucTiep(x);
            }
            else if(x instanceof sanhSu){
                xuatHangSanhSuTrucTiep(x);
            }
            else if(x instanceof dienMay){
                xuatHangDienMayTrucTiep(x);
            }
          
        }
    }
    //CÁC CHỨC NĂNG SẮP XẾP TĂNG DẦN GIẢM DẦN
    public void giamDanTheoGia(){
        Collections.sort(danhSach,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return 1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatTatCa();
        System.out.println();
    }
    public void tangDanTheoGia(){
        Collections.sort(danhSach,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGiaNhap() < o2.getGiaNhap()){
                    return -1 ;
                }
                else {
                    if(o1.getGiaNhap() == o2.getGiaNhap()){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
        xuatTatCa();
        System.out.println();
    }
    public void tangDanTheoNgay(){
        Collections.sort(danhSach,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().after(o2.getNgayNhapKho())){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhapKho().equals(o2.getNgayNhapKho())){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatTatCa();
        System.out.println();
    }
    public void giamDanTheoNgay(){
        Collections.sort(danhSach,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                    return 1 ;
                }
                else {
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
        xuatTatCa();
        System.out.println();

    }

    //CÁC CHỨC NĂNG TÌM KIẾM 
    public void timKiemTheoLoai(){
        int luaChon = 0;
        System.out.println("=========================");
		System.out.println("| 1. Hang thuc pham     |");
		System.out.println("| 2. Hang sanh su       |");
		System.out.println("| 3. Hang dien may      |");
		System.out.println("=========================");
		System.out.print("Nhap lua chon cua ban : ");
		luaChon = in.nextInt();
		switch(luaChon){
			case 1 :{System.out.println("CAC LOAI HANG THUC PHAM LA :");
            for (int i =0; i< 85; i++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.printf("|%-8s|%-15s|%-10s|%-15s|%-15s|%-15s|\n","Ma Hang","Ten Hang Hoa","So Luong ","Gia ","Ngay Nhap Kho","Tong gia tri");
            for (int i =0; i< 85; i++) {
                System.out.print("-");
            }
					 xuatHangThucPham();
                     System.out.println();
					 break;
					}
			case 2 :{System.out.println("CAC LOAI HANG SANH SU LA : ");
            for (int i =0; i< 85; i++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.printf("|%-8s|%-15s|%-10s|%-15s|%-15s|%-15s|\n","Ma Hang","Ten Hang Hoa","So Luong ","Gia ","Ngay Nhap Kho","Tong gia tri");
            for (int i =0; i< 85; i++) {
                System.out.print("-");
            }
            xuatHangSanhSu();
            System.out.println();

					 break;
					}
                    
			case 3 :{
                System.out.println("CAC LOAI HANG ĐIEN MAY LA :");
                for (int i =0; i< 85; i++) {
                System.out.print("-");
                }
               System.out.println();
                 System.out.printf("|%-8s|%-15s|%-10s|%-15s|%-15s|%-15s|\n","Ma Hang","Ten Hang Hoa","So Luong ","Gia ","Ngay Nhap Kho","Tong gia tri");
            for (int i =0; i< 85; i++) {
                System.out.print("-");
            }
            xuatHangDienMay();
            System.out.println();
					 break;
					}
		}
    }
    public void timKiemTheoGia(){
        System.out.println("Nhap khoang gia can tim kiem tu : ");
		long giaBatDau = in.nextInt();
		System.out.println(" den : ");
		long giaKetThuc = in.nextInt();
         for (int a =0; a< 85; a++) {
                            System.out.print("-");
                        }
                        System.out.println();
                        System.out.printf("|%-8s|%-15s|%-10s|%-15s|%-15s|%-15s|\n","Ma Hang","Ten Hang Hoa","So Luong ","Gia ","Ngay Nhap Kho","Tong gia tri");
                        for (int a =0; a< 85; a++) {
                            System.out.print("-");
                        }
        if(giaBatDau <= giaKetThuc){
            for(int i = 0 ; i < danhSach.size() ; i++){
                HangHoa x = danhSach.get(i);
                if(x.getGiaNhap() >= giaBatDau && x.getGiaNhap() <= giaKetThuc){
                    if(x instanceof thucPham){   
                        xuatHangThucPhamTrucTiep(x);
                    }
                    else if(x instanceof sanhSu){
                        xuatHangSanhSuTrucTiep(x);
                    }
                    else if(x instanceof dienMay){
                        xuatHangDienMayTrucTiep(x);
                    }
                }
            }
        }
        else{
            System.out.println("Vui long nhap lai !");
            timKiemTheoGia();
        } 
    }
    public void timKiemTheoNgay() throws ParseException{
        System.out.println("Nhap khoang thoi gian can tim kiem tu ngay (vd 13/05/2020): ");
		String ngayBatDau = in.nextLine();
		System.out.println(" den ngay :");
		String ngayKetThuc = in.nextLine();
        if(chuyenChuoiSangNgay(ngayBatDau).compareTo(chuyenChuoiSangNgay(ngayKetThuc))<=0){
            System.out.println("CAC LOAI HANG DA NHAP KHO TU NGAY " + ngayBatDau +" DEN NGAY " + ngayKetThuc + " LA :");
            for (int i =0; i< 85; i++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.printf("|%-8s|%-15s|%-10s|%-15s|%-15s|%-15s|\n","Ma Hang","Ten Hang Hoa","So Luong ","Gia ","Ngay Nhap Kho","Tong gia tri");
            for (int i =0; i< 85; i++) {
                System.out.print("-");
            }
            for(int i = 0 ; i<danhSach.size() ; i++){
                HangHoa x = danhSach.get(i);
                if(x.getNgayNhapKho().compareTo(chuyenChuoiSangNgay(ngayBatDau)) >= 0 && x.getNgayNhapKho().compareTo(chuyenChuoiSangNgay(ngayKetThuc))<=0  ){
                    if(x instanceof thucPham){
                        xuatHangThucPhamTrucTiep(x);
                    }
                    else if(x instanceof sanhSu){
                        xuatHangSanhSuTrucTiep(x);
                    }
                    else if(x instanceof dienMay){
                        xuatHangDienMayTrucTiep(x);
                    }
                }
            }
        }else {
            System.out.println("Vui long nhap lai !");
            timKiemTheoNgay();
        }
    }
    public static Date chuyenChuoiSangNgay(String chuoiNgay) throws ParseException{
        //ngày việt nam
        Date date;
        /**
         * dd: ngày
         * mm: tháng
         * yyyy: năm
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        date = simpleDateFormat.parse(chuoiNgay);
        return date;
    }
    DecimalFormat ft = new DecimalFormat("###,###,### VND");

    public void tongSoLuong(){
        long tongSoLuong = 0 ;
        for (HangHoa hangHoa : danhSach){
            tongSoLuong += hangHoa.getSoLuongTonKho();
        }
        
        for (int i =0; i< 85; i++) {
			System.out.print("-");
		}
		System.out.println();
        System.out.printf("|%-35s|%-47d|\n","Tong so luong",tongSoLuong);
        for (int i =0; i< 85; i++) {
			System.out.print("-");
		}
        System.out.println();
    }

    public void tongGiaHangHoa(){
        long tongChiPhi = 0;
        for (HangHoa hangHoa : danhSach) {
           
            tongChiPhi += hangHoa.tinhTien();
        }
        
        for (int i =0; i< 85; i++) {
			System.out.print("-");
		}
		
		System.out.println();
        System.out.printf("|%-35s|%-20s%-27s|\n","Tong chi phi"," ",ft.format(tongChiPhi));
        for (int i =0; i< 85; i++) {
			System.out.print("-");
		}
		System.out.println();

    }
    public void thongKeTheoLoaiHangHoa(){
        long tongSoLuongTP = 0;
        long tongSoLuongSS = 0;
        long tongSoLuongDM = 0;
        for(int i = 0 ; i < danhSach.size() ; i++){
            HangHoa x = danhSach.get(i);
            if(x instanceof thucPham){     
                tongSoLuongTP+=x.getSoLuongTonKho();
            }
            else if(x instanceof sanhSu){           
                tongSoLuongSS+=x.getSoLuongTonKho();
            }
            else if(x instanceof dienMay){              
                tongSoLuongDM+=x.getSoLuongTonKho();
            }
        }
        System.out.println("=============MENU=============");
        System.out.println("|        1.Thuc Pham         |");
        System.out.println("|        2.Sanh Su           |");
        System.out.println("|        3.Dien May          |");
		System.out.println("|        0.Quay lai          |");
        System.out.println("==============================");
        System.out.print("Nhap lua chon loai hang hoa : ");
    	int luaChon = in.nextInt();
        switch(luaChon){
            case 1 : {
                for (int i =0; i< 85; i++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.printf("|%-8s|%-15s|%-10s|%-15s|%-15s|%-15s|\n","Ma Hang","Ten Hang Hoa","So Luong ","Gia ","Ngay Nhap Kho","Tong gia tri");
                for (int i =0; i< 85; i++) {
                    System.out.print("-");
                }
                xuatHangThucPham();
                System.out.println();
                for (int i =0; i< 85; i++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.printf("|%-35s|%-47d|\n","Tong so luong",tongSoLuongTP);
                for (int i =0; i< 85; i++) {
                    System.out.print("-");
                }
                System.out.println();
                break;
            }
            case 2 : {
                for (int i =0; i< 85; i++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.printf("|%-8s|%-15s|%-10s|%-15s|%-15s|%-15s|\n","Ma Hang","Ten Hang Hoa","So Luong ","Gia ","Ngay Nhap Kho","Tong gia tri");
                for (int i =0; i< 85; i++) {
                    System.out.print("-");
                }
                xuatHangSanhSu();
                System.out.println();
                for (int i =0; i< 85; i++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.printf("|%-34s|%-47d|\n","Tong so luong",tongSoLuongSS);
                for (int i =0; i< 85; i++) {
                    System.out.print("-");
                }
                
                System.out.println();
                break;
            }
            case 3 : {
                for (int i =0; i< 85; i++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.printf("|%-8s|%-15s|%-10s|%-15s|%-15s|%-15s|\n","Ma Hang","Ten Hang Hoa","So Luong ","Gia ","Ngay Nhap Kho","Tong gia tri");
                for (int i =0; i< 85; i++) {
                    System.out.print("-");
                }
                xuatHangDienMay();
                System.out.println();
                for (int i =0; i< 85; i++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.printf("|%-35s|%-47d|\n","Tong so luong",tongSoLuongDM);
                for (int i =0; i< 85; i++) {
                    System.out.print("-");
                }
                
                System.out.println();
                break;

            }
        }
    }
}
