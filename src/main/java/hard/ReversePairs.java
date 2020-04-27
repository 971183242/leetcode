package main.java.hard;

import java.util.LinkedList;

public class ReversePairs {

    /**
     * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
     * <p>
     *  
     * <p>
     * 示例 1:
     * <p>
     * 输入: [7,5,6,4]
     * 输出: 5
     */
    public int reversePairs(int[] nums) {
        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i]>nums[j]){
//                    count ++;
//                }
//            }
//        }
//        return count;
/**解法2*/
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            count += insertNum2Array(nums[i], linkedList);
        }
//        int count = 0;
//
//        /**解法3
//         * 遍历一次
//         * 两个指针，一个指向当前的数
//         * 一个只想当前最小值*/
//        LinkedList<Integer> list = new LinkedList<Integer>();
//        int current = 0;
//        int min = 0;
//        while(current < nums.length){
//            if (nums[current])
//        }
//
//
//
        return count;
    }

    private int insertNum2Array(int num, LinkedList<Integer> linkedList) {
        int count = 0;
        if (linkedList.isEmpty()) {
            linkedList.add(num);
            return 0;
        }
        for (int i = 0; i <= linkedList.size(); i++) {
            if (i == linkedList.size()){
//                count++;
                linkedList.offer(num);
                return count;
            }
            if (linkedList.get(i)>num){
                count ++;
            } else {
                linkedList.add(i,num);
                break;
            }
        }
        return count;

    }

}
