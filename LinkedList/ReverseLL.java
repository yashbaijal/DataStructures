/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//LinkedList REverse
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
    
  static  class LinkedList 
    {
        Node head;
        Node tail ;
       
       
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
        
        public  void printList()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        
        public void reverse()
        {
            Node curr=head;
            Node prev=null;
            Node forward=null;
            
            while(curr!=null)
            {
                forward=curr.next;
                curr.next=prev;
                prev=curr;
                curr=forward;
            }
            tail=head;
            head=prev;
        }
        
        public void reverseRec(Node prev,Node curr)
        {
            if(curr!=null)
            {
                reverseRec(curr,curr.next);
                curr.next=prev;
            }
            else{
                tail=head;
                head=prev;
            }
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
		
		list.printList();
		System.out.println();
	    //list.reverse();
	    list.reverseRec(null,list.head);
		list.printList();
		System.out.println(list.head.data+"-----"+list.tail.data);
	}
}
