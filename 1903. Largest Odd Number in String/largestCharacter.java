/*
1903. Largest Odd Number in String
largestCharacter

Example 1:

Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
Example 2:

Input: num = "4206"
Output: ""
Explanation: There are no odd numbers in "4206".
Example 3:

Input: num = "35427"
Output: "35427"
Explanation: "35427" is already an odd number.

*/

import java.util.*;
class largestCharacter{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        String num=sn.nextLine();
        int n=num.length();

        for(int i=n-1;i>=0;i--){
            if(num.charAt(i)%2!=0){
                System.out.println(num.substring(0,i+1));
                break;
            }
        }
        System.out.println("");
    }
}