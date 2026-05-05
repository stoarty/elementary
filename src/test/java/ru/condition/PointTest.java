package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PointTest {
    @Test
    void whenPointsAreOnYAxisThenDistanceIsTwo() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);

        double result = first.distance(second);

        assertThat(result).isEqualTo(2.0);
    }

    @Test
    void whenPointsAreOnDiagonalThenDistanceIsFive() {
        Point first = new Point(0, 0);
        Point second = new Point(3, 4);

        double result = first.distance(second);

        assertThat(result).isEqualTo(5.0);
    }

    @Test
    void whenPointsAreEqualThenDistanceIsZero() {
        Point first = new Point(7, -3);
        Point second = new Point(7, -3);

        double result = first.distance(second);

        assertThat(result).isEqualTo(0.0);
    }
}

