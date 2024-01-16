package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Main.calculateMonthlyRate;

public class TestCase {

    @Test
    public void testEmi(){
        double actualAmount = calculateMonthlyRate(1000,2,12);
        double expectedAmount = 197.769320418271;
        Assertions.assertEquals(actualAmount, expectedAmount);
    }

}
