package com.leetcode;

/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8 Explanation:
 * 342 + 465 = 807.
 * 
 * @author eybcccg
 * 
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next =  new ListNode(3);
		
		System.out.println(listNodeToString(l1));
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next =  new ListNode(4);
		
		System.out.println(listNodeToString(l2));
		
		AddTwoNumbers test = new AddTwoNumbers();
		ListNode result = test.addTwoNumbers(l1, l2);
		String string = listNodeToString(result);
		System.out.println(string);
	}
	
	public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }
    
        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
	
	/**
	 * 注意next的指向
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode d = new ListNode(0);
        ListNode sentinel = d;
		int sum = 0;
		while (null != l1 || null != l2) {
			sum = sum / 10;
			if (l1 != null) {
				sum = sum + l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum = sum + l2.val;
				l2 = l2.next;
			}
			sentinel.next = new ListNode(sum % 10);
			sentinel = sentinel.next;
		}
		if (sum / 10 == 1) {
			sentinel.next = new ListNode(1);
		}
		
		return d.next;
    }

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
