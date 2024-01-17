package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Main.emiRate;

public class TestCase {

    @Test
    public void testEmi(){
        double actualAmount = emiRate(1000,4,12);
        double expectedAmount = 85.14990419555598;
        Assertions.assertEquals(actualAmount, expectedAmount);
    }
}
