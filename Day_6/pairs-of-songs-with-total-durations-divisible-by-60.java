class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        int sum=0;
        for(int t:time){
            int first=t%60;
            int second=0;
            if(first==0)
                second=0;
            else
                second=60-first;
            sum+=map.getOrDefault(second,0);
            map.put(first,map.getOrDefault(first,0)+1);
            
        }
        
        return sum;
    }
}