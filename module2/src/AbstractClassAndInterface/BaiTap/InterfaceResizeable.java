package AbstractClassAndInterface.BaiTap;

public class InterfaceResizeable {
    public static void main(String[] args) {
        double size = Math.random() * 100;

        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("red", false);
        System.out.println(shape1);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        Rectangle rectangle1 = new Rectangle("yellow", true, 3.5, 4.2);
        System.out.println(rectangle1);
        rectangle1.resizeable(size);
        System.out.println(rectangle1);

        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle("blue", false, 5.2);
        System.out.println(circle1);
        circle1.resizeable(size);
        System.out.println(circle1);

        Square square = new Square();
        System.out.println(square);
        Square square1 = new Square("black", true, 3.8, 3.8);
        System.out.println(square1);
        square1.resizeable(size);
        System.out.println(square1);

    }
}
