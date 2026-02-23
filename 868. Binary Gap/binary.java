/*

Given a positive integer n, find and return the longest distance between any two adjacent 1's in the binary 
representation of n. If there are no two adjacent 1's, return 0.

Input: n = 22
Output: 2
Explanation: 22 in binary is "10110".
The first adjacent pair of 1's is "10110" with a distance of 2.
The second adjacent pair of 1's is "10110" with a distance of 1.
The answer is the largest of these two distances, which is 2.


Input: n = 8
Output: 0
Explanation: 8 in binary is "1000".


*/

class Solution {
    public int binaryGap(int n) {
        int prev=-1;
        int result=0;
        for(int cur=0;cur<32;cur++){
            if(((n>>cur)&1)>0){
                result=(prev!=-1)? (Math.max(result,cur-prev)):result;
                prev=cur;
            }
        }
        return result;
        
    }
}