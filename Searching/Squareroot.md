# 69. Squareroot(x)
beats 5%
```
class Solution {
    public int mySqrt(int x) {
        long i=1;
        long root=0;
        while(i*i <= x && root<i){
            root=i;
            i++;
        }
        return (int)root;
    }
}
```
## efficient solution (using binary search)
```
class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int left = 0;
        int right = x-1;
        int mid;
        
        while (left <= right) {
            mid = left + (right-left)/2;
            if (mid*mid == x) {
                return mid;
            } else if ((long)mid*mid < x) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return left-1;
    }
}
```
