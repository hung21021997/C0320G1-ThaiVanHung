package KeThua.BaiTap;

public class CircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(5,"yellow");
        System.out.println(circle1);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(10,"blue",5);
        System.out.println(cylinder1);
    }
}
