package com.example.unittest;

import org.junit.jupiter.api.*;

public class NestedTest {
    @BeforeAll
    static void setUpAll() {
        System.out.println("Before All");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before Each");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("After All");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each");
    }

    @Test
    void test1() {
        System.out.println("Test 1");
    }

    @Test
    void test2() {
        System.out.println("Test 2");
    }

    @Nested
    class InnerClass1 {
        @BeforeEach
        void setUp2() {
            System.out.println("Before Each in InnerClass1");
        }

        @Test
        void test1() {
            System.out.println("Test 1 in InnerClass1");
        }

        @Nested
        class InnerClass2 {
            @Test
            void test1() {
                System.out.println("Test 1 in InnerClass2");
            }

            @RepeatedTest(3)
            void test2() {
                System.out.println("Test 2 in InnerClass2");
                System.out.println("Test 2 in InnerClass2");
                System.out.println("Test 2 in InnerClass2");
                System.out.println("Test 2 in InnerClass2");
            }
        }
    }
}
