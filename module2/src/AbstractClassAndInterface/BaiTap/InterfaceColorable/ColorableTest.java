package AbstractClassAndInterface.BaiTap.InterfaceColorable;

public class ColorableTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square.howToColor();
        System.out.println(square);

        Square square1 = new Square(3.5);
        System.out.println(square1);

        Square square2 = new Square("blue", true, 3.6);
        System.out.println(square2);

        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(2.5);
        System.out.println(circle1);

        Circle circle2 = new Circle("yellow", true, 4.2);
        System.out.println(circle2);


        ShapeColorable[] shapes = new ShapeColorable[4];
        shapes[0] = new Square(3.5);
        System.out.println(square1.getArea());
        shapes[1]= new Square("blue", true, 3.6);
        System.out.println(square2.getArea());
        shapes[2] = new Circle(2.5);
        System.out.println(circle1.getArea());
        shapes[3] = new Circle("yellow", true, 4.2);
        System.out.println(circle2.getArea());

        for (ShapeColorable shape1: shapes){
            System.out.println(shape1);
        }
    }
}
