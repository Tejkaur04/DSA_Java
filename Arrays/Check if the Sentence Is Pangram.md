# 1832. Check if the Sentence Is Pangram

### my solution (beats 80%)
```
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] exists = new boolean[26];
        for(int i: sentence.toCharArray()){
            exists[i-'a'] = true;
        }
        for(boolean check : exists){
            if(!check) return false;
        }
        return true;
    }
}
```

### solution that beats 100%
```
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
                return false;
            }
         }
        return true;
    }
}
```
