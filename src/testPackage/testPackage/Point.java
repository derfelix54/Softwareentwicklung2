package testPackage;

import static java.lang.Math.atan2;
import static java.lang.Math.hypot;
public interface Point {

    double EPSILON = 1.E-6;

    abstract double getxCoord();
    default double getyCoord(){
        return 0;
    }

    /**
     *
     * @return
     */
    default double getDistance(){
        return hypot(getxCoord(), getyCoord());
    }

    /**
     *
     * @return
     */
    default double getAngle(){
        return atan2(getyCoord(), getxCoord());
    }
    /**
     * Prueft, ob ein Punkt nah am anderen liegt, d.h. Abstand kleiner 10^-5
     * @param other
     * @return
     */
    default boolean closeTo(Point other){
        return hypot(getxCoord() - other.getxCoord(), getyCoord() - other.getyCoord()) < EPSILON;
    }
}
