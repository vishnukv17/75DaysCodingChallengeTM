class Solution {
    public int[][] merge(int[][] intervals) {
       int count=0;
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] i1,int[] i2)
            {
                return Integer.compare(i1[0],i2[0]);
            }
        });
        
        int i=0;
        for(int j=1;j<intervals.length;j++){
            if(intervals[i][1]>=intervals[j][0]){
                  intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);
                count++;
            }
            else {
                i++;
                intervals[i]=intervals[j];
            }
            
        }
        int[][] result= new int[intervals.length-count][2];
        for(int j=0;j<intervals.length-count;j++){
            result[j]=intervals[j];
            
        }
        
        return result;
    }
}