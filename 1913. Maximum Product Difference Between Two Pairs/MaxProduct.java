import java.util.*;
class MaxProduct{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        Arrays.sort(arr);

        int result=0;
        result=arr[n-1]*arr[n-2]-arr[0]*arr[1];
        System.out.println(result);
    }
}
