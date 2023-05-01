package com.TimothyPolke.LeetCode;

import org.junit.Test;
import org.junit.Assert;

public class TestSolution {
	Solution solutionObj = new Solution();
	
	@Test
	public void test_example1(){
		Assert.assertArrayEquals("Example 1 Error", solutionObj.twoSum(new int[]{2,7,11,15},9), new int[]{0,1});
	}
	
	@Test
	public void test_example2(){
		Assert.assertArrayEquals("Example 2 Error", solutionObj.twoSum(new int[]{3,2,4},6), new int[]{1,2});
	}
	
	@Test
	public void test_example3(){
		Assert.assertArrayEquals("Example 3 Error", solutionObj.twoSum(new int[]{3,3},6), new int[]{0,1});
	}
}