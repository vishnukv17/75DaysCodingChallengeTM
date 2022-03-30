class Solution {
    public void nextPermutation(int[] nums) {
        
        int i= nums.length-2;
        
        //find the right minima--> number to be changed
        while(i>=0 && nums[i]>=nums[i+1])
            i--;
        if(i>=0){
            int j =nums.length-1;
            
            //find the number just above the number to be changed
            while(nums[j]<=nums[i])
                j--;
            
            //swap the numbers
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        int j=nums.length-1;
        
        //sort the right subarray next to the changed element
        while(i<j){
            i++;
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j--;
        }
        
    }
    
}