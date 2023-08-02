public class Practice {

  static  class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int d)
        {
            this.data=d;
            this.prev=null;
            this.next=null;
        }

    }

    static class DoublyLinkedList
    {
        Node head;
        Node tail;

        public void addHead(int d)
        {
            Node temp=new Node(d);
            if(head==null)
            {
                head=temp;
                tail=temp;
            }
            else
            {
                temp.next=head;
                head.prev=temp;
                head=temp;
            }
        }

        public void addTail(int d)
        {
            Node temp=new Node(d);
            if(tail==null)
            {
                tail=temp;
                head=temp;
            }
            else
            {
                tail.next=temp;
                temp.prev=tail;
                tail=temp;
            }
        }

        public void printList(Node head)
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

        public void addAtPosition(Node head,Node tail,int position,int d)
        {
            Node temp=head;
            if(position==1)
            {
                addHead(d);
            }
            else if(temp.next==null)
            {
                addTail(d);
            }
             else{
                Node nodeToAdd=new Node(d);
                nodeToAdd.next=temp.next;
                temp.next.prev=nodeToAdd;
                temp.next=nodeToAdd;
                nodeToAdd.prev=temp;
            }
        }

        public void deleteNode(Node head,int position)
        {

            if(position==1)
            {
                Node temp=head;
                temp.next.prev=null;
                head=temp.next;
                temp.next=null;
            }
            else
            {
                Node temp=head;
                Node past=null;
                int cnt=1;
                while(cnt<position)
                {
                    past=temp;
                    temp=temp.next;
                    cnt++;
                }
                temp.prev=null;
                past.next=temp.next;
                temp.next=null;
            }
        }
        
    }


    public static void main(String[] args) {

        DoublyLinkedList list=new DoublyLinkedList();
        list.addHead(5);
        list.addHead(3);
        list.addTail(6);
        list.addTail(7);
        list.addAtPosition(list.head, list.tail,2,4);
        list.addAtPosition(list.head, list.tail,1,2);
        list.printList(list.head);
        list.deleteNode(list.head, 4);
        System.out.println();
        list.printList(list.head);
    }
}
