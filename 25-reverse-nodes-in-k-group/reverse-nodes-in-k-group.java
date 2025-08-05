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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0,head);
        ListNode groupprev=dummy;

        while(true){
            ListNode kth= get(groupprev,k);
            if(kth ==null){
                break;
            }
            ListNode groupnext=kth.next;
            ListNode prev=kth.next;
            ListNode cur=groupprev.next;
            while(cur!=groupnext){
                ListNode temp=cur.next;
                cur.next=prev;
                prev=cur;
                cur=temp;
            }
            ListNode temp=groupprev.next;
            groupprev.next=kth;
            groupprev=temp;
        }
        return dummy.next;
    }

    private ListNode get(ListNode curr,int k){
        while(curr!=null && k>0){
            curr=curr.next;
            k--;
        }
        return curr;
    }
}