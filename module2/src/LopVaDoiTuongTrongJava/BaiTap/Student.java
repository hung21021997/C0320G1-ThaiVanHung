package LopVaDoiTuongTrongJava.BaiTap;

import java.util.Scanner;

public class BaiLamThem03Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.inputInfo();
        student.slowInfo();
        student.grantStudent();
    }
}
class Student{
    int studentCode;
    double mediumCode;
    int age;
    String classStudent;

    public Student() {
    }

    public Student(int studentCode, double mediumCode, int age, String classStudent) {
        this.studentCode = studentCode;
        this.mediumCode = mediumCode;
        this.age = age;
        this.classStudent = classStudent;
    }
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter studentCode: ");
            studentCode = Integer.parseInt(input.nextLine());
        } while (studentCode<10000000 || studentCode>99999999);
        do {
            System.out.println("Enter mediumCode: ");
            mediumCode = Double.parseDouble(input.nextLine());
        } while (mediumCode<0 || mediumCode>10);
        do {
            System.out.println("Enter age: ");
            age = Integer.parseInt(input.nextLine());
        } while (age<18);
        String str = "AC";
        char word1 = str.charAt(0);
        char word2 = str.charAt(1);
        do {
            System.out.println("Enter classStudent: ");
            classStudent = input.nextLine();
        }while (classStudent.charAt(0)!=word1 && classStudent.charAt(0)!=word2);

    }
    public void slowInfo(){
        System.out.println("Mã SV: " + studentCode + ", điểm TB: " + mediumCode + ", tuổi: " + age + ", lớp: " + classStudent);
    }
    public void grantStudent(){
        if (mediumCode>=8){
            System.out.println("Sinh viên được nhận học bổng.");
        } else {
            System.out.println("Sinh viên không được nhận học bổng.");
        }
    }
}