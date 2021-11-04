/*
* created date: Oct 26, 2021
*author: tien
*/
package hoclaptrinh.Student;

import java.util.ArrayList;

public class Apple {
    private int id;
    private int mass;
    private String colour;

    public Apple(int id, int mass, String colour) {
        this.id = id;
        this.mass = mass;
        this.colour = colour;
    }

    public int getId() {
        return id;
    }

    public int getMass() {
        return mass;
    }

    public String getColour() {
        return colour;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Apple" + "\n" + "id: " + id + "\n" + "mass: " + mass + "\n" + "colour: " + colour;
    }

    public void show() {
        System.out.println("id: " + this.id);
        System.out.println("mass:" + this.mass);
        System.out.println("colour:" + this.colour);
    }
}