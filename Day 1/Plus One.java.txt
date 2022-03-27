class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry=0;
        int result[]=new int[digits.length];
        for(int i=digits.length-1;i>=0;i--){
                   
            if(digits[i]<9){
                digits[i]++;
                break;
            }
            else {
                if(i==0){
                    result= new int[digits.length+1];
                    result[0]=1;
                    carry=1;
                }
                digits[i]=0;
                
            }
        }
        
        if(carry==1){
           for(int i=0;i<digits.length;i++){
            result[i+1]=digits[i];
            } 
            return result;
        }
            
        else 
            return digits;
        
    }
}