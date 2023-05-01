package com.TimothyPolke.LeetCode;

import org.junit.Test;
import org.junit.Assert;

public class TestSolution {
	Solution solutionObj = new Solution();
	
	@Test
	public void test_example1(){
		Assert.assertTrue("Example 1 Error", solutionObj.isPalindrome("A man, a plan, a canal: Panama"));
	}
	
	@Test
	public void test_example2(){
		Assert.assertFalse("Example 2 Error", solutionObj.isPalindrome("race a car"));
	}
	
	@Test
	public void test_example3(){
		Assert.assertTrue("Example 3 Error", solutionObj.isPalindrome(" "));
	}
}