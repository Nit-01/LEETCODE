/*
Example 1:

Input: s = "010"
Output: "001"
Explanation: Because there is just one '1', it must be in the last position. So the answer is "001".
Example 2:

Input: s = "0101"
Output: "1001"
Explanation: One of the '1's must be in the last position. The maximum number that can be made with the remaining digits is "100". So the answer is "1001".

*/
import java.util.*;

class MaximumOddBinaryNumber {
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine();
        System.out.println(oddnumber(s));

    }
    public static String oddnumber(String s){
        int n=s.length();
        char[]result=new char[n];
        int index=0;

        Arrays.fill(result,'0');
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                if(result[n-1]!='1'){
                    result[n-1]='1';
                }else{
                    result[index++]='1';
                }
            }
        }
        return new String(result);
    }
}
