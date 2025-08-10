# 1365. How Many Numbers Are Smaller Than the Current Number

### my first submission (brute force)
```java(beats 20%)
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      int[] ans = new int[nums.length];
      for(int i=0; i<nums.length ; i++){
        int count = 0;
        for(int j=0 ;j<nums.length ;j++){
            if(j!=i && nums[j]<nums[i]){
                count++;
            }
        }
        ans[i] = count;
      } 
      return ans; 
    }
}
```

### this made my soltuion more efficient (beats 70%)
You don't need to check for j != i, since nums[j] is never less than nums[i] when j = i

### beats 100% approach
```java
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];
        
        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i-1];    
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else 
                res[i] = count[nums[i] - 1];
        }
        return res;        
    }
}
```

