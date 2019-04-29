package com.example.unittest;

import org.junit.experimental.theories.Theories;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofNanos;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("JUNIT 5")
public class FizzBuzzTest {

    @BeforeAll
    static void setUpAll() {
        System.out.println("Start Unit Test");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Start");
    }

    @AfterEach
    void tearDown() {
        System.out.println("End");
    }

    @AfterAll
    static void teardownAll() {
        System.out.println("End Unit Test");
    }

    @Test
    @DisplayName("Input 1")
    public void input_1_ShouldBeReturn_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    public void input_2_ShouldBeReturn_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    public void input_3_ShouldBeReturn_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void input_5_ShouldBeReturn_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    public void input_6_ShouldBeReturn_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(6));
    }

    @Test
    public void input_10_ShouldBeReturn_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.convert(10));
    }

    @Test
    public void input_15_ShouldBeReturn_FizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }

    @Test()
    public void input_30_ShouldBeReturn_FizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.convert(30));
    }

    @Test
    void time() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = assertTimeout(ofNanos(1), ()-> {
            Thread.sleep(10);
            return fizzBuzz.convert(30);
        });
        assertEquals("FizzBuzz", actualResult);
    }

    @Test
    @DisplayName("assertTimeout")
    void name() {
        assertTimeout(ofMillis(10), () -> {
            Thread.sleep(100);
        });
    }
}
