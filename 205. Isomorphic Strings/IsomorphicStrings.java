/*
Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "f11", t = "b23"

Output: false

Explanation:

The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.

Example 3:

Input: s = "paper", t = "title"

Output: true

*/
import java.util.*;
class IsomorphicStrings {
	public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine();
        String t=sn.nextLine();

        System.out.println(canbe(s, t));
    }
    public static boolean canbe(String s,String t){
        int m=s.length();
        HashMap<Character,Character>mp1=new HashMap<>();
        HashMap<Character,Character>mp2=new HashMap<>();

        for(int i=0;i<m;i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if((mp1.containsKey(c1) && mp1.get(c1)!=c2) || (mp2.containsKey(c2) && mp2.get(c2)!=c1)){
                return false;
            }
            mp1.put(c1,c2);
            mp2.put(c2,c1);
        }
        return true;
    }
}
