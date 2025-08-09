# 1480. Running Sum of 1d Array

### my final solution

```java
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0 ;i<n ;i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
```
this was very easy , so no errors in the first go
