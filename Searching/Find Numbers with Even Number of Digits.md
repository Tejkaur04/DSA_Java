# 1295. Find Numbers with Even Number of Digits

### my final solution(beats 98%)
```
class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i=0 ; i<nums.length ;i++){
            if(digits(nums[i])%2 == 0){
                ans++;
            }
        }
        return ans;
    }

    public int digits(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n/10 ;
        }
        return count;
    }
}
```

solved by making methods , to first make a method to count digits and in main function checking if it is even or not
