package com.TimothyPolke.LeetCode;

import org.junit.Test;
import org.junit.Assert;

public class TestSolution {
	Solution solutionObj = new Solution();
	
	@Test
	public void test_example1(){
		Assert.assertEquals("Example 1 Error", solutionObj.findTheDifference("abcd","abcde"), 'e');
	}
	
	@Test
	public void test_example2(){
		Assert.assertEquals("Example 2 Error", solutionObj.findTheDifference("", "y"), 'y');
	}
}