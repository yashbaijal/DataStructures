/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Check if list is Palindrome
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class Node{
        int data;
        Node next;
        
        Node(int d)
        {
            this.data=d;
        }
    }
    
    static class LinkedList
    {
        Node head;
        Node tail;
        
        public  void add(int d)
        {
            Node temp=new Node(d);
            if(head==null)
            {
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        
        public  void printList(Node head)
        {
            if(head==null)
            {
                System.out.println("empty List");
            }
            
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        
        public Node getMid(Node head)
        {
            Node slow=head;
            Node fast=head.next;
            
            while(fast!=null && fast.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
        }
        
        public Node reverse(Node head)
        {
            Node next=null;
            Node curr=head;
            Node prev=null;
            
            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            
            return prev;
        }
        
        public boolean ifPalindrome(Node head)
        {
            if(head==null && head.next==null)
            {
                return true;
            }
            
            Node middle=getMid(head);
            
            Node temp=middle.next;
            
            middle.next=reverse(temp);
            
            Node head1=head;
            Node head2=middle.next;
            
            while(head2!=null)
            {
                if(head2.data!=head1.data)
                {
                    return false;
                }
                
                head1=head1.next;
                head2=head2.next;
            }
            return true;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedList list=new LinkedList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(2);
		list.add(1);
		
		if(list.ifPalindrome(list.head))
		{
		    System.out.println("Palindrome");
		}
		else
		{
		    System.out.println(" Not Palindrome");
		}
	}
}
