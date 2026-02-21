/* 
Given an array of integers nums and an integer target, return indices of the two numbers such that 
they add up to target.


Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

import java.util.*;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {

            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] + nums[j] == target) {

                    return new int[]{i, j};

                }
            }
        }

        return new int[]{};

    }

}

public class TwoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Solution sol = new Solution();

        int[] result = sol.twoSum(nums, target);

        if(result.length == 2) {
            System.out.println("Indices: " + result[0] + " " + result[1]);
        } else {
            System.out.println("No solution found");
        }

        sc.close();
    }
}