class Solution {
    public int maxArea(int[] height) {
        
        int i=0, j=height.length-1;
        int area=0;
        while(i<j){
            if((j-i)*Math.min(height[i],height[j])>area){
                area=(j-i)*Math.min(height[i],height[j]);
            }
            
            if(height[i]>height[j])
                j--;
            else
                i++;
                        
        }
        
       return area; 
    }
}