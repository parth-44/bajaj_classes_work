

// User function Template for Java
import java.util.*;
class second_largest{
    public int getSecondLargest(int[] arr) {
        // Code Here
        int n=arr.length;
        int largest=-1;
        int second=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            }
            else if(arr[i]>second&&arr[i]<largest){
                second=arr[i];
            }
            
        }
        return second;
    }
}