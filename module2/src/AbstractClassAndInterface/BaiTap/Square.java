package AbstractClassAndInterface.BaiTap;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "color= " + getColor() +
                ", filled= " + isFilled() +
                ", area= " + getArea() +
                ", perimeter= " + getPerimeter() +
                "}";
    }
}
