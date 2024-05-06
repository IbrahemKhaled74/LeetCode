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
    private int gcd(int number1 , int number2){
        if(number2 == 0) return number1;
        return gcd(number2 , number1%number2);
        
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        int gcd = 0;
        ListNode current = head;
        while(current.next != null){
                gcd = gcd(current.val , current.next.val);
                ListNode newNode = new ListNode(gcd);
                newNode.next=current.next;
                current.next=newNode;
            
            current = current.next.next;
        }
        return head;
        
    }
}