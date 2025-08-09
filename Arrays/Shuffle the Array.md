# 1470. Shuffle the Array

### my final solution

```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int j = 0;
        for (int i = 0; i < n; i++) {
            ans[j++] = nums[i];     
            ans[j++] = nums[i + n]; 
        }
        return ans;
    }
}
```

### problems i faced :
i took time figuring out how to iterate from mid and start both without using pointers,
but turns out just had to add the mid simply
