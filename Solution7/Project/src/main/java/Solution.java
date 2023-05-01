package com.TimothyPolke.LeetCode;

class Solution {
    public int reverse(int x) {
        StringBuilder sStringBuilder = new StringBuilder(String.valueOf(x));
        sStringBuilder.reverse();
        if (sStringBuilder.toString().charAt(sStringBuilder.toString().length() - 1) == '-')  {
            sStringBuilder.delete(sStringBuilder.toString().length() - 1, sStringBuilder.toString().length());
            sStringBuilder.insert(0, '-');
        } 
        int result = 0;
        try {
            result = Integer.valueOf(sStringBuilder.toString());
        }
        catch (NumberFormatException e) {
        }
        return result;
    }
}