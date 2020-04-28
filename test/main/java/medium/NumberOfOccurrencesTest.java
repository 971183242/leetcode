package main.java.medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NumberOfOccurrencesTest {

    /**No.56 题目描述：
     * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。
     * 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
     *  
     *
     * 示例 1：
     *
     * 输入：nums = [4,1,4,6]
     * 输出：[1,6] 或 [6,1]
     * 示例 2：
     *
     * 输入：nums = [1,2,10,4,1,4,3,3]
     * 输出：[2,10] 或 [10,2]
     */

    @Test
    public void singleNumbers() {
        NumberOfOccurrences numberOfOccurrences = new NumberOfOccurrences();
        int[] nums = {1,2,10,4,1,4,3,3};
        int[] result1 = {2,10};
        int[] result2 = {10,2};
        assert Arrays.equals(numberOfOccurrences.singleNumbers(nums),result1) || Arrays.equals(numberOfOccurrences.singleNumbers(nums),result2);
    }
}