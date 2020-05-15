package LopVaDoiTuongTrongJava.BaiTap;

import java.util.Scanner;

public class BaiLamThem05LopTamGiac {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.inputTriangle();
        System.out.println("Chu vi tam giác: " + triangle.perimeter());
        System.out.println("Diện tích tam giác: " + triangle.areaTriangle());
        triangle.styleTriangle();
    }
}
class Triangle{
    int number1, number2, number3;

    public Triangle() {
    }
    public void inputTriangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1: ");
        number1 = Integer.parseInt(input.nextLine());
        System.out.println("Enter number2: ");
        number2 = Integer.parseInt(input.nextLine());
        System.out.println("Enter number3: ");
        number3 = Integer.parseInt(input.nextLine());
    }
    public double perimeter(){
        return number1+number2+number3;
    }
    public double areaTriangle(){
        double per = 0.5*this.perimeter();
        double hNumber3=2*Math.sqrt(per*(per-number1)*(per-number2)*(per-number3))/number3;
        return 0.5*number3*hNumber3;
    }
    public void styleTriangle(){
        if (number1==number2 && number1==number3){
            System.out.println("Number1, number2, number3 tạo thành tam giác đều.");
        } else if(number1==number2 || number1==number3 || number2==number3){
            System.out.println("Number1, number2, number3 tạo thành tam giác cân.");
        } else if (number1*number1+number2*number2==number3*number3 || number1*number1+number3*number3==number2*number2 || number3*number3+number2*number2==number1*number1){
            System.out.println("Number1, number2, number3 tạo thành tam giác vuông.");
        } else {
            System.out.println("Number1, number2, number3 tạo thành tam giác thường.");
        }
    }
}