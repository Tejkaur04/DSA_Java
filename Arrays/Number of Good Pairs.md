# 1512. Number of Good Pairs

### My final solution
```java
class Solution {
    public int numIdenticalPairs(int[] nums) {
      int count = 0;
      for(int i=0 ; i<nums.length ;i++){
        for(int j=i+1 ; j<nums.length ;j++){
            if(nums[i]==nums[j]){
                count++;
            }
        }
      }  
      return count;
    }
}
```

### A better optimised approach
using hashmap; (beats 100%) clever approach😎
```java
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int ans = 0;
        
        for(int i:nums)
        {
            int count = hm.getOrDefault(i,0);
            ans+=count;
            hm.put(i,count+1);
        }
        
        
        return ans;
    }
}
```
