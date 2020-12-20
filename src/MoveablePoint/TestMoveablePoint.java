package MoveablePoint;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(4,5,6,7);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
