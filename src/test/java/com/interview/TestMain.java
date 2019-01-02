package com.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.beans.IntrospectionException;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestMain {
    @Test
    public void testFindNumber() {
        Set<Integer> integers=Main.findNumber(new Integer[]{1, 3, 8, 12, 15, 17, 25, 80, 145, 156},25);

        assertEquals(integers,Main.findNumber(new Integer[]{1, 3, 8, 12, 15, 17, 25, 80, 145, 156},25));
    }
}
