/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//  intersection point of two Linked Lists
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
          
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        
        public Node getIntersection(Node head1,Node head2) // o(n^2) O(1)
        {
            while(head2!=null)
            {
                Node temp=head1;
                while(head1!=null)
                {
                    if(temp==head2)
                    {
                        return temp;
                    }
                    temp=temp.next;
                }
                head2=head2.next;
            }
        }
        
        public Node getIntersection1(Node head1,Node head2) // hashing TC=O(n+m) SC=O(n)
        {
            HashSet<Node> nodeSet=new HashSet<>();
            
            Node temp=head1;
            while(temp!=null)
            {
                nodeSet.add(temp);
                temp=temp.next;
            }
            
            temp=head2;
            while(temp!=null)
            {
                if(nodeSet.contains(temp))
                {
                    return temp;
                }
                temp=temp.next;
            }
            return null;
        }
        
        public Node getIntersection2(Node head1,Node head2) // O(n+m),O(1)
        {
            int diff=getDiff(head1,head2);
            
            if(diff<0)
            {
                while(diff++!=0)
                {
                    head2=head2.next;
                }
            }
            else{
                
                while(diff--!=0)
                {
                    head1=head1.next;
                }
            }
            
            while(head1!=null)
            {
                if(head1==head2)
                {
                    return head1;
                }
                head1=head1.next;
                head2=head2.next;
            }
            
            return null;
        }
        
        public int getDiff(Node head1,Node head2)
        {
            int len1=0,len2=0;
            
            while(head1!=null ||head2!=null)
            {
                if(head1!=null)
                {
                    len1++;
                    head1=head1.next;
                }
                
                if(head2!=null)
                {
                   len2++;
                    head2=head2.next; 
                }
            }
            
            return len1-len2;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		
	}
}
