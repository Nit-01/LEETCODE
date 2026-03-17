/*
maxLengthBetweenEqualCharacters
Example 1:

Input: s = "aa"
Output: 0
Explanation: The optimal substring here is an empty substring between the two 'a's.
Example 2:

Input: s = "abca"
Output: 2
Explanation: The optimal substring here is "bc".
Example 3:

Input: s = "cbzxy"
Output: -1
Explanation: There are no characters that appear twice in s.

*/
import java.util.*;
class maxLengthBetweenEqualCharacters{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine();
        System.out.println(occur(s));

    }
    public static int occur(String s){
        int n=s.length();
        int result=-1;
        int[]freq=new int[26];
        Arrays.fill(freq,-1);

        for(int i=0;i<n;i++){
            char c=s.charAt(i);

            if(freq[c-'a']==-1){
                freq[c-'a']=i;
            }else{
                result=Math.max(result,i-freq[c-'a']-1);
            }

        }


        return result;
    }
}