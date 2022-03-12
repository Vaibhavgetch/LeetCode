/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return head;
        }
        Node orig=head;
		//step 1
        while(orig!=null){
            Node temp=new Node(orig.val);
            temp.next=orig.next;
            orig.next=temp;
            orig=temp.next;
        }
        orig=head;
		//step 2
        while(orig!=null){
            if(orig.next!=null){
                orig.next.random=orig.random==null?null:orig.random.next;
                orig=orig.next.next;
            }
        }
        Node copy=head.next,res=copy;
        orig=head;
		//step 3
        while(orig!=null){
            orig.next=orig.next.next;
            copy.next=copy.next!=null?copy.next.next:null;
            orig=orig.next;
            copy=copy.next;
        }
        return res;
    }
}