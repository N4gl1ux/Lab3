package com.example.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

import com.itis.libs.parserng.android.expressParser.MathExpression;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void Addition(){
        String givenExpression = "8+8";
        String expectedResult = "16.0";

        MathExpression expression = new MathExpression(givenExpression);
        String actualResult = expression.solve();

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Subtraction(){
        String givenExpression = "20-4";
        String expectedResult = "16.0";

        MathExpression expression = new MathExpression(givenExpression);
        String actualResult = expression.solve();

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Division(){
        String givenExpression = "32/2";
        String expectedResult = "16.0";

        MathExpression expression = new MathExpression(givenExpression);
        String actualResult = expression.solve();

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Multiplication(){
        String givenExpression = "2*8";
        String expectedResult = "16.0";

        MathExpression expression = new MathExpression(givenExpression);
        String actualResult = expression.solve();

        assertEquals(expectedResult, actualResult);
    }
}