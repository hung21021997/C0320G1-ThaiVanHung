package LopVaDoiTuongTrongJava.BaiTap;

import java.util.Scanner;

public class Student {
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
            this.studentCode = Integer.parseInt(input.nextLine());
        } while (this.studentCode<10000000 || this.studentCode>99999999);
        do {
            System.out.println("Enter mediumCode: ");
            this.mediumCode = Double.parseDouble(input.nextLine());
        } while (this.mediumCode<0 || this.mediumCode>10);
        do {
            System.out.println("Enter age: ");
            this.age = Integer.parseInt(input.nextLine());
        } while (this.age<18);
        String str = "AC";
        char word1 = str.charAt(0);
        char word2 = str.charAt(1);
        do {
            System.out.println("Enter classStudent: ");
            this.classStudent = input.nextLine();
        }while (this.classStudent.charAt(0)!=word1 && this.classStudent.charAt(0)!=word2);

    }
    public void slowInfo(){
        System.out.println("Mã SV: " + this.studentCode + ", điểm TB: " + this.mediumCode + ", tuổi: " + this.age + ", lớp: " + this.classStudent);
    }
    public void grantStudent(){
        if (this.mediumCode>=8){
            System.out.println("Sinh viên được nhận học bổng.");
        } else {
            System.out.println("Sinh viên không được nhận học bổng.");
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.inputInfo();
        student.slowInfo();
        student.grantStudent();
    }
}
