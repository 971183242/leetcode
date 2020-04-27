package main.java.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateSortedArrayTest {

    /**No.33 题目描述：
     * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
     *
     * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
     *
     * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
     *
     * 你可以假设数组中不存在重复的元素。
     *
     * 你的算法时间复杂度必须是 O(log n) 级别。
     *
     * 示例 1:
     *
     * 输入: nums = [4,5,6,7,0,1,2], target = 0
     * 输出: 4
     * 示例 2:
     *
     * 输入: nums = [4,5,6,7,0,1,2], target = 3
     * 输出: -1
     *
     * */

    @Test
    public void search() {
        RotateSortedArray arrayProcessor = new RotateSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        assert arrayProcessor.search(nums,0) == 4;
        assert arrayProcessor.search(nums,3) == -1;
        int[] array = {1};
        assert arrayProcessor.search(array,1) == 0;
    }
}