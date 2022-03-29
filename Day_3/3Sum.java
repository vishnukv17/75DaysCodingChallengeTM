class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result= new HashSet<List<Integer>>();
        Arrays.sort(nums);
        List<Integer> temp= new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int sum=-1*nums[i];
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                 
                if(nums[j]+nums[k]==sum && i!=j && i!=k && j!=k ){
                    temp= new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);
                    j++;
                    k--;
                }
                else if(nums[j]+nums[k]>sum){
                    k--;
                }
                else{
                    j++;
                }
                
            }
        }
        List<List<Integer>> list= new ArrayList<List<Integer>>();
        list.addAll(result);
        return list;
    }
}