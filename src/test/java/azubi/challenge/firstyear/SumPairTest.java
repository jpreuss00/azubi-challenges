package test.java.azubi.challenge.firstyear;

import org.junit.Test;
import static org.junit.Assert.*; 

import main.java.azubi.challenge.firstyear.SumPair;

public class SumPairTest {

    @Test
    public void findSumPair_shouldReturn_false_ifNoNumbersGiven() {
        boolean actual = SumPair.sumPairExists(17, new int[0]);
        assertFalse(actual);
    }

    @Test
    public void findSumPair_shouldReturn_false_ifNoPairIsFound() {
        boolean actual = SumPair.sumPairExists(17, new int[] {1, 2, 3});
        assertFalse(actual);
    }

    @Test
    public void findSumPair_shouldReturn_true_ifAPair_isFound() {
        boolean actual = SumPair.sumPairExists(17, new int[] {10, 15, 3, 7});
        assertTrue(actual);
    }

} 