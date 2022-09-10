/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Merge Two Sorted  LL  T(C) & SC= O(n)
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
        
        public  void  printList(Node head)
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        
        public Node merge(Node first ,Node second)
        {
            if(first==null)
            {
                return second;
            }
            
            if(second==null)
            {
                return first;
            }
            
            if(first.data<=second.data)
            {
                return solve(first,second);
            }
            else{
                 return solve(second,first);
            }
        }
        
        public Node solve(Node first,Node second)
        {
            if(first.next==null)
            {
                first.next=second;
            }
            
            Node curr1=first;
            Node next1=curr1.next;
            
            Node curr2=second;
            Node next2=curr2.next;
            
            while(next1 !=null && curr2!=null)
            {
                if((curr2.data>=curr1.data) && (curr2.data<=next1.data))
                {
                    curr1.next=curr2;
                    next2=curr2.next;
                    curr2.next=next1;
                    
                    curr1=curr2;
                    curr2=next2;
                }
                else{
                    curr1=next1;
                    next1=next1.next;
                    
                    if(next1==null)
                    {
                        curr1.next=curr2;
                        return first;
                    }
                }
            }
            return first;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedList list=new LinkedList();
		
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		
		LinkedList list1=new LinkedList();
		
		list1.add(2);
		list1.add(4);
		list1.add(6);
		list1.add(8);
		
	   list.head=list.merge(list.head,list1.head);
	  
	   list.printList(list.head);
	}
}
