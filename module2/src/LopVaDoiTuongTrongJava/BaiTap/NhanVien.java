package LopVaDoiTuongTrongJava.BaiTap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NhanVien {
    String name;
    int age;
    String address;
    double salary;
    double officeHours;

    public NhanVien(){

    }

    public NhanVien(String name, int age, String address, double salary, double officeHours) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.officeHours = officeHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên: ");
        System.out.println("Enter name: ");
        setName(input.nextLine());
        System.out.println("Enter age: ");
        setAge(Integer.parseInt(input.nextLine()));
        System.out.println("Enter address: ");
        setAddress(input.nextLine());
        System.out.println("Enter salary: ");
        setSalary(Double.parseDouble(input.nextLine()));
        System.out.println("Enter officeHours: ");
        setOfficeHours(input.nextDouble());
    }
    public void printInfo(){
        System.out.println("Tên: " + name + ", tuổi: " + age + ", địa chỉ: " + address + ", lương: " + salary + ", thời gian làm việc: " + officeHours );
    }
    public double tinhThuong(){
        if(officeHours>=200){
            return salary*0.2;
        } else if(officeHours>=100){
            return salary*0.1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.inputInfo();
        nhanVien.printInfo();
        System.out.println("Lương thưởng nhân viên: " + nhanVien.tinhThuong());
    }

}
