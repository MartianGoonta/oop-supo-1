package src.test.java;

import org.junit.Test;

import src.main.java.Question4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Question4Test {
    @Test
    public void testCumsum() {
        Question4 question4 = new Question4();
        int[] input = {1, 2, 3, 4, 5};
        int[] expectedOutput = {1, 3, 6, 10, 15};

        int[] result = question4.cumsum(input);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testSum() {

        Question4 question4 = new Question4();
        int [] testArray = {1,2,3,4};
        int result = question4.sum(testArray);
        assertEquals(result, 10);
    }
    @Test
    public void testPositives() {
        Question4 question4 = new Question4();
        int[] input1 = {3, -2, 0, 7, -5, 9, 1, -4};
        int[] expected1 = {3, 7, 9, 1};
        assertArrayEquals(expected1, question4.positives(input1));
    }
}
