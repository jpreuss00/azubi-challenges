package test.java.azubi.challenge.firstyear;

import org.junit.Test;
import static org.junit.Assert.*;

import main.java.azubi.challenge.firstyear.MirrorProduct;

public class MirrorProductTest {

    @Test
    public void TestDigitLengthFor4_first_factor_is_4_second_is_not_4_should_return_false() {
        boolean actual = MirrorProduct.TestProductForPalindrom(8495, 847);
        assertFalse(actual);
    }

    @Test
    public void TestDigitLengthFor4_both_factors_are_4_should_return_true() {
        boolean actual = MirrorProduct.TestProductForPalindrom(8495, 8647);
        assertTrue(actual);
    }

    @Test
    public void TestDigitLengthFor4_both_factors_are_not_4_should_return_false() {
        boolean actual = MirrorProduct.TestProductForPalindrom(495, 847);
        assertFalse(actual);
    }

    @Test
    public void TestProductForPalindrom_both_factors_are_1001_should_return_true() {
        boolean actual = MirrorProduct.TestProductForPalindrom(1001, 1001);
        assertTrue(actual);
    }
}