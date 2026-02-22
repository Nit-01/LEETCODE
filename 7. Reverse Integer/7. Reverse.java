/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
*/



class Reverse {
    public int reverse(int x) {

        int num=Math.abs(x);   // convert positive
        int r=0;

        while(num!=0){
            int digit=num%10;

            if(r>(Integer.MAX_VALUE-d)/10){
                return 0;
            }
            r=r*10+digit;
            num=num/10;
        }
        return (x<0)?(-r):r;         //turnery operator

        
    }
}
