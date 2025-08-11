package LongestConsecutiveSequence;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void testExample1() {
        int expected = 4;
        int[] nums = new int[]{
                100,
                4,
                200,
                1,
                3,
                2};
        assertEquals(expected, Solution.longestConsecutive(nums));
    }

}
