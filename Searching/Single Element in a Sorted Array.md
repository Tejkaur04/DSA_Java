# 540. Single Element in a Sorted Array

## my solution 
```
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid= low+(high-low)/2;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid]!=nums[mid+1]){
                high=mid;
            }
            else{
                low = mid+2;
            }
        }
        return nums[low];
    }
}
```
this was actually pretty clear , what to do after taking a look at the testcases and doing a dry run
