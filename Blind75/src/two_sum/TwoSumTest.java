package two_sum;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {


    @Test
    public void testTwoSumFound() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);

        assertNotNull(result, "Result should not be null");
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void testTwoSumNotFound() {
        int[] nums = {1, 2, 3};
        int target = 7;
        int[] result = TwoSum.twoSum(nums, target);

        assertEquals(0, result.length, "Result should be empty when no pair is found");
    }
}