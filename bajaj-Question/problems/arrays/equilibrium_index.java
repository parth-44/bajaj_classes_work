import java.util.*;
class equillibrium {
    public static int findEquilibrium(int arr[]) {
        // code here
        int total = 0;
        for(int x : arr){
            total+=x;
        }
        int curr=0;
        for(int i=0;i<arr.length;i++){
            int comp = total - curr - arr[i];
            if(curr==comp){
                return i;
            }
            curr+=arr[i];
        }
        return -1;
    }
}
