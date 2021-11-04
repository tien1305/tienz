/*
* created date: Oct 30, 2021
*author: tien
*/
package com.tienpd2008110294.lab8;

public class SinhVien {
    private int diem;
    private int mssv;
    private String ten;
    private String hocluc;

    public int getDiem() {
        return diem;
    }

    public String getHocluc() {
        return hocluc;
    }

    public int getMssv() {
        return mssv;
    }

    public String getTen() {
        return ten;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    /*
     * public void showinfo() { System.out.println("tên     : " + this.getTen());
     * System.err.println("điểm    : " + this.getDiem());
     * System.out.println("mssv    : " + this.getMssv());
     * System.out.println("học lực : " + this.getHocluc()); }
     */

    public String toString() {
        return "SinhVienNhap{" + "mssv=" + mssv + ", ten='" + ten + ", điểm=" + diem + "," + ", hoc lực=" + hocluc + ""
                + "}";
    }

    // khởi tạo phương thức hiển thị theo format
    public void hienThiTT() {
        System.out.printf("%-10d %-10s %-10s %-10s \n", mssv, ten, diem, hocluc);
    }

}
