package com.TimothyPolke.LeetCode;

public class Solution {
    int[] answer = null;
    public int[] twoSum(int[] nums, int target) {
        for (int i1 = 0; i1 < nums.length; i1++) {   
            for (int i2 = 0; i2 < nums.length; i2++) {
                if (i1 != i2) {
                    if (nums[i1] + nums[i2] == target) {
                       answer = new int[]{i2, i1};
                    } 
                }
            }
        }
        return answer;
    }
}