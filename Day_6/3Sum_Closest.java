class Solution {
    public int threeSumClosest(int[] nums, int target) {
       
        Arrays.sort(nums);
        int length=nums.length;
        int sum=0;
        int i,j,k;
        int min= Integer.MAX_VALUE;
        int result=0;
        
        for(i=0;i<length;i++){
            j=i+1;
            k=length-1;
            
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==target)
                    return target;
                else if(sum>target)
                    k--;
                else
                    j++;
                
                if(min>Math.abs(target-sum)){
                    min=Math.abs(target-sum);
                    result=sum;
                }
                
            }
            
            
        }
        return result;
            
            
    }
}