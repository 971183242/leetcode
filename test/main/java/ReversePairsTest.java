package main.java;

import main.java.hard.ReversePairs;
import org.junit.Test;

public class ReversePairsTest {

    private ReversePairs reversePairs = new ReversePairs();
    private int[] nums = {5,6,6};

    @Test
    public void reversePairsTest() {
        assert reversePairs.reversePairs(nums) == 0;
    }
}