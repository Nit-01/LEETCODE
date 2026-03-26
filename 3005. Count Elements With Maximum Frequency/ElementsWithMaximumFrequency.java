/*
Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.

Example 2:

Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.
*/
import java.util.*;
class ElementsWithMaximumFrequency {
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sn.nextInt();
        }
        System.out.println(totalis(nums));
    }
    public static int totalis(int[]nums){
        int[]arr=new int[101];
        int maxfreq=0;
        int total=0;
        for(int num:nums){
            arr[num]++;
            int freq=arr[num];

            if(freq>maxfreq){
                maxfreq=freq;
                total=freq;
            }else if(freq==maxfreq){
                total+=freq;
            }
        }
        return total;
    }
}
