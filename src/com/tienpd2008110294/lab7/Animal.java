/*
* created date: Oct 25, 2021
*author: tien
*/
package com.tienpd2008110294.lab7;

public class Animal {
    private static final String cho_bat_meo = "chó bắt mèo";
    private static final String meo_duoi_buom = "mèo đuổi bướm";
    String sound;

    private String picture;
    private String food;
    private int hunger;
    private String boundaries;
    private int location;

    protected void makeNoise() {
        System.out.println("phát ra tiếng kêu");
    }

    protected void eat() {
        System.out.println("ăn..");
    }

    protected void sleep() {
        System.out.println("ngủ..");
    }

    protected void roam() {
        System.out.println("đi lang thang.");
    }

    protected void chaseCats() {
        System.out.println(cho_bat_meo);
    }

    protected void chaseButterfly() {
        System.err.println(meo_duoi_buom);
    }
}
