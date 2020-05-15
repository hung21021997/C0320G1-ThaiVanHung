package LopVaDoiTuongTrongJava.ThucHanh;

import java.util.Scanner;

public class ClassRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = Integer.parseInt(input.nextLine());
        System.out.println("Enter the height:");
        double height = Integer.parseInt(input.nextLine());
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your rectangle " + rectangle.disPlay());
        System.out.println("Area of the rectangle" + rectangle.getArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());
    }
}
class Rectangle {
    double width, height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String disPlay(){
        return "Rectangle{"+"width "+width+", height "+height+"}";
    }
}
