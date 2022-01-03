/*
* creted date: Dec 31, 2021
* author: pdt
*/
package com.tienpd2008110294.kiemtracuoiky;

import java.text.DecimalFormat;
import java.text.ParseException;

public class thucPham extends HangHoa {
    public thucPham(String maHang, String tenHangHoa, long giaNhap, int soLuongTonKho, String ngayNhapKho )throws ParseException {
        super("TP-" + maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho);
    }
    
    DecimalFormat ft = new DecimalFormat("###,###,### VND");
    @Override
    public String toString() {
        String s ;
        s = super.toString() + String.format( "%-15s|" , ft.format(tinhTien()));
        return s;
    }

    
}