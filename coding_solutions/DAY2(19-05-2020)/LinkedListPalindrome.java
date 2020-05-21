package alsten;

import java.util.Scanner;
import java.util.Stack;

public class LinkedListPalindromeUsingStack {
 
    public static void main(String[] a){
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter the list elements: ");
    	int a1,b,c,d,e;
    	a1=s.nextInt();
    	b=s.nextInt();
    	c=s.nextInt();
    	d=s.nextInt();
    	e=s.nextInt();
    	
 
        Node n1 = new Node(a1);
        Node n2 = new Node(b);
        Node n3 = new Node(c);
        Node n4 = new Node(d);
        Node n5 = new Node(e);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        if (isPalindrome(n1)) {
			System.out.print("Linked List is a palindrome.");
		} else {
			System.out.print("Linked List is not a palindrome.");
		}
    }
 
    static class Node {
        int data;
        Node next;
        Node(int tmp) {
            data = tmp;
        }
    }
 
    static boolean isPalindrome(Node head) {
 
        Node tempNode = head;
        Stack<Integer> stack = new Stack<Integer>();
        while(tempNode != null) {
            stack.push(tempNode.data);
            tempNode = tempNode.next;
        }
        while(head != null) {
            if(head.data != stack.pop()) {
                return Boolean.FALSE;
            }
            head = head.next;
        }
 
        return Boolean.TRUE;
    }
}
