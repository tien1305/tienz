/*
* created date: Oct 22, 2021
*author: tien
*/
package hoclaptrinh.Student;

import java.util.Calendar;

public class Student {

    public String name;
    public String code;
    public int birthday;
    public int age;

    // setter
    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCode() {
        this.code = "1234ed";
    }

    public void setCode(String str, int number) {
        this.code = str + number;
    }

    public void setCode(int number) {
        this.code = "HS" + number;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getBirthday() {
        return this.birthday;
    }

    public int getAge() {
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.YEAR) - this.getBirthday();

    }

    public void showInfo() {
        System.out.println("năm sinh \t:" + this.getBirthday());
        System.out.println("tuổi\t\t:" + this.getAge());
        System.out.println("lớp \t\t:" + this.getCode());
        System.out.println("tên \t\t:" + this.getName());
        System.out.println("---------------------------");
    }

}
