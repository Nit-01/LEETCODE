/*
Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
*/

import java.util.*;
class ValidAnagram{
    public static boolean Anagram(String s,String t){
        int []count=new int[26];
        if(s.length()!=t.length())return false;
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        for(char c:t.toCharArray()){
            count[c-'a']--;
        }
        for(int n:count){
            if(n!=0)return false;
        }
        return true;

    }
    public static void main(String []args){
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine();
        String t=sn.nextLine();
        System.out.println(Anagram(s,t));
    }
}