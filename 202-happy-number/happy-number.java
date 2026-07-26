class Solution {
    public int nextNum(int num){
            int sum=0;
            while(num>0){
                int d=num%10;
                sum = sum + d * d;
                num=num/10;
            }
            return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow=nextNum(slow);
            fast=nextNum(fast);
            fast=nextNum(fast);
        }while(slow != fast);
        if(slow==1){
            return true;
        }else{
            return false;
        }
    }
}