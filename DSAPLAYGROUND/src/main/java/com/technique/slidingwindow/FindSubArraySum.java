package com.technique.slidingwindow;
/*
*  find the max sum sub array
* */
public class FindSubArraySum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 3;

        findingSum(nums,k);

    }

    static int findingSum(int[] nums,int k){
        int max_sum = 0;

        // TIME : O(k)
        for(int i = 0 ;i < k ; i++){
            max_sum += nums[i];
        }

        int window_sum = max_sum;

        //TIME : O(N)
        for(int i = k ; i < nums.length ; i++){
            window_sum += nums[i] - nums[i-k];
            max_sum = Math.max(window_sum,max_sum);
        }
        System.out.println(max_sum);
        return max_sum;


    }


}
