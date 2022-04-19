class Solution {
    public int fib(int n) {
     
        if(n ==0 || n == 1){
            return n ;
        }
        
        int prev1 = fib(n-1);
        int prev2 = fib(n-2);
        return prev1 + prev2 ;
    }
}