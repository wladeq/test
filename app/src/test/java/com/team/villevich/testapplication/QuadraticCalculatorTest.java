package com.team.villevich.testapplication;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticCalculatorTest {
    @Test
    public void quadraticPlusSample() throws Exception {
        int inputX = 5;
        int inputY = 5;
        long output;
        long expected = 100;
        double delta = .1;

        output = QuadraticCalculator.quadraticPlusSample(inputX,inputY);

        assertEquals(expected,output,delta);

    }

    @Test
    public void quadraticMinusSample() throws Exception {
        int inputX = 5;
        int inputY = 5;
        long output;
        long expected = 20;
        double delta = .1;

        output = QuadraticCalculator.quadraticMinusSample(inputX,inputY);

        assertEquals(expected,output,delta);

    }

}