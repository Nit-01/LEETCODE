/* 
Given an array of integers nums and an integer target, return indices of the two numbers such that 
they add up to target.


Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

import java.util.*;

class twoSum {

    public static int[] findTwoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int com = target - nums[i];

            if (map.containsKey(com)) {
                return new int[]{map.get(com), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        int n = sn.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sn.nextInt();
        }

        int target = sn.nextInt();

        int[] result = findTwoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);

    }
}