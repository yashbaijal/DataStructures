/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Flattena Linked List O(n) O(1)
/* Name of the class has to be "Main" only if the class is public. */

class LinkedList
{
    Node head;
    
    class Node{
        Node next,bottom;
        int data;
        
        Node(int data)
        {
            this.data=data;
            next=null;
            bottom=null;
        }
    }
    
    public Node add(Node head,int d)
    {
        Node temp=new Node(d);
        temp.bottom=head;
        head=temp;
        
        return head;
    }
    
     public  void printList()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.bottom;
            }
        }
        
        public Node flatten(Node root)
        {
            if(root==null || root.next==null)
            {
                return root;
            }
            
            root.next=flatten(root.next);
            
            root=mergeList(root,root.next);
            
            return root;
        }
        
        public Node mergeList(Node head1,Node head2)
        {
            Node temp=new Node(0);
            Node res=temp;
            
            while(head1!=null && head2!=null)
            {
                if(head1.data<head2.data)
                {
                    temp.bottom=head1;
                    temp=temp.bottom;
                    head1=head1.bottom;
                }
                else{
                   temp.bottom=head2;
                    temp=temp.bottom;
                    head2=head2.bottom; 
                }
            }
            
            if(head1!=null)
            {
                temp.bottom=head1;
            }
            else{
               temp.bottom=head2; 
            }
            
            return res.bottom;
        }
        
        public static void main(String args[]){
            
            LinkedList list = new LinkedList();
            
            list.head=list.add(list.head,30);
            list.head=list.add(list.head,8);
            list.head=list.add(list.head,7);
            list.head=list.add(list.head,5);
            
            list.head.next=list.add(list.head.next,20);
            list.head.next=list.add(list.head.next,10);
            
            list.head.next.next=list.add(list.head.next.next,50);
            list.head.next.next=list.add(list.head.next.next,22);
            list.head.next.next=list.add(list.head.next.next,19);
            
            list.head.next.next.next=list.add(list.head.next.next.next,45);
            list.head.next.next.next=list.add(list.head.next.next.next,40);
            list.head.next.next.next=list.add(list.head.next.next.next,35);
            list.head.next.next.next=list.add(list.head.next.next.next,28);
            
            list.head=list.flatten(list.head);
            
            list.printList();
        }
}