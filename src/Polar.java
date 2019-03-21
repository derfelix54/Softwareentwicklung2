public class Polar implements Point{

    private double distance;
    private double angle;

    Polar(double dist, double angle){

    }

    @Override
    public double getxCoord() {
        return 0;
    }

    @Override
    public double getyCoord() {
        return 0;
    }

    @Override
    public double getAngle() {
        return angle;
    }

    @Override
    public double getDistance() {
        return distance;
    }

    @Override
    public boolean closeTo(Point other) {
        return false;
    }
}
