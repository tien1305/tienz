/*
* created date: Oct 25, 2021
*author: tien
*/
package com.tienpd2008110294.lab7;

public class Cat extends Animal {
    protected void makeNoise() {
        System.out.println("mèo méo meo mèo meo...");
    }

    protected void eat() {
        System.out.println("mèo ăn cá...");
    }

    protected void sleep() {
        System.out.println("con mèo đang ngủ");
    }

    protected void roam() {
        System.out.println("đi bắt chuột");
    }

    @Override
    protected void chaseButterfly() {
        super.chaseButterfly();
    }

    @Override
    protected void chaseCats() {
        // TODO Auto-generated method stub
        super.chaseCats();
    }
}