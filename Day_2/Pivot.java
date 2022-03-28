class Solution {
    public int pivotIndex(int[] nums) {
        
        int sum=0;
        int lsum=0,rsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            lsum+=nums[i];
            rsum=sum-lsum;
            if((i==0 && rsum==0 ))
                return i;
            
            if(lsum==rsum-nums[i+1])
                return i+1;
            
            
            
        }        
        return -1;
    }
}