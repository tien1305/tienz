/*
* creted date: Dec 31, 2021
* author: pdt
*/
package com.tienpd2008110294.cuoiky;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class HangHoa {
    private String maHH ;
    private String tenHH;
    private long Gia;
    private int soLuong;
    private Date ngayNhapKho;
    public HangHoa(String maHH , String tenHH , long Gia , int soLuong , String ngayNhapKho) throws ParseException {
        this.tenHH = tenHH ;
        this.Gia = Gia ;
        this.soLuong = soLuong;
        this.maHH = maHH;
        this.ngayNhapKho = chuyenChuoiSangNgay(ngayNhapKho);
        
    }
    public void setmaHH(String maHH) {
        this.maHH = maHH;
    }
    public String getmaHH() {
        return maHH;
    }
    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    } 
    public String getTenHH() {
        return tenHH;
    }
    public void setGia(long Gia) {
        this.Gia = Gia;
    }
    public long getGia() {
        return Gia;
    }
    public void setsoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public int getsoLuong() {
        return soLuong;
    }
    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    public Date getNgayNhapKho() {
        return ngayNhapKho;
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
	public static String chuyenNgaySangChuoi(Date date){
        String chuoiNgayViet = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        chuoiNgayViet =  simpleDateFormat.format(date);
        return chuoiNgayViet;

    }
    public long tinhTien(){
        return (long)(getsoLuong()*getGia());
    }
    DecimalFormat ft = new DecimalFormat("###,###,### VND");
    public String toString() {
		String s = "";
		s+=String.format("|%-8s|%-15s|%-10s|%-15s|%-15s|", getmaHH(),getTenHH(),getsoLuong(), ft.format(getGia()),chuyenNgaySangChuoi(getNgayNhapKho()));
		return s;
	}
    
}