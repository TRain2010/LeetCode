package com.TRain.Laicode;

public class AddTwo {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        boolean carry = false;
        while (l1 != null || l2 != null ||carry) {
        	int sum = ((l1 == null) ? 0:l1.val) + ((l2 == null) ? 0:l2.val);
        	sum = (carry == true) ? sum+1:sum;
        	if (sum >= 10) {
        		carry = true;
        		sum -= 10;
        	} else
        		carry = false;
        	result.next = new ListNode(sum);
        	l1 = (l1== null)? null:l1.next;
        	l2 = (l2 == null)? null:l2.next;
        	result = result.next;
        }
        return dummy.next;
        
    }
}
