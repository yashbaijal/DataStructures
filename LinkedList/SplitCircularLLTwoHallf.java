/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// split circular LL in two halfves
/* Name of the class has to be "Main" only if the class is public. */

class LinkedList
    {
    static  Node head ,tail ,head1,head2;
    
    static class Node{
        int data;
        Node next;
        
        Node(int d)
        {
            this.data=d;
        }
    }
        
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
            Node temp=head;
            if(temp!=null)
            {
                do{
                System.out.print(temp.data + " ");
                temp = temp.next;
                }while(temp!=head);
            }
            else{
                System.out.print("empty ");
            }
        }
        
       public void splitList(Node head)
       {
           Node slow=head;
           Node fast=head;
           
           while(fast.next!=head && fast.next.next!=head)
           {
               fast=fast.next.next;
               slow=slow.next;
           }
           
           head1=head;
           head2=slow.next;
           
           slow.next=head1;
           
           Node curr=head2;
           while(curr.next!=head)
           {
               curr=curr.next;
           }
           curr.next=head2;
       }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedList list1=new LinkedList();
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		
		
		list1.splitList(head);
		list1.printList(head1);
		System.out.println("");
		list1.printList(head2);
		
	}
	
    }