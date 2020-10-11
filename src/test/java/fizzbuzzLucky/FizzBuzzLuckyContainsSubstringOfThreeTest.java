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
public class FizzBuzzLuckyContainsSubstringOfThreeTest {
    private Integer num;
    private String expectedResult;
    private FizzBuzzLucky fizzbuzzLucky;

    @Before
    public void initialize() {
        fizzbuzzLucky = new FizzBuzzLucky();
    }

    public FizzBuzzLuckyContainsSubstringOfThreeTest(Integer num, String expectedResult) {
        this.num = num;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection nums() {
        return Arrays.asList(new Object[][] {
                {3, "lucky"},
                {13, "lucky"},
                {34, "lucky"},
                {53, "lucky"},
                {333, "lucky"},
                {703, "lucky"},
        });
    }

    @Test
    public void returnsLuckyWhenContainingSubstringOfThree() {
        assertEquals(expectedResult, fizzbuzzLucky.testDivisorsAndSubstring(num));
    }
}