package com.TimothyPolke.LeetCode;

import java.lang.StringBuffer;

class Solution {
	public boolean isPalindrome(String s) {
		StringBuffer stringBuffer = new StringBuffer(s);
		String sModified = "";
		for (int i = 0; i < stringBuffer.length(); i++) {
			if (Character.isLetter(stringBuffer.charAt(i)) == true || Character.isDigit(stringBuffer.charAt(i)) == true) {
				sModified = sModified + String.valueOf(stringBuffer.charAt(i)).toLowerCase();
			}
		}
		int counter = 0;
		int whole = sModified.length();
		int half = sModified.length() / 2;
		for (int i = 0; i < half; i++) {
			if (sModified.charAt(0 + i) == (sModified.charAt((whole - 1) - i))) {
				counter = counter + 1;
			}
		}
		if (counter == half){   
		   return true;
		}
		else 
		   return false;
	}
}