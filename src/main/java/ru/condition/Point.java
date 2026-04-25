package ru.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) is " + result);
        System.out.println("result (1, 1) to (2, 2) is " + Point.distance(1, 1, 2, 2));
        System.out.println("result (0, 1) to (3, 6) is " + Point.distance(0, 1, 3, 6));
    }
}
