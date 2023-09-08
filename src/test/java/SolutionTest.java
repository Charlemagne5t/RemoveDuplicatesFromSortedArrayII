import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void removeDuplicatesTest1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] expected = {1, 1, 2, 2, 3};
        new Solution().removeDuplicates(nums);

        Assert.assertTrue(nums[0] == expected[0]);
        Assert.assertTrue(nums[1] == expected[1]);
        Assert.assertTrue(nums[2] == expected[2]);
        Assert.assertTrue(nums[3] == expected[3]);
        Assert.assertTrue(nums[4] == expected[4]);
    }

    @Test
    public void removeDuplicatesTest2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int[] expected = {0, 0, 1, 1, 2, 3, 3};
        new Solution().removeDuplicates(nums);

        Assert.assertTrue(nums[0] == expected[0]);
        Assert.assertTrue(nums[1] == expected[1]);
        Assert.assertTrue(nums[2] == expected[2]);
        Assert.assertTrue(nums[3] == expected[3]);
        Assert.assertTrue(nums[4] == expected[4]);
        Assert.assertTrue(nums[4] == expected[5]);
        Assert.assertTrue(nums[4] == expected[6]);
    }
}
