# 1773. Count Items Matching a Rule

### my first approach (using a nested for loop) => very lengthy 
### second approach(beats 85%)
```
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0 ;
        int index = 0;
        if(ruleKey.equals("type")){
            index = 0;
        }
        if(ruleKey.equals("color")){
            index = 1;
        }
        if(ruleKey.equals("name")){
            index = 2;
        }

        for(int i=0 ; i<items.size() ;i++){
            if(items.get(i).get(index).equals(ruleValue)){
                count++;
            }  
        }
        return count;
    }
}
```

## == Compares object reference (memory address)
## .equals() Compares the value of strings
