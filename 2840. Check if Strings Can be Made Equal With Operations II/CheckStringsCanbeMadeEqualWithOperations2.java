/*
Example 1:

Input: s1 = "abcdba", s2 = "cabdab"
Output: true
Explanation: We can apply the following operations on s1:
- Choose the indices i = 0, j = 2. The resulting string is s1 = "cbadba".
- Choose the indices i = 2, j = 4. The resulting string is s1 = "cbbdaa".
- Choose the indices i = 1, j = 5. The resulting string is s1 = "cabdab" = s2.

Example 2:

Input: s1 = "abe", s2 = "bea"
Output: false
Explanation: It is not possible to make the two strings equal.
*/

import java.util.*;

class CheckStringsCanbeMadeEqualWithOperations2 {
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        String s1=sn.nextLine();
        String s2=sn.nextLine();

        System.out.println(isSimilar(s1, s2));
    }
    public static boolean isSimilar(String s1,String s2){

        int[]even =new int[26];
        int []odd=new int[26];

        int n=s1.length();

        for(int i=0;i<n;i++){
            if(i%2==0){
                even[s1.charAt(i)-'a']++;
                even[s2.charAt(i)-'a']--;
            }else{
                odd[s1.charAt(i)-'a']++;
                odd[s2.charAt(i)-'a']--;
            }
        }
        for(int i=0;i<26;i++){
            if(even[i]!=0 || odd[i]!=0){
                return false;
            }
        }

        return true;

    }
}
