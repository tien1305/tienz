/*
* creted date: Dec 08, 2021
* author: pdt
*/
package com.tienpd2008110294.kiemtracuoiky;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Date;


public class hangHoaList {
    private static final int Comparator = 0;
    private ArrayList<hangHoa>danhSach;
    private Scanner in = new Scanner(System.in);
    private Object loai;
    public hangHoaList(){   
        this.danhSach = new ArrayList<hangHoa>();  
    }
    public static int getComparator() {
        return Comparator;
    }
    public hangHoaList(ArrayList<hangHoa> danhSach){
        this.danhSach=danhSach;
    }
    public void dulieunhaptrc(hangHoa t) throws ParseException{
        int count = 0 ;
        for(int i = 0 ; i < danhSach.size() ; i++){
            hangHoa hh = danhSach.get(i);
            if(hh.getMaHH().equalsIgnoreCase(t.getMaHH()) || hh.getMaHH().equalsIgnoreCase("HTP-") ||hh.getMaHH().equalsIgnoreCase("HSS-") || hh.getMaHH().equalsIgnoreCase("HDM-") ){
                System.out.println("HANG HOA BI TRUNG !!!!  VUI LONG NHAP LAI !!!!");
                count++ ;
                themHangHoa();;
                break;
            }
        }
        if(count == 0){
        hangHoa.add(t);
        }     
    }
    void themHangHoa() {
    }
    // thêm hàng hóa vào danh sách
    public void themHangHoa(hangHoa t) throws ParseException {
        System.out.println(" 1.Hàng thực phẩm ");
        System.out.println(" 2.Hàng sành sứ  ");
        System.out.println(" 3.Hàng Điện máy ");
		System.out.println(" 0.Quay lai  ");
        System.out.print("Nhập lựa chọn: ");
    	int luaChon = in.nextInt();
        hangHoa hh;
        switch(luaChon){
            case 1 : {
				System.out.println("\n\tNHAP THONG TIN HANG THUC PHAM NHAP KHO");
                System.out.print("Nhập mã hàng hóa : ");
				in.nextLine();
				String maHH = in.nextLine();
				System.out.print("Nhập tên hàng hóa: ");
				String tenHH = in.nextLine();
				System.out.print("Nhập số lượng tồn kho: ");
				int soLuongTonKho = in.nextInt();
				System.out.print("Nhập đơn giá (vnd) : ");
				int donGia = in.nextInt();				
				System.out.print("Ngày nhập kho (dd/mm/yyyy) : ");
                in.nextLine();
				String ngayNK = in.nextLine();
                
				hh = new thucPham( maHH, tenHH , donGia , soLuongTonKho , ngayNK  );
				dulieunhaptrc(t);
                break;
            }
			case 2 : {
				System.out.println("\n\tNHAP THONG TIN HANG SANH SU NHAP KHO"); 
                System.out.print("Nhập mã hàng hóa: ");
				in.nextLine();
				String maHH = in.nextLine();
				System.out.print("Nhập tên hàng hóa : ");
				String tenHH = in.nextLine();
				System.out.print("Nhập số lượng tồn kho: ");
				int soLuongTonKho = in.nextInt();
				System.out.print("Nhập đơn giá (vnd) : ");
				int donGia = in.nextInt();				
				System.out.print("Ngày nhập kho (dd/mm/yyyy) : ");
                in.nextLine();
				String ngaynhapkho = in.nextLine();
				hh = new sanhSu(maHH, tenHH, donGia, soLuongTonKho, ngaynhapkho);
                dulieunhaptrc(t);;
                break;
			}
			case 3 : {
				System.out.println("\n\tNHAP THONG TIN HANG DIEN TU NHAP KHO");
                System.out.print("Nhap ma hang hoa : ");
				in.nextLine();
				String maHH = in.nextLine();
				System.out.print("Nhap ten hang hoa (khong dau) : ");
				String tenHH = in.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soluong = in.nextInt();
				System.out.print("Nhap don gia (vnd) : ");
				int Gia = in.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                in.nextLine();
				String ngaynhapkho = in.nextLine();
				hh = new dienmay(maHH, tenHH, Gia, soluong, ngaynhapkho) ;
				dulieunhaptrc(t);
                break;
			}
			default : break;
        } 
	}
    
    //in danh sach hàng hóa
    public void indanhsach(hangHoa t) throws ParseException {
        System.out.println("Danh sách hàng hóa: ");
        String Xuat = String.format("%s%10s%15s%20s%20s%20s", "Loại", "Mã","Tên hàng hóa","Gia","Số lượng", "Ngày nhập kho");
        System.out.println(Xuat);

        for (hangHoa hh: danhSach){
            String Xuat1 = String.format("%s%10d%15s%20d%20d%20s", hh.getLoai(), hh.getMaHH(),hh.getTenHH(),
            hh.getGia(),hh.getSoluong(), hh.getNgayNhapKho());
            System.out.println(Xuat1);
        }
        dulieunhaptrc(t);
    }
    //sua hang hoa
    public void suaHangHoa() throws ParseException{
        String MaHH ;
        int count = 0;
        in.nextLine();
        System.out.print("Nhap ma hang hoa cua hang can sua (vd 254) : ");
        MaHH = in.nextLine();
        for(int i = 0 ; i< danhSach.size();i++){
           hangHoa x = danhSach.get(i);
            if(x.getMaHH().equals(MaHH)){
                    MaHH.split("-",2);
                    System.out.println("\n\n\tNHAP THONG TIN HANG THUC PHAM CAN SUA");
                    System.out.print("Nhap ten hang hoa (khong dau) : ");
                    String TenHH =in.nextLine();
                    System.out.print("Nhap so luong ton kho : ");
                    int soluong =in.nextInt();
                    System.out.print("Nhap don gia (vnd) : ");
                    int Gia = in.nextInt();				
                    System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                    in.nextLine();
                    String ngayNhapKho = in.nextLine();
                    hangHoa hh =new hangHoa(MaHH, TenHH, Gia, soluong, ngayNhapKho);
                    danhSach.add(danhSach.indexOf(x),hh);
                    danhSach.remove(x);
            }
        }
            if(count == danhSach.size()){
            System.out.println("không có hàng hóa " + MaHH + " trong danh sách. vui lòng nhập lại");
            suaHangHoa();
        }
    }
    
    //xóa hàng hóa theo mã
    public void xoahanghoa(hangHoa hh) {
        int count = 0;
        in.nextLine();
        System.out.print("nhập mã hàng cần xóa : ");
		String maHH = in.nextLine();
		for(int i = 0 ; i <danhSach.size() ; i++){
            hangHoa x = danhSach.get(i);
            if(x.getMaHH().equals(maHH)){
                danhSach.remove(x);
                System.out.println("dã xóa hnagf hàng hóa " + maHH + " khoi danh sach ");
            }
            else count++;
        }
        if(count == danhSach.size()){
            System.out.println("không có mã hàng hóa " + maHH + " trong danh sách. vui lòng nhập lại");
            xoahanghoa(hh);
        }
        return;
    
    }
   // tìm hàng hóa theo loại
   public void timhanghoatheoloai() {
        for (hangHoa hangHoa : danhSach) {
            if(hangHoa.getLoai().indexOf(loai)>=0){
                System.out.println(hangHoa);
            }
        }
    }// tìm hàng hóa theo giá
    public void timhanghoatheogia() {
        System.out.println("Giá cần tìm từ: ");
		long giaBatDau = in.nextInt();
		System.out.println("đến: ");
		long giaKetThuc = in.nextInt();
        if(giaBatDau <= giaKetThuc){
            for(int i = 0 ; i < danhSach.size() ; i++){
                hangHoa x = danhSach.get(i);
                if(x.getGia() >= giaBatDau && x.getGia() <= giaKetThuc){
                  if ( x instanceof hangHoa) {
                        indanhsach();
                    }
                
                }
            }
        }else{
                System.out.println("không có hàng hóa. Vui lòng nhập lại");
                timhanghoatheogia();} 
        
    }// tìm hàng hóa theo ngày
    void indanhsach() {
    }
    public void timhanghoatheongay() throws ParseException {
        System.out.println("Tìm từ ngày: ");
		String ngayBatDau = in.nextLine();
		System.out.println(" đến ngày:");
		String ngayKetThuc = in.nextLine();
        if(chuyenChuoiSangNgay(ngayBatDau).compareTo(chuyenChuoiSangNgay(ngayKetThuc))<=0){
            System.out.println("các loại hàng nhập kho từ ngày" + ngayBatDau +" đến ngày " + ngayKetThuc + " la :");
            for(int i = 0 ; i<danhSach.size() ; i++){
                hangHoa x = danhSach.get(i);
                if(x.getNgaynhapkho().compareTo(chuyenChuoiSangNgay(ngayBatDau)) >= 0 && x.getNgaynhapkho().compareTo(chuyenChuoiSangNgay(ngayKetThuc))<=0  ){
                    if(x instanceof hangHoa){
                        indanhsach();
                    }
                }   
            }
        }
    }
    private Date chuyenChuoiSangNgay(String ngayBatDau) {
        return null;
    }

    // sắp xếp hàng hóa giảm dần theo giá
    public void sapxephhgiamdantg(){
        Collections.sort(this.danhSach, new Comparator<hangHoa>() {
            @Override
            public int compare(hangHoa hh1, hangHoa hh2) {
                if (hh1.getGia()<hh2.getGia()) {
                    return 1;
                }else if (hh1.getGia()==hh2.getGia()) {
                    return 0;
                } else {
                    return -1;
                }              
            }            
        });
    }
     // sắp xếp hàng hóa tăng dần theo giá
     public void sapxephhtangdantg(){
        Collections.sort(this.danhSach, new Comparator<hangHoa>() {
            @Override
            public int compare(hangHoa hh1, hangHoa hh2) {
                if (hh1.getGia()<hh2.getGia()) {
                    return -1;
                }else if (hh1.getGia()==hh2.getGia()) {
                    return 0;
                } else {
                    return 1;
                }              
            }            
        });
    }
    // sắp xếp hàng hóa giảm dần theo ngay
    public void sapxephhgiamdantn(int flag) {
        Collections.sort(this.danhSach,new Comparator<hangHoa>(){
            @Override
            public int compare(hangHoa hh1, hangHoa hh2) {
                if(hh1.getNgayNhapKho().compareTo(hh2.getNgayNhapKho()) < 0){
                    return 1 ;
                }
                else {
                    if(hh1.getNgayNhapKho().compareTo(hh2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return -1 ;
                    }
                }
            }
        });
    }// tăng dần theo ngày
    public void sapxephhtangdantn(int flag) {
        Collections.sort(this.danhSach,new Comparator<hangHoa>(){
            @Override
            public int compare(hangHoa hh1, hangHoa hh2) {
                if(hh1.getNgayNhapKho().compareTo(hh2.getNgayNhapKho()) < 0){
                    return -1 ;
                }
                else {
                    if(hh1.getNgayNhapKho().compareTo(hh2.getNgayNhapKho()) == 0){
                        return 0 ;
                    }
                    else {
                        return 1 ;
                    }
                }
            }
        });
    }
	 
}