class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n=nums.length;
        int num=nums[0];
        int count=1;
        int i=1,j=1;
        while(i<n){
            if(nums[i]==num){
                i++;
            }
            else{
                nums[j]=nums[i];
                count++;
                num=nums[j];
                i++;
                j++;
            }
            
        }
        
        return count;
        
    }
    
     
}