/*
Example 1:

Input: nums = [5,6,2,7,4]
Output: 34
Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
The product difference is (6 * 7) - (2 * 4) = 34.
Example 2:

Input: nums = [4,2,5,9,7,4,8]
Output: 64
Explanation: We can choose indices 3 and 6 for the first pair (9, 8) and indices 1 and 5 for the second pair (2, 4).
The product difference is (9 * 8) - (2 * 4) = 64.

*/

import java.util.*;

class maxProductDifference{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[]nums=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sn.nextInt();
        }

        System.out.println(product(nums));
    }

    public static int product(int[]nums){

        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){

            if(nums[i] > largest){
                secondlargest = largest;
                largest = nums[i];
            } 
            else if(nums[i] > secondlargest){
                secondlargest = nums[i];
            }

            if(nums[i] < smallest){
                secondsmallest = smallest;
                smallest = nums[i];
            } 
            else if(nums[i] < secondsmallest){
                secondsmallest = nums[i];
            }
        }

        return largest*secondlargest - smallest*secondsmallest;
    }
}