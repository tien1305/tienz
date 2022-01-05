/*
* creted date: Dec 31, 2021
* author: pdt
*/
package com.tienpd2008110294.cuoiky;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class quanLy {
    private static final int Comparator = 0;
    private ArrayList<HangHoa> danhSach ;
    private Scanner in = new Scanner(System.in);

    quanLy(){
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
            if(sp.getmaHH().equalsIgnoreCase(x.getmaHH()) || sp.getmaHH().equalsIgnoreCase("HTP-") ||sp.getmaHH().equalsIgnoreCase("HSS-") || sp.getmaHH().equalsIgnoreCase("HDM-") ){
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
				int soLuong = in.nextInt();
				System.out.print("Nhap don gia (vnd) : ");
				int donGia = in.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                in.nextLine();
				String ngayNK = in.nextLine();
				x = new thucPham( maHH, tenHH , donGia , soLuong , ngayNK );
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
				int soLuong = in.nextInt();
				System.out.print("Nhap don gia (vnd) : ");
				int donGia = in.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                in.nextLine();
				String ngayNK = in.nextLine();
				x = new sanhSu(maHH, tenHH, donGia , soLuong , ngayNK );
                hangHoaCoSan(x);
                break;
			}
			case 3 : {
				//HÀNG ĐIỆN TỬ
				System.out.println("\n\n\tNHAP THONG TIN HANG DIEN TU NHAP KHO");
                System.out.print("Nhap ma hang hoa : ");
				in.nextLine();
				String maHH = in.nextLine();
				System.out.print("Nhap ten hang hoa : ");
				String tenHH = in.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soLuong = in.nextInt();
				System.out.print("Nhap don gia (vnd) : ");
				int donGia = in.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                in.nextLine();
				String ngayNK = in.nextLine();            
				x = new dienMay(maHH, tenHH, donGia, soLuong,ngayNK) ;
				hangHoaCoSan(x);
                break;
			}
			default : break;
        } 
	}
    //CHỨC NĂNG SỬA HÀNG HÓA THÔNG QUA MÃ HÀ HÓA 
    public void suaHangHoa() throws ParseException{
        String maHH ;
        int count = 0;
        in.nextLine();//bắt dấu cách thừa nếu có
        System.out.print("Nhap ma hang hoa cua hang can sua (vd DM-123) : ");
        maHH = in.nextLine();
        for(int i = 0 ; i< danhSach.size();i++){
            HangHoa x = danhSach.get(i);
            if(x.getmaHH().equals(maHH)){
                if(x instanceof thucPham){
                    String[] maHh = maHH.split("-",2);
                    System.out.println("\n\n\tNHAP THONG TIN HANG THUC PHAM CAN SUA");
                    System.out.print("Nhap ten hang hoa : ");
                    String tenHH = in.nextLine();
                    System.out.print("Nhap so luong ton kho : ");
                    int soLuong = in.nextInt();
                    System.out.print("Nhap don gia (vnd) : ");
                    int donGia = in.nextInt();				
                    System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                    in.nextLine();
                    String ngayNK = in.nextLine();
                    HangHoa a = new thucPham( maHh[1], tenHH , donGia , soLuong , ngayNK );
                    danhSach.add(danhSach.indexOf(x),a);
                    danhSach.remove(x);
                }
                else if(x instanceof sanhSu){
                    String[] maHh = maHH.split("-",2);
                    System.out.println("\n\n\tNHAP THONG TIN HANG SANH SU CAN SUA"); 
                    System.out.print("Nhap ten hang hoa : ");
                    String tenHH = in.nextLine();
                    System.out.print("Nhap so luong ton kho : ");
                    int soLuong = in.nextInt();
                    System.out.print("Nhap don gia (vnd) : ");
                    int donGia = in.nextInt();				
                    System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                    in.nextLine();
                    String ngayNK = in.nextLine();
                    HangHoa a = new sanhSu(maHh[1], tenHH, donGia , soLuong , ngayNK );
                    danhSach.add(danhSach.indexOf(x),a);
                    danhSach.remove(x);
                }
                else if(x instanceof dienMay){
                    //HÀNG ĐIỆN TỬ
                    String[] maHh = maHH.split("-",2);
                    System.out.println("\n\n\tNHAP THONG TIN HANG DIEN TU CAN SUA");
                    System.out.print("Nhap ten hang hoa : ");
                    String tenHH = in.nextLine();
                    System.out.print("Nhap so luong ton kho : ");
                    int soLuong = in.nextInt();
                    System.out.print("Nhap don gia (vnd) : ");
                    int donGia = in.nextInt();				
                    System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                    in.nextLine();
                    String ngayNK = in.nextLine();
                    HangHoa a = new dienMay(maHh[1], tenHH , donGia , soLuong,ngayNK) ;
                    danhSach.add(danhSach.indexOf(x),a);
                    danhSach.remove(x);
                }
            }
            else count++;
        }
        if(count == danhSach.size()){
            System.out.println("Khong co ma hang " + maHH + " trong danh sach !!! Enter de nhap lai !!!");
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
            if(x.getmaHH().equals(maHH)){
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
    public void xuatThucPham(){
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
    public void xuatSanhSu(){
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
    public void xuatDienMay(){
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
    public void xuatThucPhamCoSan(HangHoa x){
		
        System.out.println();
        System.out.println(x);
        for (int i =0; i< 85; i++) {
			System.out.print("-");
		}
    }
    public void xuatSanhSuCoSan(HangHoa x){
		
        System.out.println();
        System.out.println(x);
        for (int i =0; i< 85; i++) {
			System.out.print("-");
		}
    }
    public void xuatDienMayCoSan(HangHoa x){
		
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
                xuatThucPhamCoSan(x);
            }
            else if(x instanceof sanhSu){
                xuatSanhSuCoSan(x);
            }
            else if(x instanceof dienMay){
                xuatDienMayCoSan(x);
            }
          
        }
    }
    //CÁC CHỨC NĂNG SẮP XẾP TĂNG DẦN GIẢM DẦN
    public void giamDanTheoGia(){
        Collections.sort(danhSach,new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if(o1.getGia() < o2.getGia()){
                    return 1 ;
                }
                else {
                    if(o1.getGia() == o2.getGia()){
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
                if(o1.getGia() < o2.getGia()){
                    return -1 ;
                }
                else {
                    if(o1.getGia() == o2.getGia()){
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
    public void timTheoLoai(){
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
					 xuatThucPham();
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
            xuatSanhSu();
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
            xuatDienMay();
            System.out.println();
					 break;
					}
		}
    }
    public void timTheoGia(){
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
                if(x.getGia() >= giaBatDau && x.getGia() <= giaKetThuc){
                    if(x instanceof thucPham){   
                        xuatThucPhamCoSan(x);
                    }
                    else if(x instanceof sanhSu){
                        xuatSanhSuCoSan(x);
                    }
                    else if(x instanceof dienMay){
                        xuatDienMayCoSan(x);
                    }
                }
            }System.out.println();
        }
        else{
            System.out.println("Vui long nhap lai !");
            timTheoGia();
        } 
    }
    public void timTheoNgay() throws ParseException{
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
                        xuatThucPhamCoSan(x);
                    }
                    else if(x instanceof sanhSu){
                        xuatSanhSuCoSan(x);
                    }
                    else if(x instanceof dienMay){
                        xuatDienMayCoSan(x);
                    }
                }
            }System.out.println();
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
            tongSoLuong += hangHoa.getsoLuong();
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
                tongSoLuongTP+=x.getsoLuong();
            }
            else if(x instanceof sanhSu){           
                tongSoLuongSS+=x.getsoLuong();
            }
            else if(x instanceof dienMay){              
                tongSoLuongDM+=x.getsoLuong();
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
                xuatThucPham();
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
                xuatSanhSu();
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
                xuatDienMay();
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
