class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        ArrayList<Integer> tempList=new ArrayList<Integer>();
        tempList.add(1);
        result.add(tempList);
        
        if(numRows==1)
            return result;
        
        
        for(int i=0;i<numRows-1;i++){
            tempList=new ArrayList<Integer>();
            tempList.add(1);
            for(int j=0;j<result.get(i).size()-1;j++){
                int sum=result.get(i).get(j)+result.get(i).get(j+1);
                tempList.add(sum);
            }
            tempList.add(1);
            result.add(tempList);
        }
        
     return result;   
    }
}