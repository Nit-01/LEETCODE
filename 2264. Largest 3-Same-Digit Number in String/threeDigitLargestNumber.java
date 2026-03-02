/*
Example 1:

Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".
Example 2:

Input: num = "2300019"
Output: "000"
Explanation: "000" is the only good integer.
Example 3:

Input: num = "42352338"
Output: ""
Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.

*/

import java.util.*;
class threeDigitLargestNumber{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        String num=sn.nextLine();
        char max=' ';

        for(int i=2;i<num.length();i++){
            char ch=num.charAt(i);

            if(ch==num.charAt(i-1) && ch==num.charAt(i-2)){
                if(ch==' ' || ch>max){
                    max=ch;
                }
            }
        }
        if(max==' '){
            System.out.println("");
        }else{
            System.out.println(""+max+max+max);
        }
    }
}