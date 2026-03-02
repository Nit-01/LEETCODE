/* 
findTheWordsCanFound.java
Example 1:

1160. Find Words That Can Be Formed by Characters

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:


Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.

*/

import java.util.*;
class findTheWordsCanFound{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        String[]words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sn.nextLine();
        }
        sn.nextLine();
        String chars=sn.next();

        int[]freq=new int[26];

        for(char ch:chars.toCharArray()){
            freq[ch-'a']++;
        }
        int result=0;
        for(String word:words){
            int []temp=new int[26];

            for(char ch:word.toCharArray()){
                temp[ch-'a']++;
            }
            boolean found=true;
            for(int i=0;i<26;i++){
                if(temp[i]>freq[i]){
                    found=false;
                }
            }
            if(found){
                result+=word.length();
            }
        }
        System.out.println(result);
    }

}
