package AbstractClassAndInterface.BaiTap.InterfaceColorable;

public abstract class ShapeColorable {
    private String color ="blue";
    private boolean filled = false;

    public ShapeColorable() {
    }

    public abstract double getArea();
    public ShapeColorable(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "ShapeColorable{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
