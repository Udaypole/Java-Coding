import java.util.*;
public class cirularQ
{
     static class Queue
    {
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n)
        {
            arr=new int[n];
            size = n;
            rear =-1;
            front = -1;
        }
    
        public static boolean isEmpty()
        {
            return rear ==-1 && front ==-1;
        }
        public static boolean isFull()
        {
            return (rear+1)% size ==front;
        }

        public static void enque(int data)
        {
            if(isFull())
            {
                System.out.println("q is full");
                return;
            }
            if(front ==-1)
            {
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }
        public static int  deque()
        {
            if(isEmpty())
            {
                System.out.println("q is full");
                return -1;
            }
            
            int res = arr[front];
          if(rear == front){
            rear = front = -1;
          }
          else
          {
            front = (front+1) % size;
          }
            return res;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("q is full");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[])
    {
        Queue q = new Queue(5);
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