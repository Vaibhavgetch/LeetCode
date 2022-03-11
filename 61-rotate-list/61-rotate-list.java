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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null || k==0) return head ;
        ListNode temp = head ;
        ListNode tail = head ;
        int n = 0 ;
         
        while(temp != null){
            tail = temp ;
            temp = temp.next ;
            n++ ;
        }
         k = (k%n + n)% n ;
        System.out.print(n) ;
         tail.next = head;
             ListNode pHead = head.next ;
        ListNode pTail = head ;
        for(int i = 0 ; i < n - k -1 ; i++ ){
           pTail = pTail.next ;
           pHead = pHead.next ;
             
        }
        
        pTail.next = null ;
        return pHead ;
        
    }
}