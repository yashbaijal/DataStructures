/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Check if list is circular
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
                tail.next=head;
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
        
        public boolean isCircular(Node head)
        {
            if(head==null)
            {
                return true;
            }
            
            Node temp=head.next;
            
            while(temp!=null && temp!=head){
                temp=temp.next;
            }
            
          
             if(temp==head)
            {
                return true;
            }
            
            return false;
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
		
		if(list.isCircular(list.head))
		{
		    System.out.println("circular");
		}
		else{
		     System.out.println(" NOT circular");
		}
	}
}
