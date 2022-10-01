/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

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
        
        public Node kReverse(Node head,int k)
        {
            if(head==null)
            {
                return null;
            }
            
            Node curr=head;
            Node forward=null;
            Node prev=null;
            int count=0;
            
            while(curr!=null && count<k)
            {
                forward=curr.next;
                curr.next=prev;
                prev=curr;
                curr=forward;
                count++;
            }
            
            if(forward!=null)
            {
                head.next=kReverse(forward,k);
            }
            
            return prev;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedList list=new LinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		list.printList(list.head);
		
		list.head=list.kReverse(list.head,2);
		
		list.printList(list.head);
	}
}
