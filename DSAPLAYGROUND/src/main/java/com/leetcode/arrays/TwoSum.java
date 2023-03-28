package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * URL : https://leetcode.com/problems/two-sum/description/
 * TYPE : Arrays
 * TIME : O(n) // SPACE : O(1)
 */

public class TwoSum {
    public static void main(String[] args) {
        int target = 9;
        int[] nums = {2,7,11,15};

        TwoSum ts = new
                TwoSum();

        ts.twoSum(nums,target);
    }

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer,Integer> hm = new HashMap<>();

        for(int i = 0 ; i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                result[0] = hm.get(nums[i]);
                result[1] = i;
            }else{
                hm.put(target-nums[i],i);
            }
        }

        return result;

    }

}
