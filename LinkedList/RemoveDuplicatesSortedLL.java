/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Remove duplicates in SOrted LL
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
        
        public  void  printList()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        
        public void removeDuplicate(Node head)
        {
            if(head==null)
            {
                return;
            }
            
            Node curr=head;
            
            while(curr!=null)
            {
                if((curr.next!=null) && curr.data==curr.next.data)
                {
                   Node temp=curr.next.next;
                   curr.next=temp;
                }
                else{
                    curr=curr.next;
                }
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedList list=new LinkedList();
		
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(50);
		
	     list.printList();
	     list.removeDuplicate(list.head);
	     list.printList();
	}
}
