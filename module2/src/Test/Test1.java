package Test;

public abstract class Test1 {
    private String color = "blue";
    private boolean filled = false;

    public Test1() {
    }

    public Test1(String color, boolean filled) {
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
    public abstract String showInfo();

    @Override
    public String toString() {
        return "Test1{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
