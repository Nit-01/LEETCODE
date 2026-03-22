/*
Example 1:

Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:

Input: s = "loveleetcode"
Output: 2

Example 3:

Input: s = "aabb"
Output: -1

*/

import java.util.*;
class FirstUniqueCharacterInAString {
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine();
        System.out.println(unique(s));
    }
    public static int unique(String s){
        int []freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
