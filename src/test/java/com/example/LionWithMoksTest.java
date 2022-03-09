package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class LionWithMoksTest {

    @Mock
    Feline feline;

    @Test
    public void testLionGetKittensEqualsOneLion() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(lion.getKittens(),1);
    }

    @Test
    public void testLionGetFoodEqualsRightFoodType() throws Exception{
        Lion lion = new Lion(feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedList = lion.getFood();
        assertEquals(expectedList,List.of("Животные", "Птицы", "Рыба"));
    }
}
