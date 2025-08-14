# 832. Flipping an Image

## my first submission(beats 39%)
```
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] ans = new int[n][image[0].length];
        for(int i=0;i<image.length ;i++){
            flip(image[i]);
            for(int j=0 ;j<image[i].length ;j++){
                ans[i][j]=invert(image[i][j]);
            }
        }
        return ans;
    }

    public int invert(int num){
        if(num==0){
            num=1;
        }else{
            num=0;
        }
        return num;
    }

    public int[] flip(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}
```

## (beats 100%)
chatgpt suggested that i reverse the array inplace and do XOR along with it
```
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int start = 0;
            int end = row.length - 1;
            
            while (start <= end) {
                int temp = row[start] ^ 1;
                row[start] = row[end] ^ 1;
                row[end] = temp;
                
                start++;
                end--;
            }
        }
        return image;
    }
}
```
