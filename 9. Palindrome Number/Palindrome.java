/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true

Example 2:

Input: x = -121
Output: false
*/

import java.util.*;
class Palindrome{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int num=Math.abs(n);
        int rev=0;

        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        System.out.println(n==rev);
    }
}
