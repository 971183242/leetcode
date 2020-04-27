package main.java.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permute {
    /**给定一个 没有重复 数字的序列，返回其所有可能的全排列。
     示例:

     输入: [1,2,3]
     输出:
     [
     [1,2,3],
     [1,3,2],
     [2,1,3],
     [2,3,1],
     [3,1,2],
     [3,2,1]
     ]*/
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 2){
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return result;
        }
        for (int i = 0; i< nums.length; i++){
            for(int j = 0; j<nums.length-1;j++){
                result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
        return result;
    }
}
