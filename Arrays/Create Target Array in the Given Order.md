# 1389. Create Target Array in the Given Order

### my final solution (beats 100%)
``` 
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] target = new int[nums.length];
        for(int i=0 ; i<nums.length ;i++){
            arr.add(index[i],nums[i]);
        }
        for(int i=0 ; i<arr.size() ;i++){
            target[i] = arr.get(i);
        }
        return target;
    }
}
```

## Learning:

`When we add elements at the same index in an arraylist , the other elements get right shifted
syntax to add element according to index `
```
arr.add(index,element);
```
to measure the size of an arraylist .size() is used instead of .length()
