package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void appCanAdd() {
        App classUnderTest = new App();
        assertEquals(3, classUnderTest.add(1, 2), "app should be able to add two numbers");
    }
}
