package KeThua.BaiTap;

public class Triangle extends Shape {
    private double side1 =1.0;
    private double side2 =1.0;
    private double side3 =1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double perimeter(){
        return (this.side1+this.side2+this.side3);
    }
    public double area(){
        double per = 0.5*this.perimeter();
        double hNumber3=2*Math.sqrt(per*(per-this.side1)*(per-this.side2)*(per-this.side3))/this.side3;
        return 0.5*this.side3*hNumber3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color=" + getColor() +
                (isFilled()?", filled":", not filled") +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", perimeter="+ perimeter() +
                ", area=" + area()+
                '}';
    }
}
