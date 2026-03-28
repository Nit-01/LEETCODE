/*
Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/

import java.util.*;

class IntersectionOfTwoArrays {
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int m=sn.nextInt();
        int[]arr1=new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=sn.nextInt();
        }
        int n=sn.nextInt();
        int[]arr2=new int[m];
        for(int i=0;i<n;i++){
            arr2[i]=sn.nextInt();
        }
        System.out.println(Arrays.toString(common(arr1,arr2)));
    }
    public static int[]common(int[]arr1,int[]arr2){
        int i=0;
        int j=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Set <Integer>s=new HashSet<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                s.add(arr1[i]);
            }
            if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        int []result=new int[s.size()];
        int index=0;
        for(int num:s){
            result[index++]=num;
        }
        return result;
    }
}
