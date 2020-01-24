package test.java.azubi.challenge.firstyear;

import org.junit.Test;

import main.java.azubi.challenge.firstyear.DigitPowers;

import main.java.azubi.challenge.firstyear.MultiDimensionalArrays;
import static org.junit.Assert.*;

public class MultiDimensionalArraysTest {

    @Test
    public void buildRandomMatrix_shouldHave_dimension() {
        // given 
        int dimension = 3;
        
        // when
        int[][] actual = MultiDimensionalArrays.buildRandomMatrix(dimension);
        
        //then 
        assertEquals(3, actual.length);
        assertEquals(3, actual[0].length);
    }

    @Test
    public void sumMatrices_shouldHave_correctlySummed() {
        int[][] m1 = new int[][] {
            {1, 2, 3},
            {2, 3, 1},
            {3, 1, 2}
        };

        int[][] m2 = new int[][] {
            {-1, 1, 1},
            {1, 1, -1},
            {1, -1, 1}
        };

        int[][] actual = MultiDimensionalArrays.sumMatrices(m1, m2);
        assertArrayEquals(new int[][] {
                {0, 3, 4},
                {3, 4, 0},
                {4, 0, 3}
            }, actual);
    }

    @Test
    public void sumMatrices_shouldHave_return_Zero_given_empty_Matrices() {
        int[][] m1 = new int[0][0];
        int[][] m2 = new int[0][0];

        int[][] actual = MultiDimensionalArrays.sumMatrices(m1, m2);
        assertArrayEquals(new int[][] {}, actual);
    }

    @Test
    public void sumMatrices_shouldHave_return_oneElement_given_Matrices_with_one_element_each() {
        int[][] m1 = new int[][] {
            {1}
        };
        int[][] m2 = new int[][]{
            {1}
        };

        int[][] actual = MultiDimensionalArrays.sumMatrices(m1, m2);
        assertArrayEquals(new int[][] {{2}}, actual);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void sumMatrices_shouldHave_thrownException_given_Matrices_with_unequal_length() throws UnsupportedOperationException {
        int[][] m1 = new int[][] {
            {1}, {2}, {3}
        };
        int[][] m2 = new int[][]{
            {1}
        };

        int[][] actual = MultiDimensionalArrays.sumMatrices(m1, m2);
        assertArrayEquals(new int[][] {{2}}, actual);
    }

    
    @Test
    public void buildMatrixHavingIncreasingColumnCounts_shouldBe_correct() {
        int[][] m = new int[][] {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };

        int[][] actual = MultiDimensionalArrays.buildMatrixHavingIncreasingColumnCounts(3);
        assertArrayEquals(m, actual);
    }

    @Test
    public void buildMatrixHavingIncreasingColumnCounts_should_return_empty_given_zero_dimension() {
        int[][] m = new int[][] {};

        int[][] actual = MultiDimensionalArrays.buildMatrixHavingIncreasingColumnCounts(0);
        assertArrayEquals(m, actual);
    }

    @Test
    public void buildMatrixHavingIncreasingColumnCounts_should_return_1_given_1_dimension() {
        int[][] m = new int[][] {{1}};

        int[][] actual = MultiDimensionalArrays.buildMatrixHavingIncreasingColumnCounts(1);
        assertArrayEquals(m, actual);
    }

    @Test
    public void buildMatrixHavingIncreasingColumnCounts_should_return_2_x_2_given_2_dimension() {
        int[][] m = new int[][] {{1, 3},
                                 {2, 4}};

        int[][] actual = MultiDimensionalArrays.buildMatrixHavingIncreasingColumnCounts(2);
        assertArrayEquals(m, actual);
    }

    @Test
    public void buildMatrixHavingIncreasingColumnCounts_should_return_4_x_4_given_4_dimension() {
        int[][] m = new int[][] {{1, 5, 9, 13},
                                 {2, 6, 10, 14},
                                 {3, 7, 11, 15},
                                 {4, 8, 12, 16}};

        int[][] actual = MultiDimensionalArrays.buildMatrixHavingIncreasingColumnCounts(4);
        assertArrayEquals(m, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void buildSpiralSquare_shouldThrow_Exception_ifDimensionIsNotOdd() {
        MultiDimensionalArrays.buildSpiralSquare(2);
    }

    @Test
    public void buildSpiralSquare_with_dimension_3_shouldBe_correct() {
        int[][] m = new int[][] {
            {7, 8, 9},
            {6, 1, 2},
            {5, 4, 3},
        };

        int[][] actual = MultiDimensionalArrays.buildSpiralSquare(3);
        assertArrayEquals(m, actual);
    }

    @Test
    public void buildSpiralSquare_with_dimension_5_shouldBe_correct() {
        int[][] m = new int[][] {
            {21, 22, 23, 24, 25},
            {20,  7,  8,  9, 10},
            {19,  6,  1,  2, 11},
            {18,  5,  4,  3, 12},
            {17, 16, 15, 14, 13}
        };

        int[][] actual = MultiDimensionalArrays.buildSpiralSquare(5);
        assertArrayEquals(m, actual);
    }

    @Test
    public void buildSpiralSquare_with_dimension_7_shouldBe_correct() {
        int[][] m = new int[][] {
            {43, 44, 45, 46, 47, 48, 49},
            {42, 21, 22, 23, 24, 25, 26},
            {41, 20, 7, 8, 9, 10, 27},
            {40, 19, 6, 1, 2, 11, 28},
            {39, 18, 5, 4, 3, 12, 29},
            {38, 17, 16, 15, 14, 13, 30},
            {37, 36, 35, 34, 33, 32, 31},
        };

        int[][] actual = MultiDimensionalArrays.buildSpiralSquare(7);
        assertArrayEquals(m, actual);
    }

    @Test
    public void buildSpiralSquare_with_dimension_1_shouldBe_correct() {
        int[][] m = new int[][] {
            {1}
        };

        int[][] actual = MultiDimensionalArrays.buildSpiralSquare(1);
        assertArrayEquals(m, actual);
    }
}