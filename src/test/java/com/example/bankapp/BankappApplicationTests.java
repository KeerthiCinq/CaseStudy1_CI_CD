package com.example.bankapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankappApplicationTests {

    @Test
    void sampleTest() {
        int expected = 42;
        int actual = 40 + 2;
        assertEquals(expected, actual, "Simple addition must be equal to 42");
    }
}
