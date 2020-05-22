package LopVaDoiTuongTrongJava.BaiTap;

import java.util.Scanner;

public class SoHoc {
    double number1, number2;

    public SoHoc(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public SoHoc(){

    }
    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        setNumber1(scanner.nextDouble());
        System.out.println("Enter number2: ");
        setNumber2(scanner.nextDouble());
    }
    public void printInfo(){
        System.out.println("Number1: " + number1 + ", number2: " + number2);
    }
    public double addition(){
        return this.number1+this.number2;
    }
    public double subtract(){
        return this.number1-this.number2;
    }
    public double multi(){
        return this.number1*this.number2;
    }
    public double division(){
        return this.number1/this.number2;
    }
    public static void main(String[] args) {

        SoHoc soHoc =new SoHoc();
        soHoc.inputInfo();
        soHoc.printInfo();
        System.out.println("Tổng 2 số: " + soHoc.addition());
        System.out.println("Hiệu 2 số: " + soHoc.subtract());
        System.out.println("Tích 2 số: " + soHoc.multi());
        System.out.println("Thương 2 số: " +soHoc.division());
    }
}