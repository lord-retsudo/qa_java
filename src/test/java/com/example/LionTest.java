package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionTest {
    Feline feline = new Feline();

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(1, lion.getKittens());
    }

}