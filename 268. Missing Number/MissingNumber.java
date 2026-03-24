/*
Example 1:
Input: nums = [3,0,1]
Output: 2

Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2

Explanation:
n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
*/
import java.util.*;

class MissingNumber {
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sn.nextInt();
        }
        System.out.println(missing(nums));

    }
    public static int missing(int[]nums){
        int n=nums.length;
        int sum=n*(n+1)/2;
        for(int num:nums){
            sum-=num;
        }
        return sum;
    }
}
