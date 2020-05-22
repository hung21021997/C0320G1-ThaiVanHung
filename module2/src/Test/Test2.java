package Test;

public class Test2 extends Test1 {
    private double length = 1.0;

    public Test2() {
    }

    public Test2(String color, boolean filled, double length) {
        super(color, filled);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double area(){
        return this.length*this.length;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "length=" + length +
                '}';
    }

    @Override
    public String showInfo() {
        return "color: " + this.getColor()+", filled: " + this.isFilled()+", độ dài: " + this.getLength() + ", diện tích: " + area();
    }
}
