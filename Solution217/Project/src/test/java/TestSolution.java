package com.TimothyPolke.LeetCode;

import org.junit.Test;
import org.junit.Assert;

public class TestSolution {
	Solution solutionObj = new Solution();
	
	@Test
	public void test_example1(){
		Assert.assertTrue("Example 1 Error", solutionObj.containsDuplicate(new int[]{1,2,3,1}));
	}
	
	@Test
	public void test_example2(){
		Assert.assertFalse("Example 2 Error", solutionObj.containsDuplicate(new int[]{1,2,3,4}));
	}
	
	@Test
	public void test_example3(){
		Assert.assertTrue("Example 3 Error", solutionObj.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
	}
}