import java.util.*;

public class linkListQ
{
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = next;
        }
    }
     static class Queue
    {
        static Node head = null;
        static Node  tail = null;
    
        public static boolean isEmpty()
        {
            return head ==null && tail == null;
        }
        public static void enque(int data)
        {
            Node nn = new Node(data);
            if(head == null )
            {
                head = tail = nn;
            }
            tail.next = nn;
            tail = nn;
        }
        public static int  deque()
        {
            if(isEmpty())
            {
                System.out.println("q is full");
                return -1;
            }
            
            int front = head.data;
           if (tail == head)
           {
                tail = head = null;
           }
           else
           {
            head = head.next;
           }
            return front;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("q is full");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[])
    {
        Queue q = new Queue();
        q.enque(1);
        q.enque(2);
        q.enque(3);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.deque();
        }
    }
}