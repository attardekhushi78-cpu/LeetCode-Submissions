class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        
        result[0] = findBound(nums, target, true);  // Find first position
        
        if (result[0] != -1) {
            result[1] = findBound(nums, target, false); // Find last position
        }
        
        return result;
       
    }
    static int findBound(int nums[],int target,boolean isFirst){
        int low=0;
        int high=nums.length-1;
        
        int bound=-1;
        int arr[]=new int[2];
        while(low<=high){
           int mid=low+(high-low)/2;

            if(nums[mid]==target){
                bound=mid;
                if(isFirst){
                    high=mid-1;
                    
                }
                else{
                    low=mid+1;

                }
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
     
     return bound;

    }
}