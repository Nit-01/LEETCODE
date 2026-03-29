/*
Example 1:

Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: We can do the following operations on s1:
- Choose the indices i = 0, j = 2. The resulting string is s1 = "cbad".
- Choose the indices i = 1, j = 3. The resulting string is s1 = "cdab" = s2.

Example 2:

Input: s1 = "abcd", s2 = "dacb"
Output: false
Explanation: It is not possible to make the two strings equal.

*/
import java.util.*;

class CheckStringsCanbeMadeEqualWithOperations {
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        String s1=sn.nextLine();
        String s2=sn.nextLine();

        System.out.println(issimilar(s1, s2));

    }
    public static boolean issimilar(String s1,String s2){
        boolean c1=((s1.charAt(0)==s2.charAt(0) && s1.charAt(2)==s2.charAt(2)) || (s1.charAt(0)==s2.charAt(2) && s1.charAt(2)==s2.charAt(0)));
        
        boolean c2=((s1.charAt(1)==s2.charAt(1) && s1.charAt(3)==s2.charAt(3)) || (s1.charAt(1)==s2.charAt(3) && s1.charAt(3)==s2.charAt(1)));

        if(c1 && c2){
            return true;
        }

        return false;
    }
}
