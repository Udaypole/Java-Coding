import java.util.*;
public class zig_zag
{
    public static class Node
    {
        int data;
        Node next;
    
        public Node(int data)
        {
            this.data=data;
            this.next=next;
        }
    }
    public static Node head;
    public static Node tail;

    public void zigzag()
    { //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow; 
        // reverse the  second half linkd list 
        Node curr = mid.next;
        mid.next = null;

        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
        }
        // alter the merged list
        Node left =  head;
        Node right =  prev;

        Node nextl,nextr;

        while(left !=null && right !=null)
        {
            nextl = left.next;
            left.next = right;
            nextr = right.next;
            right.next = nextl;

            left = nextl;
            right = nextr;
        }
    }
    public void addLast(int data)
    {
        Node nn=new Node(data);
        if(head==null)
        {
            head = tail = nn;
            return;
        }
        tail.next = nn;
        tail = nn;
    }

    public void print()
    {
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main (String args[])
    {
        zig_zag l1 = new zig_zag();
        
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(6);
        l1.print();
        
        l1.zigzag();
        l1.print();
    }
}