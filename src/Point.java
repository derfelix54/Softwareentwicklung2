public interface Point {

    abstract double getxCoord();
    abstract double getyCoord();
    abstract double getDistance();
    abstract double getAngle();
    abstract boolean closeTo(Point other);
}
