import java.util.*;
class contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            if(!set.add(x)){
                return true;
            }
        }
        return false;
    }
}