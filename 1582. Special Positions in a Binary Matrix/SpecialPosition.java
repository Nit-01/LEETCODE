/*

Example 1:

1 0 0
0 0 1
1 0 0

Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.
 

Example 1:

1 0 0
0 1 0
0 0 1

Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
Explanation: (0, 0), (1, 1) and (2, 2) are special positions.
*/

import java.util.*;
class SpecialPosition{
    public static int special(int[][]mat){
        int m=mat.length;
        int n=mat[0].length;
        int[] rowcount=new int[m];
        int[] colcount=new int[n];

        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(mat[row][col]==1){
                    rowcount[row]++;
                    colcount[col]++;
                }
            }
        }
        int result=0;
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(mat[row][col]==1 && rowcount[row]==1 && colcount[col]==1){
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int m=sn.nextInt();
        int n=sn.nextInt();
        int[][]mat=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sn.nextInt();
            }
        }
        System.out.println(special(mat));
    }
}
