/*
* creted date: Dec 31, 2021
* author: pdt
*/
package com.tienpd2008110294.cuoiky;

import java.text.DecimalFormat;
import java.text.ParseException;

public class dienMay extends HangHoa {
    public dienMay(String maHH,String tenHH, long Gia, int soLuong, String ngayNhapKho) throws ParseException {
        super("DM-" + maHH,tenHH, Gia, soLuong, ngayNhapKho);
    }
    
    DecimalFormat ft1 = new DecimalFormat("###,###,### VND");
    @Override
    public String toString() {
        String s ;
        s = super.toString() + String.format("%-15s|",ft1.format(tinhTien()));
        return s ;
    }
    
}