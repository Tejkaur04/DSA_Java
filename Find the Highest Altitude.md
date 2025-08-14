1732. Find the Highest Altitude

# one go solution
```
class Solution {
    public int largestAltitude(int[] gain) {
        int highest=0;
        int position =0;
        for(int i=0 ; i<gain.length ; i++){
            position += gain[i];
            highest = Math.max(highest,position);
        }
        return highest;
    }
}
```
