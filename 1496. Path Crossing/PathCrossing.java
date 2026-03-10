/*
Input: path = "NES"
Output: false 
Explanation: Notice that the path doesn't cross any point more than once.

Example 2:

Input: path = "NESWW"
Output: true
Explanation: Notice that the path visits the origin twice.
 
*/

import java.util.*;
class PathCrossing{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine();
        System.out.println(ispath(s));

    }
    public static boolean ispath(String s){
        HashSet<String>set=new HashSet<>();
        int x=0;
        int y=0;
        set.add(x+"_"+y);

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                y++;
            }else if(s.charAt(i)=='W'){
                y--;
            }else if(s.charAt(i)=='N'){
                x++;
            }else{
                x--;
            }
            String key=x+"_"+y;

            if(set.contains(key)){
                return true;
            }
            set.add(key);
        }
        return false;
    }
}