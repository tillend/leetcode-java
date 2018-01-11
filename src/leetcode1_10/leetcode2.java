package leetcode1_10;

public class leetcode2 {
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode p = head;
		int flag = 0;
		
		while(l1 != null || l2 != null || flag != 0) {
			int num = ((l1 == null)? 0 : l1.val) + ((l2 == null)? 0 : l2.val) + flag;
			if(num >= 10) {
				flag = 1;
				num %= 10;
			}else {
				flag = 0;
			}
			ListNode l = new ListNode(num);
			p.next = l;
			
			p = l;
			l1 = (l1 == null)? null : l1.next;
			l2 = (l2 == null)? null : l2.next;
		}

		return head.next;
	}

	

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}