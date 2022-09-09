/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//LinkedList and it's Methods
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
       
       public void addFirst(int d)
       {
           Node temp=new Node(d);
           if(head==null)
           {
               head=temp;
               tail=temp;
           }
           else{
               temp.next=head;
               head=temp;
           }
       }
        public  void addLast(int d)
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
        
        public void addAtPosition(int position,int d)
        {
            Node temp=head;
            int count=1;
            
            while(count<position-1)
            {
                temp=temp.next;
                count++;
            }
            
            Node newNode=new Node(d);
            
            newNode.next=temp.next;
            temp.next=newNode;
        }
        
        public void remove(int position)
        {
            if(position==1)
            {
                head=head.next;
            }
            else{
                Node curr=head;
                Node prev=null;
                
                int count=1;
                while(count<position)
                {
                    prev=curr;
                    curr=curr.next;
                    count++;
                }
                
                prev.next=curr.next;
            }
        }
        
        public void removeData(int d)
        {
            if(head.data==d)
            {
               head=head.next; 
            }
            else{
                Node curr=head;
                
                while(curr!=null && curr.next.data!=d)
                {
                    
                    curr=curr.next;
                }
                curr.next=curr.next.next;
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedList list=new LinkedList();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		
		list.printList();
		System.out.println();
		
		LinkedList list1=new LinkedList();
		list1.addFirst(10);
		list1.addFirst(20);
		list1.addFirst(30);
		list1.addFirst(40);
		list1.addFirst(50);
		
	    list1.printList();
	    
	    System.out.println();
	    list.addAtPosition(3,100);
	    list.printList();
	    
	    System.out.println();
	   list.remove(6);
	   list.removeData(10);
	    list.printList();
	}
}
