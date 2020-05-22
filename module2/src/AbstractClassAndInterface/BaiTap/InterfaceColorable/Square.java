package AbstractClassAndInterface.BaiTap.InterfaceColorable;

public class Square extends ShapeColorable implements Colorable {
    private double length = 1.0;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    public Square(String color, boolean filled, double length) {
        super(color, filled);
        this.length = length;
    }

    public double getArea(){
        return this.length*this.length;
    }
    public double getPerimeter(){
        return this.length*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length= " + this.length +
                ", color= " + getColor() +
                ", filled= " + isFilled() +
                ", area= " + getArea() +
                ", perimeter= " + getPerimeter() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Hình vuông :)");
    }
}
