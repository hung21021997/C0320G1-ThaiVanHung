package AbstractClassAndInterface.BaiTap;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return (this.length+this.width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color= " + getColor() +
                ", filled= " + isFilled() +
                ", width= " + width +
                ", length= " + length +
                ", area= " + getArea() +
                ", perimeter= " + getPerimeter() +
                '}';
    }

    @Override
    public void resizeable(double size) {
        this.width = this.width*size;
        this.length = this.length*size;
    }
}
