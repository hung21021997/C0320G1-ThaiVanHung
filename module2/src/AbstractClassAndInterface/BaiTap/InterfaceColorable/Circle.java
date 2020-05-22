package AbstractClassAndInterface.BaiTap.InterfaceColorable;

public class Circle extends ShapeColorable implements Colorable {
    private double radius =1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return (this.radius+this.radius)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius= " + this.radius +
                ", color= " + this.getColor() +
                ", filled= " + this.isFilled() +
                ", area= " + getArea() +
                ", perimeter= " + getPerimeter() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Hình tròn :)");
    }
}
