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
        
        public  void  printList()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        
        public Node getMiddle()
        {
            if(head==null || head.next==null)
            {
                return head;
            }
            
            if(head.next.next==null)
            {
                return head.next;
            }
            
            Node slow=head;
            Node fast=head.next;
            
            while(fast!=null)
            {
                fast=fast.next;
                if(fast!=null)
                {
                    fast=fast.next;
                }
                
                slow=slow.next;
            }
            
            return slow;
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
		
	//	list.printList();
		Node n=list.getMiddle();
		System.out.println(n.data);
	}
}
