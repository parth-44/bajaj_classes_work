import java.util.*;
class rotate_array {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
       int K = k%n;
    if(K==0){
        return;
    }
    reverse(0,n,nums);
    reverse(0,K,nums);
    reverse(K,n,nums);
    }
    static void reverse(int start , int end , int[] nums){
        while(start<end){
            int temp = nums[start];
            nums[start]= nums[end-1];
            nums[end-1]=temp;
            start++;
            end--;
        }
    }
}