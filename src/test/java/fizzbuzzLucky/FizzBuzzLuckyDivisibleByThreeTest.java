package fizzbuzzLucky;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FizzBuzzLuckyDivisibleByThreeTest {
    private Integer num;
    private String expectedResult;
    private FizzBuzzLucky fizzbuzzLucky;

    @Before
    public void initialize() {
        fizzbuzzLucky = new FizzBuzzLucky();
    }

    public FizzBuzzLuckyDivisibleByThreeTest(Integer num, String expectedResult) {
        this.num = num;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection nums() {
        return Arrays.asList(new Object[][] {
                {9, "fizz"},
                {18, "fizz"},
                {597, "fizz"},
                {726, "fizz"},
                {999, "fizz"},
        });
    }

    @Test
    public void returnsFizzWhenDivisibleByThree() {
        assertEquals(expectedResult, fizzbuzzLucky.testDivisorsAndSubstring(num));
    }
}