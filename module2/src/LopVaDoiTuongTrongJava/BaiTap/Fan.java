package LopVaDoiTuongTrongJava.BaiTap;

public class ClassFan {
    public static void main(String[] args) {
        final byte slow = 1;
        final byte medium = 2;
        final byte fast = 3;
        Fan fan1 = new Fan();
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan1.setRadius(10);
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.setColor("blue");
        System.out.println(fan2.toString());
    }
}
class Fan{
    int speed;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public Fan() {
    }

    public String toString(){
        if (this.on == true){
            return "fan is on";
        } else {
         return "fan is off";
        }
    }

}
