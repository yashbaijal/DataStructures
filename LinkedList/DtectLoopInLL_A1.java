/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// Detect Loop in LL Approch -1 TC =O(n)  S(C)=O(n)
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
        
        public boolean detectCycle(Node head)
        {
            if(head==null)
            {
                return false;
            }
            
            Map<Node,Boolean> visited =new HashMap<>();
            
            Node temp=head;
            
            while(temp!=null)
            {
                if(visited.getOrDefault(temp,false)==true)
                {
                    return true;
                }
                
                visited.put(temp,true);
                temp=temp.next;
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
		
		list.tail.next=list.head.next;
		
		if(list.detectCycle(list.head))
		{
		    System.out.println("Cycle is present in loop");
		}
		else{
		    System.out.println("Cycle is not  present in loop");
		}
	}
}
