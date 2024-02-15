package com.example.dsa.leetcode.linkedlist;

public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public ListNode rotateList(ListNode head , int k) {
		
		if(head == null || k==0) {
			
			return head;
		}
		
		int num =0;
		ListNode kth = head;
		ListNode prev = null;
		
		while(num<k && kth!=null) {
			prev= kth;
			kth = kth.next;
			num++;
		}
		
		if(kth!=null) {
			
			kth.next = head;
			prev.next = null;
		}
		
	}

}

class ListNode{
	
	
	int val;
	ListNode next;
	ListNode(){}
	ListNode(int val){this.val=val;}
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
