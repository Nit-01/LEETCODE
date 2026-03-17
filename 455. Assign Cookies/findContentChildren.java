
/*
Example 1:

Input: g = [1,2,3], s = [1,1]
Output: 1
Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
You need to output 1.
Example 2:

Input: g = [1,2], s = [1,2,3]
Output: 2
Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2. 
You have 3 cookies and their sizes are big enough to gratify all of the children, 
You need to output 2.

*/

import java.util.*;
class findContentChildren{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int p=sn.nextInt();
        int []g=new int[p];
        for(int i=0;i<p;i++){
            g[i]=sn.nextInt();
        }

        int q=sn.nextInt();
        int []s=new int[q];
        for(int i=0;i<q;i++){
            s[i]=sn.nextInt();
        }
        System.out.println(cal(g,s));

    }
    public static int cal(int[]g,int[]s){

        int m=g.length;
        int n=s.length;

        int i=0,j=0;
        while(i<m && j<n){
            if(g[i]<=s[i]){
                i++;
            }
            j++;
        }
        return i;
    }
}