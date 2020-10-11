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
public class FizzBuzzLuckyDivisibleByThreeAndFiveTest {
    private Integer num;
    private String expectedResult;
    private FizzBuzzLucky fizzbuzzLucky;

    @Before
    public void initialize() {
        fizzbuzzLucky = new FizzBuzzLucky();
    }

    public FizzBuzzLuckyDivisibleByThreeAndFiveTest(Integer num, String expectedResult) {
        this.num = num;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection nums() {
        return Arrays.asList(new Object[][] {
                {15, "fizzbuzz"},
                {150, "fizzbuzz"},
                {600, "fizzbuzz"},
                {915, "fizzbuzz"},
                {1050, "fizzbuzz"},
        });
    }

    @Test
    public void returnsFizzbuzzWhenDivisibleByThreeAndFive() {
        assertEquals(expectedResult, fizzbuzzLucky.testDivisorsAndSubstring(num));
    }
}