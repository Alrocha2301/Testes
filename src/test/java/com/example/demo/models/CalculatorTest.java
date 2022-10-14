package com.example.demo.models;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testSum() {
        assertEquals(3, calculator.sum(1, 2));
        assertThat(calculator.sum(1, 2)).isEqualTo(3);
    }

}