package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorShould {

    @Test
    public void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    public void string_with_two_numbers_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
        assertEquals(233, stringCalculator.add("11,222"));
        assertEquals(176, stringCalculator.add("151,25"));
        assertEquals(2100, stringCalculator.add("100,2000"));
    }
}
