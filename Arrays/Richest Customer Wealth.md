# 1672. Richest Customer Wealth

### my final solution

```java
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0 ; i<accounts.length ; i++){
            int wealth = 0;
            for(int j=0 ; j<accounts[i].length ; j++){
                wealth += accounts[i][j];
            }
            max = Integer.max( max, wealth);
        }
        return max;
    }
}
```

### things to remeber/learn:
- how to iterate in a 2d array
- how to find max value using inbuilt functions
