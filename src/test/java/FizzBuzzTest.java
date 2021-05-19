import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void itShouldFoo() {
        assertTrue(false);
    }

    @Test
    void itShouldTakeANumberAndReturnAString() {
        //Given
        int number = 4;
        FizzBuzz testee = new FizzBuzz();

        // When
        String result = testee.fizzBuzzer(number);

        // Then
        assertEquals("4", result);
    }

    @Test
    void itShouldReturnFizzWhenMultipleOfThree() {
        // Given
        int number = 9;
        FizzBuzz testee = new FizzBuzz();

        // When
        String result = testee.fizzBuzzer(number);

        // Then
        assertEquals("Fizz", result);
    }

    @Test
    void itShouldReturnBuzzWhenMultipleOfFive() {
        //Given
        int number = 20;
        FizzBuzz testee = new FizzBuzz();

        // When
        String result = testee.fizzBuzzer(number);

        // Then
        assertEquals("Buzz", result);
    }

    @Test
    void itShouldReturnFizzBuzzWhenMultipleOfThreeAndFive() {
        //Given
        int number = 30;
        FizzBuzz testee = new FizzBuzz();

        // When
        String result = testee.fizzBuzzer(number);

        // Then
        assertEquals("FizzBuzz!", result);
    }

}
