/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Begining Node of LOOP in LL 
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
        
        public Node detectCycle(Node head) //floyd loop detection algo
        {
            Node slow=head; // let say teo people running with speed ratio 2:1 only chance of their
            Node fast=head; // meeting if track is either in loop ie end meets start or any other point.
            
            while(slow!=null && fast!=null)
            {
                fast=fast.next;
                if(fast!=null)
                {
                    fast=fast.next;
                }
                
                slow=slow.next;
                
                if(slow==fast)
                {
                    return slow;
                }
            }
            return null;
        }
        
        public Node startOfLoop(Node head)
        {
            if(head==null)
            {
                return null;
            }
            
            Node slow=head;
            Node intersect=detectCycle(head);
            
            while(slow!=intersect)
            {
                slow=slow.next;
                intersect=intersect.next;
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
		
		list.tail.next=list.head.next;
		
		System.out.println(list.startOfLoop(list.head).data);
	}
}
