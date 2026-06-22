class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        int c=0;
          for(int j=1;j<n;j++){
            if(nums[c]!=nums[j]){
                c++;
               nums[c]=nums[j];
            }
    
        }

        return c+1 ;
    }
}