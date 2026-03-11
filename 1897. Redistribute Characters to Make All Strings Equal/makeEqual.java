/*
Example 1:

Input: words = ["abc","aabc","bc"]
Output: true
Explanation: Move the first 'a' in words[1] to the front of words[2],
to make words[1] = "abc" and words[2] = "abc".
All the strings are now equal to "abc", so return true.


Example 2:

Input: words = ["ab","a"]
Output: false
Explanation: It is impossible to make all the strings equal using the operation.

*/

import java.util.*;
class makeEqual{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        String[]words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sn.next();
        }
        System.out.println(equal(words));
    }
    public static boolean equal(String[]words){

        int []freq=new int[26];
        for(int i=0;i<words.length;i++){
            String word=words[i];

            for(int j=0;j<word.length();j++){
                freq[word.charAt(j)-'a']++;
            }
        }
        for(int ch:freq){
            if(ch%words.length!=0){
                return false;
            }
        }
        return true;
    }
}