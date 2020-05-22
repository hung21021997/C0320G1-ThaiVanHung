package KeThua.BaiTap;

public class PointMoveable {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        Point point1 = new Point(3,5);
        System.out.println(point1);

        MoveAblePoint moveAblePoint = new MoveAblePoint();
        System.out.println(moveAblePoint);
        MoveAblePoint moveAblePoint1 = new  MoveAblePoint(3,5,7,9);
        System.out.println(moveAblePoint1);
    }
}
