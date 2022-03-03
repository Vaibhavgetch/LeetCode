class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        // get the size and check if less than 3 or not  because (#at least three elements) condition given in question
        int k=nums.length; 
        if(k<3) return 0;  
        int ans=0;int p=0;
        //traverse the array and find the difference among each three
        for(int i=0;i<k-2;i++){
            int a=nums[i];
            int b=nums[i+1];
            int c=nums[i+2];
            // if the difference is same i.e. #subarray found  
            if(c-b == b-a){ 
                ans+=1; //2
               p+=ans; //
            }
            else{
                ans=0;
            }
        }
        return p;   
    }
}