/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Add two Numbers represented by LL
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
        
        public  void addLast(Node head, Node tail ,int d)
        {
            Node temp=new Node(d);
            if(head==null)
            {
                head=temp;
                tail=temp;
                return;
            }
            else{
                tail.next=temp;
                tail=temp;
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
        
        public Node reverse(Node head)
        {
            Node next=null;
            Node curr=head;
            Node prev=null;
            
            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
             return prev;
        }
        
        public Node addList(Node head1,Node head2)
        {
            head1=reverse(head1);
            head2=reverse(head2);
            
            Node ans=add(head1,head2);
            
            ans=reverse(ans);
            
            return ans;
        }
        
        public Node add(Node head1,Node head2)
        {
            int carry=0;
            
            Node ansHead=null;
            Node ansTail=null;
            
            while(head1!=null || head2!=null ||carry!=0)
            {
                int val1=0;
                if(head1!=null)
                val1=head1.data;
                
                int val2=0;
                if(head2!=null)
                val2=head2.data;
                
                int sum=carry+val1+val2;
                
                int digit=sum%10;
                
                addLast(ansHead,ansTail,digit);
                
                carry=sum/10;
                
                if(head1!=null)
                head1=head1.next;
                
                if(head2!=null)
                head2=head2.next;
            }
            return ansHead;
        }
        
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedList list1=new LinkedList();
		list1.add(4);
		list1.add(5);
		
		LinkedList list2=new LinkedList();
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		
	}
}
