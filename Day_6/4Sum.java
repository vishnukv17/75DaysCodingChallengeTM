class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       
        Set<List<Integer>> result= new HashSet<List<Integer>>();
        Arrays.sort(nums);
        int sum=0;
        int j,k;
        for(int i=0;i<nums.length;i++){
            for(int r=i+1; r<nums.length;r++){
                  j=r+1;
                  k=nums.length-1;
                 while(j<k){
                    sum=nums[i]+nums[r]+nums[j]+nums[k];
                    if(sum==target ){
                        List<Integer> temp= new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[r]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        result.add(temp);
                        j++;
                        k--;
                    }
                    else if(sum>target){
                        k--;
                    }
                    else{
                       j++;
                    }
                
                }
            }
        }
        
        return new ArrayList<>(result);
        
    }
}