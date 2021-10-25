/*
* created date: Oct 25, 2021
*author: tien
*/
package com.tienpd2008110294.lab7;

public class Dog extends Animal {
    protected void makeNoise() {
        System.out.println("Gâu gâu ẳng ẳng ẳng ....");
    }

    protected void eat() {
        System.out.println("Chó đang ăn....");
    }

    protected void roam() {
        System.out.println("giữ nhà bắt chuột.");
    }

    @Override
    protected void chaseCats() {
        // TODO Auto-generated method stub
        super.chaseCats();
    }
}
