public class dll
{
    public static class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
    }
        public static Node head;
        public static Node tail;

        int size;


        public void addf(int data)
        {
            Node nn = new Node(data);
            if(head == null)
            {
                head = tail= nn;
                return;
            }
            head.prev = nn;
            nn.next = head;
            head = nn;
            nn.prev = null;
        }
        public void addl(int data)
        {
            Node nn = new Node(data);
            if(head == null)
            {
                head = tail= nn;
                return;
            }
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
            tail.next=null;  
        }
        public void print()
        {
            if(head==null){
                System.out.println("LinkedList is empty");
                return;
            }
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public void rev()
        {
            Node prev = null;
            Node curr =  head;
            Node next;
            while(curr !=null) 
            {
                next = curr.next;
                curr.next = prev;
                curr.prev = next;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
        public static void main(String args[])
        {
             dll  l1 = new dll();
             l1.addf(1);
             l1.addf(2);
             l1.addf(3);
             l1.addf(4);
             l1.addf(5);
             l1.addf(6);
             l1.print();

             l1.addl(7);
             System.out.println("bfr reverse");
             l1.print();
             System.out.println("after reverse");
             l1.rev();
             l1.print();
        }

}