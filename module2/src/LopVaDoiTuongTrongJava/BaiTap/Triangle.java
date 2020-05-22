package LopVaDoiTuongTrongJava.BaiTap;

import java.util.Scanner;

public class Triangle {
    private int number1;
    private int number2;
    private int number3;

    public Triangle() {
    }

    public Triangle(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public void inputTriangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1: ");
        this.number1 = Integer.parseInt(input.nextLine());
        System.out.println("Enter number2: ");
        this.number2 = Integer.parseInt(input.nextLine());
        System.out.println("Enter number3: ");
        this.number3 = Integer.parseInt(input.nextLine());
    }
    public double perimeter(){
        return this.number1+this.number2+this.number3;
    }
    public double areaTriangle(){
        double per = 0.5*this.perimeter();
        double hNumber3=2*Math.sqrt(per*(per-number1)*(per-number2)*(per-number3))/number3;
        return 0.5*this.number3*hNumber3;
    }
    public void styleTriangle(){
        if (this.number1==this.number2 && this.number1==this.number3){
            System.out.println("Number1, number2, number3 tạo thành tam giác đều.");
        } else if(this.number1==this.number2 || this.number1==this.number3 || this.number2==this.number3){
            System.out.println("Number1, number2, number3 tạo thành tam giác cân.");
        } else if (this.number1*this.number1+this.number2*this.number2==this.number3*this.number3 || this.number1*this.number1+this.number3*this.number3==this.number2*this.number2 || this.number3*this.number3+this.number2*this.number2==this.number1*this.number1){
            System.out.println("Number1, number2, number3 tạo thành tam giác vuông.");
        } else {
            System.out.println("Number1, number2, number3 tạo thành tam giác thường.");
        }
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.inputTriangle();
        System.out.println("Chu vi tam giác: " + triangle.perimeter());
        System.out.println("Diện tích tam giác: " + triangle.areaTriangle());
        triangle.styleTriangle();
    }
}