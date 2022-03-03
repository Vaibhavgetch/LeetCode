class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
    }
    int helper(int num, int count){
       if(num == 0) return  count ;    
        return (num%2 == 0)? helper(num/2, count + 1): helper(num-1, count + 1);
    }
   
}
