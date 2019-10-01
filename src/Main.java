public class Main {
    public static void main(String[] args) {
        Point point = new Point(3.55335f , 8.8766f);
        System.out.println(point.toString());
        point.setX(9.2134f);
        point.setY(12.4342f);
        System.out.println(point.toString());

        point.setXY(8.88888f , 9.99999f);
        System.out.println(point.toString() +'\n');

        MoveablePoint movable = new MoveablePoint(1,1,1,1);
        System.out.println(movable.toString());
        movable.setXY(2 ,2);
        movable.setSpeed(2,2);
        System.out.println(movable.toString());

        movable.move();
        System.out.println(movable.toString());
    }
}
