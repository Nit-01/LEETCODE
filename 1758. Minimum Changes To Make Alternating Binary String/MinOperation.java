//1758. Minimum Changes To Make Alternating Binary String

/*
Input: s = "0100"
Output: 1
Explanation: If you change the last character to '1', s will be "0101", 
which is alternating.

Example 2:

Input: s = "10"
Output: 0
Explanation: s is already alternating.
Example 3:

Input: s = "1111"
Output: 2
Explanation: You need two operations to reach "0101" or "1010".


*/

import java.util.*;
class MinOperation{
    public static int minoperation(String s){
        int start0=0;
        int start1=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='1'){
                    start0++;
                }else{
                    start1++;
                }
            }else{
                if(s.charAt(i)=='0'){
                    start0++;
                }else{
                    start1++;
                }
            }
        }
        return Math.min(start0,start1);

    }
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine();
        System.out.println(minoperation(s));
    }
}