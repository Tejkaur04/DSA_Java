# 1929. Concatenation of Array

 ### my final solution:

```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0 ; i<n ;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}
```

### wrong first approach :
At first i was trying to use a nested for loop for insertion of elements but it was unessacary.
also for increasing the size by multiples is incorrect , the correct way to write it is 2*n instead of 2n

```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2n];
        for(int i=0 ; i<n ;i++){
            for(int j=0 ; j<2n ; j++){
                ans[j]=nums[i];
            }
        }
        return ans;
    }
```
