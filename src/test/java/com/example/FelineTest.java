package com.example;

import junit.framework.TestCase;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest extends TestCase {

    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

}