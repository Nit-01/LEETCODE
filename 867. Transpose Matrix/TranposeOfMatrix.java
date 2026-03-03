/*
Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
*/
import java.util.*;

class TranposeOfMatrix {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int n = sn.nextInt();
        int m = sn.nextInt();

        int mat[][] = new int[n][m];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sn.nextInt();
            }
        }

     
        int[][] result = transpose(mat);


        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][i] = mat[i][j];  
            }
        }

        return result;
    }
}