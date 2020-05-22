package AbstractClassAndInterface.BaiTap;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

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
                "color= " + getColor() +
                ", filled= " + isFilled() +
                ", radius=" + radius +
                ", area= " + getArea() +
                ", perimeter= " + getPerimeter() +
                '}';
    }

    @Override
    public void resizeable(double size) {
        this.radius = this.radius*size;
    }
}
