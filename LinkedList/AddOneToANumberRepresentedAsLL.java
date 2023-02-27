class Codechef
{
  static  class Node {
        
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
        
        public void add(int d)
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
        
        public void printList(Node head)
        {
            if(head==null)
            System.out.println("empty list");
            
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
        
        public Node addOne(Node head)
        {
            head=reverse(head);
            
            head=addOneUntill(head);
            
            return reverse(head);
        }
        
        public Node addOneUntill(Node head)
        {
            Node res=head;
            Node temp=null;
            int carry=1,sum=0;
            
            while(head!=null)
            {
               sum=carry+head.data;
               
               carry=(sum>=10)?1:0;
               
               sum=sum%10;
               
               head.data=sum;
               
               temp=head;
               
               head=head.next;
            }
            
            if(carry>0)
            {
                temp.next=new Node(carry);
                
            }
            
            return res;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedList list1=new LinkedList();
		list1.add(9);
		list1.add(9);
		list1.add(9);
		list1.add(9);
		
		list1.printList(list1.head);
		
		list1.head=list1.addOne(list1.head);
		
		list1.printList(list1.head);
	}
}
