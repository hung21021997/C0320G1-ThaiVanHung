package KeThua.ThucHanh;

public class Circle extends Shape {
    private double radius;

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
    @Override
    public String toString(){
        return "A circle with radius "
                + getRadius()
                +", which is a subclass 0f "
                + super.toString();
    }
}
