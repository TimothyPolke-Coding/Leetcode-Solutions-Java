package com.TimothyPolke.LeetCode;

public class Solution {
	public boolean containsDuplicate(int[] nums) {
		boolean containsDuplicate = false;
		loop:
		for (int i1 = 0; i1 < nums.length; i1++) {
			for (int i2 = i1 + 1; i2 < nums.length; i2++) {
				if (nums[i1] == nums[i2]) {
					containsDuplicate = true;
					break loop;
				}
			}
		}
		return containsDuplicate;
	}
}