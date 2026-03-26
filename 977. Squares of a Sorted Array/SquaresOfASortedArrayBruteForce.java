/*
Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
*/
import java.util.*;

class SquaresOfASortedArrayBruteForce {
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sn.nextInt();
        }
        System.out.println(Arrays.toString(sorted(nums)));
    }
    public static int[]sorted(int[]nums){
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
    
}
