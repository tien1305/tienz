/*
* created date: Nov 04, 2021
*author: tien
*/
package com.tienpd2008110294.kiemtragiuaky;

import java.util.List;

public class danhSachQuanLy extends Nguoi {
    private ArrayList<Object> list = new ArrayList<Object>();

    public void themNguoi(Object object) {
        list.add(object);
    }

    public void inList() {
        for (Object obj : list) {
            System.out.println(obj.toString());
        }

    }

}
