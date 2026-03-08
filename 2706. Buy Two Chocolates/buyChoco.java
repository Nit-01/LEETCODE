/*
Example 1:

Input: prices = [1,2,2], money = 3
Output: 0
Explanation: Purchase the chocolates priced at 1 and 2 units respectively. You will have 3 - 3 = 0 units of money afterwards. Thus, we return 0.
Example 2:

Input: prices = [3,2,3], money = 3
Output: 3
Explanation: You cannot buy 2 chocolates without going in debt, so we return 3.

*/

import java .util.*;
class buyChoco{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[] price=new int[n];
        for(int i=0;i<n;i++){
            price[i]=sn.nextInt();
        }
        int money=sn.nextInt();
        System.out.println(choco(price, money));
    }

    public static int choco(int[]price,int money){
        int remain=0;
        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MIN_VALUE;

        for(int i=0;i<price.length;i++){
            if(price[i]<smallest){
                secondsmallest=smallest;
                smallest=price[i];
            }else if(price[i]<secondsmallest){
                secondsmallest=price[i];
            }
        }
        remain=smallest+secondsmallest;
        if(remain>money){
            return money;
        }
        return money-remain;
    }
}