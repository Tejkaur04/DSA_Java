//string has all unique characters
import java.util.*;

class IsUnique{
    public static void main(String[] args){
        String str = "abcde";
        HashSet<Integer> mp = new HashSet<>();
        boolean ans = true;
        for(int i=0 ; i<str.length() ;i++){
            int temp = str.charAt(i) - 'a';
            if(!mp.contains(temp)){
                mp.add(temp);
            }else{
                ans=false;
                break;
            }
        }

        System.out.println(ans);

    }

}