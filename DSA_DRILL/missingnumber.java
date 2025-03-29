import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
     int count=nums.length;
     int[] check = new int[count+1];
     for(int i=0;i<count;i++){
           check[nums[i]]++;
     }
     for(int j=0;j<=count;j++){
        if(check[j]==0){
            return j;
        }
     }
     return -1;

    }
}
