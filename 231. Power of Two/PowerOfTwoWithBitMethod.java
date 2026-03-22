/*
Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false

*/

import java.util.*;
public class PowerOfTwoWithBitMethod {
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        System.out.println(equal(n));
    }
    public static boolean equal(int n){
        return n>0 && (n & (n-1))==0;
    }
}