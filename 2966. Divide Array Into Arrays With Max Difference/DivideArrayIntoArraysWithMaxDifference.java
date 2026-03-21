/*
Example 1:
Input: nums = [1,3,4,8,7,9,3,5,1], k = 2
Output: [[1,1,3],[3,4,5],[7,8,9]]

Explanation:

The difference between any two elements in each array is less than or equal to 2.

Example 2:
Input: nums = [2,4,2,2,5,2], k = 2
Output: []

Explanation:

Different ways to divide nums into 2 arrays of size 3 are:

[[2,2,2],[2,4,5]] (and its permutations)
[[2,2,4],[2,2,5]] (and its permutations)

*/
import java.util.*;

class DivideArrayIntoArraysWithMaxDifference {
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int m=sn.nextInt();
        int[]arr=new int[m];

        for(int i=0;i<m;i++){
            arr[i]=sn.nextInt();
        }
        int k=sn.nextInt();
        int[][] res = divideArray(arr, k);

        for (int i = 0; i < res.length; i++) {
            System.out.print(Arrays.toString(res[i]));
        }

    }
    public static int[][]divideArray(int[]arr,int k){

        int n=arr.length;
        Arrays.sort(arr);

        int [][]result=new int[n/3][3];
        int index=0;

        for(int i=0;i<n;i+=3){
            if(arr[i+2]-arr[i]>k){
                return new int[0][0];
            }
            result[index][0]=arr[i];
            result[index][1]=arr[i+1];
            result[index][2]=arr[i+2];
            index++;
        }

        return result;
    }
}
