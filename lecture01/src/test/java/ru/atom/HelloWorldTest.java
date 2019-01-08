package ru.atom;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void getHelloWorld() throws Exception {
        assertEquals("Hello, World!", HelloWorld.getHelloWorld());
        assertNotEquals("Some strange string", HelloWorld.getHelloWorld());
    }
}