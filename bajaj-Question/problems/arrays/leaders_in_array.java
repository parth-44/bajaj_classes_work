import java.util.*;
class leaders {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int leader = -1;
        for(int i = n-1;i>=0;i--){
            if(arr[i]>=leader){
                list.add(arr[i]);
                leader=arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
