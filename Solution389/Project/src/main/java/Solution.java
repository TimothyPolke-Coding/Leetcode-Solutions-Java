package com.TimothyPolke.LeetCode;

public class Solution {
	char difference = '\u0000';
	StringBuffer sStringBuffer;
    public char findTheDifference(String s, String t) {
		sStringBuffer = new StringBuffer(s);
		loop:
		for (int i = 0; i <= t.length(); i++) {
			if (sStringBuffer.toString().contains(String.valueOf(t.charAt(i)))) {
				deleteFirstOccuranceOfChar(t.charAt(i));
				
			}
			else {
				difference = t.charAt(i);
				break loop;
			}
		}	
		return difference;
    }
	
	public void deleteFirstOccuranceOfChar(char letter) {
		for (int i = 0; i < sStringBuffer.toString().length(); i++) {
			if (sStringBuffer.toString().charAt(i) == letter) {
				sStringBuffer.delete(i,i+1);
				break;
			}
		}
	}
}