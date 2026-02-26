/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321

*/


import java.util.*;
class Reverse{
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
        rev=(n<0) ? (-rev):rev;
        System.out.println(rev);
    }
}