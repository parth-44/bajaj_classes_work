import java.util.*;
public class starting_node_loop {
    public ListNode detectCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    while(fast!=null&&fast.next!=null){
        fast = fast.next.next;
        slow = slow.next;
        if(slow == fast){
            ListNode n1 = head;
            ListNode n2 = fast;
            while(n1!=n2){
                n1=n1.next;
                n2=n2.next;
            }
            return n1;
        }
    }
    return null;
    }
}