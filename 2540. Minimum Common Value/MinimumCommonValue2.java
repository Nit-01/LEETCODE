/*
Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2.
Example 2:

Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
Output: 2
Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
*/
import java.util.*;
class MinimumCommonValue2 {
    public static void main(String []args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[] nums1=new int[n];
        for(int i=0;i<n;i++){
            nums1[i]=sn.nextInt();
        }
        int m=sn.nextInt();
        int[] nums2=new int[n];
        for(int i=0;i<m;i++){
            nums2[i]=sn.nextInt();
        }
        System.out.println(common(nums1, nums2));

    }
    public static int common(int[]nums1,int[]nums2){

        int i=0;
        int j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j])return nums1[i];

            if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        return -1;
    }
}
