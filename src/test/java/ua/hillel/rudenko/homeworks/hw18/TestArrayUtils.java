package ua.hillel.rudenko.homeworks.hw18;

import org.junit.jupiter.api.*;

public class TestArrayUtils {
    static int[] array = null;
    static int[][] matrix = null;

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll");
        array = new int[] {1, 2, 3, 4, 5};
        matrix = new int[][] {
                new int[] { 1, 2, 3 },
                new int[] { 1, 2, 3 },
                new int[] { 1, 2, 3 },
        };
    }

    @Test
    void testMethod1() {
        System.out.println("testMethod1");
        double test = ArrayUtils.getAverage(array);
        Assertions.assertEquals(3, test);
    }

    @Test
    void testMethod2() {
        System.out.println("testMethod2");
        array = new int[] {};
        double test = ArrayUtils.getAverage(array);
        Assertions.assertEquals(0, test);
    }

    @Test
    void testMethod3() {
        System.out.println("testMethod3");
        boolean test = ArrayUtils.isSquare(matrix);
        Assertions.assertTrue(test);
    }

    @Test
    void testMethod4() {
        System.out.println("testMethod4");
        matrix = new int[][] {
                new int[] { 1, 2, 3 },
                new int[] { 1, 2, 3, 4},
                new int[] { 1, 2, 3 },
        };
        boolean test = ArrayUtils.isSquare(matrix);
        Assertions.assertFalse(test);
    }

    @Test
    void testMethod5() {
        System.out.println("testMethod5");
        matrix = new int[][] {};
        boolean test = ArrayUtils.isSquare(matrix);
        Assertions.assertFalse(test);
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
        array = null;
        matrix = null;
    }

}

