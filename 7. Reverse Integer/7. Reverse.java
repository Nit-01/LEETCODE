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
