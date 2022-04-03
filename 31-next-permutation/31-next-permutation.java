class Solution {
    public void nextPermutation(int[] nums) {
       
    int n = nums.length;
    int idx=-1;
    for(int i=n-1;i>0;i--){
        if(nums[i-1]<nums[i]){
            idx=i;
            break;
        }
    }
    if(idx==-1){
        reverse(nums,0,n-1);
    }
    else{
       // System.out.println("Idx= "+idx);
        int prev=idx;
        for(int i=idx+1; i<n;i++){
            if(nums[idx-1]<nums[i] && nums[prev] >= nums[i]){
                prev = i;
            }
        }
        //System.out.println("IDX-1 "+nums[idx-1] +" prev "+nums[prev]);
        swap(nums, idx-1, prev);
        //print(nums);
        
        reverse(nums, idx,n-1);
    }
    
}

void reverse(int arr[], int start , int end){
    while(start<end){
        swap(arr,start++,end--);
    }
}
void swap(int []arr, int start, int end){
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp; 
    }
}