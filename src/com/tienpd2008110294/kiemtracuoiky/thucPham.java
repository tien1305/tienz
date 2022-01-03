/*
* creted date: Dec 08, 2021
* author: pdt
*/
package com.tienpd2008110294.kiemtracuoiky;

import java.text.ParseException;
import java.text.DecimalFormat;

public class thucPham extends hangHoa{
    
    public thucPham(String MaHH,String TenHH, long Gia, int soluong, String ngayNhapKho ) throws ParseException {
        super("điện máy" + MaHH,TenHH,Gia,soluong, ngayNhapKho);  
    }
    
    DecimalFormat ft1 = new DecimalFormat("###,###,### VND");
    @Override
    public String toString() {
        String s ;
        s = super.toString() + String.format("%-20s|",ft1.format(tongtien()));
        return s ;
    }
}
