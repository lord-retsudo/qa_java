package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest  {

    @Mock
    Feline feline;

    @Test
    public void testGetFood() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("food1", "food2", "food3"));
        var cat = new Cat(feline);
        assertEquals(List.of("food1", "food2", "food3"), cat.getFood());
    }

    @Test
    public void testGetSound() {
        var cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }
}