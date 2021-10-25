/*
* created date: Oct 22, 2021
*author: tien
*/
package hoclaptrinh.Student;

public class Main {
    /*
     * public static void main(String[] args) { Student studentOne = new Student();
     * Student studentTwo = new Student();
     * 
     * studentOne.setBirthday(1994); studentOne.setName("tiến");
     * studentOne.setCode("krq121"); studentOne.showInfo();
     * 
     * studentTwo.birthday = 2001; studentTwo.code = "kt12t "; studentTwo.name =
     * "toàn"; studentTwo.showInfo();
     * 
     * }
     */
    public static void main(String[] args) {
        Student studentOne = new Student();
        // studentOne.setCode("2021");
        // studentOne.setCode("s007");
        // studentOne.setCode("bahk", 12345);
        studentOne.setCode(99);
        System.out.println("code:" + studentOne.getCode());
    }
}