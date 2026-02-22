/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true

Example 2:

Input: x = -121
Output: false
*/

class Solution {
    public boolean isPalindrome(int x) {

        String str=Integer.toString(x);
        String rev=new StringBuilder(str).reverse().toString();
        return str.equals(rev);
        
    }
}