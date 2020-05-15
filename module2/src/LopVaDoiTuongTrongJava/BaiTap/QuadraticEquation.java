package LopVaDoiTuongTrongJava.BaiTap;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1: ");
        double number1 = Integer.parseInt(input.nextLine());
        System.out.println("Enter number2: ");
        double number2 = Integer.parseInt(input.nextLine());
        System.out.println("Enter number3: ");
        double number3 = Integer.parseInt(input.nextLine());
        QuadraticEquation equation = new QuadraticEquation(number1,number2,number3);
        if (equation.delta()>0){
            System.out.println("Root1 of the equation: " + equation.getRoot1());
            System.out.println("Root2 of the equation: " + equation.getRoot2());
        } else if(equation.delta()==0){
            System.out.println("Root of the equation: " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
class QuadraticEquation{
    private double number1, number2, number3;
    public QuadraticEquation (double number1, double number2, double number3){
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
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

    public double getNumber3() {
        return number3;
    }

    public void setNumber3(double number3) {
        this.number3 = number3;
    }

    public double delta(){
        return Math.pow(this.number2,2)-4*this.number1*this.number3;
    }
    public double getRoot1(){
        return (-number2-Math.sqrt(this.delta()))/(2*this.number1);
    }
    public double getRoot2(){
        return (-number2+Math.sqrt(this.delta()))/(2*this.number1);
    }
}
