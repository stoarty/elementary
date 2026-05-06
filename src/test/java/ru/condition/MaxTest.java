package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    private final Max max = new Max();

    @Test
    void whenSecondIsMaxThenReturnSecondForTwoNumbers() {
        int result = max.max(1, 2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void whenThirdIsMaxThenReturnThirdForThreeNumbers() {
        int result = max.max(1, 2, 3);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void whenThreeNumbersAreNegativeThenReturnGreatest() {
        int result = max.max(-10, -2, -3);
        assertThat(result).isEqualTo(-2);
    }

    @Test
    void whenFirstIsMaxThenReturnFirstForFourNumbers() {
        int result = max.max(9, 2, 3, 4);
        assertThat(result).isEqualTo(9);
    }

}

