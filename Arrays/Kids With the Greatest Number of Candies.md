# 1431. Kids With the Greatest Number of Candies

### my final solution
```java
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int i=0 ; i<n ;i++){
            max= Integer.max(candies[i],max);
        }
        for(int i=0 ; i<n ;i++){
              result.add(candies[i] + extraCandies >= max);
        }
    return result;
    }
}
```

### Optimisation
The only optimisation this code can use is for-each loop instead of for loop
```java
import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            if (candy > max) max = candy;
        }

        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}

```
