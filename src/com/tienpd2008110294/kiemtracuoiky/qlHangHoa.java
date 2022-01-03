/*
* creted date: Dec 08, 2021
* author: pdt
*/
package com.tienpd2008110294.kiemtracuoiky;

import java.text.ParseException;
import java.util.Scanner;


public class qlHangHoa  {
    private static final int flag = 0;
    private static hangHoa hh;
   
    public static void main(String[] args) throws ParseException {
     Scanner in = new Scanner(System.in);

     hangHoaList hhl =new hangHoaList();
     hangHoa hh1 = new thucPham("100", "Rau Cai", 15000 ,1231, "22/11/2023");
     hangHoa hh2 = new thucPham("101", "Ca thu", 150000 ,893, "29/12/2022");
     hangHoa hh3 = new thucPham("102", "Thit Heo", 100000 ,562, "26/01/2021");
     hangHoa hh4 = new thucPham("103", "Thit Bo", 200000 ,747, "12/02/2020");
     hangHoa hh5 = new thucPham("104", "Ca ngu", 120000 ,903, "30/11/2019");
     hangHoa hh6 = new thucPham("105", "Rau Muong", 12000 ,2041, "13/04/2018");
     //************************************************************************************/
     //TẠO ĐỐI TƯỢNG HÀNG SÀNH SỨ
     //HangHoa x = new HangSanhSu(maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho)
     hangHoa hh7 = new sanhSu("100", "Chen Tra", 50000, 235, "20/11/2014");
     hangHoa hh8 = new sanhSu("101", "Chen Com", 55000, 940, "19/11/2012");
     hangHoa hh9 = new sanhSu("102", "Am Tra", 70000, 322, "20/02/2013");
     hangHoa hh10 = new sanhSu("103", "Muong Su", 45000, 446, "30/01/2011");
     hangHoa hh11 = new sanhSu("104", "Chen Su", 500000, 783, "21/12/2028");
     hangHoa hh12 = new sanhSu("105", "To Su", 700000, 621, "30/04/2010");
     hangHoa hh13 = new sanhSu("106", "Am Su", 800000, 1225, "20/12/2015");
     //************************************************************************************/
     //TẠO ĐỐI TƯỢNG HÀNG ĐIỆN MÁY
     //HangHoa x = new HangDienMay(maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho)
     hangHoa hh14 = new dienmay("100", "May Lanh", 10000000, 55,"20/11/2017");
     hangHoa hh15 = new dienmay("101", "May Giat", 15000000, 46,"23/03/2016");
     hangHoa hh16 = new dienmay("102", "May Say", 899000, 23,"17/07/2024");
     hangHoa hh17 = new dienmay("103", "May Xay Sinh To", 1299000, 39,"20/11/2027");
     hangHoa hh18 = new dienmay("104", "May Suoi", 2355000, 42,"16/12/2025");
     hangHoa hh19 = new dienmay("105", "May Quat", 490000, 15,"26/06/2009");
     hangHoa hh20 = new dienmay("106", "May Loc Nuoc", 12500000, 66,"15/05/2002");
     hhl.dulieunhaptrc(hh1);
     hhl.dulieunhaptrc(hh2);
     hhl.dulieunhaptrc(hh3);
     hhl.dulieunhaptrc(hh4);
     hhl.dulieunhaptrc(hh5);
     hhl.dulieunhaptrc(hh6);
     hhl.dulieunhaptrc(hh7);
     hhl.dulieunhaptrc(hh8);
     hhl.dulieunhaptrc(hh9);
     hhl.dulieunhaptrc(hh10);
     hhl.dulieunhaptrc(hh11);
     hhl.dulieunhaptrc(hh12);
     hhl.dulieunhaptrc(hh13);
     hhl.dulieunhaptrc(hh14);
     hhl.dulieunhaptrc(hh15);
     hhl.dulieunhaptrc(hh16);
     hhl.dulieunhaptrc(hh17);
     hhl.dulieunhaptrc(hh18);
     hhl.dulieunhaptrc(hh19);
     hhl.dulieunhaptrc(hh20);
     int luaChon=0;
     do {
          System.out.println("-------MENU--------");
          System.out.println("vui lòng chọn chúc năng: ");
          System.out.println(
            "1. Thêm hàng hóa. \n"
           +"2. Sửa hàng hóa \n"
           +"3. Xóa hàng hóa \n"
           +"4. Tìm kiếm hàng hóa theo loại \n"
           +"5. Tìm kiếm hàng hóa theo giá \n"
           +"6. Tìm kiếm hàng hóa theo ngày \n"
           +"7. Sắp xếp hàng hóa giảm dần theo giá \n"
           +"8. Sắp xếp hàng hóa tăng dần theo giá \n"
           +"9. Sắp xếp hàng hóa giảm dần theo ngày \n"
           +"10. Sắp xếp hàng hóa tăng dần theo ngày \n"
           +"11. Thống kê tổng số lượng hàng hóa\n" 
           +"12. Thống kê tổng số lượng nhập kho\n"
           +"13. Thống kê số lượng từng loại hàng \n"
           +"14. In danh sách ra màng hình \n"
           +"0. thoát khoải chương trình");   
      luaChon = in.nextInt();
      in.nextLine();
      if (luaChon==1) {//thêm hàng hóa
        hhl.themHangHoa(hh);;;  
      } else if (luaChon==2) {//sửa hàng hóa
        hhl.suaHangHoa();
      } else if (luaChon==3) {// xóa hàng hóa
        hhl.xoahanghoa(hh);       
      } else if (luaChon==4) {//tìm hàng hóa theo loại
        hhl.timhanghoatheoloai();;
      } else if (luaChon==5) {// tìm hàng hóa theo gia
        hhl.timhanghoatheogia();
      } else if (luaChon==6) {// tìm hàng hóa theo ngày
        hhl.timhanghoatheongay();
      } else if (luaChon==7) {//  giảm dần theo giá
        hhl.sapxephhgiamdantg();
        hhl.indanhsach();
      } else if (luaChon==8) {// tăng dần theo giá
        hhl.sapxephhtangdantg();;
        hhl.indanhsach();
      } else if (luaChon==9) {//giảm dần theo ngày
        hhl.sapxephhgiamdantn(flag);
        hhl.indanhsach();
      } else if (luaChon==10) { // tăng dần theo ngày
        hhl.sapxephhtangdantn(flag);
        hhl.indanhsach();
      } else if (luaChon==11) {
        
      } else if (luaChon==12) {
        
      } else if (luaChon==13) {
        
      } else if (luaChon==14) {//in danh sách hàng hóa
        hhl.indanhsach();
        
      } 
     } while (luaChon!=0);
}
}

