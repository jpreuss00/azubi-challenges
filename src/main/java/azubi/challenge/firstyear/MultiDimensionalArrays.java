package main.java.azubi.challenge.firstyear;

import java.util.*;

/**
 * Regarding multidimensional arrays ..
 * https://www.dummies.com/programming/java/java-use-arrays-with-two-dimensions-or-more/
 */
public class MultiDimensionalArrays {

    private static final Random random = new Random();

    public static void main(final String...args) {
        int[][] randomMatrix = buildRandomMatrix(5);
        printMatrix(randomMatrix);
    }

    /**
     * Returns a matrix initialized with random numbers.
     *
     * Example:
     *   dimension = 3
     *   42   27389      -74
     *   8376    -5   728397
     *   -727   634 28937293
     */
    public static int[][] buildRandomMatrix(final int dimension) {
        int numbers[][] = new int[dimension][dimension];
        for(int i = 0; i < dimension; i++){
            for(int j = 0; j < dimension; j++){
                int randomNumber = random.nextInt();
                numbers[i][j] = randomNumber;
            }
        }
        return numbers;
    }

    /**
     * Sums two independent matrices.
     *
     * Example:
     *   Matrix 1:
     *   1 4 7
     *   2 5 8
     *   3 6 9
     *
     *   Matrix 2:
     *   1 4 7
     *   2 5 8
     *   3 6 9
     *
     *   Result:
     *   2  8 14
     *   4 10 16
     *   6 12 18
     */
    public static int[][] sumMatrices(int[][] m1, int[][] m2) {

        if (m1.length == 0 && m2.length == 0){
            int empty[][] = new int[][]{};
            return empty;
        } else if(m1.length == m2.length){
            int result[][] = new int[m1.length][m1[0].length]; 
            for(int i = 0; i < m1.length; i++){
                for(int j = 0; j < m1[0].length; j++){
                    result[i][j] = m1[i][j]+m2[i][j];
                }
            }
        return result;
       } else {
        throw new UnsupportedOperationException("Matrices should have same length!");
       }  
    }

    /**
     * Returns a matrix initialized with increasing numbers column-wise.
     *
     * Example:
     *   dimension = 3
     *    i 0 1 2
     *  j
     *  0   1 4 7
     *  1   2 5 8
     *  2   3 6 9
     */ 
    public static int[][] buildMatrixHavingIncreasingColumnCounts(final int dimension) {
        int dimensionArray[][] = new int[dimension][dimension];
        int k = 0;
            for(int i = 0; i < dimension; i++){
                for(int j = 0; j < dimension; j++){
                    k++;
                    dimensionArray[j][i] = k;
                }
            }
        return dimensionArray;
    }

    /**
     * Hard!
     *
     * Returns a matrix initialized with an increasing spiral clockwise.
     * The dimension must be odd (1, 3, 5, 7).
     *
     * @throws IllegalArgumentException when dimension is even (e.g. 2, 4, 6, 8).
     *
     * Example:
     *        0  1  2  3  4 i
     *   0   21 22 23 24 25
     *   1   20  7  8  9 10
     *   2   19  6  1  2 11
     *   3   18  5  4  3 12
     *   4   17 16 15 14 13
     *   j
     */
    public static int[][] buildSpiralSquare(final int dimension) {
        if ( dimension % 2 != 0 ) {
            int square[][] = new int[dimension][dimension];
            int statementForI = -1;
            int statementForJ = 0;
            int counter = 0;
            int i = dimension-1;
            int j = 0;

            for(int k = (dimension*dimension); k > 0; k--){
                        square[j][i] = k;
                        if(i == 0+counter && j == 0+counter){
                            statementForI = 0;
                            statementForJ = 1;
                        }
                        if(i == 0+counter && j == (dimension-1)-counter){
                            statementForI = 1;
                            statementForJ = 0;
                        }
                        if(i == (dimension-1)-counter && j == (dimension-1)-counter){
                            statementForI = 0;
                            statementForJ = -1;
                        }
                        if(i == (dimension-1)-counter && j == 1+counter){
                            statementForI = -1;
                            statementForJ = 0;
                            counter++;
                        }
                        i = i+=statementForI;
                        j = j+=statementForJ;
            }
            System.out.print(square);
            return square;
        } else {
            throw new IllegalArgumentException("odd Numbers only!");
        }
    }

    // --- utility methods, feel free to use

    public static void printMatrix(int[][] square) {
        final int maxNumber = square.length * square.length;
        final int maxDigits = Integer.toString(maxNumber).length();

        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                final int number = square[row][col];
                final String paddedNumber = padLeftSpaces(number, maxDigits + 1);

                System.out.print(paddedNumber);
            }
            System.out.println();
        }
    }

    private static String padLeftSpaces(int input, int length) {
        final int inputLength = Integer.toString(input).length();
        if (inputLength > length) {
            return Integer.toString(input);
        }

        final StringBuilder sb = new StringBuilder();
        while (sb.length() < (length - inputLength)) {
            sb.append(' ');
        }
        sb.append(input);
        
        return sb.toString();
    }
}