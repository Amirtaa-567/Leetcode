/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode fh=head;
        ListNode sh=slow;
        // slow.next=null;
        ListNode cur=sh;
        ListNode prev=null, next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        sh=prev;
        while(sh!=null){
            if(fh.val!=sh.val){
                return false;
            }
            fh=fh.next;
            sh=sh.next;
        }
        return true;
    }
}